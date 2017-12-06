(ns adventofcode2017.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn parse-int
  [s]
  (. Integer parseInt (str s)))

(defn- whittle
  [s] (map #(identity %2) s (iterate rest s)))

;;======================================================================
;; Day 1. Inverse Captcha
;;======================================================================

(def day-1-input "77736991856689225253142335214746294932318813454849177823468674346512426482777696993348135287531487622845155339235443718798255411492778415157351753377959586612882455464736285648473397681163729345143319577258292849619491486748832944425643737899293811819448271546283914592546989275992844383947572926628695617661344293284789225493932487897149244685921644561896799491668147588536732985476538413354195246785378443492137893161362862587297219368699689318441563683292683855151652394244688119527728613756153348584975372656877565662527436152551476175644428333449297581939357656843784849965764796365272113837436618857363585783813291999774718355479485961244782148994281845717611589612672436243788252212252489833952785291284935439662751339273847424621193587955284885915987692812313251556836958571335334281322495251889724281863765636441971178795365413267178792118544937392522893132283573129821178591214594778712292228515169348771198167462495988252456944269678515277886142827218825358561772588377998394984947946121983115158951297156321289231481348126998584455974277123213413359859659339792627742476688827577318285573236187838749444212666293172899385531383551142896847178342163129883523694183388123567744916752899386265368245342587281521723872555392212596227684414269667696229995976182762587281829533181925696289733325513618571116199419759821597197636415243789757789129824537812428338192536462468554399548893532588928486825398895911533744671691387494516395641555683144968644717265849634943691721391779987198764147667349266877149238695714118982841721323853294642175381514347345237721288281254828745122878268792661867994785585131534136646954347165597315643658739688567246339618795777125767432162928257331951255792438831957359141651634491912746875748363394329848227391812251812842263277229514125426682179711184717737714178235995431465217547759282779499842892993556918977773236196185348965713241211365895519697294982523166196268941976859987925578945185217127344619169353395993198368185217391883839449331638641744279836858188235296951745922667612379649453277174224722894599153367373494255388826855322712652812127873536473277")

(defn day-1a
  "Day 1. Inverse Captcha - Part 1"
  ([input]
   (let [pairs (partition 2 1 (take 1 input) input)]
     (->> pairs
          (filter #(apply = %))
          (map first)
          (map parse-int)
          (apply +))))
  ([] (day-1a day-1-input)))

(defn day-1b
  "Day 1. Inverse Captcha - Part 2"
  ([input]
   (let [inputs (partition (/ (count input ) 2) input)
         pairs (apply map vector inputs)]
     (->> pairs
          (filter #(apply = %))
          flatten
          (map parse-int)
          (apply +))))
  ([] (day-1b day-1-input)))

;;======================================================================
;; Day 2. Corruption Checksum
;;======================================================================

(def day-2-input "
1208	412	743	57	1097	53	71	1029	719	133	258	69	1104	373	367	365
4011	4316	1755	4992	228	240	3333	208	247	3319	4555	717	1483	4608	1387	3542
675	134	106	115	204	437	1035	1142	195	1115	569	140	1133	190	701	1016
4455	2184	5109	221	3794	246	5214	4572	3571	3395	2054	5050	216	878	237	3880
4185	5959	292	2293	118	5603	2167	5436	3079	167	243	256	5382	207	5258	4234
94	402	126	1293	801	1604	1481	1292	1428	1051	345	1510	1417	684	133	119
120	1921	115	3188	82	334	366	3467	103	863	3060	2123	3429	1974	557	3090
53	446	994	71	872	898	89	982	957	789	1040	100	133	82	84	791
2297	733	575	2896	1470	169	2925	1901	195	2757	1627	1216	148	3037	392	221
1343	483	67	1655	57	71	1562	447	58	1561	889	1741	1338	88	1363	560
2387	3991	3394	6300	2281	6976	234	204	6244	854	1564	210	195	7007	3773	3623
1523	77	1236	1277	112	171	70	1198	86	1664	1767	75	315	143	1450	1610
168	2683	1480	200	1666	1999	3418	2177	156	430	2959	3264	2989	136	110	3526
8702	6973	203	4401	8135	7752	1704	8890	182	9315	255	229	6539	647	6431	6178
2290	157	2759	3771	4112	2063	153	3538	3740	130	3474	1013	180	2164	170	189
525	1263	146	954	188	232	1019	918	268	172	1196	1091	1128	234	650	420
")

(def day-2a-example "
5 1 9 5
7 5 3
2 4 6 8
")

(def day-2b-example "
5 9 2 8
9 4 7 3
3 8 6 5
")

(defn- parse-spreadsheet
  [input]
  (->> input
       str/trim
       (#(str/split % #"\n"))
       (map str/trim)
       (map #(str/split % #"\s+"))
       (map #(map parse-int %))))

(defn day-2a
  "Day 2. Corruption Checksum - Part 1"
  ([input]
   (let [rows (parse-spreadsheet input)]
     (apply + (map #(- (apply max %) (apply min %)) rows))))
  ([] (day-2a day-2-input)))

(defn- divide-evenly
  [row]
  (first (flatten (for [divisors (whittle (reverse (apply sorted-set row)))
                        :let [divisor (first divisors)]]
                    (for [dividend (rest divisors)
                          :when (zero? (mod divisor dividend))]
                      (/ divisor dividend))))))

(defn day-2b
  "Day 2. Corruption Checksum - Part 2"
  ([input]
   (let [rows (parse-spreadsheet input)
         quotients (map divide-evenly rows)]
     (apply + quotients)))
  ([] (day-2b day-2-input)))

;;======================================================================
;; Day 3. Spiral Memory
;;======================================================================

(def day-3-input 289326)

;; An = An-1 + (An-1 - An-2) + 8
(defn spiral
  ([] (spiral 1 1))
  ([a b] (lazy-seq (cons a (spiral (- (+ a a 8) b) a)))))

(defn spiral-ring
  "Return a vector of [ring base] for the given value."
  ([value]
   ;; This could be handled by the conditional below, but it's not
   ;; necessary to test for this special case every time through the
   ;; loop.
   (if (= value 1)
     [0 0]
     (spiral-ring value 1 (spiral))))
  ([value ring iseq]
   (if (<= value (second iseq))
     [ring (first iseq)]
     (recur value (inc ring) (rest iseq)))))

(defn spiral-rung
  "Return offset (diagonal jog) for the given value."
  ([value]
   (apply spiral-rung value (spiral-ring value)))
  ([value ring base]
   (if (= value 1)
     0
     (let [edge (* 2 ring)
           around (- value base)
           v (mod around edge)]
       (Math/abs (- v (/ edge 2)))))))

(defn day-3a
  "Day 3. Spiral Memory - Part 1"
  ([input]
   (let [[ring base] (spiral-ring input)
         rung (spiral-rung input ring base)]
     (+ ring rung)))
  ([] (day-3a day-3-input)))

(defn spiral-sum
  [grid x y]
  (apply + (for [dx [-1 0 1]
                 dy [-1 0 1]
                 :let [value (get-in grid [(+ x dx) (+ y dy)])]
                 :when value]
             value)))

(defn spiral-sums
  ([] (spiral-sums {0 {0 1}} 0 0 1 1 1 1))
  ([grid x y edge dx dy dir]
   (let [value (spiral-sum grid x y)
         new-grid (assoc-in grid [x y] value)
         [new-x, new-y] (if (pos? dx) [(+ x dir) y] [x (+ y dir)])
         eol (and (zero? dx) (= 1 dy))
         new-dir (if eol (- dir) dir)
         new-edge (if eol (inc edge) edge)
         [new-dx, new-dy] (cond eol [new-edge new-edge]
                                (pos? dx) [(dec dx) dy]
                                :else [0 (dec dy)])]
     (lazy-seq
       (cons value (spiral-sums new-grid new-x new-y new-edge
                                new-dx new-dy new-dir))))))

(defn day-3b
  "Day 3. Spiral Memory - Part 2"
  ([input]
   (first (filter #(< input %) (spiral-sums))))
  ([] (day-3b day-3-input)))

;;======================================================================
;; Day 4. High-Entropy Passphrases
;;======================================================================

(def day-4-input "vxjtwn vjnxtw sxibvv mmws wjvtxn icawnd rprh
fhaa qwy vqbq gsswej lxr yzl wakcige mwjrl
bhnlow huqa gtbjc gvj wrkyr jgvmhj bgs umo ikbpdto
drczdf bglmf gsx flcf ojpj kzrwrho owbkl dgrnv bggjevc
ndncqdl lncaugj mfa lncaugj skt pkssyen rsb npjzf
kdd itdyhe pvljizn cgi
jgy pyhuq eecb phwkyl oeftyu pyhuq hecxgti tpadffm jgy
zvc qdk mlmyj kybbh lgbb fvfzcer frmaxa yzgw podt dbycoii afj
zfr msn mns leqem frz
golnm ltizhd dvwv xrizqhd omegnez nan yqajse lgef
gbej rvek aehiz bgje
yej cphl jtp swe axhljo ddwk obwsq mnewiwu klddd
ipiev henods rpn qfpg gjfdgs zcpt sswab eosdhn teeil
gzje ydu oiu jzge udy sqjeoo olxej
mgn gox tcifta vzc lxry gox gox mvila qdl jipjnw dvu
hxk xhk unhdmdz yomze povrt nbww bxu qqsqc rvuk tgffy twddm
fyx fyx nzkm fyx
ymnoc zogudq yncom tqrob sidvy dfuu ccjpiej yidvs
bxebny akknwxw jeyxqvj syl cedps akknwxw akknwxw zpvnf kuoon pnkejn wqjgc
kcebrkj zmuf ueewxhi mgyepbr nleviqc dez
argavx fqguii gebohvw klnrq rkqnl goevhbw
ywqi abwi eswph nlplbl pswhe lnqx fpgk lllnpb
abpb mpkw ampey yapme xnuyj
tmuaq asd bhbs sqmbsnw wsbnqsm ydwdncn rpa vrllkh
dnltf cck djy ydj
wywwl scezo clowuz dkgqaj dohyzcp
diimshr vlmsnlj whqb dkicau ckdaiu terp kgcii npqc vvzrqzv nol
wfpxe sqf tbb ruqpcq zfgb
kajykuz tsxgtys vuz kglmgg ihnnn plyjxj rcrvo mij plyjxj jqiur
pxs hmet dwgvd mvhkvn cjxg yvid vmhnkv kwxz rfemsua wdgvd okixk
lzwxas ddtyeh ivyama crrhxdt hedytd jfw
vjfv oyd fvjv kfwlj mradbx mckseee xradmb
llga yytxyvj lstspek lstspek lstspek
fabgf wgop fabgf bvsfoaw
grqnbvo tntomdw hizg tmotdwn
mau ufkw cxfi rhehj ebe xyv rhehj acxngo arl qtl rhehj
kbkto stqjtm tpcwshj saerkrt pffj dthp pfjf axc gwmmfdw glnqtdy xmskw
veff zqm hzhxap lgwnwq twsdk mqz xbbarbv cdx fhnwt qjcji bbvbrxa
fjw eds hofskl nkbsv des hvx xyn
qzort qzort qesz rtq oonk vwzlw wapoj ifr cta
pja hvy nhjg paj smtfe fmtse
xvi tcjj xvkjtab nqftt aumijl xkd cmilegf hvsmodx uuo igmcelf mslkq
mdhezgv lelzy kzfvsqu hvmvaxw pxiqjc hvmvaxw kzfvsqu
hsicsav csshrhx znojm eapi lhmzq bbwnz seao gfk azk
pup xtgjyzy wqt ijeektl
ktwh qdegzs btj pfwzzho
xdkmdm izqtjrr iqbke vtp
fmrbpdr zpccv tmtwx tmtwx tmtwx bys
ehphfgq idd ehphfgq ehphfgq uphe hvrc jcscne nbnslqy
xzqucgj fcih fljk barz lvln hcfi azrb
cmfmclv mfgvifw rnxgn jpg bsnq wnduzj ymsdx smdxy pqomf
rlqsm qrsml emts qsmcowv scmvwqo
tshzkpa zwtpda ftsiwo nil tpawdz kjpa ptzashk
mnep sfc swjawtd vnwud gyulluw zpa kmwyvln evd btnmoi dnwe
jwq scepq redoxmw rbdzsa wlkzso kxpm bttg vxuc moxwdre ijtdd rzsabd
wpvo dsjox amuwjm pls lgwksva ctakgpl rmsjj lzwwpr zzm udg
bji obbn tmwyc afpmkxr glvrd kahhgpq rna qkxyntp vmd mloshc
ymq rtnr nxjzm pqiddrn qmy vgxw ull
mmzk ikge zhtzhs xyo qwe lll gjjm icetq qgrr mzwqa knec
kxomfck idlh xrbowo nyetbnl qskh xuwkkxe upmmmf zhvuyp
srcwyhl czgr xmhuws jueyh xcuib xhsuwm bxuic
crkueh beyxopz xpyozbe dxgadw qktmce rjropjg
lbktun imdpcp fkssp fhcpt fehho jqdnt aoewa
jmun pynzjo trs ijwcc pelf oft pcsqdxg zvql
mneaaq vjrg jidlrzz phd mvxpivd ldkhu
sao xqw nrukn gatkz quscpsx vmz oscoeb
goi wzxhb rrk aylqqcd mlcbvvf ororn heptid kdu byevr
qsj lsbieef deez vzwdx hez iwd
lmgfb keqt mqbsuis ogrr errbi xiqe xsszacp
ato hmk zfjaj kmh plxup cida dqd pfwh nkbxvpr buajw pxkrvnb
cli bdwu vrwott vowtrt grle
zisgks ciuaqr zvk tcb kvz ugmtv
oegrojm wofpwp gnaocx rweyull ellhwow dtefylf dqsz oiw varr bcirpf oxusz
oydkmib oydkmib yefts gbl gbl
sruwjk pgkrp kea gppkr zdcky cfljh
obpxbax jhpcrj slcsa lgd fborz vvpaus wsrpsws ifijuzo
rixz jwh uhdaf hoacv hdfua
kntk qprmfow kntk tbmcjx
vnqe ooyxtb ixl hdmnpn orpz ykspl xromvj kowtq wmho gquos
ynk xjjqw sut lmtub bmtlu zdo dztlk bpkuul smhpx rbczg
zals csdbe sbj dibicq kdfwwt
coyy pjddlfc lwvhyms ldjdcfp ryubz kfwst dqjrjja jtv jjjaqrd
jaexhms iqoiln ewgyr exmnrr fsr lgmyy fdofhn
pjgyn hfoz zbcnz nczbz
ovntivq vcey vdrkse giu ohyaxy ionyy fvpn yvwrgrv qta
yelpz htbk njgeyub tggh mdthzp fwyux rduqli twlhfp pnh gywif ttn
yxhsbil vplsmmx rgtq grsf lyibxhs hctnkfr awg lmloz jroy lpgb wga
kzytass szyksat tyskasz ehmhhu
jkus hwjv ymnnkk yffugg cvtnits gbl lywkn szihcn dbrbalf rxqpbqh
koyfcef wkom mwok qgjrytl
slmhry lcr slmhry lcr
mvoxbt cfkz purnsui xar ouhtc thbx
xcdifw kvvxyrj knac qmypw bou tmukqy eusgaoo bktiu
ablgnhb axumg bwpxnjp zqpc vtw ghhoxu zqpc znfpvl ghhoxu jlg ntdk
vmvc cdkhrx cvz rvxk mmcuo udpcayd lsmm gufduzt linj
mgyeqkv hqionh rgnqgz kkc qrgnzg egkmqyv topdp
koa dimwx gjxa atlfdy
uuez ueuz zeuu ezo daq
ofpaw bgomvmt mqa dexpy mbipd epyzcoa nuwrh vwly xppz qkjrleo rwhnu
wok grxk lchvtg plrzr lwaax cfeu ijapws dmkdwc cfeu
zkd hysxxip hlydw wicsvy gbwoaw dapre ktjn dzg uri
blzh hblz qgmjceg fyf
vkhpn xnc ogva pjrh cxn hkpnv
aja cldzta tdcazl lorr fwmxxh knilf ges tdhp gnlo vihrl
ucpr peair nlbmc msfg
trv ppq bmo xqd vbui yegsr xqxawu fvuz aclhspo wnan
loiq fvg kare rmgq hir rzo ossd ziw renh ygtkjys vda
xmans kio alexs ujekfl vvf ddghn
fcxvsf bjuytet zrzsobo uhn mlfzhlq bjefs
zys htlqvky plno pbcqfuf fjwc vshkxrl lonp lyzmy dqmui vyyc glad
tlc krhcter krhcter bolk tlc opryl
idcii dverl uswb wusb zgax zhbt gjsnlso yhs
cti npri rcbxjdw ollj nirp ghfvxzh
blyhug aflnrrz zudyw ccnstq cyoju jxtqoj ntuknjq gunjiwy ycuoj igac cqctns
bul yehpnw jifjrhc ifetu ufrodp hqzpeqf hdvpc qtvgxg ibb wcxsitx xztshb
xzct scetn eoaufyo jtudgkx xrpgxip lpubtq juezstc nuc hokswh obkf ipbu
nfq lwpmn qltal xnphsqs zlrgf iewtrtd mqzsob duokpy kfbqs icg
vil zjz xkqrvni uay ystq
terrrnt lnfg clm lbs ptpiy ybcuup ayzjm pqugx lmc yppit mbf
dtajh vqivg vnblt fmn qxkw stiwna pclrrr fro khu wbslnqp tjyosu
uqlehn tjuiy obt uedct bbwiq uxndqn
hiqfovy xiimca zwne ivunvjk cmctzi mxnnrx dclib xzaoq ieztkg
shpr xuorihj chuwq poadbo mhtvex gymsp iltgl sypjfua fmyh sgiv
alv nxjt txnj bhact
vjvtrex obmrxk fgigs meixbc fggsi awi rxdjpeg
ypwo oicmbdw xbpeeyj uabzj cjvutvc oicmbdw immtmks
exijri hogl epr gzdqyur xiiejr pre ihzlgzu
rlh qfhx lrh qmvrx
kogq okhd mivmivb mivmivb okhd
taekt nhjaa znbaahn iaospxy jawwf
ytdvq ghtqwud jkiig mre kzmmjxu jba nwpykc
ktyzr aczd exgadhb uinrgac izazxky yyfe
yrifb qgc lsiuapg teyelxn ugezu
wdzkc ltx fkhncb hwrecp kfbchn sfcpc hjvq
rjdjyt ahwxh nvggsmx lmz oshd xbcik powse ahhxw yhiq gxmgsnv
qdr qjnam gag qjamn kooek mqnaj
pza gml opf ilfbblu kjp luilbfb rhfrzgp ixagj ofp
yphz runy dhull bozcsgk wfxekrd akgkbz urcphc
tfyxwol lhcl npik beug
szatel yfkve yfkve lzqhs
yjzqon pcjibu bdncmcl kczuymm pbmg nyn
rerqvs aoxucwi pmstl sstawu joqu abvcchg mvgjn mslpt vhmfkr utusuh
gqbec jjpqdh yeaiavi nledfi jhzwc vyxjpf momnm vnknjs nvgjzik ipm
psirt rispt lrkgma irtsp
jbbaph xvunete gsvnr mjd ifxhpry cpsx hmuokkx vhcm yth shrrl zbhd
gfa bcmlxtf sqyanrp cugg qxfvftz pbl ujsgc jajxltm gugc oil
xjuhyg aht vmyvzhh oby oyb ybo xbybgmx
atfk qjudfzz mky tfy
nxk yzy jqgg qxgjt bevvvv efi xcbw bohc zaqlqjq
hdc qpnx ygmtqw acvoa udboxw dhc klh mwgpk xfpuri
cycgbkq skwhyf skwhyf veaqss skwhyf
jnezf jowjt vsdu uck scgxd fvopomz vfajslp
djvi epgkyqn apzd cpm owm kpwih fsr adlhqu jicp pmc
erxlmhj wqxvofi ugj ttrmtsb
omku vmrgoy tdicbje ewml dfnwbap
gpih pyt ptsmzc gmdbu rqxkqmz objm nurxjz oozbere ztxug koth
jpnl jpnl dmeh qed
intdwv ksgw qwlzhq zpd lrl mwjl dozrjwq aujbet bsnf vhqyg
eqs uot qyz xor aem kmrh mrhk jqx tsbrf
irytjab mdzm qbb kkjt gofiwo xgbovg kyeyxqn tcks tljhx
zgejy qodgah nqavvx xnigdvt
eqve bizrxq lkhz yzwxgt nwe zfe sxypkz xnssept
bxqn lkfg yfxbszo sphwifz wnj crhbq dvokzw
vzn afatwye ogzvnu vnz rfjba xtugnj kpbgly ocsjd
xrc cxr rahv yvhk khyv bed ctgbuq cmqwpqa jlbg hpj vmesvw
jbshkya dgqw lfl mzcch jxsg czcmh ifruvlw ufwrlvi xcczlol cqqchmr
rbk mhn tnmqdc sxnnn kvoa mhn sxnnn mgemob ieiyajs
cqi ghxg ghxg ghxg
uqwdxn qli gdtkngp gnptdgk udxqwn
dmcczr dnjaqc qwdta rhrbi hkdwe qdjcan peic iulaz xns
tcmppb nzq ecy sitdud nft ecy afrbf wvnc vmfpzx tcmppb cgb
plitv efnpq mjqav nrxxo izg lpitv rwbzdo rdbzwo
day dntga adtng agndt hhvtd
yrg iudsh gyr ryg
qttyeew tco flq bszw jkzftc wdh efcwnp mja rfmju
moch prkze uslzyv plhjuy kxczyq qlmm hgq
xtg ypz izy ixg bvs xlqgj xcy sepza abiylsg
wxvsxn bqag jnlzgxq ikxwa dfd plqxl xlgqnjz nuqvoyb emhodso gaqb
bzjdsm xmxkj fhuqn gauyw ntl kjxmx zcxdr vrds
ofjcc uxyzlk ofjcc ofjcc
zwosex kkvwobl cpudsmb kes zklf bayuojr otqnyr udbbs
iqpvzh ybds piovrh oivprh voprih pov sfl
upns cpeelht xboyk itb hsxdmt dnwgfbw upns fygf kwdpxzm mli dyy
djwutl sikh shki ikhs gecd jqkon trqyw
prbbdf vdp bvvfjcg ydqb muxygg
vhpurzn psemqe xwqfk hrvonxu nxkxacq
xicmhss tnpja qiad woipfy uvadcq usljh hzgs jntvfv wzikk
mmupc twntp upcmm pumcm
qnisuzy lppnfd uiqr eyqbain uxlp eyrfwjo olgkrps sbikam zin vckr
nmokl skfni jcdfot njzqeaj nqzjjea
slmaxx offfzqp wudicrf nfn rwfcdui cwirufd
paffi murnjd oyj lbtjdqe babuas dtqh qkt stapzl yrqlp
eedc rig zmnfmn edec ecde
bcfdf edovdj lacx nzvze sordvxj ybs ujh zvvvp rzstejg ueosuq
xrrfsd okuvem znzlvmb jwzcb bfg bmuxbc qzwfry
pqgxybd cvgra acgn ocd ancg fvfcx fbb bfb zfzv
tmmv mpywyg fwl bnvcv lcnv flw
xxnfbro papc ianru beuzx apcp rnt
wuyhycj nrnc cka ebg rncn rvo wcyhjuy
thh cmoog hwf imqfp okzpxd
rzxiqt rtaiy ytria tyria
cjkmro myif myif xyirn aqxlol wlhwibi dhzsen pzwgm bfbz bufjs qwffg
mxhiui umiihx zomyll vfieccs
yyntf rjk iivgj mwh rjk
dsshx wsmaxhc xcwuelh rdsgtr wsmaxhc rgtsfj
rdh nwlxiwu xsjzbpr bsgps
ufyo vqtzkg kpeohu mxzt fyuo gawgaq youf
hzbhut bxsnjwb zuhhbt zhhtbu
pdz sgntypg ragev hrrji goitft yphnebs xjzoo sqf jsuzijq dsocb hcxg
pptsq woomypc woomypc woomypc
axcg wfbnpql ejqb cmnn nncm csvlc wraludb pkmp whtht tfpicer
moom oomm ommo vfqeii
xvrgpp rofl yxyrkb oage nypzau pwfnkn jxnhkw cyxsi clzb adwpuh
mfbz vdtt muzhm wvwwfl ttdv
cpqgvbu byc pgfrlkr aftl tqm zcqxi juu gnf ppovxh huoa
konpcp lzordid jqng lwxs nqgj gghkxmf kyn ngqj
iorhccj xfygc cnfr tysqc xpcyf vmjpitf nut zmrk mgbrtb tcblxwf dkadwrm
kov jtmp xoatesx qxkilp rmggpfx ltpxzwf vko reqms mqq nps
hjigmk fyqy wpuwe mwmso thsimfs okcmeyh mzqkez duzaq vzhyrm uyvpkox cwivpls
ukoerf korufe zhs ntwfz hugem vriyk enfaib hrrcdgf zllsk vkiyr
shkx khxs wntpjv qdevaw noqyht nwpvjt egh hgok mukdjfi law bzbvjz
dquk kczxsq tdu trnkjs wqtdc ybvcb
hlrotxn cumcjkm qwufgle ylm nejh hnje pvaigrx myl sfvsd
szmvisn aywic vsnimsz iufmybr
zjozr zojzr qmn ffrggdh wam dafvok
nxkvlhr posmf posmf posmf zhlzb
ywis kpqpyb qae zqxpuz pcj hbsfz ejlwa lajew znuom
qxsl ussivur dstd avojo
yoeagao egpaqm ymzf kkauy ivm illir wsvchne skmamvn nqxc
cldo ixzzy vhk nra zhypgab
qjdd ecxud tbuqq mpotbdk tjdpczn knncm tyy
rbfc fhhjf innia tsjbbbv fmtcuup rapvhqz ebpzt whdbms gvjoy lykl fquvcby
bihhfwi lhal udxz uwjwp dmb
fekxamy uophet yzvv rqj zawlp ldrv mdymkzy taauf
rcwxvmh edueui ltdyo xfghz dgjig senm ifj
qcu fii axmgijj ifi oixjfsg jxagijm
sdtyr rbdh yvnvq czzuig wro
lot xkto cmpiena nht ozcg aotcw xiegl cyaouj und lsclep cexn
pgihljk cmgmv sajhi zfvbqij ogwoc ajsih zmppe
jexwkdp dwpexjk mzjydfu bff rubgdb
yshfhx emkl hshxyf mkle
dxgti jdo tkwprv pbxbrqd oiz gsbdphd qotu utfdnq tzvve bqc
ovdf bshfxyl xspjpd vljdsm mgkd djlsvm mlsjdv
etyia eytai sfq qafj xzgp ewhsn snwhe lhqp
zjz mwh dorxm ges gexo rckwsa dltoq mmntha
hqkuj ypsjcxo dixbe rmvnhjh ovnr
edc iffaxc lolu xwrvpb gva vti vit
ceuxq xbwejr lzyvm rozseit cwe mham fivpwj qtv omaktaw
alzdrk tsxbuld mdbq pgbdtoo xwf vzalric nqe jqwlxsy cbtylu dtubxsl lqm
rqjmjcs exjpn kpilcgu ihcm lfadjm mlri hpd vqs cxqwqhu twxrtk
aeuvlcp aubvnw riedvz arypagp uuvg kliehx cokt ogh xsdw cdsyywv
ddwrgvp bscaq bbfv qrbutp
jpdg uey eyu uyarl zgbk qyhqq fdvlql zmwkp
kbt bkt lebhpfu smrzt xalw mmwa zmtzfry tkb
fcvcv oewfzu fvvcc mldww lwdmw
ejrltsu sqoyx wfvsdbp bfdspvw bfir jqhgrmt ofdmrjg ysq
jzwucwn erqjd eikq knpf cvk xvqnscy eei wvfjzmj xujq cqaim boev
jqhkmr ipjpj zwno ybu krhqjm zqfyyzb dyciy
ugwsw rpwteje qtvwi pwyhrzt hfcdfmc qbovk ibws
ffy kdder qjookz bfvmvvq yjzuaj fvxllfb pjyz jcezhye fimyydt qjookz qjookz
loupd nwsc yytvuqo ltcqxnf
iho ulvxguz fxbf iqu ofjtmvq xhs ybbusd kxg mebdnah ucttcf zufb
wzdb wumuhtv kef aavv buu xmjtlur faaccl wospwff bjasr eapfsi
jau qzszci ciu inagax
kui tqig fyovsp fvwol fyovsp mzth tcp nhoq
ajdla wtpj amylu jly tvq wjqef
ofqc einz bdze tows bdze eew
avwavzt aesrsjv lbmpi hllv chdbul ezelxn
imcprs cafb clfg rsjo iylqu nvk vkrq izezlnu vkqr tyhnv
rwj zboui reh buzio wuhpvid cpzy jrw tsbuiby hmxwqr ute
ixq luwbi uoiwsjh souz ysoubw uilbw ffwjvw ewzswoh hci zmfdaov whowzse
xrhgqf xrhgqf giyv giyv
toiqgzv gakg udgdlb wvi carrn pjyha muqclu
wuxthi srtszr ourab hpds bakvy fnk yefe yfee doowxcx
ijdc ujhvls xmy hwg yetsda qelbe nang xgywo wgh
bhm icq cnam dec enksf qfctz pwxoo bdf cnma xoowp rbls
jguzh fextz yax kesaunn waljo jltcza tfzxe dezs syi ebwxnks
flvq bzgd clvqw ahtyvu xbdyv wssxx boscm grgl nqcg
caskpli hqctxxc nwpyo wjlqfqf ebti dva
wmsz fzpd ikgeq gti ejftoou ezs cqef mybojc rgwz
mdaay yfppa pavl fuuvfkh hpod tpb dhxmia emdecm rbqcwbk vecyt
neha rmvl ndp vlrm dpn debghi vyhvc
bnp zkxdu iqqkesd abtlx hmjasdq kyvekr krt srrjyd oxmfev oot
dumlcqd ccm hyir oritdz madjjw
oakqrs advfmu verrc zkfdcn btndsp
onlkinl rdtm bscfxre bnu oumyrvv kgc zkj
tfxfsgm uwmic agswclg uofezgc
wpfdyjn kjlihk etbot fbu scm gwccce xgownte wig cuaijbo
bzbdk etozk qracb oftfoo lkooe
xupzw vmxwu sis wzpxu
gbz oqbgh jwgrru bzg kwmxcfc jrurgw
agyjnyc tuec imxlult omwiyjg fiwnoqx nhmnro qtg kbr agyjnyc
koiq llreotu elrtoul dubfvgy whq
htm lll crzppb gdjaae nsmxzh gnfvn obiuy ymspzbo iuboy
thm xlfrr pbxdfo mht tygi sapxgbv mmngzf dej
eus seu qmstw ues
yvfsw esut biblze kbjcpk estu xih qzki ezlbbi blzv
ohq ugc tqqeo jygvpwm vfs ldnfibp ycbpa sml rmime
kuuow gbg nzwdaf wiimtg lam oqmm
wsbwkdd hda nqk ticz mvt
gqbljyh zqugqs cjod sxwlqy qkfs wwvwvt dsojb qbhjlgy riusoa uosari
jkphfx dbt les jsvoij rnuw mxmmchu dol vto swn
qqxe vwvephr twdqlyg cvdu xjiych clooq vkwavl whvverp yuz vkwval
txtbudi tiutdbx wqhx tws utgbf amh hmf izsez ooz
egdube nhsxjs nxjshs xoy sjsxnh
egdziod diodegz ejxn zogedid uhhkr rnm cyvvuc uqbl
rbn pinwag sidwdwv jqdbe jlbemk blkeaqq ipfqbtn zkrbp
bdryz sbh wxvn mhot wemsfm oemkff
vxyn xvdwwo xhd vyca zxjaw vfkz xhg ofsphks dyq mmzzd
yjrqsjf iiesdh envwyx rmtbmiv ggzsg ukx bprfym qmyqc vag ymho hjtoh
fuxxrd wbweptd vkoffr wbweptd
gfwcez smetli yjyh pslpz qyokpsm qsy cxjymg wqfkf obuq awz
eqhm ceest kayf heqm
rdi dti vntcf ewkmpvf jjwoihc
sfq qlb xrm ocy vtnj zdznbal zvon stln zwnj wsgalvq vhphap
pya jay mgnyo pya xmapdn
hrwbj xhr gvwl ktq ktq gvwl
rzgqi hjwtthl kxhggbl wepc hgavj ctmqug
tzfwkc xeqfath iiuwq iiuwq dhwuvy
gibagy smq getjofc lum msq ulm xuxu bilrus ily
xlv ndrkch hdcknr nqltoze xvl
wmc vuzlrj mwc atp cvpx atv ujatz
hxpafgl ymjltv nvvpy ahycdk jhpdcks ettm lvqyw ertpivm dnezwxx usi kdhcay
vrh hqyomv mcq ilwjbkz yprjxad
ugv szfitxg zeluib pfj ijm zmiigxx gltxzz jzljhgh otskue
mxp bilj jlbi tce yfted zxsqas ftyed
ykasqv ehye kirmnl upmi dojwmw wzj ykasqv ifixn vreoypz
kerbgub nnroqk onkqnr gbebkur tjhl knjo ccsem yozvrcg
ygq evkoj wkn ffljhds scxeibh egsybeg mwvi vgjblj qda ywqpp
hocvpl ozgkxp xgmj ejzyxm
gernu kks lxe nxzv sypg xle goz
xoatis fjp wzlbo dzkonz jtutyj vdonj swro tqclemv xhomap ymeqkua vaxcw
mxcyjs ywyxndk wng vpftv nsuvu
jmiyyhh gwser shgcu jmyg cjzegc hmhe eopg kmkan
smdd dmds mgqhtkh qtamih haqmit skkcy
dnj rmggy rgymg uburbao rymgg
klcpjgq ons ajyv sqryt son pjlcgkq xlobdt
piw shonk tzi mcdumz noskh tebolw yaypn
ozm mvmjgtg nxj weommiq asnmhzq xjn uobztuo cqgjh utfb oydt ommiewq
qlwgsc vvpe xgft ahpjc zjtx iyof scwqlg dxgcokx ltrefj xyzq rwto
ggqdd dqgdg ggdqd kjkmmfp
htzjam fjbg iagc xls iagc iydtf ihxl boa iydtf
vhe nqj bwgdoi hhaoa qtulz
axvyja hpdkwee hnryj prou rgadv oubjdqg knjbc
caz xibj wqkzwe peioeya vmz hesy ftb
dudwcr gupj sjrtzc xsqbb hiet nujv bebcvsj eks uuzlcx gex
kywozi tfzuc mflssw hnxxxqt zzc tzfuc hkokuv mnjg lwkavjp lvpwjak xez
izgh zfv cingjt dkf cknite qox vfz zvf
ojpu dzk tehpgnt gntpteh
glxfxa uxq ajtles ahgzn ajlste zwgc mrpu adz wuunwhc zda
hdgdtn hnoyz aromkb qujfv yjgmn tbf atw
uyvsv oaopjv uyvemxk ldpp tthe iisjk txr hebmd yxevukm rkziao znt
ypdr mnwuzvw acpg kzwz ywbn wcrr umrnlbe lkult ljify azyhu mgqoo
abmpl omsd xmyl mxyl mgoq kracrf ufm ppwi zpggh
uxfdpv jnm vvc vchunhl ubv ktj mxolsxz
fcja eci edzrb nlvksaw lhf ycohh tfztt xso ceub tyv
rkwtp tcmmvv kufg cxui hdamg suuaej fgku cvjlv
oldbgy riadoyo djsi wca zxoeq pmemqap aijxa
nyy ruxcosx xisqoz yny jvzfpbe tlfdiaj ybd jifatdl zuzv
kxwdz qvrvx svllp ergmme
swjfuv eronk favcxfm acptbh pnbjn ciqcrlt rgvdnlt icgahb
ddza xxfn use obqka bfzwjp gmf bld fyvde mxdfdl
ame bmxbyf ame bmxbyf
rdgby pyfog dybrg gdryb lpztd
sntg impd uxgxai naoalb ntnk xgix
oadpmqj oso criln izih oos
ouzjq gtl ito xefqt phnv ouzjq hoyjjj
mlp rboq lpm roqb whvp
tghcw ggshevw dzsgj ggshevw kec ggshevw
kmwhb kfcb mbhkw gemz fdh
euve veue kplrq evue
hikfiw bcdktj hcnawja gjasvwc vcht igrzly rkxijxe ikfwhi dvmp
hvksis kafs ktcs sfyqzyt etctrgt vodwr wff tskc juobnm
dpcsodn ehwc pglywfl yhdp mdiyzx
ibog umftejh cfm pnxhna wqwx yabnk ygws dqw
dezz tqw qism rarfe fpmlab xvbau irwtfs wwmoyss yvn xetqp xtqep
pchqwk npsmd jefec qok uuc ucnpz rlkakn
kudh rjysb xrdbx bkbmjfo xrdbx
rogu ssdwsus voa ncw obkxsr
tflf hlevus scq rrbpat tau wxsq wxoblt
rzr lex kqdy whtj ffnys xlgkkff msjhy dimaq hrc wyde qkwf
ghtwd wernjpn tdgwh olrfvmr edq gxvp
rjirvf skhdgln aauit bipu mubjiwp kowz gyjfbjx cmgdqs
aftfpbv agajyy aqjll vsf twh robpys lebt eav yribup
sby ymkla sxkbfwl awmd nhb vlp
kizvjj ycjswr jkzjiv vuy jijzkv jcs
cwvch xzqfal tephz lqfzax cnkbdcr mql zflaxq
jjxzwl himpra ssjf bibfiui seeaq pzse
jogrn jogrn sqew jogrn oixgwr
khonpyw iiyxir vybhc ndnxxv kzlt ipmncn
okqkqu svbemi nfn ovd xgwy edd ujet nrrbv dde vdo
jobvf dus asvio vaosi sovia
knmz qbz nkmz zmkn
isbmopr unduey impobrs hea zswciev sopbmri duuj
ocs ntgnrdu kbvtzp cvyieu fiyn znmh lhrz ixtnzrj vktbpz lbpqx vzkpbt
muduhc sabc dlyoisz kuaz ogpyepw yuog ictiiqt
xjflsf nfklvml thfh uajnmby cichyj xxoqi lpime bxpyx
riahifn bohbgd obhdgb jni qzvkf ybp hjkkwq ytutd cakcsh smfdoe tuytd
iddku nccp zgtl yne ppzpqcx lwm
refpcz uqt uqt uqt
mtn czxkagb nmt caqacrg bcakxgz
itxjii uethxbj vpds bsqod diqax inv zrwt doepe
bfyaj nbvhg zmi buf
dtre dkwdr nrapm qtfth odvt bbcnae vxuk gqm enlg
ybt qcfozrk yzrh bfp euuozuz pzsdkxx mhi nbkzprb
vpuhqn gyx caint antci vfep incat kqdakdx
ddhi chgnjk ibg xbemitr mjtdph eovw
ngbtuvq qdttlsg dbqhhwk bkrqze qdttlsg qdttlsg
evn smvhi dgcmn xjo ascc ahbpj uvzc pwn tung
ksu thr omg onvsqzz rllakar ysfjtfj grxwyx oawix gpk suk
qvb iouav yhtndkd vuoia ouaiv
kud kofcip hcczrgc cvvxxlk rvyamwe duthdzr dftun
rgv ynw gph tmxwfup nwy
dnc trawj kwzbx trawj zvp
ogqxijy tbqtsg tbo vqinnlq jbvgl sfafh rve mcxqs ubh
qccr lpv puuvdyb tydaflf uxic
tlon tbfwkxg tlon tlon
iytiz qjlqaqw uixb lnt zwro uzgxqfi gklgnqs zwgoidw iifk wkwdo
tmvhxw tmvhxw tmvhxw fhiqpjy ejk kvysd
cmphg xjjz groiccd dvetuk xbwa zhm lyi ohhd neg bxaw yil
kdmzopy lxx bvhach goxmxu qbqvzcm qbbrhvb nrfom aixmio grpxz hbrqbbv lkucih
bnqn phqr uycuxc mopyyfh bbpesqm stgigq stggqi cwtjm asqhpl imvlxj lbmloo
pws iuvbvjr cwccm qbr srqnstz cjebq
bfh jobkcy gtbroe lpagq icmax jobyck fbh
ounqdo qrrr pwi alho rrqr beao rsioepe
vrccqge qvcgrce cbslkjs qnclw rvmjkw
aaxjns deupjs wtgxtp penad depbho tbrdt depbho qxg zhjxpgd
drqfo kbp jfa jaf
izn oczcitj cpae quvzqo iwwk jck idjdpm
ecort zgcvxx bvh vrprsf
fhubfvy ndcfjo kol hyufbfv hvpka
kpt zgajpc rjvsxa gayznjd
xeoixk peq kfu lqa mjnv mzvh bicl hlfk
wyt imdx lksy twy
xeptp ilxs qbsqzwn rsy slxi xtpep dsdkekl
rotvbt fuirp elos ciu nhx bxej trmtx ixn xbpc vrxtma
skcprn yns sao ghlq vftezvc aaryahy telt
fkaov gexa xijv yiksa xega dhgw okfva gxxs edkecag mqbqvrm nrzcqub
ljc jujxeof fdj gdzjzr mabbktu pmyrfv uspven zxry snt hrah
nhujhdr jdhrnuh midm bbavhpp cpjk zmpbasz eptrpou znq zqn
ywzfq wuu lfflon uuw rke qzwyf hjbms gakx
yqrq zsk jzn uuuzrml kzs lseupsg waynfh blech
gwyqej weyjqg uwuje uujwe
lxud rnwkc bgygkh csq rfvtos ystqp keb gkakodj uthcce eqxifl
elvj evj rfwo vvgkosh aarcgjs utsbh orwf jxcqvmh uowmktl qtgf
bqszre oxntty ombwiz mbiwzo
ccp iilcc tacf czk giwv erqi jgdfah wip xtrzhv wosvbyb
gymyw rwsxeg gvydr izyk spsonkg knospsg
djj tbr tbr tbr ice
yyzh zkykapw puydtik ysxc hjumhsd cuhhw dnnhida yyzh lnklymg
nhbcxsu ccrbbyw scbxunh ghxrkqh brcwcyb
latdaav sexa ipzuzjl ayusb etb fshh
giz akqd vjmabii arfuzgv efrww jxkvolg efrww vrnzgbx
jmcc vqy adkzj fqrkdo tjrczp ccmj cfponk rptzjc
jsviu sraw imsj fujm cdf xwqhl lhz ojejzuy trtqblg
ibz dulm muoq quom etvjzxn tuhrpp jfukac jqctqn qhgbae msgmcit ludm
zgx bpfa elhp rnyqtq wyceube nkeuxz
lzxfo vygpecv jszacku zfxlo
cpmv ysaaj xnp wbvqg hrsiuj venjxna yeqvwmk ftaga dcqxc jgapb rqdixp
xpbbe tyn hfdlu fto wrgzkou sxylv cqto wdv xqc pnu rapk
pkrxypl wnu oipq tzbhnc gpug tgzf ofjb
mvaz bwcv gll itgcye dessw szt gzimgeu bvmohh wbywyhc kzerxbr anjsive
lhvnrzs qkmjwy pnyciwp mgp jfdz ghvtf yusfzg upab
xbscukx aubulj snbcmc uscxkbx ddpucyg
hgv ollh yzpjmpy fcicyae vhg gvh
prd onyd iux oik xui
zipadig nvewx cir lbpcusx dljqy
ifyxzsc btmy lsu tmyb lus ldyzx
egmyxbe ieasvek dylmj qahtatr uyqgbk
mejjczw spj vaekp kdud
vwan mgenld mnlged vpfuil euoxlr rclkpi dfknyoa rhthij kcyxl qaxab crlpik
pqm eihogk iwml nuauxi ngilkoh jmu mbdi cqxz nblb rmuj zczdgp
pswbe mtzch wbeps fxtnc psa aioff pas
prwrpvz oadpqvz tgzrt giom pjyihh rxdir dmya xjolzxv
khdybe obqkjn kdq jkvmgwo enpat wyw qjbnko waid msest wwkoyts
yep liv ofmtpod imdd qyw
afnrx jgn gxarpb myltj ggrsajy mdaobjo vbtn vbtn zlziz eds
hqr kqu oub skoeqk icnfm cqvld aay bto
rga odaf exoosh pwevx zpbd plaa xoseoh
mbr gqu oxvchrt nqa larxmjx pfozej
ozuo ywubjbg xcua eblwqp nfdvw hmhen zkjfu gmhgp bsyi ktprtf
src vrysby srybvy znwjm hmypwdl gdmau pqe
cldr crhi lbaq fbuduyn hygbz uhida
qrxukq dygkp oaks soka oask
vpido ajgfq pwlv hezt fmg epwrxo rqvjke iovpd hhkjm
anxf ydl xnfa hqph olorp
exydcg onxjm psqlbv ehz boar hze qsblpv
mnzrvc ipj swg ijp sgw gdkntsd fzz grqwly
erpq qghpj fay gci uglm afy
jwbq hbxaub jpdilyt yvalrlk topl qup
eczonk ftcc paltirb owz tihhe dglxory wthvqcb qdnxm lirejh alyxsr
ooruaby gboyeu lkv arrz jcqyzl uxlfk fhmeony fcmh
wzr xjb pwmf okqj adwcedy lkidve uwekxf asbdzr biub
dikhur pxgh urdinjh wednf ulzdxs
iplf byt tyt qnnlba pzt bednml ljjtkvo tjovlkj uwms xat
htzk ltmfha xikeze atfmhl fchxhyz
lqala bqwgcul vetaa xuxjau zcb wtdmomu wfqmpq sief uyblyz ahv
aytvvo awm ojaaigg awm dbfaokz
abq npcyld fzbfku oia qss jkxldm wgtmki pasgxi dieix rpqnuac tecnfy
nmr qzfj qjfz lsz vnahex
djxoo jzlkh svy xige
tjlkkg glcuvmh fwzlhi ecun qlgulj hrfhyql qgdlf ofakqdf zokkvm gelxkq oowgs
upfpk gfstjlv lxc rjd nhj sbq jpzsz zsjzp
favd nzqfdid nekfjsf mtjndu
sgdqx uvpuefv vhwrgd aivav gsqxd jdhfoq
llaf cthbgy njrpw fqgkx jzf xqkgf lnrfrm gkxqf
wzdwlc wisst alw kyjeur sjsqfcr tta bijnyn whfyoxl
dtjr baxkj lmnyrlg nrmyllg
mtgky xmwf zdko nnocxye gytkm ygp hixk xwmf
maudjy okgjga uadjmy dzfrk omd
azz ajdcqkd bcafn zaz dcjaqdk gylyzo
xzvfbf fopmfxu mvftgr mfupoxf coyhof talcc vpkslo")

(defn valid-passphrase?
  [p]
  (let [ps (into #{} p)]
    (= (count p) (count ps))))

(defn day-4a
  "Day 4. High-Entropy Passphrases - Part 1"
  ([input]
   (let [pp (map #(str/split % #"\s+")
                 (str/split input #"\n\s*"))]
     (count (filter valid-passphrase? pp))))
  ([] (day-4a day-4-input)))

(defn sort-words
  [p]
  (map #(apply str (sort %)) p))

(defn day-4b
  "Day 4. High-Entropy Passphrases - Part 2"
  ([input]
   (let [pp (map #(str/split % #"\s+")
                 (str/split input #"\n\s*"))
         pps (map sort-words pp)]
     (count (filter valid-passphrase? pps))))
  ([] (day-4b day-4-input)))

;;======================================================================
;; Day 5. A Maze of Twisty Trampolines, All Alike
;;======================================================================

(def day-5-input [2 2 -1 1 -1 1 1 -5 -5 -1 0 -8 -2 -11 -4 -5 -10 -4 -9 -9 1 1 -11 -8 -19 -14 -6 -2 -1 -11 -23 -8 -7 -9 -26 -1 -8 -11 -34 0 -22 -17 -41 -12 -43 -33 -15 0 2 -41 -41 -26 -48 -52 -47 -30 -38 -20 -4 -21 -17 -19 -55 -32 -12 -55 1 -34 -8 -15 -59 -56 -16 -23 -43 -5 -41 -56 -32 -67 -14 0 -28 -32 -7 -54 -19 -9 -24 -63 -2 -60 -5 -78 -11 -84 -50 -36 -72 -14 -30 -4 -62 -6 -1 -69 -17 -33 -32 -45 -71 -87 -71 -60 -19 -80 -11 -106 -45 -27 -23 -51 -77 -67 -103 -17 -98 -109 -91 -125 -68 -39 -34 -96 -49 -64 -38 -105 -31 -100 -89 -108 -69 -36 -94 -38 -124 -123 -79 -92 -42 -14 -87 -68 -17 -36 -21 -54 -98 -79 -142 -25 -60 -112 -99 -64 -15 -78 -37 -64 -15 -129 -32 -102 -74 -112 1 -146 -151 -147 -153 -4 -181 -22 -176 -4 -57 -151 -86 -121 -38 -137 -160 -156 -72 -73 -149 -64 -182 -117 -146 -180 -195 -27 -194 -191 -108 -153 -40 -149 -100 -120 -207 -83 -94 -73 -200 -95 -155 -94 -76 -9 -149 -70 -125 -49 -146 -223 -68 -139 -26 -132 -142 -165 -2 -45 -154 -129 -130 -185 -60 -34 -173 -91 -37 -40 -153 -189 -236 -95 -128 -46 -14 -53 -245 -67 -9 -208 -244 -198 -74 -62 -104 -51 -251 -48 -50 -115 -76 -79 -32 -82 -65 -185 -124 -32 -189 -124 -174 1 -273 -223 -275 -238 -200 -184 -229 -195 -152 -63 -150 -73 -44 -54 -187 -49 -250 -192 -290 -282 -266 -214 -117 -199 -83 -104 -251 -176 -262 -296 -39 -259 -87 -132 -166 -67 -194 1 -294 -8 -3 -264 -217 -228 -233 -241 -294 -210 -72 -307 -259 -33 -101 -103 -235 -100 -110 -253 -292 -134 -269 -52 -265 -15 -29 -272 -126 -210 -151 -308 -40 -40 -112 -268 -185 -346 -237 -287 -34 -302 -41 -25 -191 -29 -170 -95 -315 -278 -160 -220 -99 -126 -224 -33 -350 -76 -138 -340 -284 -268 -128 -238 -197 -93 -110 -120 -190 -140 -64 -217 -296 -103 -363 -199 -254 -233 -190 -282 -136 -174 -309 -61 -206 -18 -105 -111 -163 -287 -188 -145 -294 -251 -398 -265 -273 -50 -250 -376 -5 -357 -6 -8 -198 -20 -82 -158 -122 -196 -97 -183 -48 -428 -36 -88 -424 -35 -380 -109 -209 -323 -394 -102 -276 -153 -229 -320 -391 -7 -328 -127 -430 -102 -372 -447 -222 -401 -184 -183 -49 -239 -413 -101 -187 -289 -12 -418 -248 -279 -318 -134 -443 -272 -456 -143 -3 -209 -276 -414 -189 -302 -238 -241 -106 -332 -375 -400 -476 -9 -95 -412 -52 -127 -442 -278 -25 -446 -411 -39 -55 -80 -234 -361 -223 -384 -283 -47 -164 -18 -38 -87 -393 -93 -380 -493 -73 -150 -241 -378 -211 -516 -349 -520 -38 -397 -406 -16 -461 -276 -448 -316 -376 -156 -369 -216 -431 -309 -400 -135 -523 -40 -508 -87 -25 -151 -355 -141 -3 -495 -153 -438 -343 -161 -66 -455 -70 -248 -278 -548 -300 -337 -290 -551 -200 -68 -540 -476 -395 -245 -318 -424 -112 -556 -541 -94 -148 -542 -100 -120 -199 -569 -471 -298 -16 -453 -469 -50 -500 -84 -435 -579 -287 -522 -77 -83 -347 -437 -171 -231 -139 -350 -357 -221 -214 -224 -148 -125 -385 -255 -38 -320 -254 -517 -532 -80 -286 -58 -97 -390 -309 -548 -319 -323 -238 -297 -12 -312 -517 -434 -466 -103 -621 -448 -503 -72 -601 -287 -61 -577 -87 -143 -33 -482 -275 -529 -340 -279 -130 -512 -63 -109 -528 -22 -549 -317 -375 -377 -385 -23 -191 -138 -509 -40 -565 -559 -14 -547 -28 -159 -153 -585 -508 -582 -431 -580 -637 -561 -513 -243 -420 -298 -485 -132 -613 -157 -521 -596 -61 -420 -498 -577 -563 -354 -662 -264 -273 -111 -597 -466 -389 -345 -306 -102 -57 -596 -1 -45 -12 -619 -47 -43 0 -323 -9 -319 -529 -402 -238 -191 -487 -315 -65 -386 -110 -605 -363 -461 -6 -95 -95 2 -596 -454 -618 -83 -481 -283 -386 -247 -417 -707 -564 -603 -17 -712 -140 -336 -567 -443 -36 -476 -251 -735 -589 -198 -197 -476 -49 -736 -422 -383 -569 -732 -1 -104 -261 -352 -453 -273 -344 -66 -307 -698 -158 -238 -280 -207 -624 -491 -765 -506 -146 -616 -711 -650 -655 -393 -19 -315 -311 -572 -675 -533 -156 -373 -744 -142 -582 -491 -796 -777 -125 -483 -426 -510 -560 -700 -778 -407 -440 -409 -238 -738 -477 -147 -152 -317 -110 -323 -788 -601 -202 -517 -487 -726 -300 -1 -554 -448 -15 -191 -531 -568 -466 -527 -132 -254 -290 -8 -400 -655 -788 -376 -249 -662 -315 -378 -41 -793 -163 -29 -327 -839 -133 -124 -129 -673 -32 -605 -393 -664 -374 -135 -366 -717 -93 -601 -763 -788 -494 -802 -282 -443 -491 -461 -197 -83 -96 -162 -97 -161 -232 -144 -472 -118 -429 -387 -724 -789 -636 -298 -484 -720 -526 -382 -102 -449 -846 -525 -547 -696 -524 -272 -843 -286 -247 -838 -447 -489 -797 -483 -386 -775 -340 -772 -158 -293 -256 -432 -812 -273 -93 -487 -264 -594 -330 -712 -798 -131 -591 -539 -677 -455 -470 -108 -573 -57 -845 -383 -273 -890 -747 -913 -648 -625 -650 -544 -137 -490 -434 -734 -182 -355 -859 -835 -141 -536 -874 -102 -940 -359 -83 -800 -894 -712 -470 -687 -578 -435 -935 -400 -780 -814 -458 -892 -481 -371 -761 -348 -388 -891 -764 -297 -536 -695 -314 -336 -978 -379 -462 -597 -533 -561 -9 -474 -292 -560 -420 -828 -721 -769 -874 -157 -495 -771 -899 -571 -98 -282 -233 -203 -982 -416 -142 -993 -540 -979 -851 -506 -238 -292 -184 -695 -195 -632 -575 -962 -76 -546 -705 -13 -271 -222 -124 -380 2 -1003 -251 -525 -228 -644 -159 -624 -477 -912 -712 -343 -263 -88 -745 -85 -374 -675 -804 -610 -854 -511 -612 -964 -731 -358 -495 -946 -466 -364 -1053 -57 -101 -829 -155 -600])

(defn day-5a
  "Day 5. A Maze of Twisty Trampolines, All Alike - Part 1"
  ([jumps maze pos]
   (let [j (get maze pos)]
     (if-not j
       jumps
       (recur (inc jumps) (assoc maze pos (inc j)) (+ pos j)))))
  ([maze] (day-5a 0 maze 0))
  ([] (day-5a day-5-input)))

(defn day-5b
  "Day 5. A Maze of Twisty Trampolines, All Alike - Part 1"
  ([jumps maze pos]
   (let [j (get maze pos)]
     (if-not j
       jumps
       (recur (inc jumps)
              (assoc maze pos (if (> j 2) (dec j) (inc j)))
              (+ pos j)))))
  ([maze] (day-5b 0 maze 0))
  ([] (day-5b day-5-input)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
