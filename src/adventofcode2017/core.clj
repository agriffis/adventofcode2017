(ns adventofcode2017.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

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

;;======================================================================
;; Day 6. Memory Reallocation
;;======================================================================

(def day-6-input [11 11 13 7 0 15 5 5 4 4 1 1 7 1 15 11])

(defn bank-with-most
  [banks]
  ;; min-key and max-key return the last index in case of a tie.
  ;; We want the first, so rseq and math.
  (let [ri (first (apply max-key second (map-indexed vector (rseq banks))))]
    (- (count banks) ri 1)))

(defn rotate-banks
  "Rotate banks so index is at the end."
  [banks index]
  (let [banksv (vec banks)]
    (vec (concat (subvec banksv (inc index))
                 (subvec banksv 0 (inc index))))))

(defn unrotate-banks
  "Undo rotate-banks."
  [banks index]
  (rotate-banks banks (- (count banks) index 2)))

(defn redistribute-bank
  ([banks index]
   (let [value (get banks index)
         n (count banks)]
     (-> banks
         (assoc index 0)
         (rotate-banks index)
         (#(map-indexed (fn [i v] (+ v (quot value n)
                                     (if (< i (mod value n)) 1 0))) %))
         (unrotate-banks index))))
  ([banks]
   (redistribute-bank banks (bank-with-most banks))))

(defn -while-unique
  ([s]
   (-while-unique s #{}))
  ([s seen]
   (when (seq s)
     (let [v (first s) vs (rest s)]
       (when-not (contains? seen v)
         (lazy-seq (cons [v vs] (-while-unique vs (conj seen v)))))))))

(defn take-while-unique
  [s]
  (map first (-while-unique s)))

(defn drop-while-unique
  [s]
  (second (last (-while-unique s))))

(defn day-6a
  "Day 6. Memory Reallocation - Part 1"
  ([input]
   (count (take-while-unique (iterate redistribute-bank input))))
  ([] (day-6a day-6-input)))

(defn day-6b
  "Day 6. Memory Reallocation - Part 2"
  ([input]
   (count (take-while-unique
            (drop-while-unique (iterate redistribute-bank input)))))
  ([] (day-6b day-6-input)))

;;======================================================================
;; Day 7. Recursive Circus
;;======================================================================

(def day-7-example "
pbga (66)
xhth (57)
ebii (61)
havc (66)
ktlj (57)
fwft (72) -> ktlj, cntj, xhth
qoyq (66)
padx (45) -> pbga, havc, qoyq
tknk (41) -> ugml, padx, fwft
jptl (61)
ugml (68) -> gyxo, ebii, jptl
gyxo (61)
cntj (57)
")

(def day-7-input "vpryah (310) -> iedlpkf, epeain
aqfemi (38)
bwtsue (18) -> crdoq, lhxdfj
eeyaxfn (72) -> idsab, jnhyc, vswgxoh, hivnzrk, afcsq, vpryah, dqiby
vddsv (64)
xnoux (41)
apajk (61)
fdgjgwt (13174) -> piofa, uxrros, ngiys
tgjmrpl (43)
jjxhgkx (1478) -> jncwn, tydjgm
nbrqwvs (201) -> zzkzfln, htdimcs
qcnoadr (70)
wwcngr (77)
deweh (1549) -> qaqof, kvyiqr, zfmqlj
ygeoklq (12)
bpszadt (35)
bdlzzvy (98)
fbaiatg (13)
pidgnp (95856) -> ehlwoxs, hbldvzk, ezwzp, tylelk, jkxutle, kkflx, oucqw
vijgqvl (40)
ofjjqdj (46)
vgsqrp (46)
idqgxkl (81)
nafzy (65)
nxspzd (82)
cnrwew (222) -> vnyaqgw, zooxx
qhdqak (2571) -> vmgxg, knmmys, zkwplas, bsqpcne, xgqdjhe
rxbrsd (28)
hubvoh (152)
mpwlly (12)
rotzn (10)
drswab (57)
udkvb (250) -> fkvhdj, flhhbd
coedb (62)
fpwoels (35)
huzzk (131) -> fqozst, naacbhr
etxfihy (98) -> tgjmrpl, hdiprgd, hospabk, fvmws
mbtin (67)
yaawixo (67)
kxcid (77)
sibko (27)
khshj (177)
otnrfom (37)
hzqpddb (16)
ngiys (963) -> ybqzq, vcrgmn, ysmqsps, bwrenq, opomx
yybtd (16)
myhgys (11) -> daesbhs, qrmipn
amhmm (64) -> pxkhwuu, gnbmz
soiza (34)
dqiby (202) -> fdklcbu, qcnoadr
jleqdi (69)
fdyuo (91)
gxmdnq (42)
wdnlqh (43)
lmmffej (337) -> twjvtbu, suvwi
qrrdb (94) -> zqvhd, vcgcmuh
gkzpb (207)
rfkdn (163) -> zpjju, bxwtlj, igzrzi
iyegmn (58)
johqe (47)
nmfhgq (141) -> dzbnx, cveuc, sfrwf
jknrln (13)
hivnzrk (206) -> coxuqy, ewuohku
xulpd (54) -> itzmwqp, egtem
quqixmj (203) -> jykfxee, vsqcws
wjkfdvb (10)
fusiiz (47)
awvqy (71)
auztp (27)
ghuyt (65)
xzfrad (23)
nvkhow (96)
htdimcs (93)
kwolrk (90)
dhsyxu (35)
chjdhl (40)
gndjq (70)
izxeuz (97)
dgqquh (92)
yenbb (51)
wogrc (27)
cijhcl (16)
ebaevkk (97)
mxikfk (23)
elxfl (320) -> ohneffn, jyvhtle, sgymtmx, mitvkt, kaxvdwl
aivprd (58)
ujnas (94)
ubdfq (12)
ozuqsau (8)
hlszj (23)
tpdch (17)
atgamme (26)
nwlacty (167) -> vhuwgi, zaiopar
kyizmdu (53)
xgufltj (96)
rqbjjuo (49)
pkipyhb (98)
mojsngw (92)
bncmd (95)
hkssn (463) -> gjpglfg, bqlmhj, cvseh
mgoew (180) -> gqmbul, geqrb, oidjn
fdvfx (58)
mkohhbb (82)
btami (41)
ohbhyq (20)
jnyvdz (98)
sbzee (24)
dyeds (47)
xmendwz (76)
dwybhqe (326) -> ftyilib, lhmhrpi
dydlyj (88)
cgtddkw (164) -> jcikl, jaxjy
jircuj (729) -> qyqthsz, ctqaxh, scbjq
xernf (34)
ljpeina (81)
dvvlx (16)
itzmwqp (76)
opbrn (78)
ekpvnh (61)
btbuwwi (105) -> btami, ffrrwb, niuvu, atzuayu
ceqayn (77)
gtgdmny (11)
unqmapv (58) -> ofjjqdj, vgsqrp, ayogkum, ymerus
phrrm (5)
botmw (78)
fbhxulf (40) -> flbumzk, csxdpl
tdbwpcj (98)
qdfzlv (73) -> blkcnq, idqgxkl
cfiurqp (12)
pejkmud (33)
doqxpij (154) -> xaidhn, mcmijwy
mmjpziu (38)
ryjrq (69)
dzienj (115) -> gybbvb, mbtin
iisuf (42)
mtfqemm (8)
gwpzvb (48) -> qjlrpjn, prtah
pkjykh (81)
hgqesr (672) -> satuz, zozajw, hzauzw
ayogkum (46)
cdqkuuw (216) -> lhjpci, mlkddpw
dvips (13)
klvhv (34)
kvypj (91)
rcytc (700) -> doqxpij, dwybhqe, yeuaeqp, bpvit, ljhqql
wadeqe (98)
dqwocyn (1215) -> aepss, jtxphqg, gveca
unbjm (40)
qhwtf (97)
afxazvx (49)
pyraep (46)
lwpwtbj (71)
kasozsw (143) -> sayhdkv, ghhhiwl, kreehw
xfjpbus (96)
llalv (35)
xpzadg (15) -> ydjrtcd, ebaevkk
igzrzi (182) -> chjdhl, buyou
skzxsyk (31)
hontwg (58) -> pgnbhl, qoksme, dzlgor, gmfsl, sdvag, nbrqwvs
smmdlo (416) -> cxgdzl, facddx, doehwd
drtfi (19)
uglla (19)
mjbdmlf (67)
ykhycl (496) -> xmkkpat, iroikgp, khshj, kxqhlbm, vfrna
twvkgl (74)
iuagzo (69)
qxvpdh (28) -> qptzj, hkcghm
poviv (76)
knhati (51)
uashrrc (50)
ouiwlb (98)
tzxvnri (12)
bnqutso (11)
fqozst (39)
xypex (18)
gerpefi (69)
wbqjf (24)
xaidhn (91)
lwpmgk (61)
wuluf (72)
ffrrwb (41)
ooobx (45)
fdhvp (137) -> ybjld, uksim, wbqjf, sbzee
pxkhwuu (89)
rrxrsx (77)
crxbcqe (1033) -> rmocf, xjiql, mocrsqu
msywua (32)
zqatt (72) -> pzggi, abdjb, wvisr, ibushn, fdkvm, dobqmg, gbqig
jfclt (107) -> pjssvle, tmsnmf, iisuf, njhppm
upndyov (83) -> pkcpn, qvknu
gbbnux (279) -> yotrh, bnsqqv
scbjq (89) -> ogorkv, rvglq, upnls
ydgusm (66)
sayhdkv (87)
nqzlzs (10)
coazy (129) -> wkmey, skzxsyk
vhcza (20)
pgtmio (19)
tprgqt (81)
euoqdcd (62)
zddlo (62)
dlapc (26)
qorsgjk (62)
hsyoiy (23)
pyplv (26)
gqmbul (8)
jwgvg (62)
lyrxhp (90)
uekiz (23) -> wwcngr, xqyrozn, ikclk, uents
ibyvotn (65)
ewtqg (51)
qwlze (52) -> malwro, gwyrxmf, blstaec, ehoqrji, bqppw, btbuwwi
gjpglfg (29) -> vumpiw, yfzbdl, nlgoig, fqppio, uykfql, gvujhex
ftohrkw (16)
hmtnj (28) -> qorsgjk, vneld
qggjzz (106) -> yqxvhbl, wsyqwf
pgilb (19)
hueuhx (54)
thats (64)
arveor (80)
yuymxvd (80) -> llbxkj, zmpyqv
cisaxsf (161) -> rptfwu, mqjpes
pkuqykh (68) -> bpyce, fusiiz, mdrto
otqdauw (32)
ylnua (76)
uyjtxt (87) -> gahwap, fqxrjg, mnxmtp
zfzpgfw (25) -> rwouyb, gjvfc, zbtswr
vzrfuvn (83)
bdzkzv (318) -> baimp, wfgyg
ceywcm (68)
ypeap (60)
mqjqez (70)
iueqa (53)
hqhkw (70)
bpyce (47)
wseii (36)
vxxhu (32)
nqomdre (40)
pxnvwaj (11) -> rcytc, hontwg, vjhwn, deweh
qvknu (90)
qcsfpn (85)
eprljo (98) -> hdjlp, qqfgo, xbhww
cwdfqo (6) -> ctqym, nxxfgn, uoenrx, owdcg
fgzwvuy (67)
ajdtudl (263)
dngqchs (1012) -> mxpxbm, quqixmj, qneezf
zdiygz (207) -> tujrz, vpmuei
jkxutle (5247) -> scjrx, srcfgoo, rfkdn
jeywnj (13043) -> kkjro, jxysad, crxbcqe, pgdgh, qozxrgg
holcno (13)
qtjpthc (45) -> hfpspc, iniuzfq
malwro (93) -> saxar, dydlyj
bujphvu (154) -> dpcuy, rimobjs, mevce
hgogzfl (17)
xgqdjhe (327) -> gbbnux, zuanzd, nbykdlk
rtzodmx (76)
mdrto (47)
xuwmc (256) -> yekxli, xnfybs
ptmqsnr (83)
mplgqv (77)
uhoryyb (4957) -> slohro, kkjnouk, lmfchi
yrbwhz (19)
elcnwtn (110) -> mmqtzmj, rnfoji, xayhv
wtkxd (73)
ftyilib (5)
bztcy (224) -> mysjwy, wbqkf
unnvung (64)
gufqi (12)
zntrkc (71)
zxdhxrb (69)
tzvtu (78)
ohneffn (65) -> ffcefem, qjxyfa, bojjcl, bhqkvi
rtcicn (211) -> hqcwl, pgilb, dniub
hmwfqwz (225) -> zqczqd, xdrjmkv
obilnz (93)
satuz (271)
fdkvm (189) -> hueuhx, ujyxvl
mxtcei (11914) -> eeyaxfn, dhrbaor, mzgayzs, tfphsaq
cqupm (71) -> vsvne, wwrkqb, jtgcmc, yyria, hkntpfd, cbefqk
gymuodz (63) -> rimua, whfeq
zfmqlj (121) -> kdbfv, abccyo
muecxv (98)
cldldxp (14) -> uuztubk, hrqsnls, eeergq, vyqlzi
acpwe (135) -> yrbpdq, iwtqde
hcrxqbw (80)
xmkkpat (43) -> ivwybv, mjbdmlf
okqwb (85)
pwmazwj (59)
qwtheza (22)
euxrv (110) -> sfuegcs, kqfesp, azjunml
qvowcc (30)
zelwp (61) -> nxspzd, lrhkoc, ybfqzep, sqwovza
pqqfpa (355) -> dezgi, dtakrnu
uykfql (405) -> efijtd, phdetz
jyvhtle (25) -> jasol, esivz, wprhap, fqyog
czyok (75) -> pkipyhb, sbsfo, izkej
vpmuei (62)
ydjrtcd (97)
bgjwy (82)
xupkjdt (31) -> mzjhsq, cimubay
coxuqy (68)
wupsg (81)
prtah (59)
pewvv (39) -> rtcicn, vysjpf, lxxbgm, bztcy, fgbsxh
kemme (38)
rpanfr (42)
mmqtzmj (76)
auocefh (10)
mweox (60) -> ddrsd, nxwtdg, jlvakq, gmaxala, rtwur, qqkwjoy, lmmffej
kazlt (312) -> cgetpc, jknrln
rqqxoou (82) -> lbeqp, jfsnic
jrygk (124) -> zkkvh, xjvwjq
rvglq (18)
ajyzem (70)
qhgvoj (129) -> uwpuqd, pyplv
scgpm (19)
apbjfv (43)
waxvx (96)
dpqrxbr (55) -> nafzy, bgscxgk
jtzrvt (55)
qnzdaj (262) -> ablgyqv, xhang
jfvoui (45)
vfmiaz (38)
xnqznos (5)
qhfoy (63)
fsqws (95) -> yyrwb, vnuwoq, vlllp, reuaanp
aunrdo (61)
pbcpt (7)
xwunxz (1100) -> klhzgvj, walzh, snquxtz
lshkygc (19)
bkqndr (44)
dhrbaor (1511) -> fpkuumw, fytlv, knendm, xxsobt, wlqfnkr
opomx (191) -> pycim, khnemp
zlvgiq (76)
oioqg (63)
dkeosz (13)
irgymg (99)
iyqcty (19)
ozugcs (60)
ewoebye (55)
dxggcx (34) -> nuwpvd, ylnua, vljooo, ykzjkp
qyvxs (83) -> qtcsae, gjdrco, zffoytm
ogorkv (18)
zuanzd (73) -> tutmv, ubkhce, ebzton
qozxrgg (1351) -> yuymxvd, zjuupn, uyjtxt
lbeqp (62)
bqlmhj (2246) -> cvahi, jgbvdp, wehfli
ptyuh (70)
jlhsd (41) -> ygnlbv, wochkc, nzazpe
ayfafvc (33)
ldmgzql (17) -> qsods, ewoebye, yesozb, bfqotji
rdytzgp (127374) -> uhoryyb, vfwwc, hkssn
nxxfgn (59)
iniuzfq (81)
vysjpf (228) -> ohbhyq, bhzeep
scjrx (448) -> ejoee, uyvuqp, yaera
tzobgt (88)
ljhqql (44) -> tbzqsrb, wtkxd, amhug, axgpt
vvpacb (126) -> ijmaxm, cjoeyrm
zqvhd (88)
zagaz (88)
emhblpr (85)
lrosl (82)
orcrc (74)
vyfhcqp (109) -> jwgvg, pyfeav
njhppm (42)
eowjgp (188) -> ueqkrm, nhgchm
wlodh (39)
vsqcws (25)
jxcxv (60)
hybvw (92)
qdgsn (47)
jasol (41)
zgrcahy (64)
mhassg (80)
eeergq (53) -> oeehfxg, emhblpr
ojozup (29)
gmeqmy (66) -> mbslas, vimplcz
zzekx (81)
xjvwjq (14)
heezga (300) -> jtfdy, scgpm
pjhoue (56)
djejdy (98) -> fdvfx, ykoazai
fkzxmb (55)
ezwzp (7179) -> jlhsd, oedan, emuek
tlwqwlk (23)
fqyog (41)
elvzp (33)
ydusqh (80) -> qucxsqh, lrfttlb, vzrfuvn, ptmqsnr
dweli (58)
qbnldp (85) -> cguzndh, oldoxo
xbhww (55)
smjtypd (35)
vcgcmuh (88)
iedlpkf (16)
zttytvi (93) -> qkjed, jnxbxzk
bszaj (104) -> txhbij, kwolrk
qwagq (67)
gxzxapn (12)
fqppio (139) -> fllao, orcrc, uhmmouc, twvkgl
opnpx (94)
esivz (41)
iqbtc (94)
wznad (369)
nujmyt (309) -> vbzyp, qwagq
vuzkop (57)
dxzahps (8)
idsab (142) -> befsr, mhlgi, uashrrc, fkmyndg
vtjrflg (73)
wfgyg (69)
ghhhiwl (87)
phpjy (44)
ekffumh (295) -> wznad, metsfo, afycii, czyok
jhltpk (61)
kaxvdwl (125) -> hzqpddb, aqeqvr, esegn, hdyrxg
uxgux (53)
zhnug (77)
cjoeyrm (72)
sdvag (387)
efbvz (54)
rksqqfr (90)
xplsuaq (98)
joryloo (24)
mxpxa (128) -> vtjrflg, guccv
tjcujd (193) -> cmfit, tcvpst
wkmey (31)
hgkjgm (4609) -> xcjxzq, ekffumh, juscckl, dngqchs
vneld (62)
lmfchi (67) -> qnzdaj, efqrg, murzaw
umajdu (17)
ierjhuk (15)
bvviqc (60)
qcizo (70)
cwaymbr (98)
iemeek (37)
lhxdfj (92)
nlgoig (240) -> xyfsr, ghuyt, ibyvotn
xxviu (12)
doehwd (169) -> ahcba, pbqdzda, xijkpj
nzazpe (88)
wehfli (105) -> asuodq, fbaiatg
athdvrh (3021) -> ajika, gxmdnq
hwluwdo (5)
yvttt (201) -> fdgccyg, joryloo
dyxzd (216) -> gubya, pnxmfdc
ehoqrji (79) -> kqvsah, yanwn
iwdzu (98)
owdcg (59)
vgaxwnn (78)
wlqfnkr (47) -> wseii, axhfcb, iomjmn, rczoepp
jxysad (99) -> jtydj, udkvb, plpctjz, ydusqh
jaedvjj (76)
iemgv (23)
skjez (147) -> aivprd, cbdyc
bwrenq (295) -> lyaqynn, hlcnf
hoarkjh (12)
tyvhz (222) -> wjkfdvb, powfmo
yiyjz (71) -> ljpeina, zzekx
fiwnjv (45)
dzwnlq (54)
algav (26)
nhgchm (47)
ejoee (115) -> algav, atgamme
jncwn (94)
gypuu (21)
xeiur (185)
zqczqd (82)
zordz (166) -> zhubam, hoarkjh
xtocem (23) -> ajyzem, hqhkw, jcshcvr, zxbnkvs
hhndlt (17641) -> sfxvp, ypzqp, pewvv
rrtpjw (7238) -> ptfyi, hgqesr, jmdlczf
aduuei (65)
dzrywb (84)
fpnjjy (91) -> dgqquh, ftatt
wprhap (41)
cvahi (39) -> auorp, jypccpq
gxhjjv (62)
zbrhqwq (171) -> kckevg, pbcpt
rimua (86)
fxqaw (63) -> avfsez, tprgqt
lyorl (80)
csmjw (142) -> hwluwdo, phrrm
crqesym (75)
gkskqqb (13)
cnuygks (10)
owxbfr (80)
gubya (56)
nnjrm (69) -> nesoknh, mkohhbb
gjdrco (85)
gtditk (58)
vlfxdli (66)
qwtvro (870) -> cfiurqp, ubdfq, xxviu
isoayc (6)
coicjc (185)
yuktpa (74)
txnuvci (44)
jbomczw (82)
jykfxee (25)
yyria (21) -> qztfbzn, xfmneu
xgibks (66) -> qvuhbo, abspab, ehegh, bvelsl
liklroi (108) -> xowek, qdgsn
kdbfv (78)
flhhbd (81)
halwu (66)
enorooc (44)
jfnknli (2345) -> hubvoh, csmjw, kzpyvis, hmyuwix, fbhxulf
yeuaeqp (162) -> vojcrx, jnshvhq
plzrspg (188) -> pdprpyn, itacy
jcshcvr (70)
uckyywt (96)
zpyoxs (52)
gvujhex (419) -> jbmxm, ozuqsau
zxbnkvs (70)
ydcibyi (1431) -> sakmn, yuktpa, ielyzgp
ffcefem (31)
mxpxbm (77) -> mvldvib, phpjy, mtqdya, enorooc
yzssszb (80)
srltg (96)
txznlay (55)
jwmjagj (30)
ejzoa (468) -> pqqfpa, fsqws, kqhusg
iwtqde (57)
tdxsqf (391) -> ejrychc, wqpfc
hrqsnls (133) -> ooobx, jfvoui
ewgvg (14873) -> sohohlc, fxhlrok, ykhycl, xabull, gdvqsyp
flgjahm (5240) -> bwhovd, zqatt, hcqsg
odtetse (25)
floca (98)
jfsnic (62)
hdiprgd (43)
fwfbd (81) -> djxvowe, mssypcn
whfeq (86)
lrfttlb (83)
aygltsd (44)
ztoitoz (59)
zooxx (30)
cumlar (39)
gzarnps (75) -> mojsngw, hybvw, ssuho, phmoj
lpgtx (63)
psdhpk (110) -> ceqayn, kimsadh
jfvmu (44)
hfpspc (81)
nghcpr (88)
idfuz (87) -> lwpmgk, scfrwrg
qqnroz (666) -> uvexl, ldmgzql, vtphqb, tjcujd
tutmv (94)
gmaxala (403) -> yybtd, cijhcl
kimsadh (77)
tbzqsrb (73)
ijmaxm (72)
biokfm (155) -> nvflr, sabolzl
lnllv (255) -> tpdch, nyeur
ulpfyrr (93)
twjvtbu (49)
qkdiej (25)
deyxep (58)
jbolstg (1053) -> aizud, hxowycm, fzcerr
jvxecw (59)
rxwxqe (53)
geqrb (8)
fytlv (35) -> pshil, bppdgwm
lbgqy (20)
gmtsea (8)
nbvlp (47)
vkdpaip (50) -> xfjpbus, ilkhnhw
btsvvyg (21)
shjlwli (264)
uzxjt (8)
xichd (209)
vhuwgi (20)
plmaxee (62)
texooeb (55)
qneezf (143) -> bsnxzz, yntilqc
dzlgor (43) -> jnmgovh, lzqtep, umuur, nuajwg
ubkhce (94)
cvxkylq (99)
ctqaxh (61) -> tslfayy, xquzvw
yfzbdl (75) -> kmyvyx, lyrxhp, tuyon, rksqqfr
rdrrye (338)
jrgiha (7)
wpugb (69) -> xhubgcl, psdhpk, htgvzw, shjlwli, xtxppp, nusvn
odmmo (456)
hgblqo (31)
jcikl (59)
khkaq (16)
mcmijwy (91)
sgymtmx (85) -> uxbyymt, tnngtb
fqxrjg (15)
rhfznek (52) -> vckzclh, kurnhks, ftthnl, fseduzt, gxumijt
txhbij (90)
yaann (187) -> drtfi, golkvpd
dfolgy (80)
qoukeij (82) -> szdthny, bpszadt
rmocf (100) -> fkbivys, ryjrq
rpxni (39)
xmvthbd (40)
soddek (333) -> wragpj, qcldyng
gwyrxmf (93) -> ntugl, bkqndr, nhnwkzo, txnuvci
bzwiavk (122) -> vszfxh, unbjm, hkxefzm, vijgqvl
okrnkqa (70)
pasveb (20)
qxivh (85)
aakrpyc (14)
qfellsp (80)
yowbd (346) -> ooazmvu, jtzrvt
ielyzgp (74)
ihslyyb (51)
faubz (59)
itacy (93)
fwevqj (33)
zzsbd (78)
edygy (258) -> yzfnlfl, hwdkwn
sohswca (66)
jngifv (614) -> rdthc, ajdtudl, skjez, eprljo
ivfffiz (96) -> iqbtc, opnpx
hcbdbh (400) -> cibrtjo, gkxdmxg
rulkpe (27) -> faubz, ftbsur, luixm, jvxecw
fpkuumw (31) -> arveor, hsykei
xabull (769) -> egkqlyz, obdtlhg, mgoew
cvcvyeu (100) -> rawfw, ceywcm
wjqdusq (186) -> odtetse, swastze
khnemp (95)
rudbmkz (30)
llbxkj (26)
tbfkvty (97) -> aymgd, glmcscm, coedb
kufceqa (95)
exaqlbc (186) -> tejonrz, hlszj
hxxexy (82)
cveuc (57)
pnxmfdc (56)
jtwrh (43)
pfuyke (217) -> hsyoiy, ovfby
wdgfw (49)
obdtlhg (66) -> pbmni, gerpefi
abdjb (285) -> nzhfbo, begrb
onwhg (40)
wfixt (70)
ngtpz (98)
gxumijt (297) -> yrbwhz, yxzdn, otslex
murzaw (64) -> cwaymbr, iwdzu, ouiwlb
jtxphqg (108) -> aakrpyc, vjyhqx
wjkqpqr (235) -> auocefh, cnuygks, nkxdfu, rotzn
vsvne (183) -> qkllvda, uzxjt
jqhify (94)
ntadc (61)
niuvu (41)
bbsvfl (6)
powvrta (32)
nvflr (64)
kebfmsz (269) -> fhryrfj, vxxhu, wycfrkz, wrurg
ueqkrm (47)
elyuo (55)
kzpyvis (24) -> akumg, dfghz
fozgkmk (28)
skdbvqr (4471) -> smmdlo, cqupm, buyazh, elxfl
pycim (95)
spgyst (88)
vojcrx (87)
xorbfm (20) -> pwmazwj, ztoitoz, udiykt
wsyiyen (504) -> cisaxsf, rejss, zbrhqwq, xeiur, fyfjc, eaxqpmn
ivwybv (67)
zsjvdo (128) -> omnyr, hrhfd
uvfou (368) -> ygeoklq, tzxvnri, gufqi
objgx (80)
zpcqx (226) -> izxeuz, qhwtf
emuek (149) -> tzvtu, zzsbd
dytadg (35)
crdoq (92)
lljifba (68) -> jeywnj, fdgjgwt, ewgvg, mxtcei, wetrsmz, sgvaf, hhndlt
hcizj (91)
zzkzfln (93)
hmjzw (117) -> aujgtj, lshkygc
blkcnq (81)
udiykt (59)
nhnwkzo (44)
tiunb (46)
ccbgy (64)
khjexez (59)
tydjgm (94)
mssypcn (56)
swpjozm (66)
yryyz (249)
vdham (232)
scfrwrg (61)
xyfsr (65)
golkvpd (19)
qovcwth (59)
dzngp (183) -> onwhg, xmvthbd
vqbfan (51)
pkdeoh (16)
foozzq (114) -> klsxgx, kcorlw
ehegh (54)
kqhusg (155) -> dfolgy, yzssszb, qfellsp
jxzfb (88)
airlri (97) -> pidgnp, lljifba, gmewl, tbedct, ryvidhy, rdytzgp
kreehw (87)
zkkjh (93)
vqlyyx (43)
mkbjgur (34)
faqsp (40)
fiqnz (32)
esyzn (66)
swastze (25)
wbiys (58)
xiyhl (49) -> ktvry, ezoar
aonpvtr (82)
pgibhk (75)
axgpt (73)
kxqhlbm (31) -> sulyr, qeksx
apgqnys (82)
osipmuv (366) -> qkaaq, ffrgif, qxvpdh
lzqtep (86)
jrjkj (69)
omnyr (37)
jmdlczf (22) -> idfuz, xichd, pkuqykh, xpzadg, kioxu, huzzk, vgrbrzc
vvivo (60)
uents (77)
utprdt (33) -> ihslyyb, knhati
lcqed (45)
vnyaqgw (30)
szdthny (35)
rwqopie (35)
vgrbrzc (11) -> swpjozm, ibdon, sohswca
spjim (73)
bipyp (78)
mvxqfe (85)
vlszzu (333) -> nafvoj, foozzq, jgwajk, ppedet, hqpkdyb
jdrkeh (5)
ftbsur (59)
uldlh (30)
dzbnx (57)
vswgxoh (63) -> obilnz, zkkjh, ulpfyrr
xbowtoi (53) -> tdbwpcj, muecxv
mysjwy (22)
tetyj (135) -> xckaw, tadprtr
pbqdzda (38)
gahwap (15)
vjyhqx (14)
aywrlw (132) -> xxvfb, bmxoqy
zgzxr (235) -> ewvlay, slclu
jgwajk (104) -> fdyuo, keoqd
powfmo (10)
auorp (46)
jtydj (372) -> rpsmo, lbgqy
iomjmn (36)
slclu (34)
isvfa (95)
mhcyj (61) -> gxhjjv, ipppjn
rpsmo (20)
flbumzk (56)
xtxppp (72) -> miidkpe, srltg
vpsls (6)
hlansqa (53)
znbvji (44)
kieild (43)
klsxgx (86)
asuodq (13)
tuuzrr (98)
xckaw (50)
efqrg (202) -> vgaxwnn, opbrn
ibagnjs (59)
vyevfn (120) -> jtwrh, kieild, gmevoe
kvyiqr (95) -> kvypj, hcizj
qghotl (82)
pzywvr (92) -> txswi, jljgd, hxxexy, apgqnys
akmsaq (97)
mhseysh (49)
uarsqn (53)
ryvidhy (123921) -> pxnvwaj, skdbvqr, qhdqak
cqdggj (216) -> efkyht, gtgdmny, ohbzmqz
ykoazai (58)
sydiov (1417) -> xvhpqmh, exaex, utprdt
algetkl (73)
hbldvzk (2628) -> sydiov, ropjtoe, rhfznek
pzggi (189) -> efbvz, dzwnlq
rnfoji (76)
ytfnug (39)
jpxgvjl (82)
yotrh (38)
xpqnuh (31)
ewuohku (68)
vlllp (75)
erpdg (544) -> rdnozh, plzrspg, tirehn
ablgyqv (48)
yqxvhbl (42)
hgrjt (98)
joees (23)
eqsqenp (26)
mnxmtp (15)
wetrsmz (16444) -> wpfywy, litnjrv, rpmtne
bkicgcc (33)
dwvbnp (80)
qptzj (76)
ibvyfys (220) -> rpzit, bepnzsh, khjexez
bwhovd (457) -> yhgutqw, amhmm, cwdfqo, vlaowv, vkdpaip, tyvhz, unqmapv
fyfjc (21) -> qghotl, jbomczw
zaiopar (20)
rimobjs (88)
ipfmr (121) -> mkvblbi, btrdhk
mbslas (81)
zkwplas (63) -> tdxsqf, gzarnps, nujmyt
hoilkqz (84)
jljgd (82)
wfwma (85)
rfeqsq (77)
ptfyi (789) -> exaqlbc, vdham, vxjvov
jdtwus (115) -> cumlar, rpxni
ddrsd (319) -> aibabp, dweli
buyou (40)
plrma (94)
cmfit (22)
nbjrv (39)
aizud (118) -> eirze, xnoux
jgbvdp (91) -> pasveb, vhcza
vckzclh (240) -> vuzkop, gpgmx
xdzya (8219) -> malnjq, jircuj, zxdfpy
zfaxas (30)
keoqd (91)
xnqeu (30)
wycfrkz (32)
oidjn (8)
ihmqbiu (1005) -> hcbdbh, abicjs, rpiuf, zpcqx, pzywvr
rpiuf (332) -> znbvji, rjjeggt
ygykyu (85)
abicjs (375) -> ierjhuk, psmvz, nfkbhas
ehclf (40)
okmwjoa (92)
uxbyymt (52)
xqyrozn (77)
eaxqpmn (9) -> zagaz, tzobgt
undug (38)
uxrros (89) -> kebfmsz, sqnfn, mlztke, ibvyfys, facjth, soddek, kxsefnd
rlyxbi (303) -> qrrdb, vvpacb, klcuumi, etxfihy, tptxpuq
vmgxg (652) -> coicjc, dpqrxbr, mhcyj, pzmmc
xoabt (58)
qztfbzn (89)
jbmxm (8)
noqmsh (81)
pgujeq (325) -> fiqnz, msywua
gmewl (70663) -> sxpee, flgjahm, hrbukg, rrtpjw, hgkjgm, twxwam, xdzya
pnszexz (43) -> ycxyxg, ycnnc
aledrs (33)
rwouyb (94)
uuztubk (139) -> rxbrsd, hwekwoq, ffzjjj
uwojoup (80)
svlvlj (254) -> pqsfee, fguhavr
ykzjkp (76)
vfrna (72) -> dhsyxu, dytadg, gjihp
vimplcz (81)
cwppzzd (58)
bstqyq (35)
mtqdya (44)
enmoyyj (10)
lfqtv (510) -> lnllv, gelep, lwujegj, uowiif
aujgtj (19)
hdyrxg (16)
ezoar (72)
zkkvh (14)
ylmwjuo (155)
mdanw (181)
klhzgvj (77) -> qmsxr, wuluf
rpmtne (88) -> heezga, xuwmc, rdrrye, qyvxs, sppxgv
zozajw (139) -> esyzn, vlfxdli
drfzng (58) -> hmwfqwz, zelwp, pgujeq, gzqutgv
hzauzw (75) -> hgrjt, tuuzrr
aepss (136)
zkaqnra (1790) -> upndyov, mcnsxuh, rulkpe, pfuyke, dzngp
egtem (76)
reuaanp (75)
apexe (85) -> pkjykh, wupsg, kdrke
agmao (53)
ctdsj (58)
izkej (98)
wfpxk (30)
cmqni (56)
qoksme (241) -> algetkl, xhqrf
otslex (19)
vumpiw (269) -> uwoyjsd, xdwrl
zimidd (21) -> hcrxqbw, uwojoup
eegwdp (82)
pjssvle (42)
zbtswr (94)
dzugjhb (60) -> orxgo, irgymg, cvxkylq, svfgh
befsr (50)
lrhkoc (82)
cbaah (5)
cimubay (62)
vnuwoq (75)
vbzyp (67)
exaex (135)
nmvki (40)
xdwrl (83)
gmfsl (306) -> yktmvtf, auztp, vhlizib
wsyqwf (42)
phdetz (15)
krquje (51)
vyqlzi (111) -> wnqny, hwhhyhh
qmsxr (72)
ojzpzsa (10)
qvuhbo (54)
esegn (16)
bdqnomo (80)
tgexl (76)
nuvrtnk (69)
zarww (162) -> vrqdv, ojozup
qqmpq (2091) -> dxggcx, kazlt, elcnwtn
pgdgh (1072) -> uzoroj, yaann, pnszexz
walzh (127) -> nbvlp, suyawzr
kkjro (582) -> vyfhcqp, yiyjz, nnjrm, oojlo, fdhvp
sxpee (31) -> sppgjfx, qwlze, erpdg, xngnhi, jngifv, jjxhgkx, lfqtv
jnshvhq (87)
ppavww (82)
vljooo (76)
zdaorg (42)
hlcnf (43)
mzgayzs (814) -> hpsljy, rgpazuy, wjqdusq, cvcvyeu, qfzyvjr, euxrv, xfkpfqd
dfntl (44)
efijtd (15)
sqcet (53)
malnjq (550) -> xqrnd, jrygk, qoukeij, hmtnj
ktvry (72)
fkvhdj (81)
qtcsae (85)
uwpuqd (26)
oeehfxg (85)
nfchpk (47) -> amooqlb, rxwxqe, uarsqn
hykmnhl (82)
tadprtr (50)
kqfesp (42)
piofa (2046) -> mxpxa, jbkek, cqupq
fseduzt (174) -> cbacfi, ypeap, vvivo
moeujf (181) -> bkfbj, apajk
vlysce (28)
xowek (47)
cqfyjm (68)
nzhfbo (6)
ovfby (23)
nkxdfu (10)
ooazmvu (55)
qrmipn (77)
wragpj (32)
bgasdfq (408) -> zxphdt, jdrkeh
srcfgoo (9) -> tetyj, qdfzlv, gymuodz, qbnldp
hztzf (152) -> spgyst, jxzfb
ebzton (94)
imdqhns (35)
tejonrz (23)
yvpzbgp (64)
luviddq (61)
akumg (64)
ixwoprg (102) -> zpyoxs, wwkdvm
uowiif (106) -> luviddq, jhltpk, dtsdw
zznnz (18)
dnmsps (61) -> plrma, jqhify
wfkxhlf (82)
yyrwb (75)
kdwict (157) -> umajdu, hgogzfl
gpgmx (57)
mzjhsq (62)
cxgdzl (27) -> glumdc, unnvung, ccbgy, zgrcahy
knendm (39) -> jaedvjj, poviv
xymtys (154) -> ayfafvc, ywrze
xrmslfs (214)
ycnnc (91)
plpctjz (296) -> cwppzzd, taaoji
qazqwkj (30)
swqgxh (76)
phmoj (92)
knmmys (620) -> pyhohkx, xiyhl, jdtwus, fwfbd
vcrgmn (227) -> zhnug, rfeqsq
cibrtjo (10)
kkjnouk (9) -> tbfkvty, vaqhekv, zbxopzp, biokfm
bpmus (87)
yntilqc (55)
ejrychc (26)
nusvn (104) -> kqokslj, owxbfr
begrb (6)
axhfcb (36)
lgmjeng (35)
kqfob (25)
qqfgo (55)
fsose (121) -> tmpysyn, hsjbzgd
hospabk (43)
cvxcr (23)
nefpbc (64)
dpcuy (88)
zsratan (39)
gybbvb (67)
tbedct (142596) -> ydcibyi, ejzoa, lcbkylu, wpugb, rlyxbi, jbolstg
wpxhphx (146) -> otnrfom, iemeek
xjiql (84) -> mplgqv, rrxrsx
kurnhks (54) -> zlsrhdz, pgibhk, zsancei, crqesym
fknai (16)
abccyo (78)
jaxjy (59)
zxdfpy (59) -> ikeiwjo, qwfosq, mmotdue, hjkrxly, zttytvi, swjcx, kvheuf
cgetpc (13)
wwrkqb (185) -> ruhqq, jrgiha
sfrwf (57)
qjxyfa (31)
vhlizib (27)
hwekwoq (28)
mocrsqu (109) -> vqlyyx, wdnlqh, apbjfv
mevce (88)
yldsmt (57)
wwkdvm (52)
reqlm (51)
pdprpyn (93)
irgumpr (71) -> xgibks, eowjgp, bzwiavk, cgtddkw, tinitt, cnrwew
jjdfk (53)
lmtebyt (85)
ibdon (66)
jjvbyf (62)
ncffht (97)
hpsljy (156) -> cukfipr, nqomdre
wqpfc (26)
glmcscm (62)
mitvkt (137) -> dlapc, eqsqenp
kmemzft (51)
gqwfi (51)
lhmhrpi (5)
tirehn (80) -> bdlzzvy, jnyvdz, zkwzctg
tmsnmf (42)
lxxbgm (56) -> hlansqa, agmao, dihvt, uxgux
yhonqw (579) -> tcaex, nwlacty, gkzpb, qtjpthc, ipfmr
oedan (21) -> zntrkc, lwpwtbj, awvqy, mmomd
gelep (34) -> qxivh, lmtebyt, wfwma
fllao (74)
sabolzl (64)
tmpysyn (22)
wrurg (32)
sfuegcs (42)
bhqkvi (31)
qgkaso (58)
fhryrfj (32)
hjkrxly (47) -> texooeb, elyuo
ssuho (92)
rejss (89) -> powvrta, fojnd, otqdauw
ffzjjj (28)
qkaaq (180)
suvwi (49)
rczoepp (36)
bhzeep (20)
kkflx (7330) -> coazy, kdwict, ojcpgj, qjdqn
gkxdmxg (10)
upnls (18)
bepnzsh (59)
xxsobt (137) -> zznnz, ziyta, xypex
bgscxgk (65)
tptxpuq (194) -> kemme, vfmiaz
qummd (77)
efkyht (11)
mmomd (71)
sulyr (73)
txswi (82)
ksbjftc (185) -> gfghu, spjim
gjvfc (94)
egkqlyz (148) -> vlysce, fozgkmk
aqeqvr (16)
kvheuf (63) -> johqe, dyeds
ajika (42)
dihvt (53)
zmpyqv (26)
xxvfb (17)
fvmws (43)
hsjbzgd (22)
uyvuqp (79) -> dfntl, jfvmu
cvseh (2033) -> liklroi, zsjvdo, bwtsue
juscckl (99) -> svlvlj, bujphvu, bgasdfq, ctdcrl
ruhqq (7)
yekxli (41)
ywrze (33)
jrksg (58)
mkvblbi (43)
suyawzr (47)
yhgutqw (10) -> oybow, ctdsj, deyxep, iyegmn
qucxsqh (83)
iurmaj (40)
ejjgym (69)
jfajopz (76) -> aonpvtr, hykmnhl, ppavww, wfkxhlf
undaxyj (92)
avfsez (81)
gbqig (181) -> qgkaso, gtditk
qaqof (130) -> oxerrb, afxazvx, mhseysh
xdrjmkv (82)
tocdoo (82)
mlztke (233) -> bgjwy, lrosl
aymgd (62)
mcnsxuh (143) -> xnqeu, xrjrjp, qvowcc, qazqwkj
afycii (199) -> okqwb, mvxqfe
atzuayu (41)
svfgh (99)
tnngtb (52)
hwhhyhh (56)
qrlmd (98) -> xernf, klvhv
wnjtvt (11)
wzruwk (82)
luixm (59)
hkntpfd (107) -> pyraep, tiunb
mqjpes (12)
pshil (78)
wvisr (137) -> znkqj, dwvbnp
slohro (598) -> qhgvoj, mdanw, zimidd
rdnozh (304) -> lgmjeng, llalv
psmvz (15)
zlsrhdz (75)
taaoji (58)
wbqkf (22)
metsfo (253) -> xoabt, wbiys
kckevg (7)
hhrlaah (155) -> smjtypd, rwqopie
daesbhs (77)
tuyjnby (44)
danfue (32) -> okrnkqa, mqjqez, gndjq, qcizo
ropjtoe (942) -> wpxhphx, wrwusvc, zarww, xymtys
tinitt (240) -> gypuu, btsvvyg
kxsefnd (285) -> cmqni, pjhoue
yzfnlfl (27)
wpfywy (530) -> mifmz, edygy, nmfhgq, danfue
hwldx (66)
sakmn (74)
ehlwoxs (7524) -> qggjzz, zordz, phntkf
fekdmb (96)
ziyta (18)
cbdyc (58)
ibushn (41) -> thats, nefpbc, yvpzbgp, vddsv
lcbkylu (732) -> gawbtev, aejhrrh, zfzpgfw
mhlgi (50)
rptfwu (12)
fkmyndg (50)
tylelk (24) -> drfzng, yhonqw, wsyiyen, dqwocyn, qqnroz
azjunml (42)
hfjazyf (80)
nuajwg (86)
cukfipr (40)
pkcpn (90)
guccv (73)
pyfeav (62)
ikeiwjo (157)
hqcwl (19)
xayhv (76)
wemzz (76)
cqupq (88) -> jjvbyf, zddlo, plmaxee
btrdhk (43)
eirze (41)
litnjrv (1103) -> fxqaw, jbqehvt, hhrlaah
gveca (66) -> bstqyq, imdqhns
wpgziu (88)
vfwwc (61) -> anoza, zjhnhz, hgdghys
losjvw (61)
zbxopzp (147) -> qaqgap, cqfyjm
uksim (24)
uiiqr (1611) -> ysxuvi, yryyz, dnmsps, cqdggj, vyevfn, dzienj
mifmz (170) -> tgqxadm, efqzxka
hkxefzm (40)
ojcpgj (121) -> fpwoels, dzyfjvd
xqrnd (35) -> wlodh, gbmexj, zsratan
ahcba (38)
jnxbxzk (32)
ftthnl (222) -> halwu, mdktwy
qjlrpjn (59)
nuwpvd (76)
jnhyc (252) -> lcqed, fiwnjv
gmevoe (43)
glumdc (64)
rajiodp (268) -> uldlh, rudbmkz
qebkt (95)
vddfzu (67) -> wchtkp, aduuei
hcqsg (939) -> zgzxr, moeujf, xtocem, hivsxt
wrwusvc (60) -> bdqnomo, objgx
uzoroj (199) -> dvips, dkeosz
ujyxvl (54)
nltqkvf (66) -> fwevqj, aledrs, elvzp
lhjpci (34)
igqup (69)
vszfxh (40)
ztxjb (81)
aibabp (58)
vaqhekv (217) -> pejkmud, bkicgcc
wchtkp (65)
ycxyxg (91)
rgpazuy (44) -> waxvx, uckyywt
bppdgwm (78)
csxdpl (56)
vxjvov (68) -> tocdoo, jpxgvjl
vuckhv (87)
wnqny (56)
kcorlw (86)
jlvakq (239) -> ngtpz, xplsuaq
tcfmra (96)
twxwam (8975) -> qwtvro, osipmuv, cldldxp
xhang (48)
qneggdm (169) -> iurmaj, faqsp
umuur (86)
tuyon (90)
aqoik (53)
oldoxo (75)
rjjeggt (44)
fdklcbu (70)
tslfayy (41)
zpjju (68) -> ncffht, akmsaq
xijkpj (38)
xfmneu (89)
fdgccyg (24)
qkllvda (8)
zhubam (12)
emreip (94)
euypgtx (80)
tbwieh (108) -> uglla, iyqcty, pgtmio
mlkddpw (34)
zxphdt (5)
ohbzmqz (11)
dylrpo (69)
zjuupn (51) -> sibko, mlighq, wogrc
xykvys (160) -> iemgv, joees
nxwtdg (51) -> tcfmra, nvkhow, fekdmb, xgufltj
mlighq (27)
abspab (54)
fzcerr (10) -> zhnjnvg, bncmd
fxhlrok (69) -> dyxzd, rajiodp, hztzf, apexe
xvhpqmh (47) -> tuyjnby, aygltsd
nafvoj (127) -> aqoik, tapirho, kyizmdu
bkfbj (61)
hmyuwix (50) -> bpmrgr, soiza, mkbjgur
ilkhnhw (96)
fkbivys (69)
ikclk (77)
ysxuvi (249)
sppgjfx (530) -> bszaj, ozzxjr, ivfffiz, cdqkuuw
dfghz (64)
bxwtlj (214) -> khkaq, pkdeoh, dvvlx
uvexl (205) -> ftohrkw, fknai
xrjrjp (30)
oopiw (214)
yesozb (55)
wochkc (88)
dzyfjvd (35)
efqzxka (71)
hdjlp (55)
pbmni (69)
afcsq (190) -> zlvgiq, wemzz
hsykei (80)
swjcx (79) -> nbjrv, ytfnug
yanwn (95)
orxgo (99)
tcvpst (22)
xnfybs (41)
ctqym (59)
hwdkwn (27)
bvelsl (54)
gkegoh (51)
cbacfi (60)
gjihp (35)
hgdghys (1528) -> acpwe, yvttt, xbowtoi, hmrrarb, qneggdm
aejhrrh (281) -> gkskqqb, acgiwii
pzmmc (83) -> kmemzft, ewtqg
ffrgif (6) -> bpmus, vuckhv
naacbhr (39)
qeksx (73)
ncymzc (202) -> holcno, lmueep
gfghu (73)
qbncqqm (76)
qqkwjoy (297) -> iuagzo, nuvrtnk
sohohlc (697) -> gmeqmy, xstgov, ncymzc
zhnjnvg (95)
blstaec (115) -> kxcid, qummd
uhmmouc (74)
tfphsaq (1875) -> sndfkkd, vddfzu, xorbfm
phntkf (31) -> jjdfk, sqcet, iueqa
xfkpfqd (236)
tujrz (62)
sfxvp (167) -> uvfou, kasozsw, jfajopz
lyaqynn (43)
bfqotji (55)
jbkek (164) -> txznlay, fkzxmb
kqvsah (95)
zffoytm (85)
bpvit (184) -> tgexl, qbncqqm
ocuhfpd (95)
xhqrf (73)
jtgcmc (47) -> aqfemi, undug, bpznnqh, mmjpziu
rdthc (173) -> zfaxas, wfpxk, jwmjagj
hrbukg (6404) -> vlszzu, irgumpr, xwunxz
sndfkkd (83) -> yldsmt, drswab
znkqj (80)
xhubgcl (254) -> xnqznos, cbaah
epeain (16)
jbqehvt (225)
dobqmg (159) -> ejjgym, igqup
fguhavr (82)
dtakrnu (20)
ozzxjr (254) -> ojzpzsa, enmoyyj, nqzlzs
sqwovza (82)
hqpkdyb (106) -> bvviqc, jxcxv, ozugcs
ybfqzep (82)
bpmrgr (34)
qcldyng (32)
sbsfo (98)
saxar (88)
xucrab (63)
mdktwy (66)
nkegq (69)
gawbtev (100) -> jleqdi, dylrpo, zxdhxrb
htgvzw (180) -> rpanfr, zdaorg
fojnd (32)
yaera (143) -> mpwlly, gxzxapn
vlaowv (226) -> dxzahps, mtfqemm
lwujegj (101) -> emreip, ujnas
rtwur (311) -> shgcr, euoqdcd
dniub (19)
qaqgap (68)
oucqw (7596) -> qrlmd, gwpzvb, aywrlw
nesoknh (82)
rpzit (59)
uwoyjsd (83)
rawfw (68)
bnsqqv (38)
sgvaf (43) -> ihmqbiu, mweox, zkaqnra, uiiqr, athdvrh, qqmpq, jfnknli
ysmqsps (61) -> hfjazyf, lyorl, mhassg, euypgtx
facjth (57) -> wvaynsl, ygykyu, bhaebe, qcsfpn
gdvqsyp (388) -> zdiygz, ksbjftc, uekiz
bsnxzz (55)
qyqthsz (5) -> nkegq, jrjkj
xcjxzq (1306) -> hmjzw, ylmwjuo, xupkjdt
nbykdlk (339) -> gmtsea, qahfrp
acgiwii (13)
xquzvw (41)
kdrke (81)
bpznnqh (38)
zhckae (58)
ypzqp (1219) -> jewrs, juytoy
vrqdv (29)
klcuumi (42) -> swqgxh, rtzodmx, xmendwz
bsqpcne (362) -> xulpd, ixwoprg, rqqxoou, xykvys, nfchpk
oxerrb (49)
hivsxt (147) -> bipyp, botmw
kmyvyx (90)
nfkbhas (15)
hkcghm (76)
kqokslj (80)
djxvowe (56)
jypccpq (46)
yktmvtf (27)
dezgi (20)
bojjcl (31)
zsancei (75)
jnmgovh (86)
buyazh (1149) -> jrksg, zhckae
sppxgv (276) -> hgblqo, xpqnuh
cguzndh (75)
shgcr (62)
hmrrarb (53) -> wadeqe, floca
lmueep (13)
ntugl (44)
ftatt (92)
pgnbhl (210) -> qovcwth, bhxmn, ibagnjs
qsods (55)
xngnhi (841) -> jfclt, fpnjjy, wjkqpqr
relztcy (22)
vtphqb (237)
qahfrp (8)
bqppw (269)
hxowycm (16) -> okmwjoa, undaxyj
oojlo (111) -> losjvw, ekpvnh
fgbsxh (268)
mmotdue (113) -> relztcy, qwtheza
tienxkv (358) -> rqbjjuo, wdgfw
qwfosq (35) -> aunrdo, ntadc
anoza (37) -> bdzkzv, dzugjhb, hgltuwc, odmmo, tienxkv, yowbd
kioxu (159) -> qkdiej, kqfob
ybjld (24)
juytoy (80)
xstgov (206) -> wnjtvt, bnqutso
tapirho (53)
vjhwn (1738) -> xrmslfs, djejdy, oopiw
iroikgp (75) -> vqbfan, gkegoh
jtfdy (19)
ybqzq (363) -> vpsls, bbsvfl, isoayc
pqsfee (82)
bhxmn (59)
amhug (73)
yxzdn (19)
wvaynsl (85)
hrhfd (37)
yrbpdq (57)
ipppjn (62)
ygnlbv (88)
zjhnhz (2113) -> fsose, tbwieh, myhgys, nltqkvf
facddx (151) -> hwldx, ydgusm
gnbmz (89)
bmxoqy (17)
pyhohkx (17) -> nghcpr, wpgziu
sqnfn (235) -> ztxjb, noqmsh
gzqutgv (185) -> gqwfi, yenbb, reqlm, krquje
tgqxadm (71)
qjdqn (27) -> wzruwk, eegwdp
mvldvib (44)
gbmexj (39)
ppedet (34) -> qhfoy, lpgtx, xucrab, oioqg
ctdcrl (38) -> kufceqa, qebkt, ocuhfpd, isvfa
bhaebe (85)
amooqlb (53)
tcaex (115) -> cvxcr, mxikfk, xzfrad, tlwqwlk
uoenrx (59)
ewvlay (34)
zkwzctg (98)
qkjed (32)
jewrs (80)
snquxtz (53) -> dzrywb, hoilkqz
miidkpe (96)
hgltuwc (316) -> ptyuh, wfixt
oybow (58)
dtsdw (61)
qfzyvjr (156) -> ehclf, nmvki
ymerus (46)
cbefqk (65) -> fgzwvuy, yaawixo
nyeur (17)
baimp (69)")

(defn inc-nil [x] (if x (inc x) 1))

(defn word-counts
  ([s] (word-counts {} s))
  ([words s]
   (if (empty? s)
     words
     (recur (update-in words [(first s)] inc-nil) (rest s)))))

;; grep -Ewo '[a-z]+' | sort | uniq -u
(defn day-7a
  ([input]
   (let [words (re-seq #"[^\d\W]+" input)]
     (filter #(= (second %) 1) (word-counts words))))
  ([] (day-7a day-7-input)))
