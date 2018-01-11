(ns adventofcode2017.inputs)

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

(def day-7-input "
vpryah (310) -> iedlpkf, epeain
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
baimp (69)
")

(def day-8-example "
b inc 5 if a > 1
a inc 1 if b < 5
c dec -10 if a >= 1
c inc -20 if c == 10
")

(def day-8-input "
um inc -671 if lbf != 5
j inc 236 if umr > -6
fk inc -246 if j < 241
uy dec -404 if mmw <= 2
j inc 372 if gk >= -1
uy inc -380 if umr > -4
dy inc 257 if es > -9
es dec 769 if es < 4
t inc -429 if umr >= 0
hg dec 13 if dy < 267
is inc 66 if fk == -246
fk inc -30 if es > -775
ada inc 258 if umr > 3
eri inc -950 if lx > -4
umr dec -789 if x >= -4
um inc -783 if aao > -7
j inc -97 if ada != -1
es inc 406 if fk != -283
lx inc 43 if kg <= 7
f inc 464 if lx <= 44
kg inc 884 if t >= -435
mmw inc 836 if gk > -3
a dec 496 if um > -1447
eri dec -617 if uy == 24
j inc -858 if kg < 886
hg dec -854 if umr == 789
dy dec -246 if f >= 457
lbf inc 122 if a != 10
aao inc -408 if uy > 19
f dec 908 if uy != 18
t dec -775 if j >= -351
t inc -594 if yk <= 3
es inc 28 if gk == 0
es inc -306 if kg >= 894
mmw dec 154 if kg <= 885
dy inc 832 if aao <= -402
lx inc -426 if a >= -8
umr dec -792 if eri > -341
a inc -609 if gk <= -6
j dec -970 if lx > -393
uy dec -241 if yk > 0
yk inc 411 if is > 61
ada dec -253 if is == 66
is dec -486 if aao > -413
yk dec 561 if a == 0
dy inc 976 if um == -1454
dy inc 885 if eri < -331
hg inc -5 if gk <= -9
t dec 717 if f <= -443
mmw inc -293 if lx <= -379
t inc 77 if lx != -383
uy dec -89 if ada <= 258
fk inc -381 if fk < -272
eri dec 711 if mmw < 398
is dec -273 if gk != -3
umr dec 384 if aao != -414
is dec -36 if is != 825
ada dec 422 if es < -326
fk inc 207 if mmw < 389
uy dec -357 if lx == -383
es inc 829 if dy <= 3199
aao dec -173 if gk == 0
x dec 274 if is >= 824
t dec -400 if is <= 833
fk dec -677 if f == -444
x inc -494 if j == 623
t dec -406 if f < -443
gk dec 704 if gk == 0
x inc -637 if x < -758
x dec 194 if gk != -710
um inc 956 if fk > 26
ada inc -527 if aao > -239
j inc -774 if f <= -436
es inc -121 if ada > -689
hg dec -461 if gk < -698
t inc 780 if is < 828
yk inc -858 if es >= 504
dy inc 145 if j > -159
is inc 929 if f != -453
mmw inc 702 if fk > 17
lbf dec 123 if aao >= -240
hg dec -543 if a == 0
kg dec -610 if es > 488
hg inc -726 if hg < 1854
kg dec -410 if j <= -146
dy inc -469 if gk <= -712
a inc 252 if aao > -237
dy dec 168 if uy <= 478
gk inc -530 if a > 244
gk dec -254 if uy == 479
es inc -960 if j > -152
umr dec 561 if hg != 1126
uy inc 420 if j < -148
mmw inc 976 if j < -142
umr dec -852 if gk >= -1238
aao dec 559 if eri >= -1042
gk inc -745 if j <= -142
t dec 183 if hg < 1112
t inc 725 if yk == -150
lbf dec -142 if kg < 1912
mmw dec -908 if is <= 1758
um inc 329 if f == -447
x dec 543 if ada > -704
gk inc 226 if eri <= -1041
es dec -176 if mmw == 2975
ada inc -156 if eri >= -1053
ada inc -523 if t <= 1347
aao inc -717 if x < -2145
gk inc -236 if t >= 1354
lx dec -266 if lx != -389
hg dec -324 if dy >= 3169
f dec 96 if x != -2143
yk inc -270 if um != -1450
aao inc -916 if lbf == 141
es inc -943 if f == -540
a dec 974 if lbf > 131
dy dec -35 if yk == -413
kg inc 112 if eri >= -1053
mmw inc -30 if gk <= -1754
um dec -288 if mmw < 2978
es dec 774 if uy == 900
t dec -60 if x > -2145
j inc 1 if x > -2148
dy inc 222 if es >= -1232
is dec -221 if x != -2142
hg dec -626 if uy > 887
is dec -114 if t <= 1408
j inc -564 if umr == 1488
a inc -29 if f != -540
umr dec 373 if fk != 17
a dec -788 if fk >= 14
ada inc 316 if aao >= -1153
x dec 970 if lbf != 141
x dec -209 if aao >= -1159
uy dec 279 if lx != -117
f dec 517 if hg >= 2065
j dec 566 if a <= 75
x dec -346 if a <= 59
t inc 576 if lx > -118
um dec 785 if es >= -1229
a dec -949 if mmw > 2974
j inc 915 if x <= -1929
hg inc 177 if is < 1873
is inc -678 if f >= -1052
umr dec 254 if lx > -123
x dec 754 if um < -1160
aao dec 977 if uy <= 894
yk inc -157 if aao <= -2124
um inc 631 if is >= 1867
lx inc -99 if ada <= -1058
fk dec -834 if x < -2695
is dec 105 if x != -2680
a inc 462 if umr <= 864
mmw inc 394 if lbf > 150
gk inc -370 if lbf >= 146
is inc 722 if yk > -586
dy inc -882 if gk != -1753
t inc 983 if gk == -1763
fk dec 874 if fk > 14
hg dec -949 if lbf < 142
es dec -592 if uy == 891
dy dec 823 if gk >= -1762
mmw dec 137 if gk >= -1751
hg dec 704 if dy >= 2343
t dec -921 if j != -372
x dec 95 if is >= 2485
dy inc -117 if kg >= 2017
gk dec 551 if um <= -545
ada inc -161 if umr >= 856
mmw inc 633 if umr != 862
fk dec 38 if lbf >= 140
kg dec -954 if x >= -2787
um inc 325 if hg > 2481
um dec -72 if j > -375
umr dec 910 if gk <= -1756
fk dec -628 if j != -356
mmw dec 267 if aao != -2123
eri inc -857 if um != -137
um inc -651 if eri != -1896
j dec -122 if a >= 1473
umr dec 177 if gk == -1753
mmw inc -16 if t > 2911
eri dec 502 if um <= -785
hg inc 134 if x != -2775
lx dec 263 if kg <= 2978
hg dec 83 if es != -1235
mmw dec -837 if umr <= 693
dy inc 148 if um < -792
gk inc -13 if j > -247
x dec 749 if yk >= -568
lbf inc 606 if is != 2489
x inc 588 if dy >= 2345
dy dec 243 if yk <= -574
umr dec 1 if es == -1233
f dec 104 if t == 2903
aao dec 32 if es != -1224
x inc 882 if j < -245
hg inc -998 if uy == 890
dy dec -605 if dy <= 2115
hg inc 45 if gk != -1769
lbf inc -521 if t > 2894
umr inc -115 if a != 1473
lx dec -795 if x == -2194
t inc 143 if f < -1154
es dec 629 if is > 2494
lbf inc 195 if fk <= -263
fk inc 926 if aao <= -2153
um inc 351 if es != -1230
t dec -541 if lx != 316
mmw inc -329 if mmw != 4178
dy inc 708 if is > 2481
j inc 386 if t != 3050
hg dec 253 if umr == 568
um inc 236 if mmw >= 4172
fk inc -874 if hg != 1328
lbf dec -499 if um != -202
lbf dec 999 if gk > -1774
gk dec 474 if fk > -219
mmw dec -598 if yk > -585
fk inc -508 if t == 3046
mmw inc -638 if x == -2193
f dec 756 if a == 1477
mmw dec -339 if aao > -2161
um inc 109 if lbf <= -578
fk dec -421 if lx < 321
is inc -725 if ada >= -1226
fk dec -458 if ada >= -1226
uy dec -588 if aao <= -2160
ada inc 404 if dy != 3420
x inc 788 if f <= -1910
kg dec -520 if is == 1754
es dec 895 if lbf < -568
fk dec -999 if lbf == -578
kg dec -38 if lbf != -574
uy inc 343 if lbf != -579
is dec -176 if es <= -2125
lbf dec -680 if lbf < -573
eri inc 562 if uy != 1823
x inc 87 if fk >= 1158
umr dec -850 if eri > -1843
um inc -978 if eri <= -1849
x dec 389 if gk < -2241
f inc -288 if a != 1486
kg dec -484 if uy < 1826
lx dec -328 if lbf != 97
um inc -998 if gk <= -2240
yk inc 314 if mmw <= 5120
t dec -884 if es == -2128
uy dec 190 if f <= -2199
lx dec 128 if umr > 1425
eri inc 807 if a > 1485
ada inc 272 if umr < 1422
hg inc 630 if is == 1937
um dec 143 if ada >= -949
eri dec -334 if lx != 637
fk dec 147 if umr < 1426
gk dec 309 if uy == 1631
aao dec 233 if hg == 1336
is dec 825 if yk > -271
lbf dec -498 if umr <= 1413
kg dec 473 if es > -2131
mmw dec -728 if hg != 1327
dy dec 309 if hg <= 1341
dy inc -863 if kg >= 3023
x inc -465 if lx <= 647
a inc 253 if x >= -1793
kg inc -184 if eri < -1500
um inc -527 if lx != 652
j inc -455 if hg > 1328
eri inc 866 if yk != -263
aao inc -47 if gk > -2553
gk inc 228 if gk < -2554
gk inc -493 if fk <= 1006
mmw inc 800 if x == -1784
lbf inc -351 if umr < 1426
a inc -903 if ada > -958
umr inc 942 if es != -2128
dy inc 600 if a < 830
j dec -247 if lx < 646
gk dec -922 if t >= 3930
mmw inc -114 if lx != 654
fk dec 415 if um > -1764
t inc -763 if lbf < -246
ada inc 818 if is > 1108
uy inc -839 if t != 3171
fk inc -335 if is > 1106
fk dec -335 if yk == -263
fk inc -291 if dy == 3711
lx dec -665 if yk != -263
es dec -772 if uy != 792
umr dec -528 if um != -1764
t dec -95 if es < -2137
es inc -800 if yk >= -261
kg inc 150 if j >= -70
f dec -118 if mmw < 6536
a inc 595 if uy > 794
is inc 927 if lx > 636
eri dec -61 if x != -1785
hg inc -878 if yk != -260
gk inc -727 if fk <= 305
mmw dec -945 if a <= 833
aao inc -101 if x >= -1792
hg dec 567 if es > -2131
gk inc -689 if mmw < 7484
ada inc -644 if eri > -1452
yk inc -810 if yk > -265
um dec 655 if aao < -2533
t dec 179 if umr != 1943
gk inc 833 if hg >= -110
fk dec 998 if fk < 315
a dec -558 if aao > -2543
x inc 426 if lbf == -249
uy inc 892 if yk > -1075
umr inc 250 if es <= -2127
mmw inc -727 if umr >= 2193
kg dec 111 if es == -2128
dy dec 898 if fk != -693
yk dec 168 if umr >= 2191
uy dec 113 if dy <= 3711
mmw inc -752 if yk == -1241
yk inc -181 if t > 2989
mmw dec -636 if t < 2995
a inc -424 if hg == -109
j dec -762 if ada > -780
lx dec 565 if uy <= 1577
aao dec 858 if j == 697
fk inc -383 if a < 969
eri inc -51 if lx <= 85
aao inc 666 if j > 690
t dec 234 if a == 964
aao inc -69 if fk > -1085
es inc -721 if gk >= -2215
is inc -185 if lbf > -251
mmw dec 411 if es == -2849
f dec -214 if gk == -2210
yk inc 904 if aao >= -2804
es inc 883 if mmw != 6210
x dec 6 if ada != -774
aao inc -776 if um != -2419
j inc -653 if yk == -344
gk dec 338 if fk != -1072
yk inc -13 if x >= -1360
lbf inc 201 if dy < 3716
yk dec -904 if aao != -3575
f dec 922 if j == 697
uy dec -562 if lbf != -53
gk dec 50 if lbf <= -47
t inc -670 if mmw > 6222
lx inc 515 if uy == 2133
yk inc 261 if dy > 3704
x dec -854 if uy == 2133
kg inc 66 if umr == 2196
kg dec -83 if j != 706
ada inc 739 if gk > -2590
eri dec 379 if eri == -1497
dy inc 638 if aao >= -3583
a dec 130 if is > 1851
mmw dec 399 if uy == 2133
eri inc -195 if f > -2801
j dec 885 if dy > 4339
eri inc -544 if aao == -3587
kg inc 895 if t != 2984
yk inc 258 if dy <= 4350
es dec 660 if dy == 4342
umr inc -92 if gk < -2592
eri inc 361 if x == -504
um dec -298 if gk != -2588
fk dec 532 if j < -184
uy inc 31 if f < -2791
aao dec 31 if j != -182
ada inc 448 if um <= -2113
fk inc -13 if eri <= -1703
t inc -59 if es >= -1971
gk dec -909 if x == -510
es inc 805 if hg >= -112
j dec 734 if kg >= 3919
um inc 369 if aao != -3606
yk inc -548 if dy > 4348
gk inc 934 if j < -182
x dec 346 if hg <= -107
lbf dec -379 if eri != -1718
lbf inc -921 if f >= -2802
mmw inc -191 if eri <= -1703
umr inc 252 if lx != 600
mmw dec 410 if ada >= -330
gk inc 558 if a != 828
mmw dec 320 if um <= -1744
ada dec 517 if t < 2933
is dec -616 if ada > -835
yk dec -406 if j <= -185
yk inc -526 if lbf <= -586
ada inc 368 if j == -188
kg inc -89 if f <= -2791
kg dec -531 if lbf == -590
mmw inc -252 if f < -2787
is inc 293 if eri > -1713
lbf inc 509 if kg <= 4367
eri inc 607 if fk > -1620
f dec -313 if j > -194
ada inc -582 if aao >= -3611
a inc 373 if x == -850
eri dec 668 if ada != -1057
um dec 112 if lbf <= -72
lx inc 91 if t > 2919
a inc 157 if is > 2139
fk inc -207 if a != 1371
um inc 108 if t <= 2929
aao inc 80 if lx >= 681
fk inc 437 if lbf == -81
umr inc 473 if lbf <= -75
eri inc 509 if umr != 2822
a dec -7 if is >= 2146
fk inc -10 if t != 2920
is dec 235 if a > 1358
ada inc -655 if eri == -1201
kg dec 983 if f >= -2486
es dec 640 if t <= 2938
eri dec -700 if is < 1919
ada inc -213 if fk == -1401
hg dec -846 if kg != 3381
f dec 584 if a <= 1361
aao inc 731 if gk != -1107
t inc 823 if kg == 3377
es dec 382 if j > -195
fk inc -83 if ada < -1916
umr inc 948 if eri > -511
a inc -765 if eri == -501
a inc 114 if f > -2478
aao inc 343 if aao == -2798
t inc -172 if eri < -498
fk inc 905 if x < -840
dy dec -731 if a > 597
lx inc 410 if um <= -1744
eri inc -859 if lbf <= -90
fk dec 820 if ada < -1916
yk dec 14 if dy != 5078
aao inc -89 if lbf != -81
umr dec 242 if aao > -2457
f inc -563 if lx <= 1100
uy dec 967 if uy <= 2166
eri dec 984 if lx > 1086
hg dec 816 if mmw <= 4653
hg dec -413 if um == -1753
dy dec -410 if mmw > 4643
uy dec -298 if lx >= 1094
mmw dec -611 if dy > 5483
t dec 471 if is != 1915
fk inc 505 if aao >= -2463
gk dec -947 if fk == -894
es inc -556 if umr >= 3532
es inc 768 if x >= -853
yk dec -865 if aao == -2455
hg inc -481 if a != 609
ada inc 904 if es == -1971
hg dec -518 if um < -1750
yk dec -744 if fk != -889
a inc 410 if f > -3047
dy inc 522 if is >= 1913
um inc 882 if is < 1915
es inc -950 if fk > -889
is dec -211 if is == 1911
kg inc -160 if um == -871
a inc 315 if j == -188
umr inc 840 if eri <= -1479
kg inc -805 if ada <= -1013
um inc 701 if x == -850
a inc 735 if umr == 4375
um inc -413 if lbf != -76
dy inc 310 if mmw <= 5268
lbf inc -210 if dy != 5800
um dec -489 if lx == 1095
fk dec -743 if mmw <= 5258
lx inc 332 if mmw > 5249
hg dec 396 if mmw >= 5251
yk inc -672 if fk > -896
a inc -872 if t >= 3114
a inc 22 if umr >= 4370
es inc 374 if um > -98
uy inc 609 if lx <= 1434
a dec 580 if is >= 2118
hg dec -809 if lx >= 1424
fk dec 451 if aao != -2446
mmw dec -339 if gk < -156
hg inc 566 if gk < -153
hg inc -629 if uy >= 2100
lx dec 314 if a > 1503
lbf dec 173 if lx >= 1109
t dec 107 if ada == -1021
dy inc 421 if mmw <= 5607
is dec 751 if hg != 731
hg inc 844 if hg != 730
eri inc -44 if a == 1505
uy dec 230 if t <= 3002
uy inc -450 if eri < -1521
kg dec 353 if j == -188
lbf inc -100 if mmw >= 5592
umr dec -946 if f >= -3045
t inc 893 if j == -188
lbf dec -263 if hg <= 1572
j inc 22 if umr == 5313
eri dec 598 if aao >= -2463
umr dec -591 if eri > -2130
t dec 489 if dy <= 6230
ada dec -547 if a != 1505
eri dec -38 if dy > 6220
ada inc 895 if is == 1371
is inc -303 if mmw < 5599
uy dec -217 if a <= 1513
a dec -366 if x <= -851
um dec 570 if t < 3411
uy inc -560 if mmw <= 5599
um dec -234 if gk != -152
fk dec 305 if um == -430
lx dec -553 if a > 1505
yk dec -923 if yk < 1335
yk dec 137 if es < -1590
hg dec 737 if es > -1605
yk dec 607 if eri < -2080
um dec -588 if eri != -2097
aao inc -230 if aao != -2455
fk inc -654 if t >= 3398
umr dec 525 if kg != 2064
mmw inc -242 if lbf < -90
lbf dec 682 if aao >= -2462
yk inc -971 if t >= 3402
t dec -403 if fk <= -2296
ada dec 404 if kg == 2059
dy inc 95 if yk < 542
lbf inc 427 if j <= -182
j inc 10 if j <= -179
x dec 524 if f <= -3051
lx dec 326 if gk != -163
umr dec 176 if lx >= 789
um dec 264 if eri == -2089
t inc 197 if eri == -2084
dy dec 574 if es > -1605
lx inc -898 if um >= -110
es dec -845 if um >= -113
es inc -731 if yk < 537
lx dec 424 if f >= -3053
a inc 525 if lx != -535
uy dec 692 if yk > 531
a inc -591 if fk >= -2309
fk dec -204 if aao != -2459
mmw dec -420 if fk <= -2110
yk inc 166 if j < -168
umr inc 535 if gk < -158
eri dec 417 if yk >= 695
umr inc 230 if mmw != 5363
umr inc -36 if lbf < -348
f dec -763 if aao < -2450
uy inc -841 if es >= -1490
is dec -381 if gk >= -167
x dec 981 if hg == 828
f inc 682 if ada == -530
fk inc 268 if uy != -450
dy dec 891 if ada < -529
uy dec 943 if hg != 828
ada dec -496 if a < 907
is dec 380 if gk == -159
aao dec 772 if eri < -2505
umr dec -646 if umr > 6151
dy dec 978 if t == 3809
kg inc -768 if fk > -1834
lbf dec -107 if x <= -1828
lx dec 822 if yk <= 709
umr inc -504 if ada > -533
aao dec -710 if es == -1483
uy inc 17 if hg >= 838
fk dec -48 if a == 914
fk inc -80 if j >= -182
gk inc 339 if um < -113
lbf inc 224 if f != -1603
lbf inc 553 if kg == 1291
umr dec -384 if ada > -535
lx dec -618 if t == 3809
aao dec -291 if ada >= -534
lx dec -385 if f <= -1591
lbf inc -918 if is <= 1069
kg inc 807 if dy != 3871
a dec -120 if eri >= -2509
fk dec 886 if uy == -452
is inc 668 if f == -1600
ada dec 281 if dy >= 3872
aao inc 952 if j > -182
eri inc -279 if kg >= 2098
gk inc -357 if gk <= -153
lbf inc -255 if um == -106
es inc -509 if um < -105
j dec 929 if umr < 6681
is inc 906 if um != -114
ada dec 951 if gk >= -523
aao dec 80 if kg > 2089
t inc 811 if hg < 832
yk inc 303 if f > -1601
gk inc 180 if mmw <= 5351
is dec -639 if umr < 6672
mmw dec -142 if kg <= 2103
fk dec -275 if is != 2643
ada inc 568 if x <= -1822
a dec 677 if yk != 1005
yk inc 111 if es <= -1990
eri inc -17 if eri >= -2793
lbf inc 974 if gk == -516
hg inc -723 if lbf == 337
mmw dec 408 if dy <= 3877
t dec 142 if mmw < 5084
gk dec 53 if yk != 1111
lbf dec -434 if aao != -1344
kg dec -837 if f >= -1593
f inc 513 if eri <= -2804
fk dec -925 if fk >= -2756
t inc 280 if kg != 2100
lx dec 328 if dy < 3880
t inc -359 if j < -1103
es inc 289 if ada < -1203
x dec -414 if gk >= -574
aao dec 710 if dy == 3873
es dec -70 if ada <= -1187
ada dec 883 if j == -1110
is dec -635 if um != -105
is inc 627 if a == 1034
um inc -348 if ada > -1190
mmw dec -270 if uy >= -454
ada dec 362 if is > 3900
eri dec -504 if t != 4541
uy inc 910 if eri >= -2804
es dec 261 if fk < -1821
uy dec -430 if uy >= 456
yk dec -841 if um >= -107
j dec -287 if fk >= -1834
a dec 90 if uy <= 897
lx inc 867 if hg < 819
yk dec 265 if fk >= -1820
is inc -444 if umr >= 6676
kg inc 586 if f == -1600
es dec -298 if uy != 889
mmw inc -896 if gk >= -576
a dec -320 if t >= 4538
t dec -722 if hg >= 819
mmw inc -778 if ada < -1553
um dec -914 if j != -826
kg inc -964 if f < -1605
yk inc -51 if umr >= 6670
um dec 219 if j == -820
dy inc 727 if a == 1264
a dec -817 if kg <= 2692
um dec 99 if fk == -1826
kg dec 302 if uy != 892
j dec -696 if lx <= -688
uy inc -626 if t <= 5268
a dec 961 if hg <= 837
yk inc -803 if a != 1119
mmw dec 678 if lx < -680
lbf inc 862 if fk < -1825
kg inc -786 if t <= 5259
aao dec 91 if x == -1407
uy dec -548 if t == 5263
aao inc 638 if is != 3463
hg dec 244 if uy > 807
f inc 58 if lbf >= 765
fk inc 581 if is != 3455
hg dec -692 if fk >= -1247
um inc -752 if aao < -1424
lbf dec 14 if lbf != 783
t dec 270 if f == -1542
uy inc 70 if hg <= 1277
is inc 676 if lx == -682
is inc 230 if um >= -163
gk dec 799 if yk > 1107
ada dec -20 if eri != -2804
lx dec -278 if umr == 6678
gk inc 83 if umr <= 6686
lbf inc 265 if a >= 1118
is dec 476 if j != -820
eri dec 509 if lx > -413
is dec -486 if dy < 4606
kg dec 989 if is > 4847
lx inc 996 if dy >= 4591
is inc -371 if eri > -3303
kg dec 209 if f != -1542
kg dec -21 if kg < 1394
uy dec -34 if x == -1417
mmw inc -753 if hg != 1285
gk dec 862 if kg > 1408
ada dec 346 if is < 4856
umr inc 262 if es > -1888
lx inc -842 if umr < 6948
f inc 557 if yk != 1103
dy inc -323 if lbf >= 1030
kg dec 610 if ada >= -1883
f dec 727 if f != -1544
es dec -922 if aao > -1435
kg inc -628 if f == -2269
eri inc -762 if lx < -245
a dec 246 if a <= 1118
aao dec 51 if kg >= 181
is dec 761 if x >= -1417
j inc 359 if x == -1417
mmw dec 562 if ada < -1880
lbf dec 955 if aao != -1426
umr dec -851 if x == -1417
t dec -845 if is <= 4101
lbf inc -666 if hg > 1272
um dec -105 if f >= -2274
gk inc 191 if umr != 7781
dy dec -399 if eri <= -4072
is inc 681 if t != 5835
mmw inc -731 if ada > -1883
x inc -603 if yk < 1111
j inc 860 if fk <= -1239
t dec -480 if kg > 175
eri inc 308 if mmw > 957
hg inc 37 if gk >= -1163
eri inc 868 if kg >= 172
gk inc 381 if f > -2276
ada inc -231 if fk < -1234
uy dec -404 if gk >= -781
es inc -33 if yk != 1105
j inc -210 if um != -66
umr dec -783 if kg == 176
a inc 287 if hg < 1322
es inc 794 if f >= -2270
f inc 816 if a < 1417
eri inc -136 if fk <= -1235
j dec 421 if lbf < 362
kg dec -889 if fk > -1248
um inc 701 if yk <= 1110
x dec -487 if fk < -1243
aao dec 623 if umr <= 8582
mmw dec -307 if eri > -3038
t inc 803 if f == -1453
kg dec 980 if a < 1404
dy inc -974 if gk < -772
yk inc 221 if eri < -3040
gk inc -421 if aao > -2059
mmw dec -751 if f <= -1445
kg dec 422 if lx <= -250
dy dec 191 if x <= -1535
um inc -318 if gk != -1195
mmw inc 870 if kg != 651
j dec -865 if t < 7131
um dec 886 if t < 7124
ada inc 171 if eri < -3030
x dec -755 if es == -202
fk inc -325 if hg >= 1313
t dec 984 if t != 7130
j dec 55 if aao == -2056
fk dec 80 if x <= -773
dy dec 852 if lx != -256
is inc 295 if a >= 1408
uy dec 733 if hg < 1318
x inc 868 if um <= -560
t dec -532 if t != 6128
aao inc -530 if x == 90
is dec 374 if lbf == 358
aao inc 93 if t == 6673
uy inc -657 if hg != 1317
fk inc -670 if umr > 8568
x inc 791 if j != 634
mmw dec -872 if uy >= -73
yk inc -771 if eri <= -3034
umr dec -125 if kg < 645
mmw inc -617 if aao > -2581
mmw dec -90 if mmw != 3145
es dec 182 if aao <= -2574
kg dec 903 if ada >= -1934
um inc 319 if lbf == 358
uy inc -958 if f <= -1447
ada dec -965 if eri == -3033
fk dec 750 if es >= -393
hg inc -488 if hg >= 1307
lx inc 742 if umr != 8703
uy inc 378 if kg != 643
lx dec -584 if um != -233
kg dec -654 if ada >= -986
is dec 181 if f == -1453
eri inc 302 if lx < 1080
uy inc -907 if kg != 1289
yk dec 652 if is < 4223
lbf inc -147 if hg != 823
fk dec -584 if kg < 1300
fk dec -593 if f <= -1449
dy dec -83 if gk < -1189
a dec -568 if es <= -377
aao inc -742 if gk <= -1193
kg dec -560 if hg <= 831
es dec -871 if fk > -1899
lx inc 239 if kg != 1855
uy dec 696 if ada >= -984
kg dec -899 if yk >= 452
x inc -303 if is <= 4223
um inc -207 if lbf != 211
eri dec 520 if eri >= -2731
is dec -251 if t < 6675
umr inc 19 if kg == 1857
lbf dec -365 if uy != -2632
yk dec 192 if fk < -1883
dy dec 451 if hg > 820
j dec -789 if lx <= 1320
um dec -577 if lx > 1309
es dec 954 if dy != 2800
aao dec 798 if f <= -1446
mmw dec -339 if mmw >= 3143
j inc 126 if yk == 259
ada inc -898 if umr != 8718
kg inc -365 if eri == -3251
aao dec 718 if lx > 1307
x inc -872 if kg <= 1495
j dec -862 if is != 4464
mmw dec -785 if is == 4469
t dec 355 if uy != -2627
ada dec -528 if ada == -977
yk dec -139 if hg >= 823
mmw dec -97 if is == 4469
j dec -454 if is == 4469
yk dec -151 if kg < 1500
lbf inc -19 if lbf != 576
yk inc 281 if umr == 8718
gk dec 59 if mmw <= 4374
umr dec 266 if hg < 828
fk inc -54 if is <= 4477
is inc 468 if is >= 4477
mmw inc -749 if ada != -442
is inc 22 if mmw > 3608
uy inc -436 if ada != -449
umr dec -545 if gk == -1256
mmw inc -716 if ada <= -447
fk dec -470 if f >= -1450
ada inc -429 if uy != -2633
aao inc -28 if a < 1984
umr inc -826 if aao >= -4867
lbf dec 141 if kg < 1493
lbf inc 307 if eri == -3251
um dec -120 if um == 335
j inc -674 if fk == -1956
mmw inc -784 if lx == 1315
x inc -524 if dy == 2805
mmw dec 911 if kg == 1492
gk inc 260 if mmw >= 1200
es inc 638 if hg > 819
mmw dec 276 if ada == -449
eri dec -682 if kg != 1489
um inc 790 if t > 6321
a inc 288 if eri >= -2560
eri dec -477 if lbf >= 747
kg inc 922 if kg > 1489
ada dec -65 if uy >= -2634
ada dec -106 if umr >= 8170
is dec -609 if aao >= -4866
t dec -598 if mmw == 930
gk dec 89 if t != 6912
t dec -500 if f < -1456
is dec -169 if es == 171
f dec -633 if f <= -1453
aao dec -191 if t > 6905
a dec -772 if eri > -2574
x inc -272 if x >= -818
es dec 135 if j <= 2862
uy inc 950 if aao == -4674
ada dec 380 if aao != -4676
aao inc 111 if kg < 2415
lx inc -339 if umr == 8171
yk dec 63 if ada <= -653
yk inc -894 if j > 2863
f dec -590 if eri != -2560
hg inc -281 if gk == -996
lx inc -529 if hg >= 539
ada dec -133 if es != 163
f dec -510 if t != 6912
uy inc -761 if um != 465
a inc -466 if um > 452
f dec 811 if lbf <= 747
umr dec 206 if umr >= 8170
x dec -606 if dy <= 2814
t dec 823 if hg <= 553
yk inc 130 if um != 453
aao inc 984 if fk > -1948
x dec -152 if um > 447
fk dec -958 if kg > 2418
eri dec 996 if a < 2290
aao inc 702 if x != -330
lbf dec -8 if aao > -2872
mmw inc 346 if hg != 554
is dec -255 if fk == -1946
gk dec -139 if x >= -335
j dec -238 if x != -332
lbf inc 649 if a < 2283
lx inc 702 if es < 178
fk dec -918 if j > 2858
lbf inc 971 if hg == 544
f dec -807 if a < 2283
eri dec -263 if dy != 2814
fk dec 128 if kg == 2414
hg dec 541 if mmw > 1270
uy inc -144 if um <= 458
um dec 362 if mmw == 1276
yk inc -346 if mmw == 1276
mmw inc -543 if yk <= -340
hg inc -358 if mmw == 733
es dec -652 if f >= -232
uy dec 401 if ada == -525
x inc 736 if kg >= 2412
uy inc -489 if mmw == 733
yk inc 134 if is > 5522
lbf dec 531 if uy != -3470
f inc 472 if umr >= 7960
f dec -410 if lbf >= 1836
eri inc 522 if gk == -857
um inc -672 if es != 178
fk dec -774 if j <= 2871
f inc 825 if kg != 2414
j dec -713 if es <= 178
um inc 769 if t <= 6079
lx inc 995 if dy > 2797
is dec 359 if es < 180
a inc -680 if es < 177
eri inc -102 if mmw < 736
ada inc 39 if eri != -2889
lx dec -935 if lx != 2145
hg inc 741 if es >= 165
kg dec -156 if lbf <= 1835
f dec 376 if eri > -2892
aao inc 570 if j == 3577
dy inc 708 if is > 5162
a dec 737 if aao == -2307
x inc 936 if hg == 391
aao inc -405 if j > 3576
mmw inc -42 if kg > 2561
j dec 295 if um != -588
yk dec -641 if j <= 3282
umr inc -633 if gk != -864
dy inc -202 if gk < -858
aao inc -244 if gk != -861
uy inc -97 if kg == 2573
mmw dec -889 if ada < -482
es inc -166 if fk == -382
eri dec -962 if eri >= -2889
umr dec 201 if t >= 6086
gk dec -700 if mmw == 1580
ada inc -158 if gk < -159
t inc 650 if es < -2
lbf dec 870 if aao > -2966
uy dec 727 if j <= 3289
umr inc 483 if lbf < 971
hg dec -283 if fk != -379
kg dec 202 if t < 6090
eri inc 607 if a >= 864
lbf dec 282 if lx > 3074
yk dec 490 if mmw >= 1573
uy dec -536 if aao >= -2959
uy dec -306 if lx > 3071
fk dec 982 if lx == 3069
aao dec 431 if aao < -2947
mmw inc 145 if t < 6093
is inc -222 if es <= 11
mmw inc -953 if fk < -372
a inc 588 if x != 406
gk dec 464 if lx <= 3080
mmw dec -655 if a > 1448
mmw dec 251 if aao < -3394
t inc 582 if dy < 3508
lbf dec 816 if ada < -492
uy inc 374 if a >= 1445
f inc 98 if f >= -129
gk dec -206 if gk == -621
lbf dec -368 if fk != -382
mmw dec -16 if um == -579
dy dec 522 if umr == 7614
fk inc -645 if dy != 2998
hg dec 829 if lbf > 676
aao dec 472 if t != 6098
kg inc 926 if aao >= -3868
x dec -485 if j <= 3284
x dec 987 if mmw > 1433
yk dec -933 if aao != -3859
fk inc -446 if lx <= 3080
kg dec 573 if f != -129
hg dec 231 if dy <= 2992
eri dec -162 if es < 14
t dec 975 if lx > 3086
dy dec -144 if f < -147
lx dec 122 if lbf < 682
mmw inc -438 if umr == 7614
j inc 149 if mmw < 1009
t inc 749 if lx > 2947
um inc -970 if hg >= -400
kg inc 368 if kg != 2721
aao dec 845 if kg == 2721
eri dec -521 if yk > -59
gk dec -200 if ada >= -495
hg inc 462 if um == -1549
eri dec -54 if mmw >= 998
hg dec -268 if a >= 1450
j dec 86 if t != 6840
a dec -394 if a == 1452
aao inc 166 if kg >= 2720
x inc -146 if is == 4943
es inc 496 if kg < 2723
t dec -949 if uy <= -2989
")

(def day-9-input "{{{{{{<e<{!i!>},<oe'!><!}}\"ao,o>},{{},<!!!>e}\"!!!!!>!}!>,<\",!}!>},<{>}},{<{e!!i{\"!!!>!!!>>,{<!!e!>},<!>,<!>!u!!!!!!i{!><!>!!!>},<!!,!!!>!!,>}}},{{{{}},{<a!!!e<o!!!>!u,!!!>,<\"io!!{!>},<\"!!!>!!!>i>}},{{<eui!!!>e,e!>,<>},{}}},{{{{}},{}},{{{<{,i\"!>!!\",u{\"!>!>'!!u>}},{{}}},{{},<\"}'{!>,<{!!!>a\",!!!>>}},{{<i<ao\"'a!>!>},<!!ouo\"!!!!>,{{{<}!!!u\"u!!!!!!'<ui!!!>'!!i<!!!>ie\">},{{<e!!!>o{!>,<>},{<}!>,<<uo!>},<i,o!!\"a!}!>},<}!>},<>}}}}},{{{<!>'>},<!!>},{{<i>}},{{<{!!u>},<e'aa{'<!>,<<auo!{!!!!u>}},{<{!!\"!!!>!!!>!\"!>,<!>},<u!!!a>,{<\"!!!>'<!'!,\"}}!>},<i}i!!!><!!!>i>}}}},{{{{<!!!>\"}!>i!a{>},{{{{<!>},<o!!<o!u!>,<}!>,<a\"!!!>,<'!!>}},{<,\"!!\"uu<,<!>',i\"!>!>,<,!<>}}},{{{},{{<\"!!!{ai!!!>},<u!!!>,<\"e!>!>!>{<!!!!!>>},{<uu!!uo}'!>},<!>!u'a\"i<}!>,<'>,{<i!!!>},<!!!<!>},<>}}}},{{{<\"!>},<}\">,<!}!>!>},<>}},<'!>!!!>,<!'!!}!>ei!!!>,<!>,<<!>,<!>,<>},{{<!>,<e!\"<!!!!!>,<!>},<!!!!!'u!>,<!!!>uo!!!>}a>},{{<ae!!a\"i!>,<!>},<!>,<!!o'}>}}}}},{{<!>\"'ue!!!>!!>}}},{{{<'e!>,<!\"!!!>>}},{<!>,<!ea!!!>!o!!!!!!!>'>},{{{{<!!!!!!!>!>!>,<!>},<<,<{>}},<}ue!,{,!io>},{}}},{{{<'!i!!i!!!>,<\"!>!>},<>,<,!!,!!}{!>},<{e!>},<ii{!!!!!>>},{{{<,<ii,>}}}},{{{<{{e!!!>!<i!>!!!>u!!!!{{a!!!!{!>>}},{{},{}}},{{},{{<<!!!>!!!>{!!!>,<\"!!{<eo!}!!!>!!!>{>,{<i>}},{{{}},{<!e!>,<{!>!!!>i>}},{{<!>,<!>},<>},{{<!!!>i!>,<>}}}}}},{{{{{<>}},{{},{{<!!!>'!!>}},{<oa!!!>!}e>,{}}}},{{{<oe!!u!>a!!!>ii<{{!!!!!!!><,!>,>}},{<!!!!!i!!!>'e,'!>,<u!a!!\"!!!{,!{!>,<e!!!!!>},<}>},{{},{<}!!i!>,<a!>},<a!>,<!!\"o!!!!!>,<<!!>,{<o!}<!!\"{\"o}!>},<!!!><u!!}u!>},<!!!>!>,<\">}}}}},{{{{<!!i,!!{o!>a!!!>!>},<!u!!!>e{!!!>!!u!!!!a}>}},{<!!u!<\",a}!!!>{{}o!>},<e\">}},{<!!!>!>},<!!\"o!i!!}u!>},<{<!>},<!!!!!!>,{<!!e!!i,'<e\"o>,<!!\"<aeo>}},{{<'e}!>,<!!}!\"!!!<!!,!!!>,<!>,<'u!}!>},<{,>},{<>}}},{{<u!!}!!!>!!i!!a!>},<!>>},{},{{},<a!!!>e{!!!>!!!!!>i}e,}!!a!}!>},<>}}}},{{{<!}!>},<>,<'!!o>}},{{{{},{{<!>},{a!>},<>},{<i}u>,<,!>,<!>},<!!!>,!>!>},<{!!!>',ae!<!>},<!!!>e'>}}}},{{{{{{<o!<uoo!!!>}\"o,'{!,a,>}},{{<<!o!>,<',\"'!'!>,<!!!>}a<!!>}}},<!!u!!'e!<!>,<!!!a,u!>},<!!!>},<>},{},{{}}},{{{{{{{<<!!e!!<u<!!\"i!!>},{<i\"!>},<!!!>},<o{!>},<!>,<{{a!>},<i!{e>}},<\"!,!!u!!>},{{}},{{<u!>},<>},{<!,}a{oo<}{}i<!!!>eu\"!>,<>}}},{{<!>},<ae!>,<!>!>>,<!!!!uei{!!!!'}!o{u{!<!>,<,>},{{<'a!>,<!!o,!>},<!>!>},<!>},<<!!\"!!>},{}},{{{<,!\">}},<!>,<!!aa,!>},<e!!!!!>},<!>{!!!>e'!!i!!!>,<>}}},{{{{<i!!!!<u'!>o!>,<!!!>},<\"\"!>,<!\"ui!i'}!!!>>},{{<,ao!>},<!>,<!}e!!!!i{a!>,<!u<!'}<o>}}}},{{{<!,}{{{!>},<!!!!,uia!a<}ei\"!!>,{}},{<i!!}!>},<!>,<'!<ou>}},{<oo}a{!o!!<!>},<!!!>!!!!!>!!e!{!!u!>},<,!!e!e!!,>,<!!!>,<\"<'!!!>},<>}},{{<!!{>},{}}}},{{{<!'!>,<!!{!>},<!>,<o<!>,<!>,<>}},{<!!!i}!u'!>,<{u!!ea!,a'o!!!!!!!>i!{>}},{{<a},i!!!!!>,<\"<<!!!!!>{>},{{}},{{<!!!!\"'u{!!!o!!!>},<!!u>},{<u!!o!>},<'!>,<o}!>,<u!!<!>,<!!!>>,<i\"'i{!>,<e\"'!}>}}}}}},{{{<'!u,{a!!!>u!>},<!>,<e>}},{{<}!>},<!{!!!>},<!!!>a!'!!!>!o!!,<o>,{<{<!!!>!!!>!!!!<}\"!!!!>}},{{}},{{<!>',!!i!!u\">,{<o,!!!>a!>},<a!!!!!>!!,ai,!!>}},{{<'!!!>!{!!!>},<{\"\",!!!>!>},<o<!!!>!!{>},{}}}}},{{{{}},{{{<!>},<!>},<!!!>ii!!!>!!!>,<i<!!'<{>},{<}!>>}},{{<e!>},<!{e!>!!!>{>,<>},{{{<,!>},<e<a\"o!!!!!>,}''>},{}},{},{<{'>,<!!!>{\"!>,<u>}},{{{<{\"eu!a!>,<!>e!u,i\"u!!!>,<}!><>},{{<!!!>,<!!!>!!\"i!!\"}!>},<\"<!!o,!\"!eo!!!>!!!>i!i>}}},{<!e>,{<\"e!>,<!!{!><<,u>}}}},{<>}},{{<<e<!!a>}}},{{{{<u''{!>!o'>}},{{{<>}},{}},{{<'!>},<uia!>},<!!!!!!u!>!>!uu!>,<!!!>>},{{<<'i!!!>,<!!!>,<},\">},{<!>o{aiae}u}e>}}}},{{{<!!u,<uu},i'!!!!!>!>,<i>},{<!>,<!\"!,}a!!ii{<<{{!>>,{{{<!!!><,!!''ie<!>},<!u!,aa>},{}}}}},{<e!!\"!>},<!!!!!>}!!!>o,!!iu{ua!>,<!!!!!!a>,{<io'!!e!!!!!>!>},<e,<o>}},{{<oi>},<}o!!!>!,!!!>!!u>}},{{{{{{<!!}!>,<!>,<!>>},{<,>}},{{{},{{<{>},{<{!>},<'!e}!a!!!>o'>,<e!{,a!!!}!!i!!<{'!>!!<\"!>>}}}},{{{<>}},{{<u!>!>,<!!!>},<!>},<io!!''io!>,<>}}}},{{{<,a<o!>},<!!,,}o!!!><\"!!,i!!!>,>},{{{},{}},{}}}},{{},{<!>e'a!!!><u{!>\"!}>,{<>}}}},{{{{<!>},<<!!!>oe'!}!>},<'au,oai!>!{!>,<>}},{<\"a!!ee!>,<!!!!a}!>\"!u\"{',>,<!!!>\"!>!!a{'!>,<\">}},{{{{{{<!>,<u!e!>ae!!!>!>},<{!!a!>},<>}},{<a{!>,<'i!!o}}!!,i!>,<!!{\"!e!!\"!ou>}},{{<!!'!!!<a!'<!!!>\",>}}},{{{{{<!>,<!,a!!!>,<!>,<>}},{}}},{{<!!!!}i!!!>,<!!!!{'euu>},{{<}>}},{{{{{},<!,o,!'!>},<}aie!!!!!>!!!>!!!>},<!<{{!!!>,<!!!><>},{{<o!>},<!!!>!!!>,!!!a!!{{a{!!<a\"i>}}},{<!>,<'!!!><ai!{!!<e\"a<'!!{!'!!u!>,<a!!!>>}},{{<!!!>o,,>}}}},{{<!!i'!!{>,<\"!>,<!!,<oi\"'iu!>ou>},{{<!>},<>},<!\"o!!,u,!!!>!!!>{,,}'<!!!>e!>},<<>}},{{{{<'!>,<{!!!>o!!u,u>}},{},{{{{{<!!>,{<}e',!!!!!>}!>,<{!!!>!!!>a'uia>}}},{{{{<!!,!!!!!>!>!!i>},{{<\"!>},<{!!'!>},<!!!e!!!!!>}!>>}}},{{},<a'!!!!\"!>,<!>,<{!>,<a,!>,<,!!oaa>}},{}}}},<{u!!!>{'!{}!!u!!!>},<!!}>}},{{<!!o!!!!a!>},<!>},<ie\"{\"i>,{<!!!>}'a!>uii{o\">}},{{<!>,a'!!'ea<'!!e'{\"u!>,<{,!!}>},{<!!!!!>,<!!!>!>},<{,<>}},{<{!>},<!>},<!!!>}>}},{{{<!!!><!o!>!i!>,<!>!>o!!!>!!!!!!,>,{{<\"uu!,a<ii'{u{!>},<{<!!,!<>}}}},{<{'!>!!\"i>,{<!>},<!{!!!!u\"<i!!!>ie>}},{}}}},{{<}!!,,e!!!!!><\",<!ia>}}},{{{<o!!!><>}},{{}}}},{{{<a!>iu'\"e>}},{{},<,\"'!!!!!u>},{<!>,<!!!>\"e!>,<!!}!!!>!!o{'a>}}},{{{<!!!a,!>,<!}!!o'!!e>},{<<<e\">,{{<!!!>!!!>!,!>},<!!'}!!!!!>!>,<!!!>},<a>},{<a!!\"<!!!{a!o!!!>!i}i>,<!eu!!u!i\"!!!!}o!!!!!!>}}}}},{{<!!o!>},<i\"'e!!<{!!!>>}}},{{<!!u\"<!,!!!\"oie>,<i,eo<>},{},{<u{!!!>,<a>,{{<!>,<!>,<!!!iu!!!>!>,<!!ao!!!>!i\"!{!>>}}}},{},{{},{{<!>},<!e>,<!ie!>},<!!i!>uio!>!!!>ui>},{},{<!'!e!!a'!>},<ii>,{<{,>}}}}},{{{{<ue!>,<}oa,}!!>},{<,!!!!!>i,e,!>},<!\"<!a}i<a>}},{<\"!>,<!!a!>,<,>},{<,!>},<\"o!!i!!!>!>!!!>ui{!!!>a'i!!!>},<{!!>}},{{{}},{{<!u!>a'!>!!o<!!,,o<!!o>}},{}},{}}},{{<!>!!!>!>,<\"'}{!>,<!!!>>},{{<'{!'o!>,<o\"\"e!!,o!!!>,<e!!!>!>o>},{<!!!!a}'!!e!>},<!>},<!!e'>}}}}}},{{{{{<{u!!!>aeu'>},<!!!>,!>!i!!a\"o!>!u!!\"!>},<o!,{!>,!!',>},{<!!!>o\",}o!>!!!>'!!o'!!e!,<{!!u>,{<!!ou!>!!o,\"!!!>\"!u,!!{e,}o>}},{{{{<'!!!>},<>},<!!{'!>},<\"!!<a<!>},<i!!a!>,<>},{}},{{<!e<e!!{>},<{!>,}!!a,>},{{<o!!,>},{}}}},{{{<o\"!>,<u!>u!>},<!!!>!>ee>},{},{{{<!!!>{!\"\"!>},<a>},{}},{{<au,!>'>}}}}},{{{{<'!!e,u!i'',!>,<!><,!>,<\"!>,<>}},{{<!>,<!'!>,<!>>}},{{},{{<!!i!>},<\"!<!!ue!>},<e}\"oee!!<!>},<>}}}}},{{{{{<!>,<<!!!>!!!>u!>!>,<!!i}<i,\">},<a{!!\"!>!>,<uo!!,!!!!>}},{{{<e\"!!a!!}'{<>},{{<}i'<a!u}!e!!!>!>,<!!!>,!\"!>,<!>,<>}}},{{{},<e!!{'o!!!>u!>,<!!!>'!>},<}!>,<}!>!!!>>},{<!!u!!!!!>!>,<!!<},!!,'o<!!!,,<!>}\">},{{<e!!!>\"<{!!i'\",ae'!!!>i>},<o!!!!!>{<aeu<!'!>,<>}}}},{{{{<>}}},{<uieoou'}<i!!!>!!!>!>>,{}},{{<o\"e'<\"!!e,!'e!>},<\">}}},{{{{<!i'!!i'!!e!}e!a!>},<e!>,<o!!>},{{<}!\"!!i{!!u}!>},<u\"u<'e}>},{<,i!>},<!>!>,<{{,!>!!!>!!!>\"''i!!!>,<!<!!<>}}},{{{<oe}!!\"!!!>,<\"eo,>},{<'!o<,}>}},{<!{!>,<!>,<'<!!}e'!<!\"a{e!>o'!>,<'!!!>>}},{<!oa{!!'!,a!!,u!>!!a,!>e!!!>\",oi>}},{{{{{{<e}!>,<<e}!!oa>}},{{<'<!!!>,<\"!>,<>},{{<!><!>'u>}}}},{{{{{},<\"!!i!{!>!>,<{i!!!'!<ei!>!>},<!!!!e!>},<{a!!>},{{<e>},{<'uiaoe!!,!!o!!\">}}},{{},{}}}}},{{<a}!>},<!>oo!>},<!iu!>},<>,<!!aoae}>}},{}},{{<!i}{a!>,<{}!>},<<a>,{{<\"!>!!!!au!>,<!!!!!!u\"<>},{{{<!!{{\"u}!!}a!>,<!'!>,<}}a>}},<o!!!!u!>},<',o<i{!>},<!!a}>}}},{{{{<oi!'o!>,<ao<ouie!!!>{'\">},{}}},{{<!e!>,<>},{<e!>},<!!}ei{}o!!!u,!>}!},!>,<>}},{{{<!>{!,o<aa!}'!!!o'!!!>!!!!!>>},{}}}}}},{{{},<!\"}!>!!!!\"!!!>a!!!>!!!>>},{{<\"eoe!!!>>,{<u{'io!>},<!!\"!>>}},<!>!!',,'!>eui<!e<i,!!!!!''!!{<\">}},{{{{},{<i'o!>},<'<a!i{o>}},{{<u\"!!<\"!!!!!>!><au!>},<!!!!!>'a}'!u!>,<>},<}'}!!!>!o,!>,<!>},<!!a!!!>ea>}},{}}}}},{{{<e<!!!>\"!!!>>,{{<!>!>!>},<!>,<!>!>!>,<!>},<!>'i!>o>}}}},{{{},{<!!!!!>},<!>},<a!>,<!!}!\">,{{},{<,!>!!!!<!!u>}}}},{{{{{<!!{!!!>i>},<o''!\"'e!!!{,a!<a!!!>,>},{},{{<!>,<{!>},<{ua>},{<!>'!!!!!>,<>},{{{<{o\"!>},<!!o{!!{e<}!!{'!>},<>},{<i!}u!!!>\">}}}}},{<!!!>,<!>,<,<!>>},{{{<!>},<>},<<!!u{!>!!!>},<!>,<!>!e!!i<!>,<!!i\"!!!u{}!>},<!!u>},<'!!e}!!!>,!>}>}},{{<e!>,<!>!,!!{!!!>!!!!!>}!>>}},{{{<\"eiuu!>>,{{}}},{{{},{<!!!>i!\"{>}}},{<!!\"!<u>,<\"!e,'e>}},{{{<,o,!>},<eeei!!!>i,!!!>u!!\">},{},{{<}o'<,{!!a!!!>}{{!>,<e<!>,<!!!!,>}}},{{{{<!!a!!ou!!,e!!e!!!}!!a'!!!>ioi{!>},<a!!e!!>},{{<!!o>}}},{<i!>o,'!!!>!>},<i,\"\"a,ie!>},<u\"!!'>,{}},{{{<!!!>'\"!>!>!!!>!>,<!>auu}u\"o!>},<!!'!>,<>,{<{!>,<!!!>,<a\"ioa}!>,<i!<>}}}}},{{<<!>!!!>!!\"!>,<{!>e<e{>,<!!!>,<{>},{{<\"a\"\"\",!!e!!!>!!{!>!<\"!>,<!!,u'!>!>,<>},<u<o!!ee!!e\"o>}},{<ua!>,<!>},<{!!'<!!!>!>},<>}},{}}},{{{<!>},<\"!>},<<!o,!{'!!o{!!!>a',!!i!!o!>,<o!>},<>}},{<ei!}!>},<ea{ooe',>,<!>},<!>,<!!!><>}}},{{<o{!!!!!>!>},<<'!>>,{{}}},{{},{<<\"oo!>!!!!!!'!!!!!!!>i!!!!!><\"\"u>}}},{{{{<!!,!i!>}u!!,<u,!>},<!>,<a!!{!!<uo>},<!>{!!!!!>!'{\"u!!!>!!!>!>},<!!>}},{{{{{},{<!>},<u!!i<a>,{{{<e!!o!,'u!!>,{{{<u!!e!!!{!!!>,<,<o>}},{<!>,<{<!!!>ei!!!!!>!>},<a,,>,{}}}},{}}}}},{{}},{}},{{<}\">}}},{{<!!{u!i!a>},{},{}}},{{{{{<a!!!>},<u\"!!!>},<o!>!!!>u}a<>},{<!><u<!!!!!>,<!!!>eu!!!!!>!}o!!>}}},{{},<,!<!!!>,<!>},<!!'\"!!!>!!'>},{{{<o!>,<!!}u!!!>!!\">}},{<<!!{'!>},<<!!e<!!'!!!i!!!>,<>}}},{}},{}}},{{<u!>,<!!!!!!!>},<}{,!!'}\"!>,<!>,<\"{!!<iu>,{<i!>e}oi!e!!!>!>!>>}},{{<<a'{i!>,<!}!>,<!!!>'}}}!>'a}!>},<!>>}}}},{{{},{{{<!>!!ae<!!'!>\"!>},<!!!!{!!!!!i>},<!!i>},{{{{<!!{a,!<i{o!!o!!a!>},<u'u!!{>}},{{{<,u!>\"!a!'!>},<>,{<!}ee!\"e!{!!!>,<e>}},<!!,!!{a!!!>!!!o!'\",>},{{{<!>},<!>!>},<!!!>!!<i>,{}},{<a,'<{!}},!!i{<>}},<!>,<<!!u>}}},{<\"!o!!!!!>i<<!>>,<a,\"!!!e>},{{<{!!!>a!'uo!!{o!\"u,!!,!>,<a!u!!eoe>},{{{},{<<!!!>i!!e!>},<\"!>},<ao{!>!!!!,!!!>>}},{{<e!!'{u!>,<a!\"!,u>},{{<!!'!>\"!!!!!>}<{!!!>>},{<a!!!>e!!!>!{!<!!!>},<,'<u!!!>},<e>}}},{}},{{<!>,<!o}>},<''<!!!>,<!<!!'!!\"!>,<!!a!!,>}}},{}}},{{<!,i!!!>ee{!!,u!!i<!>},<!>,<!>},<,!>!!!!}>,{<\"!!a\">}}},{{{{<!!!>oeeau!>,<,i<!>},<,ae!>!!>},{<>}}}},{{},{{{<{,\",a'{a!!u!>},<,!!!!e!!!>>}}}}}},{{{{{{<!!!!!!i!!!><!>!!\">},{<!!!>aoa'{{ea!!\"!!!>!>},<!!!>>}},{<u{\"'<!'>},{{<!i!!e!>,<!}\"a<>}}},{{<!''u!!!!o}!,!>a!!!a!>,<!>,<>,<!>},<}u!>},<u!<\"!!!>{'!>,<{>}}},{{<!!aa!!!>\"!!!>,<'!i,}\"!!!>>},{{{<u>}},{{<e!>},<ui\"!>,<!>a!!!!!!,>},{{{<!!!>!!!!e<!>},<>}}}}},{{{{},<>},{{<}!!!>},<'u!>ue!>,<!!!>!!a!ia\"a,ua>,<i!e>},{<>}},{<,<!>!!\"!>},<!!!>!!ai!e\"!>{o>,{<!>,<!>},<!>!>,<}oe'i,!>,<>}}},{{<!>,<a!>,<>},<!!e}!>!>},<!>},<io!>,<!!!>!!!>!!eoe!>},<>}}},{{{{{{<!>,<,!><,!!!>,<a>,<!!!!!>}}oo\"{!!!>!>},<!!!>}!!ae>}},{{{}},{{{{<!>,<i<!<e!>},<!>!>},<!!!!!!!>!>},<!!!i\"!!o!{i!>,<i}>},<'!!!>},<!!!>,<\"!!,{!>},<e{>}}},{{{<}!!!>},<!!'!>},<!a!>!!!!!>auo!!u'o!!!>>},{<!!e!>,,,!!!!!!!>!o!!\"u!>},<!!e!u!>},<>}}}}}},{<!!!oe!>}!!\">,<!>},<!!!>}!!!>,<>}},{{<{!>},<!>},<!>},<}!>,<!!,!}!\"\",!!!>!\"!!!>'!>,<!!{>},{<!!\"a!a!a!!!>{!><u!!!>!>},<eau!>},<\"<ii>}}}},{{{{<!>},<ei!!!>!uui!!a,!!}!>,<>},{}},{{{<u!>oa,}!>!>,<!>},<\">}},{<!!!!!>!!'!!a>}}},{{{{{<uo!!!>u'!!u!>},<}>}},{<!!!>\"!!!>o\"!!i{}!!>}},{{{}},<,o}!><!ua!>},<>},{<,>,<\"e!!i}!!!>,<!>,<!>,<>}},{<!!a!>},<>,{}},{<!!e!>'}!>},<!ii!!!>!>,<!>},<!>},<!!>,<aa,iui{!!u!'>}},{{<\"a!>},<!!}!>,>,{}},{{},<!!<}e!!!>,<!>,<!>'{e<>},{<!!!>},<!>,<eo\"!!!>u!>},<!!!>!!,\"!!!>},<!>,<!>,<!!{i!!e>,<o<!<!>},<!>},<!>>}}},{{{{<a!>},<'!>,<i!>},<,!!{<a!>,<,>,{<a,<!!!>i!!!>!o!!!!!>,<!>,<!>!>,<}!>\">}},{<}!>,<!!u!!ae>,{<}!!!>!!!!!>!!!!!>},<!!o}e>}}},{{{<oi!!!!e!>,<!!!!{,!>!!!}!>,<ee!!!!!>!!!>!>},<{e!>>}},{{{},<\"e,!!!>},<,ae}!>!!!>u!>'a!!!>},<,>},{{}}},{{{<!><u!>,<!>,<!!!>\"{a!!!>!!!>{<>}}}},{<!>,<<<!ei{}!>,<>,{<u,!>!,!\"i!>},<!!e!}>,<'<o'>}}},{{{{<!!'!{i>},{}},{{<!>,<e!>,<!!\",!o!>,<!>!>},<u<e!!!>},<o>,{{},{{},{{<!!!>\"e!>},<,!>,<>}}}}}},{<o<!!!>!!!<!>,<o!>,<ia<!>},<!!!>'>}},{{<'!>,<!!!a!!ee!>,<ee\",!,o{>},{}},{{<{!>,<e\"e!>,<'!!!!<i{!!!>,<,o!'e>}}},{{{},{<'!>,<!>},<}!{,!!>,{<u!!!>'\"u}!!\",'!!!>'\"i!!,>}}},{}},{{{<a!\"{!!ei!!!>i!!!{>},<!!!>>},{{{<!!!!<,,<!!!>!>u\"!>},<'!o{o!!!>>},<<!<!>!o>},{{},<!i',!>,<!<}!>,!>},<>}},{{},{{{<!}!!}ou!!>}}}}}}},{{{{<!>!<oe{uo!>!e,!!}!!!>},<e>,{}},{<!!!!!!i!>!>},<>,{<<!>!!u>}}},{{{},<a<}o!>},<!!{ui!>,<e}i,!!}<>},{<u>,<}<a!>}>},{}}},{{{{{{{<\"!!!>'}!!!>!'\"\">,{{<!>!!i,!!!\"i'>,<>},<!>},<o>}},{}}},<<!!!>>},<a!!!e{<}{uu!}!!!!'!>,<!>,<!!\"!!<!>},<>},{<<!>\"!!!>},<,>,<!>,<!!\"!!!>!>!!!>!>},<!><e'!!!>,e}>},{{{<\"ua}i!!!>,<>},{{},{}}},{{<'!>},<>,{{{},<'!i!a,<!!!,!!,<>}}},{<!!!!!>,<u!!e\"a!>,<!!!>,<'!>},<,e'<>}},{<}u!<'<'{u<',!>},<!!!!!>{!!ue>,<!>,<!!!>,}i>}}},{{{<!!!>!,o\"!>,<'\"!!!>!!!>\"!o{o}!}!'!!<!>>},{{<!!!>!!!>,!!!>a}!!{}a'u>},<ae!,o!!<o,!!io!<>}},{{{<!>,<!!!>!!!>e!!!>!>,<>}},{{<ei!>},<>}}}}},{{{{{}},{{<!!u!!!!'\"ii!!\"\"<!>},<>,<}u\"'>},{{}}}},{{{<>,<!}o!!!!!>a!!!!!!\",!!'>},{<!!!>{!o!!!!!}e}<>},{<a!>}!!!>!o},}{}'aeee!o>}},{{{<!!!!ua{!>},<e<{!!!>!!<ao>},{}},{{},{}},{{{<<}>},<\"!!,u!>},<!!!>!>},<!!!!!>\"{!\",!,!!!>},<ue>}}},{{{<!!a,'!!!>'o!!i!>},<!\"ue!!{!!!>,<>},{<e!>,<e{!!!!ue!<}!>},<\"!!!',u{!>,<,>,{<!!!>!!!>!>},<!!,>}}}},{{{},{{{<!!!>}!!<!>aou<'>}},{{}},{{{},<!>'uae,u\"i!>},<u,!!!!''!!>},{}}},{{},<a>}}}}},{{{{<!!!!o\"!>,<!>},<!a!>!u!u}o}!!!>a!<>},<uo\"i!>},<!!}<>},{{{<o<!>},<!!!>},<i!!!>!!}<e,!!!>u}>,<!!e<u{}'}!i!'!>},<<!!!>o>},{{{{<!!!>},<!>eo'!>},<'}{\"!!>},<{o!!!!!>i>}},{<!>!!!>!!!!u>,<\"oooe>},{<!>>,{}}}},{{},<e!>},<!!!>!!!>,<{u<u!{!}{>}},{}}},{{{<{{!!!>!!!!u!!'!!!>},<!>},<!>!!!!u!!a>},{<!>},<!u>}},{{<\"eu!!}!>!!!>}!>,<>,{<!!,!e!!!>!>},<ioe!!e!!!>i!><!,!>!!!>>,<!>,<!!!>>}},{{<>},{}},{{{<{!>,<!>,<!ua!>},<>},{<!!!>eo!!!>{}}{!\"i{!!!!{!!'{a!>i>}}}},{{{<{!!!>!>},<e\"}u{<u\"\"eu>,<{!>,<o\"!>u>}}}},{{<i!>ou<<<!!!!!>,<!!!!!>!>},<>,{<!!>}},{{{<o!>},<,ai\"!!!>{!!,!!{u!>,<o!>!>},<!!!>,<>,{{<\"!!!>},<!!ue!>!!!'!!!>\"u>}}},{{}},{<!!u'e<!!<u<<!>},<\"ui}e!!\"!>>}},{{<}a>}},{{<,\"!>!!!>\"}>},<i!>},<!><'\"e<!\"e,!}\"{',\"'\">}}}},{{{},{{},{<,{{>}}},{{{<{!!}aua\"\"o!!a!!eoe,{>,<ii!!!!!!!e!!<u!!u!!\"!!!>!>},<!>au>}},{{},{{<a!!!>},<!!!!aou'>}},{<\",e>,{<,!!}ou\"'!!!>!!!!ooe>}}}}}},{{{{<!!!!o!><o!!{!'!>,<\"!!!>{}u!>!\",!>>,{<!!'a!\",>}},{{<!!!>!}}!!o!!a!!!>},<!e!!!><o!><>},{<!>,<!u>}}},{{{<o!o!>,<!{!!!>},<e\"!!!>a}!!{{'>},<!!!>},<!>!!!>o!'>},{{<u!!!>},<e!!!>{{\"!>,<i!>,<!!!!!><'!>},<!!!>>}}}},{{{{}},{<!>ooo<!>,<ee<i''>,<u\"<e}<!>''!a{!!!>a}!>,<\">},{}}},{{},{{{<i!!!>e!>},<}<!><!!{o!>},<,!o!>},<>},<i{u{o!!<e!!!e!!i!!!>e,ua!>},<{>}}}}}")

(def day-10-input "34,88,2,222,254,93,150,0,199,255,39,32,137,136,1,167")

(def day-11-input "sw,s,se,se,se,se,se,nw,ne,ne,ne,ne,ne,n,n,ne,n,n,n,n,n,sw,sw,n,ne,nw,n,n,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,ne,sw,s,nw,sw,se,nw,sw,sw,nw,nw,nw,sw,sw,s,nw,nw,sw,sw,sw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,s,s,sw,sw,s,sw,s,sw,sw,sw,sw,ne,s,s,ne,sw,s,sw,s,s,n,ne,sw,s,sw,s,s,s,s,s,s,s,s,s,s,s,s,sw,s,s,n,s,s,s,se,se,s,s,sw,s,se,se,se,s,n,s,s,se,s,se,se,se,se,ne,s,n,sw,se,se,se,se,se,s,se,nw,nw,se,se,se,se,se,se,se,n,ne,se,s,se,se,se,ne,se,nw,se,se,s,ne,se,n,se,se,ne,sw,se,ne,se,se,se,nw,nw,ne,se,se,s,n,n,se,se,ne,se,ne,se,se,ne,se,se,ne,ne,ne,ne,ne,se,ne,se,nw,se,se,s,s,se,ne,ne,se,ne,ne,ne,ne,ne,ne,nw,ne,ne,ne,s,ne,n,ne,se,ne,n,ne,nw,n,ne,n,ne,ne,ne,ne,ne,n,nw,ne,ne,ne,ne,s,ne,ne,s,ne,ne,n,n,se,n,ne,n,ne,nw,ne,s,ne,n,ne,ne,ne,n,ne,s,s,ne,ne,ne,ne,ne,nw,ne,n,ne,ne,ne,n,ne,ne,n,ne,ne,n,n,ne,ne,ne,n,s,n,s,ne,ne,n,n,n,n,n,n,n,n,ne,n,n,sw,n,n,n,nw,n,ne,ne,sw,n,n,n,s,n,n,n,n,n,n,n,n,n,nw,se,n,s,s,n,n,n,ne,n,n,nw,n,n,nw,nw,n,n,nw,nw,n,nw,n,n,n,n,se,nw,n,nw,n,nw,nw,n,n,nw,nw,n,nw,n,n,nw,nw,n,nw,ne,n,n,n,n,nw,nw,nw,n,nw,n,nw,s,nw,n,n,n,n,nw,nw,n,n,nw,n,nw,nw,se,nw,ne,n,n,ne,n,nw,nw,n,n,n,nw,n,nw,n,n,nw,ne,nw,s,n,ne,n,nw,n,nw,nw,n,nw,n,n,nw,nw,nw,n,n,nw,nw,nw,nw,nw,n,nw,n,sw,n,n,nw,nw,nw,nw,s,nw,s,nw,nw,nw,n,nw,nw,nw,se,s,nw,nw,sw,nw,nw,n,se,ne,nw,nw,nw,sw,sw,ne,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,nw,nw,sw,nw,nw,nw,s,nw,nw,se,nw,nw,nw,nw,sw,nw,ne,nw,nw,nw,nw,s,nw,nw,nw,nw,nw,n,nw,sw,sw,n,nw,nw,sw,nw,nw,sw,sw,se,nw,nw,nw,s,sw,nw,se,nw,sw,se,n,sw,sw,nw,sw,nw,nw,nw,nw,nw,ne,nw,nw,sw,nw,nw,nw,nw,sw,nw,sw,n,nw,nw,sw,nw,sw,sw,nw,sw,nw,nw,sw,sw,sw,sw,nw,ne,sw,nw,sw,sw,sw,sw,nw,sw,nw,sw,sw,sw,nw,sw,nw,nw,nw,sw,nw,sw,sw,sw,sw,sw,sw,nw,sw,n,sw,sw,sw,ne,sw,ne,sw,sw,nw,nw,sw,nw,sw,sw,sw,nw,sw,sw,s,sw,sw,ne,ne,s,sw,n,nw,sw,nw,ne,ne,se,sw,sw,sw,nw,nw,sw,nw,sw,n,sw,nw,s,sw,sw,sw,n,nw,sw,sw,ne,sw,sw,s,sw,se,s,sw,ne,s,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,n,n,sw,sw,ne,sw,sw,sw,n,sw,se,sw,sw,nw,n,sw,n,s,s,s,sw,sw,s,nw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,s,ne,n,sw,sw,sw,sw,sw,sw,sw,ne,sw,sw,s,sw,sw,s,sw,sw,sw,s,nw,s,sw,n,sw,sw,s,s,sw,s,sw,sw,ne,s,sw,s,sw,sw,n,n,s,sw,sw,sw,s,sw,s,s,sw,se,sw,sw,n,s,sw,sw,n,s,sw,sw,s,sw,sw,sw,s,sw,sw,se,sw,sw,sw,nw,s,sw,s,sw,sw,sw,s,sw,sw,n,s,s,s,s,ne,sw,sw,s,sw,s,s,sw,se,sw,nw,sw,sw,n,n,sw,n,s,s,se,s,sw,s,sw,s,s,ne,se,sw,s,se,sw,s,s,s,s,s,ne,se,sw,sw,sw,sw,nw,s,s,s,sw,s,s,se,sw,s,s,sw,n,sw,ne,n,s,sw,s,sw,s,s,s,s,sw,sw,se,sw,sw,s,s,s,s,sw,s,n,n,nw,nw,sw,se,s,sw,sw,sw,s,s,s,s,s,s,s,s,sw,se,s,n,n,s,s,s,s,s,s,ne,n,s,s,sw,s,s,s,s,s,sw,se,se,s,ne,sw,s,s,nw,s,sw,s,n,nw,sw,s,s,s,s,sw,s,s,sw,s,s,sw,s,s,s,s,s,s,sw,s,s,s,s,s,sw,s,s,n,s,s,ne,s,s,s,s,s,s,sw,n,s,s,s,ne,s,s,s,s,n,ne,s,s,s,s,s,s,n,sw,s,nw,s,s,s,se,s,s,s,n,s,s,sw,nw,nw,n,sw,s,s,s,s,s,s,s,s,se,s,se,n,s,se,s,nw,se,ne,s,s,s,s,s,se,s,s,nw,s,se,s,s,sw,se,s,se,s,s,n,s,s,s,s,s,s,s,se,se,se,nw,se,se,se,se,s,se,nw,s,s,s,s,ne,nw,se,s,s,n,s,s,se,ne,s,s,n,s,s,nw,se,n,nw,ne,ne,se,s,ne,se,se,s,s,ne,s,s,ne,s,s,se,n,se,se,s,s,n,se,s,se,s,se,nw,se,s,sw,s,ne,s,s,s,sw,se,s,s,se,s,s,se,se,s,se,sw,se,s,se,ne,s,sw,se,se,s,se,se,se,ne,s,n,s,n,se,ne,s,ne,s,n,s,ne,sw,ne,s,s,nw,s,sw,se,s,se,s,se,s,se,se,nw,s,se,se,n,sw,s,se,se,se,se,s,nw,n,se,s,s,s,s,s,se,se,s,se,se,se,nw,s,se,se,se,se,se,s,s,s,se,s,se,n,s,se,s,se,se,se,se,ne,s,s,se,s,s,se,s,se,s,se,nw,nw,s,se,se,s,ne,s,ne,se,nw,n,se,sw,se,s,n,se,se,s,s,se,se,se,se,s,se,ne,se,se,s,se,ne,sw,sw,nw,se,n,s,ne,se,se,se,s,se,sw,s,nw,se,se,se,se,se,nw,se,se,sw,se,se,se,sw,se,ne,se,se,ne,s,se,se,se,se,se,se,n,s,ne,se,s,s,se,se,se,se,se,se,se,se,se,se,se,se,se,se,se,se,se,s,ne,se,s,se,ne,se,se,se,s,ne,se,se,se,ne,n,s,se,se,se,se,se,se,se,s,se,se,s,se,se,ne,se,ne,ne,se,se,se,sw,se,se,ne,se,se,n,se,se,se,se,se,sw,se,se,se,nw,se,se,se,se,se,se,se,se,se,ne,se,se,se,se,se,se,se,se,se,se,se,n,se,ne,se,nw,se,ne,se,s,s,se,se,se,se,se,se,s,se,se,se,ne,se,se,nw,s,ne,se,s,ne,se,n,s,se,se,se,se,se,se,se,se,ne,se,se,se,se,se,se,se,n,ne,se,se,se,se,se,nw,se,ne,nw,se,se,se,ne,ne,se,se,nw,n,se,se,se,se,sw,se,nw,se,se,ne,se,se,se,se,sw,ne,se,n,se,se,se,se,n,se,se,se,ne,se,se,se,s,ne,se,se,sw,ne,se,se,se,ne,ne,n,n,s,se,ne,ne,sw,ne,n,se,ne,se,se,se,se,n,ne,sw,se,se,se,ne,se,n,nw,se,n,ne,ne,n,ne,ne,se,n,se,ne,s,se,ne,sw,se,s,se,ne,se,n,ne,ne,se,se,se,n,ne,sw,se,ne,sw,se,se,se,se,se,s,sw,ne,se,se,se,se,sw,se,se,se,se,sw,n,ne,n,se,se,s,ne,se,se,ne,ne,se,se,se,ne,se,ne,se,s,se,s,ne,se,n,n,se,se,nw,se,sw,se,n,s,se,se,sw,se,ne,ne,ne,s,se,se,ne,nw,se,ne,se,n,se,se,ne,ne,se,se,nw,se,ne,nw,ne,ne,ne,ne,ne,ne,ne,n,n,se,se,se,n,se,sw,se,n,se,ne,se,se,se,sw,se,ne,ne,ne,se,sw,se,se,n,se,se,ne,se,s,se,se,ne,ne,se,se,ne,se,se,ne,ne,ne,se,nw,se,se,se,ne,ne,se,se,s,nw,s,ne,se,se,se,se,ne,se,se,se,sw,ne,ne,ne,ne,ne,ne,ne,se,se,s,ne,s,se,se,nw,ne,sw,sw,ne,ne,se,ne,ne,se,se,ne,ne,ne,ne,sw,ne,ne,ne,ne,n,ne,ne,se,ne,sw,n,se,ne,ne,s,se,se,n,nw,se,ne,se,ne,ne,nw,ne,se,s,ne,ne,nw,se,ne,se,s,se,nw,ne,se,se,n,ne,se,ne,ne,se,se,sw,ne,se,ne,se,sw,se,n,ne,se,ne,se,ne,nw,ne,se,sw,ne,se,se,ne,sw,ne,ne,ne,ne,ne,ne,ne,n,ne,ne,n,ne,sw,ne,sw,ne,se,ne,ne,sw,ne,n,se,n,sw,ne,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,ne,nw,se,ne,ne,ne,se,ne,s,n,ne,se,ne,ne,ne,ne,ne,ne,se,ne,ne,sw,ne,ne,se,n,ne,se,ne,ne,ne,nw,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,nw,ne,ne,ne,nw,ne,nw,sw,ne,sw,ne,se,s,ne,ne,ne,ne,ne,ne,se,ne,n,ne,ne,ne,ne,ne,sw,ne,ne,ne,ne,ne,sw,nw,se,se,ne,ne,sw,ne,n,ne,ne,ne,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,s,nw,ne,n,ne,ne,ne,s,ne,nw,ne,ne,ne,ne,ne,ne,ne,ne,ne,sw,ne,ne,ne,ne,n,ne,ne,ne,nw,ne,ne,ne,ne,ne,se,ne,se,ne,ne,ne,ne,ne,ne,ne,n,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,nw,ne,n,n,ne,n,ne,s,ne,ne,ne,ne,ne,n,ne,ne,ne,se,ne,s,sw,ne,ne,ne,ne,ne,ne,ne,n,ne,ne,n,n,ne,ne,sw,n,ne,nw,n,s,n,ne,nw,nw,ne,se,nw,sw,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,se,ne,sw,n,ne,ne,n,ne,ne,ne,ne,ne,se,n,ne,s,ne,ne,ne,n,ne,ne,ne,ne,ne,s,ne,ne,nw,ne,ne,s,se,ne,ne,se,sw,s,ne,ne,ne,ne,ne,n,sw,nw,s,ne,n,ne,n,ne,ne,sw,ne,ne,ne,ne,se,n,ne,ne,ne,ne,ne,ne,ne,ne,sw,ne,n,n,s,nw,s,ne,n,n,ne,ne,sw,ne,ne,n,nw,n,nw,s,ne,se,ne,ne,n,ne,n,n,ne,ne,n,ne,sw,ne,n,n,s,ne,ne,n,nw,ne,n,ne,n,n,ne,n,ne,s,sw,n,ne,nw,n,ne,ne,ne,n,ne,nw,n,ne,ne,ne,n,ne,n,n,s,se,s,s,nw,ne,ne,ne,ne,ne,se,ne,se,ne,ne,s,n,n,ne,sw,n,ne,n,ne,ne,n,ne,ne,ne,n,ne,ne,ne,n,n,ne,n,ne,n,ne,ne,ne,n,sw,ne,n,ne,n,ne,n,ne,s,ne,n,nw,ne,ne,ne,n,ne,n,n,ne,sw,ne,ne,ne,ne,n,ne,n,s,ne,ne,n,ne,ne,n,ne,ne,n,ne,n,nw,s,ne,ne,n,n,ne,n,nw,n,s,ne,ne,n,se,n,s,n,ne,ne,ne,n,ne,ne,se,n,n,ne,ne,n,n,ne,ne,ne,ne,n,n,ne,n,n,n,s,se,n,n,n,n,ne,ne,ne,ne,ne,se,ne,n,n,s,ne,ne,n,ne,ne,s,se,ne,se,n,n,ne,ne,s,n,n,se,ne,s,ne,s,ne,sw,n,ne,n,n,s,ne,ne,ne,ne,ne,ne,n,n,ne,ne,n,ne,ne,se,s,n,ne,nw,n,ne,nw,n,ne,n,ne,n,n,ne,n,n,n,n,n,ne,n,n,ne,ne,n,n,se,sw,ne,ne,ne,nw,ne,n,sw,ne,s,ne,n,sw,ne,n,n,n,n,n,ne,ne,n,ne,ne,ne,n,n,ne,n,ne,n,ne,s,sw,n,n,ne,ne,ne,n,sw,s,ne,n,se,s,n,n,ne,n,se,n,ne,ne,sw,se,n,ne,n,ne,ne,n,n,n,ne,nw,ne,s,n,n,ne,ne,se,ne,se,nw,nw,nw,sw,n,ne,n,n,n,n,n,n,s,n,nw,n,ne,ne,n,ne,ne,n,ne,s,n,n,ne,sw,n,ne,n,n,n,ne,nw,n,ne,sw,n,n,n,ne,n,ne,n,ne,n,n,ne,n,n,s,n,ne,ne,se,ne,n,n,n,n,nw,n,n,n,n,n,s,n,n,n,n,n,n,ne,se,n,sw,n,n,n,n,ne,n,n,n,n,n,n,n,sw,n,ne,ne,s,n,n,ne,n,n,n,n,n,nw,n,sw,n,n,n,n,n,se,n,n,n,n,n,ne,n,n,n,s,n,n,ne,n,n,n,n,se,n,n,n,ne,n,n,n,n,n,n,n,ne,n,n,n,n,n,ne,s,n,se,n,n,n,n,ne,n,sw,n,n,nw,n,ne,n,se,n,ne,ne,n,n,ne,n,s,n,n,n,n,s,n,nw,n,n,n,nw,n,n,s,n,n,n,sw,n,n,n,ne,n,ne,n,s,n,n,n,n,ne,n,n,n,n,n,n,n,n,sw,n,n,n,s,n,s,nw,n,sw,n,se,se,nw,n,n,n,se,n,ne,n,n,ne,n,n,ne,n,ne,n,n,n,n,n,n,se,se,n,se,nw,s,n,n,sw,n,n,n,n,n,n,n,nw,n,nw,n,n,n,n,se,sw,n,n,n,n,n,n,s,n,n,s,n,n,n,n,n,n,n,se,n,n,n,n,n,se,n,n,n,n,ne,n,s,n,n,n,n,n,se,n,n,n,se,n,n,n,n,n,n,n,se,ne,n,n,n,n,n,n,n,n,nw,sw,n,se,n,se,n,se,nw,s,n,nw,sw,n,nw,se,n,nw,n,n,n,n,n,nw,ne,n,ne,n,n,n,n,n,sw,n,n,sw,nw,n,se,n,n,n,se,n,ne,ne,n,n,n,n,n,sw,n,n,n,n,nw,s,ne,n,sw,n,n,n,n,n,n,n,nw,n,n,nw,n,n,n,n,n,n,n,n,sw,ne,n,s,n,n,n,nw,n,nw,n,se,n,n,nw,n,n,n,n,nw,se,n,n,nw,ne,n,n,sw,sw,n,nw,n,se,n,n,se,n,n,n,n,ne,nw,nw,n,sw,nw,n,ne,ne,n,n,n,n,n,nw,n,n,n,n,nw,n,sw,sw,n,se,sw,n,nw,n,n,n,nw,nw,n,n,nw,n,nw,nw,nw,nw,n,n,n,n,n,nw,nw,nw,n,n,n,n,n,n,n,n,ne,nw,n,n,s,n,n,n,nw,nw,n,n,sw,n,n,n,n,n,n,n,n,se,ne,nw,n,nw,nw,s,s,nw,s,n,n,nw,nw,n,n,n,n,n,s,nw,n,ne,n,nw,s,n,nw,n,n,n,n,n,se,n,n,nw,n,n,nw,nw,n,n,nw,n,nw,n,nw,n,nw,nw,sw,n,nw,ne,n,n,n,n,n,n,n,sw,s,n,n,n,n,n,nw,nw,nw,nw,se,n,se,se,nw,nw,nw,nw,n,se,n,n,nw,nw,n,se,n,n,n,n,n,n,n,nw,nw,n,n,nw,s,ne,ne,n,n,n,n,s,nw,n,n,n,n,nw,sw,sw,nw,nw,nw,nw,nw,n,n,n,n,n,s,s,n,nw,n,n,n,n,n,nw,n,n,nw,nw,s,nw,n,n,nw,n,n,nw,nw,n,nw,n,nw,nw,sw,n,n,s,n,ne,n,s,n,n,n,n,nw,nw,n,n,n,n,n,nw,nw,n,nw,nw,n,nw,se,s,n,n,nw,sw,n,n,nw,nw,n,nw,n,s,nw,nw,nw,nw,ne,n,n,n,nw,n,n,s,nw,sw,sw,se,n,n,n,nw,se,nw,n,n,nw,nw,nw,n,nw,nw,ne,n,n,nw,n,n,nw,n,nw,n,ne,n,nw,se,sw,nw,nw,sw,n,n,n,n,n,n,n,n,n,n,n,n,nw,nw,se,n,nw,n,nw,nw,ne,ne,n,n,ne,nw,n,nw,nw,n,nw,n,n,nw,sw,nw,se,nw,sw,nw,nw,n,n,nw,n,nw,n,n,sw,sw,n,se,n,n,n,nw,n,n,nw,n,sw,se,sw,nw,n,sw,n,s,nw,nw,nw,n,n,nw,n,nw,nw,nw,nw,nw,nw,n,nw,nw,se,s,s,sw,n,nw,sw,nw,nw,n,n,n,nw,nw,nw,n,nw,nw,n,nw,nw,n,nw,nw,nw,nw,nw,nw,n,n,nw,nw,ne,s,nw,n,s,n,nw,nw,sw,nw,n,n,sw,nw,n,sw,ne,n,n,nw,se,sw,n,n,nw,n,ne,n,nw,se,s,s,n,nw,nw,n,nw,nw,n,n,n,n,sw,sw,nw,n,n,n,n,sw,s,se,n,nw,n,nw,nw,se,nw,n,ne,n,nw,n,ne,se,nw,nw,nw,n,sw,ne,n,n,nw,n,se,n,n,sw,nw,ne,n,nw,nw,nw,s,nw,nw,n,nw,ne,nw,nw,nw,n,se,nw,nw,n,nw,nw,nw,nw,n,nw,n,n,ne,n,sw,nw,n,n,nw,nw,nw,n,nw,s,n,nw,nw,nw,nw,se,n,n,nw,n,n,nw,s,ne,n,nw,n,s,se,nw,sw,nw,nw,nw,s,nw,nw,n,nw,n,se,s,nw,nw,nw,sw,n,nw,n,se,n,s,nw,nw,nw,n,nw,nw,n,n,sw,nw,nw,nw,n,nw,sw,nw,nw,s,se,nw,nw,nw,ne,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,n,nw,nw,nw,nw,nw,nw,n,nw,n,nw,nw,n,sw,nw,sw,nw,nw,n,n,n,nw,ne,nw,n,nw,nw,nw,n,nw,nw,nw,nw,nw,n,nw,n,nw,n,nw,n,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,n,nw,sw,n,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,n,s,n,se,nw,nw,se,n,nw,ne,n,n,nw,nw,ne,nw,n,ne,nw,nw,n,n,ne,ne,sw,nw,nw,nw,n,sw,n,n,ne,nw,sw,nw,nw,nw,ne,se,sw,nw,ne,nw,nw,n,nw,nw,nw,nw,nw,ne,nw,n,s,nw,nw,nw,nw,nw,nw,ne,n,s,nw,n,nw,nw,s,n,nw,ne,s,nw,nw,nw,sw,nw,nw,nw,n,nw,nw,nw,n,n,nw,nw,nw,n,nw,n,sw,nw,nw,nw,nw,nw,n,n,nw,nw,nw,ne,s,nw,sw,nw,se,nw,nw,nw,n,nw,se,nw,ne,nw,nw,n,nw,se,nw,n,sw,sw,nw,se,nw,nw,nw,nw,n,nw,s,nw,n,nw,nw,se,nw,s,n,se,n,sw,nw,nw,nw,n,nw,ne,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,n,nw,nw,nw,s,sw,nw,nw,s,sw,nw,nw,nw,nw,nw,nw,nw,nw,n,se,nw,n,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,sw,nw,se,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,n,nw,nw,ne,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,se,nw,nw,n,s,s,nw,nw,n,nw,nw,nw,se,nw,nw,nw,ne,nw,se,nw,nw,nw,se,nw,nw,nw,s,se,n,nw,nw,nw,n,s,nw,nw,nw,nw,nw,n,nw,nw,ne,se,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,ne,sw,sw,s,ne,nw,nw,nw,nw,n,nw,nw,se,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,s,sw,nw,nw,nw,nw,nw,n,nw,s,sw,nw,nw,nw,nw,nw,s,n,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,sw,nw,sw,nw,se,sw,nw,ne,nw,sw,nw,ne,sw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,sw,nw,sw,s,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,s,se,nw,nw,nw,nw,nw,n,ne,sw,nw,nw,nw,nw,nw,sw,nw,nw,ne,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,sw,s,nw,nw,nw,ne,ne,nw,nw,nw,nw,nw,nw,sw,s,sw,se,nw,sw,ne,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,sw,nw,nw,nw,nw,s,sw,sw,se,se,nw,nw,s,nw,nw,sw,n,sw,sw,nw,sw,nw,nw,nw,nw,n,nw,nw,ne,nw,n,nw,nw,nw,sw,nw,ne,s,sw,s,nw,nw,nw,n,sw,nw,nw,nw,nw,nw,se,nw,sw,nw,nw,se,nw,nw,ne,sw,nw,nw,sw,nw,nw,nw,nw,sw,nw,sw,s,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,ne,nw,n,nw,nw,nw,nw,nw,nw,nw,se,s,n,s,s,ne,nw,sw,nw,nw,sw,nw,nw,nw,nw,nw,nw,sw,nw,se,nw,nw,nw,nw,se,nw,n,nw,n,sw,nw,nw,sw,nw,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,ne,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,s,sw,nw,sw,nw,sw,nw,nw,nw,nw,nw,n,nw,nw,n,se,nw,sw,nw,nw,sw,se,s,nw,sw,sw,se,sw,nw,sw,sw,n,sw,nw,ne,nw,sw,nw,nw,sw,nw,sw,nw,nw,n,sw,sw,nw,nw,nw,sw,nw,sw,nw,n,nw,ne,nw,nw,nw,sw,s,nw,nw,se,n,nw,nw,nw,nw,sw,sw,ne,sw,nw,sw,nw,se,sw,nw,nw,nw,sw,n,sw,sw,sw,nw,ne,sw,sw,nw,nw,sw,se,nw,nw,se,nw,s,ne,sw,s,s,nw,nw,nw,nw,nw,nw,nw,n,nw,ne,sw,sw,sw,sw,s,sw,sw,nw,nw,nw,nw,nw,sw,ne,sw,nw,nw,ne,nw,sw,nw,nw,nw,sw,nw,nw,nw,nw,sw,nw,n,sw,nw,nw,nw,sw,s,sw,sw,nw,sw,n,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,sw,sw,nw,nw,nw,nw,s,sw,nw,s,n,nw,sw,sw,se,nw,nw,nw,nw,nw,nw,s,nw,nw,ne,nw,s,sw,sw,sw,nw,sw,sw,nw,nw,sw,se,sw,nw,nw,sw,sw,ne,nw,nw,nw,n,nw,sw,nw,nw,nw,nw,sw,sw,sw,nw,sw,sw,ne,nw,nw,nw,sw,nw,ne,sw,n,nw,nw,nw,nw,sw,nw,nw,sw,nw,nw,nw,sw,se,sw,nw,nw,nw,nw,nw,nw,sw,s,sw,sw,se,s,sw,ne,nw,ne,sw,sw,nw,nw,sw,sw,se,nw,n,nw,nw,nw,nw,sw,nw,ne,sw,n,sw,sw,sw,sw,se,se,sw,ne,sw,sw,nw,nw,sw,sw,sw,sw,nw,nw,nw,nw,sw,sw,nw,nw,sw,nw,nw,nw,nw,sw,sw,s,ne,sw,nw,sw,sw,sw,nw,n,nw,sw,nw,nw,nw,nw,sw,nw,sw,nw,nw,nw,se,sw,sw,sw,sw,s,ne,sw,sw,sw,sw,nw,sw,ne,ne,sw,nw,sw,nw,nw,se,sw,sw,nw,sw,nw,sw,n,sw,nw,nw,sw,sw,sw,sw,nw,sw,nw,sw,n,nw,s,sw,sw,sw,sw,sw,nw,se,s,sw,sw,sw,sw,sw,nw,sw,sw,nw,n,se,nw,sw,nw,nw,s,sw,nw,se,nw,sw,sw,s,s,nw,s,sw,nw,sw,nw,sw,sw,sw,sw,sw,nw,nw,nw,sw,sw,sw,n,s,se,sw,ne,s,sw,ne,sw,sw,nw,nw,sw,sw,sw,sw,sw,se,sw,nw,nw,se,sw,n,sw,s,nw,sw,sw,sw,nw,sw,se,ne,nw,sw,nw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,sw,nw,nw,nw,n,sw,nw,nw,nw,s,nw,nw,nw,sw,s,se,sw,nw,sw,n,ne,se,nw,s,s,sw,se,s,sw,nw,sw,se,sw,sw,nw,nw,s,nw,n,nw,ne,nw,sw,sw,nw,sw,sw,n,nw,nw,s,ne,se,n,sw,n,nw,n,sw,ne,sw,nw,sw,sw,nw,ne,s,nw,nw,nw,nw,ne,sw,sw,se,nw,sw,sw,se,sw,nw,nw,sw,nw,sw,sw,nw,sw,sw,sw,sw,n,sw,nw,se,sw,s,ne,sw,sw,sw,sw,sw,se,sw,nw,ne,nw,sw,nw,ne,sw,se,sw,nw,nw,sw,nw,sw,ne,sw,ne,sw,nw,nw,nw,s,nw,n,sw,s,nw,nw,nw,nw,se,ne,sw,se,sw,sw,nw,sw,sw,nw,nw,ne,se,sw,nw,sw,se,nw,nw,nw,sw,s,sw,nw,sw,sw,nw,nw,sw,nw,nw,s,sw,sw,nw,sw,se,ne,sw,sw,se,s,nw,sw,sw,sw,nw,sw,nw,sw,sw,sw,nw,ne,nw,n,sw,se,n,sw,se,s,sw,nw,sw,sw,nw,s,sw,sw,nw,sw,sw,sw,ne,n,sw,s,ne,sw,sw,sw,sw,nw,sw,sw,sw,nw,sw,sw,sw,s,sw,sw,sw,nw,sw,sw,sw,sw,sw,nw,s,sw,nw,nw,n,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,nw,nw,sw,nw,se,sw,nw,ne,nw,sw,nw,sw,sw,s,sw,nw,sw,sw,sw,nw,sw,sw,sw,nw,sw,nw,sw,ne,nw,ne,sw,nw,sw,sw,sw,nw,nw,nw,nw,sw,s,sw,nw,se,nw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,s,nw,sw,sw,nw,nw,nw,sw,sw,sw,sw,sw,sw,ne,sw,se,sw,sw,nw,sw,ne,nw,sw,sw,nw,sw,n,s,nw,sw,sw,se,sw,n,nw,ne,nw,nw,sw,sw,sw,sw,sw,ne,ne,sw,sw,nw,nw,sw,nw,n,sw,sw,sw,nw,n,sw,n,sw,sw,s,nw,nw,ne,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,ne,nw,sw,s,sw,sw,s,nw,sw,sw,ne,nw,sw,sw,sw,nw,s,sw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,nw,sw,sw,nw,sw,sw,se,sw,sw,nw,sw,sw,se,se,sw,s,nw,sw,sw,nw,sw,se,sw,se,sw,s,sw,ne,nw,s,s,sw,sw,sw,sw,sw,sw,sw,nw,se,sw,s,sw,sw,sw,ne,sw,sw,nw,nw,nw,sw,nw,sw,s,sw,ne,sw,sw,sw,sw,nw,sw,sw,ne,nw,sw,nw,sw,sw,ne,sw,sw,sw,s,nw,sw,sw,nw,sw,sw,sw,sw,sw,ne,se,nw,sw,sw,s,n,ne,sw,sw,nw,sw,se,sw,sw,sw,sw,sw,ne,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,nw,sw,sw,sw,sw,nw,s,sw,se,sw,sw,sw,n,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,ne,sw,sw,sw,sw,sw,sw,sw,nw,nw,sw,sw,se,se,s,sw,ne,sw,sw,n,s,sw,sw,sw,sw,sw,sw,sw,sw,ne,se,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,n,nw,sw,ne,sw,nw,sw,sw,nw,sw,sw,sw,sw,n,sw,sw,sw,sw,nw,sw,sw,s,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,s,sw,sw,sw,sw,se,sw,sw,sw,ne,sw,sw,sw,sw,se,sw,sw,s,se,sw,sw,sw,n,sw,sw,sw,sw,sw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,ne,sw,sw,sw,sw,ne,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,s,sw,sw,nw,sw,sw,ne,n,sw,sw,sw,sw,sw,sw,n,sw,sw,sw,sw,sw,sw,sw,sw,nw,n,nw,n,sw,nw,ne,se,se,se,s,se,s,sw,s,nw,s,s,s,s,se,se,nw,sw,sw,sw,s,s,s,sw,sw,n,se,sw,s,sw,sw,sw,sw,sw,sw,nw,sw,sw,nw,sw,nw,s,sw,s,nw,s,nw,nw,nw,s,nw,nw,nw,nw,nw,nw,n,ne,nw,sw,nw,n,sw,nw,nw,n,n,nw,n,nw,n,n,nw,n,sw,n,sw,n,ne,n,n,n,n,n,sw,n,n,n,se,n,se,n,n,ne,n,ne,se,n,ne,n,n,n,n,n,nw,s,ne,ne,n,ne,se,ne,ne,ne,ne,s,ne,n,ne,ne,se,s,ne,ne,se,ne,ne,n,n,ne,sw,s,n,ne,ne,ne,ne,ne,ne,ne,ne,ne,n,ne,ne,ne,ne,ne,sw,se,nw,se,s,ne,se,ne,se,ne,ne,ne,se,sw,ne,ne,ne,s,nw,ne,se,ne,se,ne,s,se,ne,se,se,ne,se,se,se,ne,nw,ne,se,ne,sw,se,se,ne,se,nw,se,se,se,ne,se,se,se,n,ne,ne,se,se,se,ne,se,se,se,nw,se,se,se,se,se,se,se,se,se,se,se,sw,se,se,sw,se,s,se,se,se,se,se,se,se,se,ne,se,se,se,se,nw,s,s,ne,se,se,se,sw,s,nw,s,se,s,s,s,se,s,nw,se,sw,sw,s,se,se,s,se,se,nw,se,s,se,s,se,s,s,s,s,se,se,s,s,s,s,se,se,se,sw,s,s,s,ne,ne,s,sw,sw,s,s,s,s,nw,s,nw,se,ne,s,se,s,ne,s,s,s,s,s,s,s,sw,s,s,sw,s,se,se,s,s,s,s,s,nw,s,se,s,s,sw,s,s,s,s,s,s,s,sw,s,s,s,s,s,s,s,s,se,s,nw,s,sw,s,s,sw,s,s,se,s,s,sw,s,s,sw,sw,sw,sw,s,sw,n,n,sw,ne,sw,sw,s,sw,ne,s,sw,nw,nw,s,s,sw,sw,sw,s,s,sw,s,sw,sw,sw,s,se,nw,s,s,sw,s,sw,sw,s,nw,sw,s,s,sw,sw,sw,sw,s,s,sw,sw,ne,sw,sw,s,se,sw,n,sw,se,sw,sw,s,sw,sw,sw,se,sw,sw,sw,sw,sw,s,n,s,n,sw,sw,sw,sw,nw,sw,sw,nw,sw,s,sw,sw,nw,ne,sw,sw,sw,sw,sw,sw,se,n,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,s,sw,sw,sw,sw,sw,sw,sw,se,n,nw,sw,ne,nw,ne,sw,sw,nw,nw,nw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,n,nw,sw,sw,nw,sw,sw,sw,se,nw,s,sw,nw,s,n,nw,sw,sw,s,sw,sw,ne,sw,sw,nw,sw,n,sw,se,sw,nw,nw,nw,sw,nw,sw,sw,sw,ne,sw,nw,sw,n,nw,nw,sw,sw,sw,nw,nw,se,nw,nw,sw,se,sw,sw,nw,sw,sw,sw,nw,sw,nw,nw,sw,sw,sw,sw,sw,nw,nw,se,sw,ne,nw,sw,sw,sw,nw,n,sw,nw,sw,nw,ne,nw,nw,s,nw,nw,nw,sw,s,sw,sw,sw,nw,nw,n,nw,nw,nw,nw,nw,sw,sw,nw,n,nw,sw,sw,sw,se,sw,sw,nw,ne,nw,nw,n,nw,nw,nw,nw,nw,sw,nw,nw,nw,ne,nw,ne,nw,nw,sw,sw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,sw,sw,nw,se,se,sw,nw,nw,nw,nw,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,nw,ne,nw,nw,ne,nw,sw,nw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,sw,n,nw,nw,n,nw,se,se,s,nw,nw,n,ne,nw,ne,nw,nw,n,nw,sw,nw,s,s,nw,nw,n,nw,nw,se,nw,n,n,nw,ne,n,nw,nw,n,n,n,sw,n,nw,nw,nw,nw,sw,n,se,nw,s,sw,n,nw,nw,n,nw,nw,nw,n,n,nw,ne,n,s,se,n,s,n,nw,n,se,ne,nw,sw,n,se,nw,nw,s,se,n,n,ne,sw,s,n,nw,nw,nw,sw,nw,n,nw,nw,s,nw,n,n,n,n,n,n,n,n,nw,n,s,nw,n,nw,n,n,nw,se,s,nw,n,ne,sw,nw,sw,nw,nw,nw,nw,n,n,nw,n,n,n,nw,n,n,s,n,sw,n,sw,ne,n,n,n,nw,nw,n,nw,n,nw,nw,n,nw,n,s,n,n,s,n,nw,sw,nw,sw,nw,n,se,nw,s,nw,s,n,se,n,nw,n,n,n,n,n,n,ne,n,ne,n,n,n,n,nw,nw,s,n,n,ne,n,ne,n,n,n,n,n,n,sw,nw,n,n,n,n,nw,n,n,nw,n,n,n,n,se,n,n,n,n,n,n,nw,n,n,n,ne,n,n,n,n,n,s,n,n,sw,n,n,n,se,n,n,se,n,sw,n,n,se,n,n,s,se,nw,n,n,n,n,n,n,n,n,n,n,ne,n,n,n,n,n,se,ne,n,n,n,n,n,n,n,n,ne,n,n,n,n,n,n,n,s,n,s,se,n,n,n,n,ne,ne,n,n,s,n,n,n,n,n,n,nw,n,n,ne,n,n,n,ne,n,n,sw,se,n,n,n,ne,s,n,ne,n,n,n,n,n,s,n,se,n,se,s,n,n,n,n,ne,n,n,n,n,sw,se,n,n,nw,sw,nw,ne,n,n,se,n,n,n,se,n,n,n,ne,n,n,sw,nw,n,n,ne,n,ne,ne,n,n,n,ne,n,n,n,sw,n,sw,se,n,n,ne,s,n,ne,ne,n,n,n,se,sw,n,n,ne,s,ne,ne,ne,ne,ne,n,n,n,n,n,n,nw,ne,n,n,n,ne,ne,ne,sw,n,n,n,n,n,n,ne,ne,n,n,n,n,n,n,ne,s,ne,ne,ne,n,ne,n,n,ne,ne,se,ne,n,nw,ne,ne,s,ne,ne,n,ne,n,n,ne,n,ne,n,n,ne,ne,ne,se,n,ne,ne,nw,ne,n,ne,ne,n,ne,n,ne,ne,n,se,n,n,ne,n,n,ne,ne,n,ne,n,ne,ne,nw,n,ne,ne,ne,n,ne,ne,ne,s,nw,ne,ne,n,ne,n,ne,n,ne,ne,ne,sw,s,n,ne,ne,ne,n,sw,ne,nw,se,nw,ne,ne,n,ne,n,ne,ne,ne,ne,ne,ne,sw,ne,ne,se,ne,n,ne,ne,n,n,ne,ne,ne,ne,ne,ne,n,ne,ne,n,ne,ne,ne,se,sw,sw,nw,ne,ne,n,ne,nw,ne,ne,ne,ne,ne,ne,se,nw,ne,ne,ne,ne,n,ne,ne,n,ne,ne,ne,n,sw,ne,ne,s,n,ne,nw,ne,n,ne,s,ne,ne,ne,ne,ne,ne,n,sw,ne,sw,sw,se,ne,n,ne,s,ne,ne,s,n,ne,ne,ne,ne,ne,n,ne,ne,ne,ne,ne,sw,ne,ne,ne,ne,ne,ne,sw,n,ne,ne,ne,se,n,ne,nw,ne,nw,se,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,s,ne,ne,s,ne,ne,ne,se,ne,ne,nw,ne,sw,n,ne,ne,se,ne,sw,se,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,nw,ne,ne,ne,sw,ne,ne,ne,ne,ne,ne,ne,ne,s,ne,se,ne,ne,se,ne,ne,s,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,sw,ne,ne,se,se,ne,ne,se,ne,se,nw,ne,ne,ne,ne,ne,se,ne,ne,ne,se,ne,ne,ne,ne,se,se,ne,se,ne,s,n,s,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,se,se,s,ne,n,se,ne,ne,ne,se,n,n,ne,se,nw,n,ne,ne,s,nw,ne,ne,se,ne,s,se,ne,se,ne,ne,ne,ne,ne,sw,n,ne,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,s,ne,ne,ne,ne,se,se,se,ne,se,se,ne,ne,se,ne,ne,se,se,ne,ne,se,ne,s,ne,n,ne,ne,se,se,ne,n,ne,nw,se,ne,se,se,n,ne,s,se,ne,se,ne,se,se,se,se,se,se,sw,se,se,se,ne,sw,ne,ne,ne,ne,ne,nw,ne,se,s,se,ne,se,se,se,ne,sw,ne,se,ne,se,nw,se,ne,n,se,se,sw,ne,ne,se,sw,ne,se,se,se,se,ne,ne,ne,se,se,ne,se,ne,se,ne,se,se,se,se,n,n,se,se,ne,ne,se,se,se,se,ne,ne,s,s,ne,se,se,se,ne,sw,se,ne,se,sw,ne,ne,se,se,nw,se,ne,nw,ne,se,se,ne,se,se,ne,ne,se,se,sw,se,se,n,se,se,ne,se,ne,se,se,se,ne,se,n,se,se,ne,se,ne,ne,se,ne,se,se,se,se,s,se,sw,se,se,se,ne,se,ne,se,ne,ne,se,s,ne,ne,se,se,se,se,s,se,se,ne,se,ne,se,se,se,ne,se,s,ne,se,se,ne,se,ne,se,se,ne,se,se,n,se,s,ne,ne,se,se,ne,s,se,se,nw,n,ne,ne,se,ne,sw,ne,s,s,sw,sw,ne,se,se,n,nw,se,n,se,n,ne,se,ne,se,se,nw,ne,se,se,ne,nw,se,se,ne,se,sw,ne,ne,se,se,se,se,se,se,s,se,ne,se,se,se,nw,se,se,n,se,se,ne,sw,se,se,se,se,se,ne,se,nw,nw,ne,se,se,se,se,ne,s,se,se,sw,se,se,se,se,n,n,se,se,n,se,se,se,se,n,se,se,se,n,se,ne,se,ne,nw,se,n,se,ne,se,se,se,se,se,se,se,se,nw,se,se,se,n,se,se,se,se,ne,se,se,se,se,se,se,n,nw,ne,ne,se,se,ne,sw,se,sw,se,se,se,ne,se,n,n,nw,se,se,sw,n,se,s,s,se,se,se,se,se,se,nw,se,sw,ne,se,s,se,se,se,se,se,ne,se,s,se,n,se,se,se,se,se,se,ne,se,sw,se,sw,se,se,se,se,se,se,se,ne,s,se,se,n,n,se,se,se,se,se,se,se,se,se,se,nw,s,se,se,nw,se,n,se,nw,se,s,sw,se,se,se,nw,se,sw,se,se,s,ne,se,se,se,se,se,sw,se,se,se,se,se,se,se,se,ne,ne,se,nw,s,se,se,se,s,se,se,se,se,se,se,se,se,se,se,nw,s,n,se,se,se,se,nw,se,se,se,se,se,se,se,ne,se,se,se,se,s,se,se,se,sw,nw,se,se,se,n,se,ne,se,se,se,se,se,se,se,sw,n,se,se,se,se,se,se,se,se,se,se,se,se,ne,se,se,se,se,se,se,se,se,ne,se,se,se,se,se,se,se,s,ne,ne,ne,se,ne,s,se,se,se,s,se,s,se,s,se,se,se,se,se,s,se,s,nw,se,se,se,sw,ne,s,se,ne,se,se,se,s,se,se,s,s,se,s,se,se,sw,n,se,ne,s,s,se,s,se,se,nw,se,s,se,n,ne,se,se,se,se,s,se,se,s,s,s,se,se,sw,s,se,se,s,n,se,n,se,se,ne,s,ne,se,se,s,se,se,ne,s,sw,sw,s,se,s,se,nw,se,ne,se,se,se,n,se,s,nw,se,n,se,s,se,se,se,s,s,se,se,se,s,se,se,se,s,se,se,s,se,s,se,se,se,se,se,se,se,s,se,s,se,s,se,n,s,se,se,se,se,s,se,se,se,se,nw,s,n,s,se,s,se,s,se,s,se,se,se,s,se,s,s,s,se,s,se,se,se,ne,se,se,nw,se,s,se,se,se,s,s,s,se,se,s,sw,ne,se,s,s,se,se,s,se,se,s,se,nw,s,s,se,se,nw,s,se,s,se,se,se,s,se,se,nw,se,n,se,se,se,se,ne,se,se,n,se,s,s,s,s,se,se,s,s,s,s,se,n,se,s,s,se,se,s,sw,se,s,ne,n,s,se,sw,se,se,n,sw,se,ne,se,s,se,s,se,se,se,nw,ne,se,se,se,se,s,s,se,se,s,se,se,s,s,ne,nw,s,s,nw,sw,sw,s,se,sw,nw,se,se,s,se,sw,s,s,ne,se,s,s,se,se,s,se,se,sw,se,se,s,se,s,se,s,s,s,s,nw,s,s,s,se,se,s,se,se,s,s,se,se,s,s,se,s,s,s,n,s,se,se,s,n,sw,s,se,se,s,se,s,s,s,s,se,se,s,s,sw,s,se,s,sw,s,s,s,s,se,n,s,se,se,s,se,s,se,s,s,s,s,se,se,se,ne,s,s,s,s,se,s,s,s,ne,s,s,nw,s,s,s,se,se,se,s,s,s,s,s,s,s,s,se,nw,se,se,s,s,se,s,s,se,se,s,s,s,se,s,s,se,s,se,s,se,s,s,s,se,s,s,n,se,s,s,ne,s,s,s,se,s,s,s,s,n,s,se,n,sw,se,se,s,s,s,s,se,s,s,s,s,s,se,se,se,s,s,s,s,ne,ne,s,s,se,s,s,se,s,se,s,se,sw,s,s,se,s,s,se,nw,s,s,s,s,s,s,se,se,s,s,ne,s,s,s,s,s,se,s,ne,s,s,s,s,s,s,s,se,s,s,se,s,s,s,sw,nw,s,se,n,se,s,s,s,ne,ne,s,s,s,s,s,se,s,s,s,s,s,s,n,s,s,s,s,s,ne,s,n,s,se,s,s,s,se,s,s,s,sw,s,se,s,nw,s,se,se,s,sw,s,s,s,se,s,s,s,sw,nw,s,se,se,s,s,s,s,n,nw,sw,s,s,nw,sw,s,n,se,sw,se,s,ne,s,s,ne,s,s,s,s,s,s,se,s,s,sw,s,se,s,s,nw,s,s,s,s,s,s,sw,s,s,s,s,s,s,s,s,s,s,s,s")

(def day-12-example "0 <-> 2
1 <-> 1
2 <-> 0, 3, 4
3 <-> 2, 4
4 <-> 2, 3, 6
5 <-> 6
6 <-> 4, 5")

(def day-12-input "0 <-> 659, 737
1 <-> 1, 1433
2 <-> 982, 1869
3 <-> 306, 380, 1462, 1827
4 <-> 1076
5 <-> 794, 1451
6 <-> 146, 1055
7 <-> 834, 1557
8 <-> 1333
9 <-> 849, 906, 1863
10 <-> 362, 505
11 <-> 33, 938, 1896
12 <-> 490, 913
13 <-> 189, 690
14 <-> 796
15 <-> 56, 280, 1288, 1721
16 <-> 16
17 <-> 904
18 <-> 150, 1394, 1458
19 <-> 1773
20 <-> 70
21 <-> 993
22 <-> 22
23 <-> 285, 1004
24 <-> 209, 727
25 <-> 614, 1590
26 <-> 113
27 <-> 1321, 1341
28 <-> 351, 730, 1037
29 <-> 29, 1828
30 <-> 1378, 1983
31 <-> 705, 1035
32 <-> 1042, 1519
33 <-> 11, 886
34 <-> 360, 1101, 1531, 1877
35 <-> 971, 1652
36 <-> 188
37 <-> 1935
38 <-> 38
39 <-> 39, 1472
40 <-> 84, 1110
41 <-> 483, 895, 1035, 1864, 1919
42 <-> 624, 813, 1484, 1517
43 <-> 492
44 <-> 947, 1572
45 <-> 45, 1589, 1748, 1836
46 <-> 1821
47 <-> 123, 206, 239
48 <-> 146
49 <-> 235, 871
50 <-> 172, 1672
51 <-> 504
52 <-> 585, 678, 878
53 <-> 484, 543, 1282
54 <-> 374, 723
55 <-> 1956
56 <-> 15
57 <-> 583, 1159, 1596
58 <-> 313, 580, 1101
59 <-> 1529, 1788
60 <-> 60
61 <-> 1033, 1857
62 <-> 874
63 <-> 63, 1007, 1316, 1673
64 <-> 1140
65 <-> 1136
66 <-> 1337, 1546
67 <-> 67, 1468
68 <-> 298, 951
69 <-> 906
70 <-> 20, 1977
71 <-> 1956
72 <-> 146, 1465
73 <-> 911
74 <-> 1345
75 <-> 711
76 <-> 732, 789, 1499, 1637
77 <-> 1897
78 <-> 78, 379
79 <-> 96, 462, 847
80 <-> 886, 907
81 <-> 1564
82 <-> 1362, 1680
83 <-> 225, 916
84 <-> 40, 1460
85 <-> 330
86 <-> 1370
87 <-> 87, 640
88 <-> 806, 1411
89 <-> 1732
90 <-> 603
91 <-> 547, 904
92 <-> 1106
93 <-> 782
94 <-> 401, 1039, 1148, 1356
95 <-> 95, 344, 1092
96 <-> 79
97 <-> 1555, 1649
98 <-> 133
99 <-> 866
100 <-> 116, 1183, 1450
101 <-> 964
102 <-> 521, 843
103 <-> 1002
104 <-> 675, 1752, 1760
105 <-> 447
106 <-> 625
107 <-> 200, 923, 1573
108 <-> 108, 1535
109 <-> 1938, 1984
110 <-> 992
111 <-> 410, 436, 1789, 1985
112 <-> 730, 1742
113 <-> 26, 774, 1620
114 <-> 891
115 <-> 556, 980, 1502
116 <-> 100, 405, 438
117 <-> 1220, 1747
118 <-> 417
119 <-> 1671
120 <-> 225
121 <-> 215, 1414
122 <-> 1421
123 <-> 47, 488, 1390
124 <-> 1750
125 <-> 1020, 1456, 1645, 1811
126 <-> 945, 988, 1558
127 <-> 1562
128 <-> 246, 419, 878, 1057
129 <-> 198, 214, 526
130 <-> 1572
131 <-> 624
132 <-> 1086
133 <-> 98, 430, 1950
134 <-> 1179
135 <-> 1603
136 <-> 136
137 <-> 137, 248
138 <-> 604
139 <-> 1080, 1744, 1829
140 <-> 786, 890, 1336
141 <-> 819, 835
142 <-> 142, 1657
143 <-> 590, 670
144 <-> 622
145 <-> 182, 930, 1164, 1741
146 <-> 6, 48, 72, 152
147 <-> 1880
148 <-> 1486
149 <-> 1595
150 <-> 18, 653
151 <-> 1834
152 <-> 146, 289, 1949
153 <-> 1379
154 <-> 694, 1025
155 <-> 1143, 1469
156 <-> 437, 1492, 1616
157 <-> 1044
158 <-> 410, 1391
159 <-> 1327
160 <-> 387, 892, 963, 1287
161 <-> 964, 1017
162 <-> 786, 1098, 1351, 1445, 1508
163 <-> 415
164 <-> 255, 790, 1410
165 <-> 252, 425, 1186, 1662, 1838
166 <-> 791, 1012
167 <-> 167, 836, 1922
168 <-> 1586, 1998
169 <-> 679, 914
170 <-> 1975
171 <-> 672
172 <-> 50
173 <-> 614
174 <-> 723
175 <-> 246, 747
176 <-> 400, 1338
177 <-> 573, 1617, 1724
178 <-> 473, 1572
179 <-> 183
180 <-> 200, 1380
181 <-> 1394, 1657
182 <-> 145, 1825
183 <-> 179, 399, 955, 1236, 1295, 1840
184 <-> 712
185 <-> 185
186 <-> 551, 1627
187 <-> 1195
188 <-> 36, 440, 1277, 1362
189 <-> 13
190 <-> 1111
191 <-> 985, 1372
192 <-> 496, 1137, 1283
193 <-> 827, 1053
194 <-> 610
195 <-> 1231, 1497
196 <-> 1960
197 <-> 584, 1359
198 <-> 129, 651, 714, 1663
199 <-> 1047, 1805
200 <-> 107, 180, 658, 1397
201 <-> 1590
202 <-> 1268, 1768
203 <-> 1683
204 <-> 567, 1848
205 <-> 276
206 <-> 47, 461, 1794
207 <-> 207
208 <-> 1248
209 <-> 24, 1589
210 <-> 1063, 1504
211 <-> 907, 1815
212 <-> 1948
213 <-> 388
214 <-> 129, 561, 793, 1569
215 <-> 121, 252
216 <-> 216, 1728
217 <-> 761
218 <-> 631, 816
219 <-> 459, 807, 1008
220 <-> 1231, 1447
221 <-> 713, 1541
222 <-> 856, 924, 1924
223 <-> 1103
224 <-> 1426, 1761
225 <-> 83, 120, 242, 784
226 <-> 311, 560
227 <-> 587, 667, 984, 1091
228 <-> 1852
229 <-> 229, 1198, 1204
230 <-> 1505, 1944
231 <-> 1158, 1594, 1925
232 <-> 232, 345, 1417
233 <-> 828, 1677
234 <-> 982
235 <-> 49, 1012, 1254, 1956
236 <-> 489, 893, 1545
237 <-> 988, 1450
238 <-> 1719, 1791
239 <-> 47, 736, 1027
240 <-> 1167, 1457
241 <-> 270
242 <-> 225, 814, 1873
243 <-> 243, 282, 914
244 <-> 302, 328, 559
245 <-> 1753
246 <-> 128, 175
247 <-> 1230, 1660, 1824
248 <-> 137, 537, 1423
249 <-> 1209, 1391, 1749
250 <-> 298
251 <-> 799
252 <-> 165, 215
253 <-> 1437, 1741
254 <-> 1356
255 <-> 164
256 <-> 310
257 <-> 1267, 1821
258 <-> 1177, 1876
259 <-> 1257, 1432
260 <-> 311, 1115
261 <-> 1504
262 <-> 1268
263 <-> 565, 1023
264 <-> 408, 1806
265 <-> 1009, 1144
266 <-> 599, 616
267 <-> 1182
268 <-> 1026, 1456, 1470, 1854
269 <-> 269, 686
270 <-> 241, 1445
271 <-> 1232
272 <-> 487, 863, 1286
273 <-> 1614, 1748
274 <-> 1332
275 <-> 1010, 1334
276 <-> 205, 478, 888, 1049
277 <-> 277, 1330
278 <-> 734, 1561
279 <-> 535, 1190, 1913
280 <-> 15
281 <-> 1206
282 <-> 243, 475, 1571
283 <-> 283, 1936
284 <-> 324, 702, 844, 1601
285 <-> 23
286 <-> 286, 1080, 1127
287 <-> 295
288 <-> 805
289 <-> 152, 656, 691, 993
290 <-> 595, 616, 1199
291 <-> 1028, 1218, 1844
292 <-> 1447
293 <-> 378, 1771
294 <-> 811, 1790
295 <-> 287, 367, 693
296 <-> 861, 1948, 1950
297 <-> 1631
298 <-> 68, 250, 641, 745
299 <-> 299, 898, 1152, 1574
300 <-> 353
301 <-> 990, 1340, 1960
302 <-> 244
303 <-> 1645
304 <-> 445, 448, 557, 1611
305 <-> 1350, 1442
306 <-> 3, 445
307 <-> 567
308 <-> 1799
309 <-> 864
310 <-> 256, 853, 1911
311 <-> 226, 260, 970
312 <-> 1308
313 <-> 58
314 <-> 1795
315 <-> 1225, 1627, 1903
316 <-> 1065, 1991
317 <-> 317
318 <-> 546, 1415
319 <-> 1883
320 <-> 417, 1040
321 <-> 1927
322 <-> 686
323 <-> 1018, 1619
324 <-> 284
325 <-> 1114
326 <-> 474, 872
327 <-> 439
328 <-> 244
329 <-> 329
330 <-> 85, 1868
331 <-> 331, 680, 1224, 1243, 1291
332 <-> 1748
333 <-> 1673
334 <-> 676, 1306
335 <-> 809
336 <-> 797, 1559, 1858
337 <-> 978, 1874
338 <-> 538, 1077
339 <-> 432, 1033
340 <-> 340
341 <-> 1267, 1683
342 <-> 587, 726
343 <-> 1560, 1705
344 <-> 95
345 <-> 232, 1032
346 <-> 581, 1992
347 <-> 530
348 <-> 667, 1479
349 <-> 1620
350 <-> 861, 998, 1069
351 <-> 28
352 <-> 352
353 <-> 300, 1513
354 <-> 1109, 1747
355 <-> 950, 965, 1394, 1616
356 <-> 1136
357 <-> 1443, 1698
358 <-> 973, 1814
359 <-> 1662
360 <-> 34, 921
361 <-> 1418
362 <-> 10, 668, 1656
363 <-> 450, 766
364 <-> 615, 1941
365 <-> 1071
366 <-> 749, 1375
367 <-> 295, 1708, 1925
368 <-> 383, 928
369 <-> 369
370 <-> 651, 1048
371 <-> 665, 1460, 1686
372 <-> 390, 958, 1682
373 <-> 1559
374 <-> 54, 1395, 1847
375 <-> 799, 1061, 1383, 1773
376 <-> 376
377 <-> 1463
378 <-> 293, 872, 917
379 <-> 78, 449
380 <-> 3, 1117
381 <-> 1995
382 <-> 846, 896, 1506, 1918
383 <-> 368, 477
384 <-> 1009, 1788
385 <-> 1926
386 <-> 1602
387 <-> 160, 667
388 <-> 213, 713
389 <-> 586
390 <-> 372, 1140
391 <-> 863
392 <-> 590, 1259, 1384
393 <-> 645
394 <-> 423, 1537
395 <-> 782, 1496, 1893
396 <-> 1497
397 <-> 397
398 <-> 847, 1265
399 <-> 183, 743, 1564
400 <-> 176
401 <-> 94
402 <-> 402
403 <-> 558
404 <-> 572
405 <-> 116
406 <-> 769, 1563
407 <-> 1790
408 <-> 264
409 <-> 847
410 <-> 111, 158, 1467, 1880, 1902
411 <-> 1221
412 <-> 858, 1088, 1848
413 <-> 1589
414 <-> 468, 637
415 <-> 163, 415
416 <-> 416, 817
417 <-> 118, 320, 1671
418 <-> 1029, 1987
419 <-> 128, 765
420 <-> 420, 1180
421 <-> 1170, 1766
422 <-> 563, 1400, 1904, 1926
423 <-> 394
424 <-> 730
425 <-> 165, 478, 957
426 <-> 1505
427 <-> 1478, 1780
428 <-> 1658
429 <-> 650
430 <-> 133
431 <-> 469, 1491
432 <-> 339
433 <-> 667, 1549
434 <-> 852
435 <-> 435
436 <-> 111
437 <-> 156
438 <-> 116, 874
439 <-> 327, 1387
440 <-> 188, 540
441 <-> 441
442 <-> 692
443 <-> 1037, 1153
444 <-> 758, 1064
445 <-> 304, 306
446 <-> 1072, 1495, 1890
447 <-> 105, 1665
448 <-> 304, 591
449 <-> 379
450 <-> 363, 450, 466
451 <-> 1135
452 <-> 990, 1344, 1604
453 <-> 1390, 1755
454 <-> 1853
455 <-> 1199, 1735, 1852
456 <-> 484
457 <-> 457, 1973
458 <-> 786
459 <-> 219
460 <-> 1655, 1777
461 <-> 206, 753
462 <-> 79, 668
463 <-> 699
464 <-> 1843
465 <-> 829, 978, 1820
466 <-> 450
467 <-> 770, 1475
468 <-> 414, 613, 1230
469 <-> 431, 1470
470 <-> 1292, 1659
471 <-> 603
472 <-> 719, 1398
473 <-> 178, 1419
474 <-> 326, 866
475 <-> 282
476 <-> 1512, 1669
477 <-> 383
478 <-> 276, 425
479 <-> 1029
480 <-> 603
481 <-> 991, 1878
482 <-> 1726, 1783
483 <-> 41, 855
484 <-> 53, 456
485 <-> 1814
486 <-> 1470
487 <-> 272, 1693
488 <-> 123
489 <-> 236, 1155, 1793
490 <-> 12, 1349, 1498
491 <-> 913
492 <-> 43, 1121, 1822
493 <-> 1148
494 <-> 619, 1528
495 <-> 1960
496 <-> 192
497 <-> 497
498 <-> 1185
499 <-> 1933
500 <-> 1948
501 <-> 1364, 1433, 1826
502 <-> 893, 933
503 <-> 514
504 <-> 51, 821, 1116
505 <-> 10, 905
506 <-> 506
507 <-> 892
508 <-> 508
509 <-> 1078
510 <-> 1716
511 <-> 1197, 1900
512 <-> 568, 1284, 1422
513 <-> 1604, 1817, 1927
514 <-> 503, 773, 1725, 1883
515 <-> 1396
516 <-> 542
517 <-> 1299
518 <-> 1562
519 <-> 1622
520 <-> 1254, 1868, 1881
521 <-> 102, 1765
522 <-> 1438, 1980
523 <-> 1779
524 <-> 1235, 1968
525 <-> 1267, 1484
526 <-> 129
527 <-> 1211
528 <-> 597, 1017
529 <-> 529, 609
530 <-> 347, 1737, 1890
531 <-> 851, 1320
532 <-> 709
533 <-> 819, 1091
534 <-> 856
535 <-> 279, 535
536 <-> 536
537 <-> 248, 1317, 1763
538 <-> 338, 1793
539 <-> 539, 1485
540 <-> 440, 1216
541 <-> 541
542 <-> 516, 1232, 1831
543 <-> 53, 1234
544 <-> 639, 1090
545 <-> 1898
546 <-> 318, 1208
547 <-> 91
548 <-> 569, 750, 1090
549 <-> 1720
550 <-> 660
551 <-> 186
552 <-> 642, 672, 723
553 <-> 1927
554 <-> 717, 1841, 1997
555 <-> 1938
556 <-> 115, 1453
557 <-> 304, 904
558 <-> 403, 1438
559 <-> 244, 1046
560 <-> 226
561 <-> 214, 793, 1570
562 <-> 1992
563 <-> 422
564 <-> 860
565 <-> 263, 804
566 <-> 566
567 <-> 204, 307
568 <-> 512, 1084
569 <-> 548, 985, 1910
570 <-> 665, 1844
571 <-> 735
572 <-> 404, 1026, 1111
573 <-> 177, 1994
574 <-> 846
575 <-> 723, 738, 795, 802, 926, 1215
576 <-> 1650, 1962, 1996
577 <-> 1501, 1670
578 <-> 1504
579 <-> 1016, 1729
580 <-> 58
581 <-> 346, 581
582 <-> 749
583 <-> 57, 613, 1219, 1941
584 <-> 197, 1366
585 <-> 52, 1518
586 <-> 389, 1597
587 <-> 227, 342
588 <-> 1408
589 <-> 1229
590 <-> 143, 392, 1044, 1078
591 <-> 448, 1289
592 <-> 592
593 <-> 711
594 <-> 770
595 <-> 290, 1169
596 <-> 1854
597 <-> 528, 755, 1241, 1982
598 <-> 663, 806
599 <-> 266
600 <-> 1065, 1694
601 <-> 746
602 <-> 827
603 <-> 90, 471, 480, 1083
604 <-> 138, 1003
605 <-> 1703
606 <-> 1289
607 <-> 1309
608 <-> 808, 1100
609 <-> 529, 1621, 1943
610 <-> 194, 610
611 <-> 1337, 1609
612 <-> 980, 1350
613 <-> 468, 583
614 <-> 25, 173, 1623, 1914
615 <-> 364, 775
616 <-> 266, 290
617 <-> 1514
618 <-> 1031
619 <-> 494, 1761
620 <-> 1126, 1150, 1221, 1513, 1712
621 <-> 1770
622 <-> 144, 1761
623 <-> 1367
624 <-> 42, 131
625 <-> 106, 914
626 <-> 1849
627 <-> 1477
628 <-> 1379
629 <-> 969
630 <-> 1114
631 <-> 218, 1935, 1979
632 <-> 1015, 1665, 1816, 1819
633 <-> 1326, 1628
634 <-> 1347, 1720
635 <-> 816
636 <-> 636
637 <-> 414, 1566
638 <-> 1668
639 <-> 544, 824, 1542
640 <-> 87
641 <-> 298, 1196
642 <-> 552, 1619
643 <-> 972
644 <-> 814
645 <-> 393, 1148, 1205, 1302
646 <-> 969
647 <-> 935, 1575
648 <-> 648, 1424
649 <-> 1794
650 <-> 429, 854, 1586, 1711
651 <-> 198, 370
652 <-> 996, 1996
653 <-> 150, 1919
654 <-> 654
655 <-> 658
656 <-> 289
657 <-> 978, 1954
658 <-> 200, 655
659 <-> 0, 825, 1258, 1792
660 <-> 550, 1232
661 <-> 661, 1405
662 <-> 662
663 <-> 598
664 <-> 1014
665 <-> 371, 570, 1247
666 <-> 989, 1778
667 <-> 227, 348, 387, 433
668 <-> 362, 462, 703, 1091
669 <-> 1184
670 <-> 143
671 <-> 671, 901
672 <-> 171, 552
673 <-> 1865
674 <-> 972, 1961
675 <-> 104, 1581, 1800
676 <-> 334, 1995
677 <-> 1836
678 <-> 52
679 <-> 169
680 <-> 331
681 <-> 823
682 <-> 921
683 <-> 1800
684 <-> 750, 1505
685 <-> 722, 1338, 1993
686 <-> 269, 322
687 <-> 989, 1178
688 <-> 1338
689 <-> 1535
690 <-> 13, 690
691 <-> 289, 721
692 <-> 442, 1014
693 <-> 295
694 <-> 154, 862
695 <-> 1552, 1735
696 <-> 1044
697 <-> 993, 1793, 1801
698 <-> 698
699 <-> 463, 1022, 1399
700 <-> 897, 1085
701 <-> 1782, 1987
702 <-> 284
703 <-> 668, 1031
704 <-> 704, 849
705 <-> 31
706 <-> 1909
707 <-> 1276
708 <-> 1301
709 <-> 532, 1607
710 <-> 1094
711 <-> 75, 593, 1251, 1297
712 <-> 184, 712
713 <-> 221, 388, 713
714 <-> 198
715 <-> 1607
716 <-> 1110
717 <-> 554, 1819
718 <-> 1755
719 <-> 472, 1942
720 <-> 1043, 1984
721 <-> 691, 1641
722 <-> 685, 1360, 1679
723 <-> 54, 174, 552, 575
724 <-> 1466
725 <-> 1231
726 <-> 342, 1023
727 <-> 24
728 <-> 1928
729 <-> 975, 1759
730 <-> 28, 112, 424, 1324
731 <-> 731
732 <-> 76, 1698
733 <-> 1895
734 <-> 278
735 <-> 571, 1440
736 <-> 239
737 <-> 0, 1214, 1949
738 <-> 575, 985
739 <-> 1467
740 <-> 740, 1449, 1885
741 <-> 1243
742 <-> 845, 1588, 1676, 1956, 1980
743 <-> 399
744 <-> 744, 1990
745 <-> 298, 1966
746 <-> 601, 1294, 1601
747 <-> 175, 1106
748 <-> 1433, 1565, 1795
749 <-> 366, 582
750 <-> 548, 684, 1210
751 <-> 751, 1967
752 <-> 765, 1297
753 <-> 461
754 <-> 754
755 <-> 597, 1089
756 <-> 756
757 <-> 1350, 1936
758 <-> 444, 1044, 1279
759 <-> 996, 1310
760 <-> 1943
761 <-> 217, 1333
762 <-> 1671
763 <-> 1761
764 <-> 1881
765 <-> 419, 752
766 <-> 363, 928, 1100
767 <-> 1220, 1986
768 <-> 1337
769 <-> 406, 1307
770 <-> 467, 594, 1707
771 <-> 1624, 1782
772 <-> 1230
773 <-> 514, 1266, 1305
774 <-> 113, 1198
775 <-> 615, 1753
776 <-> 1307
777 <-> 1785
778 <-> 778, 1776
779 <-> 992
780 <-> 1406
781 <-> 781, 1272
782 <-> 93, 395, 1207
783 <-> 1544, 1729
784 <-> 225, 1168, 1587
785 <-> 1050
786 <-> 140, 162, 458, 786, 1060
787 <-> 1210
788 <-> 1431
789 <-> 76
790 <-> 164, 882
791 <-> 166, 1688
792 <-> 792, 946
793 <-> 214, 561
794 <-> 5, 1561
795 <-> 575, 1208, 1875
796 <-> 14, 1205, 1427
797 <-> 336, 1006, 1352
798 <-> 1176, 1754
799 <-> 251, 375
800 <-> 840, 1471
801 <-> 801, 1246, 1897
802 <-> 575
803 <-> 1692
804 <-> 565, 859, 1978
805 <-> 288, 1447
806 <-> 88, 598
807 <-> 219, 1579
808 <-> 608
809 <-> 335, 867, 1734, 1843
810 <-> 1279
811 <-> 294, 1043, 1560, 1583, 1600
812 <-> 1487, 1527
813 <-> 42, 1405
814 <-> 242, 644, 1175, 1638
815 <-> 1050, 1177
816 <-> 218, 635, 1427
817 <-> 416
818 <-> 1765, 1999
819 <-> 141, 533
820 <-> 1238, 1393
821 <-> 504, 1755
822 <-> 1320, 1397
823 <-> 681, 1120, 1798
824 <-> 639
825 <-> 659
826 <-> 1722, 1834
827 <-> 193, 602, 968
828 <-> 233, 1835
829 <-> 465
830 <-> 951
831 <-> 1606
832 <-> 1619, 1964
833 <-> 1109
834 <-> 7, 962, 1869
835 <-> 141
836 <-> 167, 875, 1145
837 <-> 1752
838 <-> 838, 1146
839 <-> 1247
840 <-> 800
841 <-> 1337
842 <-> 1438, 1466
843 <-> 102
844 <-> 284
845 <-> 742
846 <-> 382, 574
847 <-> 79, 398, 409
848 <-> 959
849 <-> 9, 704
850 <-> 915, 1455, 1911, 1987
851 <-> 531, 1001
852 <-> 434, 1172
853 <-> 310, 1533
854 <-> 650
855 <-> 483, 868, 1598
856 <-> 222, 534, 1133
857 <-> 857, 1249, 1923
858 <-> 412, 1540, 1575, 1607
859 <-> 804, 1655
860 <-> 564, 1243
861 <-> 296, 350, 1130, 1521
862 <-> 694
863 <-> 272, 391, 1558
864 <-> 309, 1071, 1227
865 <-> 1537, 1669, 1825
866 <-> 99, 474
867 <-> 809, 867, 1004
868 <-> 855, 1539
869 <-> 1550
870 <-> 1885
871 <-> 49
872 <-> 326, 378, 1552
873 <-> 1307
874 <-> 62, 438
875 <-> 836, 1056, 1326
876 <-> 876
877 <-> 1933
878 <-> 52, 128, 1527
879 <-> 879
880 <-> 1292, 1561, 1770
881 <-> 881, 981
882 <-> 790, 882, 932
883 <-> 1322, 1963
884 <-> 1842
885 <-> 885
886 <-> 33, 80, 1765, 1959
887 <-> 1012
888 <-> 276
889 <-> 1391
890 <-> 140
891 <-> 114, 891
892 <-> 160, 507
893 <-> 236, 502, 1602
894 <-> 1525
895 <-> 41
896 <-> 382
897 <-> 700
898 <-> 299
899 <-> 1797
900 <-> 1736
901 <-> 671, 944, 1147
902 <-> 1597, 1940
903 <-> 1283
904 <-> 17, 91, 557, 1169, 1764
905 <-> 505
906 <-> 9, 69, 942
907 <-> 80, 211, 1348
908 <-> 1398
909 <-> 909
910 <-> 1683
911 <-> 73, 911
912 <-> 1929
913 <-> 12, 491, 1591
914 <-> 169, 243, 625, 1867
915 <-> 850, 1538
916 <-> 83
917 <-> 378
918 <-> 1438
919 <-> 1951
920 <-> 1814
921 <-> 360, 682, 1952
922 <-> 922
923 <-> 107, 1161, 1254
924 <-> 222
925 <-> 1691
926 <-> 575
927 <-> 1165, 1270
928 <-> 368, 766
929 <-> 1707, 1914
930 <-> 145, 1096, 1434, 1791
931 <-> 931, 1983
932 <-> 882
933 <-> 502, 1921
934 <-> 1297
935 <-> 647, 1319
936 <-> 1255
937 <-> 1210
938 <-> 11
939 <-> 1348, 1666
940 <-> 1408
941 <-> 1440
942 <-> 906
943 <-> 1977
944 <-> 901
945 <-> 126
946 <-> 792
947 <-> 44, 1400
948 <-> 948, 1045
949 <-> 967
950 <-> 355
951 <-> 68, 830, 969
952 <-> 1225, 1757, 1929
953 <-> 1534, 1726
954 <-> 1511, 1888
955 <-> 183, 1418
956 <-> 1702
957 <-> 425
958 <-> 372
959 <-> 848, 1512
960 <-> 1868
961 <-> 1509
962 <-> 834, 1678
963 <-> 160
964 <-> 101, 161
965 <-> 355
966 <-> 1740, 1866
967 <-> 949, 1802
968 <-> 827, 1534
969 <-> 629, 646, 951
970 <-> 311
971 <-> 35, 1670
972 <-> 643, 674, 1449
973 <-> 358
974 <-> 974
975 <-> 729, 1955
976 <-> 1495
977 <-> 1603, 1889
978 <-> 337, 465, 657, 1615, 1953
979 <-> 1801
980 <-> 115, 612, 1239
981 <-> 881
982 <-> 2, 234, 1411, 1511
983 <-> 1970
984 <-> 227, 984
985 <-> 191, 569, 738
986 <-> 1926
987 <-> 987
988 <-> 126, 237, 1894
989 <-> 666, 687, 1079
990 <-> 301, 452, 1903
991 <-> 481, 1435
992 <-> 110, 779, 1637
993 <-> 21, 289, 697, 1675
994 <-> 1151, 1639
995 <-> 1090, 1798
996 <-> 652, 759, 1229
997 <-> 1253, 1380, 1553
998 <-> 350, 1812
999 <-> 1128
1000 <-> 1566
1001 <-> 851
1002 <-> 103, 1229
1003 <-> 604, 1156, 1232, 1420
1004 <-> 23, 867
1005 <-> 1085, 1174, 1899
1006 <-> 797
1007 <-> 63, 1282
1008 <-> 219, 1008, 1977
1009 <-> 265, 384, 1731
1010 <-> 275, 1438, 1474
1011 <-> 1289
1012 <-> 166, 235, 887, 1342, 1471
1013 <-> 1013, 1886
1014 <-> 664, 692, 1229
1015 <-> 632, 1015
1016 <-> 579
1017 <-> 161, 528
1018 <-> 323
1019 <-> 1684
1020 <-> 125
1021 <-> 1036, 1450
1022 <-> 699, 1600, 1962
1023 <-> 263, 726
1024 <-> 1295
1025 <-> 154, 1025
1026 <-> 268, 572, 1610
1027 <-> 239, 1269
1028 <-> 291, 1275
1029 <-> 418, 479, 1957
1030 <-> 1184
1031 <-> 618, 703
1032 <-> 345
1033 <-> 61, 339, 1033
1034 <-> 1166, 1291
1035 <-> 31, 41
1036 <-> 1021, 1228
1037 <-> 28, 443, 1227
1038 <-> 1178
1039 <-> 94, 1578
1040 <-> 320, 1992
1041 <-> 1041
1042 <-> 32, 1486
1043 <-> 720, 811
1044 <-> 157, 590, 696, 758, 1433, 1739
1045 <-> 948
1046 <-> 559, 1241
1047 <-> 199, 1962
1048 <-> 370
1049 <-> 276, 1885
1050 <-> 785, 815
1051 <-> 1051, 1290
1052 <-> 1165
1053 <-> 193, 1446, 1488
1054 <-> 1081
1055 <-> 6
1056 <-> 875
1057 <-> 128, 1137
1058 <-> 1112, 1173
1059 <-> 1226, 1538
1060 <-> 786
1061 <-> 375, 1639, 1988
1062 <-> 1748
1063 <-> 210, 1692
1064 <-> 444
1065 <-> 316, 600, 1689
1066 <-> 1709
1067 <-> 1067
1068 <-> 1068
1069 <-> 350
1070 <-> 1196
1071 <-> 365, 864, 1827
1072 <-> 446, 1142
1073 <-> 1931
1074 <-> 1529
1075 <-> 1075
1076 <-> 4, 1717, 1879, 1969
1077 <-> 338
1078 <-> 509, 590
1079 <-> 989, 1282
1080 <-> 139, 286
1081 <-> 1054, 1992
1082 <-> 1115, 1451, 1704
1083 <-> 603, 1271
1084 <-> 568, 1233
1085 <-> 700, 1005, 1939
1086 <-> 132, 1745, 1901
1087 <-> 1519
1088 <-> 412
1089 <-> 755
1090 <-> 544, 548, 995, 1768
1091 <-> 227, 533, 668, 1141
1092 <-> 95
1093 <-> 1271, 1946
1094 <-> 710, 1102
1095 <-> 1546
1096 <-> 930
1097 <-> 1288
1098 <-> 162, 1933
1099 <-> 1456
1100 <-> 608, 766
1101 <-> 34, 58, 1108
1102 <-> 1094, 1938
1103 <-> 223, 1117
1104 <-> 1457, 1605, 1654
1105 <-> 1105
1106 <-> 92, 747
1107 <-> 1699
1108 <-> 1101, 1201
1109 <-> 354, 833, 1285, 1874
1110 <-> 40, 716
1111 <-> 190, 572, 1440
1112 <-> 1058, 1193
1113 <-> 1113
1114 <-> 325, 630, 1853
1115 <-> 260, 1082
1116 <-> 504
1117 <-> 380, 1103
1118 <-> 1118
1119 <-> 1353, 1871
1120 <-> 823
1121 <-> 492, 1196
1122 <-> 1122
1123 <-> 1725
1124 <-> 1892
1125 <-> 1344
1126 <-> 620
1127 <-> 286, 1138
1128 <-> 999, 1268
1129 <-> 1129
1130 <-> 861
1131 <-> 1874
1132 <-> 1913
1133 <-> 856
1134 <-> 1185, 1767
1135 <-> 451, 1975
1136 <-> 65, 356, 1487
1137 <-> 192, 1057
1138 <-> 1127, 1782
1139 <-> 1240
1140 <-> 64, 390, 1385
1141 <-> 1091
1142 <-> 1072, 1587
1143 <-> 155, 1143
1144 <-> 265
1145 <-> 836, 1401
1146 <-> 838
1147 <-> 901, 1483
1148 <-> 94, 493, 645, 1167
1149 <-> 1818
1150 <-> 620, 1237, 1264
1151 <-> 994, 1844
1152 <-> 299, 1167
1153 <-> 443, 1947
1154 <-> 1803
1155 <-> 489, 1163
1156 <-> 1003, 1635, 1668
1157 <-> 1340, 1809
1158 <-> 231
1159 <-> 57
1160 <-> 1558
1161 <-> 923
1162 <-> 1590
1163 <-> 1155
1164 <-> 145, 1164, 1283
1165 <-> 927, 1052, 1678, 1934
1166 <-> 1034
1167 <-> 240, 1148, 1152, 1462
1168 <-> 784
1169 <-> 595, 904
1170 <-> 421
1171 <-> 1667
1172 <-> 852, 1195, 1323, 1444
1173 <-> 1058, 1389
1174 <-> 1005
1175 <-> 814
1176 <-> 798
1177 <-> 258, 815, 1401
1178 <-> 687, 1038, 1331
1179 <-> 134, 1179
1180 <-> 420
1181 <-> 1181
1182 <-> 267, 1677
1183 <-> 100
1184 <-> 669, 1030, 1969
1185 <-> 498, 1134, 1673, 1750
1186 <-> 165
1187 <-> 1893
1188 <-> 1236, 1365
1189 <-> 1334, 1732
1190 <-> 279
1191 <-> 1620
1192 <-> 1257
1193 <-> 1112
1194 <-> 1770
1195 <-> 187, 1172, 1964
1196 <-> 641, 1070, 1121, 1729
1197 <-> 511, 1273, 1607
1198 <-> 229, 774
1199 <-> 290, 455, 1860
1200 <-> 1901
1201 <-> 1108
1202 <-> 1378
1203 <-> 1591
1204 <-> 229
1205 <-> 645, 796, 1250
1206 <-> 281, 1824
1207 <-> 782
1208 <-> 546, 795, 1700
1209 <-> 249
1210 <-> 750, 787, 937
1211 <-> 527, 1981
1212 <-> 1212, 1369
1213 <-> 1512
1214 <-> 737
1215 <-> 575
1216 <-> 540, 1216
1217 <-> 1312, 1340
1218 <-> 291, 1586
1219 <-> 583, 1554
1220 <-> 117, 767
1221 <-> 411, 620, 1221
1222 <-> 1612, 1710
1223 <-> 1223, 1374
1224 <-> 331
1225 <-> 315, 952, 1263
1226 <-> 1059, 1928
1227 <-> 864, 1037, 1823
1228 <-> 1036, 1613
1229 <-> 589, 996, 1002, 1014, 1906
1230 <-> 247, 468, 772, 1821, 1837
1231 <-> 195, 220, 725
1232 <-> 271, 542, 660, 1003, 1232, 1606
1233 <-> 1084, 1366, 1738
1234 <-> 543, 1408
1235 <-> 524
1236 <-> 183, 1188
1237 <-> 1150
1238 <-> 820, 1521
1239 <-> 980
1240 <-> 1139, 1240
1241 <-> 597, 1046
1242 <-> 1646
1243 <-> 331, 741, 860
1244 <-> 1522, 1870
1245 <-> 1245
1246 <-> 801
1247 <-> 665, 839
1248 <-> 208, 1932
1249 <-> 857
1250 <-> 1205
1251 <-> 711
1252 <-> 1888
1253 <-> 997, 1593
1254 <-> 235, 520, 923, 1382
1255 <-> 936
1256 <-> 1718
1257 <-> 259, 1192
1258 <-> 659, 1917
1259 <-> 392
1260 <-> 1260
1261 <-> 1261, 1376
1262 <-> 1936
1263 <-> 1225
1264 <-> 1150, 1567
1265 <-> 398
1266 <-> 773, 1373
1267 <-> 257, 341, 525
1268 <-> 202, 262, 1128
1269 <-> 1027
1270 <-> 927
1271 <-> 1083, 1093
1272 <-> 781
1273 <-> 1197
1274 <-> 1760
1275 <-> 1028, 1827
1276 <-> 707, 1900
1277 <-> 188
1278 <-> 1463
1279 <-> 758, 810
1280 <-> 1920
1281 <-> 1942
1282 <-> 53, 1007, 1079
1283 <-> 192, 903, 1164, 1690
1284 <-> 512, 1584
1285 <-> 1109, 1285
1286 <-> 272
1287 <-> 160
1288 <-> 15, 1097, 1905
1289 <-> 591, 606, 1011
1290 <-> 1051
1291 <-> 331, 1034
1292 <-> 470, 880
1293 <-> 1501, 1899
1294 <-> 746, 1294
1295 <-> 183, 1024
1296 <-> 1580
1297 <-> 711, 752, 934
1298 <-> 1298
1299 <-> 517, 1299
1300 <-> 1300
1301 <-> 708, 1301
1302 <-> 645
1303 <-> 1355, 1492
1304 <-> 1361, 1746
1305 <-> 773
1306 <-> 334, 1325
1307 <-> 769, 776, 873, 1333
1308 <-> 312, 1851, 1966
1309 <-> 607, 1459, 1496
1310 <-> 759
1311 <-> 1381, 1520
1312 <-> 1217
1313 <-> 1983
1314 <-> 1314
1315 <-> 1315, 1647
1316 <-> 63
1317 <-> 537
1318 <-> 1973
1319 <-> 935, 1517
1320 <-> 531, 822
1321 <-> 27, 1837
1322 <-> 883, 1664
1323 <-> 1172
1324 <-> 730
1325 <-> 1306
1326 <-> 633, 875
1327 <-> 159, 1553
1328 <-> 1974
1329 <-> 1939
1330 <-> 277, 1515
1331 <-> 1178, 1590
1332 <-> 274, 1332
1333 <-> 8, 761, 1307, 1333
1334 <-> 275, 1189, 1482
1335 <-> 1478
1336 <-> 140
1337 <-> 66, 611, 768, 841
1338 <-> 176, 685, 688, 1449
1339 <-> 1339
1340 <-> 301, 1157, 1217, 1630
1341 <-> 27
1342 <-> 1012
1343 <-> 1408
1344 <-> 452, 1125, 1622
1345 <-> 74, 1835
1346 <-> 1860
1347 <-> 634, 1428
1348 <-> 907, 939
1349 <-> 490, 1349
1350 <-> 305, 612, 757
1351 <-> 162
1352 <-> 797, 1818
1353 <-> 1119, 1353
1354 <-> 1436
1355 <-> 1303
1356 <-> 94, 254
1357 <-> 1419, 1664, 1680
1358 <-> 1358
1359 <-> 197
1360 <-> 722, 1909
1361 <-> 1304
1362 <-> 82, 188, 1448
1363 <-> 1752
1364 <-> 501
1365 <-> 1188, 1661
1366 <-> 584, 1233
1367 <-> 623, 1394, 1781
1368 <-> 1886
1369 <-> 1212
1370 <-> 86, 1370
1371 <-> 1772
1372 <-> 191, 1473
1373 <-> 1266
1374 <-> 1223, 1981
1375 <-> 366, 1375
1376 <-> 1261, 1599
1377 <-> 1675
1378 <-> 30, 1202, 1406, 1845
1379 <-> 153, 628, 1557
1380 <-> 180, 997
1381 <-> 1311, 1407, 1666
1382 <-> 1254
1383 <-> 375, 1714
1384 <-> 392
1385 <-> 1140, 1933
1386 <-> 1949
1387 <-> 439, 1387
1388 <-> 1770
1389 <-> 1173, 1679
1390 <-> 123, 453, 1733
1391 <-> 158, 249, 889, 1945
1392 <-> 1881
1393 <-> 820
1394 <-> 18, 181, 355, 1367
1395 <-> 374, 1404
1396 <-> 515, 1860
1397 <-> 200, 822
1398 <-> 472, 908, 1622, 1701
1399 <-> 699
1400 <-> 422, 947, 1551
1401 <-> 1145, 1177
1402 <-> 1764
1403 <-> 1875
1404 <-> 1395
1405 <-> 661, 813
1406 <-> 780, 1378
1407 <-> 1381
1408 <-> 588, 940, 1234, 1343, 1603, 1865
1409 <-> 1427
1410 <-> 164
1411 <-> 88, 982
1412 <-> 1452
1413 <-> 1707, 1766
1414 <-> 121
1415 <-> 318, 1415, 1612
1416 <-> 1416
1417 <-> 232
1418 <-> 361, 955, 1418, 1737
1419 <-> 473, 1357
1420 <-> 1003
1421 <-> 122, 1973
1422 <-> 512, 1870
1423 <-> 248
1424 <-> 648
1425 <-> 1425
1426 <-> 224, 1946
1427 <-> 796, 816, 1409
1428 <-> 1347
1429 <-> 1810, 1862
1430 <-> 1430
1431 <-> 788, 1488
1432 <-> 259, 1432
1433 <-> 1, 501, 748, 1044
1434 <-> 930
1435 <-> 991
1436 <-> 1354, 1436
1437 <-> 253
1438 <-> 522, 558, 842, 918, 1010
1439 <-> 1649
1440 <-> 735, 941, 1111
1441 <-> 1707
1442 <-> 305, 1930
1443 <-> 357
1444 <-> 1172
1445 <-> 162, 270, 1636
1446 <-> 1053
1447 <-> 220, 292, 805
1448 <-> 1362
1449 <-> 740, 972, 1338
1450 <-> 100, 237, 1021
1451 <-> 5, 1082
1452 <-> 1412, 1572
1453 <-> 556
1454 <-> 1454
1455 <-> 850
1456 <-> 125, 268, 1099
1457 <-> 240, 1104
1458 <-> 18, 1576
1459 <-> 1309, 1503
1460 <-> 84, 371
1461 <-> 1747, 1879
1462 <-> 3, 1167, 1807
1463 <-> 377, 1278, 1499, 1971
1464 <-> 1908
1465 <-> 72
1466 <-> 724, 842
1467 <-> 410, 739
1468 <-> 67
1469 <-> 155, 1652
1470 <-> 268, 469, 486
1471 <-> 800, 1012, 1471, 1510
1472 <-> 39
1473 <-> 1372
1474 <-> 1010, 1915
1475 <-> 467, 1658
1476 <-> 1476
1477 <-> 627, 1477
1478 <-> 427, 1335, 1907
1479 <-> 348
1480 <-> 1480
1481 <-> 1802
1482 <-> 1334
1483 <-> 1147, 1524
1484 <-> 42, 525
1485 <-> 539
1486 <-> 148, 1042, 1549
1487 <-> 812, 1136
1488 <-> 1053, 1431
1489 <-> 1708, 1931
1490 <-> 1807
1491 <-> 431
1492 <-> 156, 1303
1493 <-> 1493
1494 <-> 1853
1495 <-> 446, 976
1496 <-> 395, 1309
1497 <-> 195, 396, 1974
1498 <-> 490, 1626
1499 <-> 76, 1463
1500 <-> 1722
1501 <-> 577, 1293
1502 <-> 115
1503 <-> 1459, 1507
1504 <-> 210, 261, 578, 1521, 1718
1505 <-> 230, 426, 684, 1634
1506 <-> 382, 1921
1507 <-> 1503
1508 <-> 162, 1667
1509 <-> 961, 1509
1510 <-> 1471
1511 <-> 954, 982, 1582
1512 <-> 476, 959, 1213, 1703
1513 <-> 353, 620
1514 <-> 617, 1546
1515 <-> 1330, 1595
1516 <-> 1946
1517 <-> 42, 1319
1518 <-> 585
1519 <-> 32, 1087
1520 <-> 1311
1521 <-> 861, 1238, 1504
1522 <-> 1244, 1653
1523 <-> 1523
1524 <-> 1483
1525 <-> 894, 1525
1526 <-> 1924
1527 <-> 812, 878
1528 <-> 494
1529 <-> 59, 1074
1530 <-> 1530
1531 <-> 34, 1531
1532 <-> 1638
1533 <-> 853
1534 <-> 953, 968
1535 <-> 108, 689
1536 <-> 1589
1537 <-> 394, 865
1538 <-> 915, 1059
1539 <-> 868
1540 <-> 858, 1745
1541 <-> 221
1542 <-> 639
1543 <-> 1746
1544 <-> 783, 1544
1545 <-> 236
1546 <-> 66, 1095, 1514
1547 <-> 1628
1548 <-> 1548
1549 <-> 433, 1486
1550 <-> 869, 1550
1551 <-> 1400, 1787
1552 <-> 695, 872
1553 <-> 997, 1327
1554 <-> 1219
1555 <-> 97
1556 <-> 1840
1557 <-> 7, 1379
1558 <-> 126, 863, 1160
1559 <-> 336, 373
1560 <-> 343, 811
1561 <-> 278, 794, 880, 1561
1562 <-> 127, 518, 1562
1563 <-> 406
1564 <-> 81, 399
1565 <-> 748
1566 <-> 637, 1000
1567 <-> 1264
1568 <-> 1568
1569 <-> 214
1570 <-> 561, 1849
1571 <-> 282
1572 <-> 44, 130, 178, 1452
1573 <-> 107
1574 <-> 299
1575 <-> 647, 858
1576 <-> 1458, 1633
1577 <-> 1833, 1939
1578 <-> 1039, 1802
1579 <-> 807, 1853
1580 <-> 1296, 1580, 1907
1581 <-> 675
1582 <-> 1511, 1605, 1756
1583 <-> 811
1584 <-> 1284
1585 <-> 1817
1586 <-> 168, 650, 1218
1587 <-> 784, 1142
1588 <-> 742
1589 <-> 45, 209, 413, 1536
1590 <-> 25, 201, 1162, 1331
1591 <-> 913, 1203
1592 <-> 1820
1593 <-> 1253
1594 <-> 231
1595 <-> 149, 1515
1596 <-> 57, 1976
1597 <-> 586, 902
1598 <-> 855
1599 <-> 1376
1600 <-> 811, 1022
1601 <-> 284, 746
1602 <-> 386, 893
1603 <-> 135, 977, 1408
1604 <-> 452, 513
1605 <-> 1104, 1582
1606 <-> 831, 1232
1607 <-> 709, 715, 858, 1197
1608 <-> 1793
1609 <-> 611, 1808
1610 <-> 1026, 1964
1611 <-> 304
1612 <-> 1222, 1415, 1769
1613 <-> 1228, 1847
1614 <-> 273
1615 <-> 978
1616 <-> 156, 355
1617 <-> 177
1618 <-> 1618
1619 <-> 323, 642, 832
1620 <-> 113, 349, 1191, 1746
1621 <-> 609
1622 <-> 519, 1344, 1398
1623 <-> 614
1624 <-> 771, 1989
1625 <-> 1625
1626 <-> 1498
1627 <-> 186, 315
1628 <-> 633, 1547
1629 <-> 1706
1630 <-> 1340
1631 <-> 297, 1800
1632 <-> 1806
1633 <-> 1576
1634 <-> 1505
1635 <-> 1156
1636 <-> 1445
1637 <-> 76, 992, 1920, 1995
1638 <-> 814, 1532
1639 <-> 994, 1061
1640 <-> 1640
1641 <-> 721
1642 <-> 1739, 1945
1643 <-> 1643
1644 <-> 1644, 1908
1645 <-> 125, 303
1646 <-> 1242, 1646
1647 <-> 1315
1648 <-> 1957
1649 <-> 97, 1439, 1783
1650 <-> 576
1651 <-> 1651
1652 <-> 35, 1469
1653 <-> 1522
1654 <-> 1104
1655 <-> 460, 859
1656 <-> 362
1657 <-> 142, 181
1658 <-> 428, 1475
1659 <-> 470
1660 <-> 247
1661 <-> 1365
1662 <-> 165, 359
1663 <-> 198
1664 <-> 1322, 1357
1665 <-> 447, 632
1666 <-> 939, 1381
1667 <-> 1171, 1508
1668 <-> 638, 1156
1669 <-> 476, 865, 1699
1670 <-> 577, 971
1671 <-> 119, 417, 762, 1804
1672 <-> 50, 1672, 1687
1673 <-> 63, 333, 1185
1674 <-> 1674
1675 <-> 993, 1377
1676 <-> 742, 1813
1677 <-> 233, 1182, 1846
1678 <-> 962, 1165
1679 <-> 722, 1389
1680 <-> 82, 1357
1681 <-> 1681, 1702, 1895
1682 <-> 372
1683 <-> 203, 341, 910
1684 <-> 1019, 1948
1685 <-> 1982
1686 <-> 371
1687 <-> 1672
1688 <-> 791
1689 <-> 1065, 1689
1690 <-> 1283
1691 <-> 925, 1878
1692 <-> 803, 1063, 1732
1693 <-> 487
1694 <-> 600
1695 <-> 1695, 1794
1696 <-> 1696
1697 <-> 1802
1698 <-> 357, 732
1699 <-> 1107, 1669
1700 <-> 1208
1701 <-> 1398
1702 <-> 956, 1681
1703 <-> 605, 1512
1704 <-> 1082
1705 <-> 343
1706 <-> 1629, 1775
1707 <-> 770, 929, 1413, 1441
1708 <-> 367, 1489
1709 <-> 1066, 1862
1710 <-> 1222
1711 <-> 650
1712 <-> 620
1713 <-> 1713
1714 <-> 1383
1715 <-> 1911
1716 <-> 510, 1716
1717 <-> 1076
1718 <-> 1256, 1504
1719 <-> 238
1720 <-> 549, 634, 1720
1721 <-> 15
1722 <-> 826, 1500
1723 <-> 1880
1724 <-> 177, 1724
1725 <-> 514, 1123, 1797
1726 <-> 482, 953
1727 <-> 1914
1728 <-> 216, 1982
1729 <-> 579, 783, 1196, 1800
1730 <-> 1730, 1972
1731 <-> 1009
1732 <-> 89, 1189, 1692
1733 <-> 1390
1734 <-> 809
1735 <-> 455, 695
1736 <-> 900, 1736
1737 <-> 530, 1418
1738 <-> 1233, 1888
1739 <-> 1044, 1642, 1834
1740 <-> 966
1741 <-> 145, 253
1742 <-> 112
1743 <-> 1980
1744 <-> 139
1745 <-> 1086, 1540
1746 <-> 1304, 1543, 1620
1747 <-> 117, 354, 1461
1748 <-> 45, 273, 332, 1062
1749 <-> 249
1750 <-> 124, 1185
1751 <-> 1835
1752 <-> 104, 837, 1363
1753 <-> 245, 775
1754 <-> 798, 1876
1755 <-> 453, 718, 821
1756 <-> 1582
1757 <-> 952, 1772, 1841
1758 <-> 1758, 1830, 1878
1759 <-> 729
1760 <-> 104, 1274
1761 <-> 224, 619, 622, 763, 1868
1762 <-> 1762
1763 <-> 537
1764 <-> 904, 1402
1765 <-> 521, 818, 886, 1782
1766 <-> 421, 1413
1767 <-> 1134
1768 <-> 202, 1090
1769 <-> 1612
1770 <-> 621, 880, 1194, 1388
1771 <-> 293
1772 <-> 1371, 1757
1773 <-> 19, 375
1774 <-> 1774
1775 <-> 1706, 1915
1776 <-> 778
1777 <-> 460, 1918
1778 <-> 666
1779 <-> 523, 1846
1780 <-> 427
1781 <-> 1367
1782 <-> 701, 771, 1138, 1765
1783 <-> 482, 1649, 1783
1784 <-> 1784, 1872
1785 <-> 777, 1785
1786 <-> 1858
1787 <-> 1551
1788 <-> 59, 384, 1865
1789 <-> 111
1790 <-> 294, 407, 1969
1791 <-> 238, 930
1792 <-> 659
1793 <-> 489, 538, 697, 1608
1794 <-> 206, 649, 1695
1795 <-> 314, 748
1796 <-> 1796
1797 <-> 899, 1725, 1797
1798 <-> 823, 995
1799 <-> 308, 1799
1800 <-> 675, 683, 1631, 1729
1801 <-> 697, 979, 1858
1802 <-> 967, 1481, 1578, 1697
1803 <-> 1154, 1803
1804 <-> 1671
1805 <-> 199
1806 <-> 264, 1632, 1806
1807 <-> 1462, 1490
1808 <-> 1609, 1808
1809 <-> 1157
1810 <-> 1429
1811 <-> 125
1812 <-> 998
1813 <-> 1676
1814 <-> 358, 485, 920, 1814
1815 <-> 211
1816 <-> 632
1817 <-> 513, 1585
1818 <-> 1149, 1352
1819 <-> 632, 717
1820 <-> 465, 1592
1821 <-> 46, 257, 1230
1822 <-> 492
1823 <-> 1227, 1891
1824 <-> 247, 1206
1825 <-> 182, 865
1826 <-> 501
1827 <-> 3, 1071, 1275
1828 <-> 29
1829 <-> 139
1830 <-> 1758
1831 <-> 542
1832 <-> 1862
1833 <-> 1577
1834 <-> 151, 826, 1739, 1882
1835 <-> 828, 1345, 1751, 1835
1836 <-> 45, 677
1837 <-> 1230, 1321
1838 <-> 165, 1856
1839 <-> 1842, 1953
1840 <-> 183, 1556
1841 <-> 554, 1757
1842 <-> 884, 1839
1843 <-> 464, 809
1844 <-> 291, 570, 1151
1845 <-> 1378
1846 <-> 1677, 1779
1847 <-> 374, 1613
1848 <-> 204, 412
1849 <-> 626, 1570
1850 <-> 1850
1851 <-> 1308
1852 <-> 228, 455
1853 <-> 454, 1114, 1494, 1579
1854 <-> 268, 596
1855 <-> 1855
1856 <-> 1838
1857 <-> 61
1858 <-> 336, 1786, 1801, 1937
1859 <-> 1908
1860 <-> 1199, 1346, 1396
1861 <-> 1861
1862 <-> 1429, 1709, 1832, 1900
1863 <-> 9
1864 <-> 41, 1975
1865 <-> 673, 1408, 1788
1866 <-> 966, 1873
1867 <-> 914
1868 <-> 330, 520, 960, 1761
1869 <-> 2, 834
1870 <-> 1244, 1422
1871 <-> 1119
1872 <-> 1784
1873 <-> 242, 1866
1874 <-> 337, 1109, 1131
1875 <-> 795, 1403
1876 <-> 258, 1754
1877 <-> 34
1878 <-> 481, 1691, 1758
1879 <-> 1076, 1461
1880 <-> 147, 410, 1723
1881 <-> 520, 764, 1392, 1955
1882 <-> 1834
1883 <-> 319, 514
1884 <-> 1969
1885 <-> 740, 870, 1049
1886 <-> 1013, 1368
1887 <-> 1887
1888 <-> 954, 1252, 1738
1889 <-> 977
1890 <-> 446, 530
1891 <-> 1823
1892 <-> 1124, 1892
1893 <-> 395, 1187, 1893
1894 <-> 988
1895 <-> 733, 1681
1896 <-> 11
1897 <-> 77, 801
1898 <-> 545, 1898
1899 <-> 1005, 1293
1900 <-> 511, 1276, 1862
1901 <-> 1086, 1200
1902 <-> 410
1903 <-> 315, 990
1904 <-> 422
1905 <-> 1288, 1905
1906 <-> 1229
1907 <-> 1478, 1580
1908 <-> 1464, 1644, 1859
1909 <-> 706, 1360
1910 <-> 569
1911 <-> 310, 850, 1715
1912 <-> 1912
1913 <-> 279, 1132
1914 <-> 614, 929, 1727
1915 <-> 1474, 1775
1916 <-> 1916
1917 <-> 1258
1918 <-> 382, 1777
1919 <-> 41, 653
1920 <-> 1280, 1637
1921 <-> 933, 1506
1922 <-> 167
1923 <-> 857
1924 <-> 222, 1526, 1924
1925 <-> 231, 367, 1925
1926 <-> 385, 422, 986
1927 <-> 321, 513, 553
1928 <-> 728, 1226
1929 <-> 912, 952, 1965
1930 <-> 1442
1931 <-> 1073, 1489
1932 <-> 1248, 1932
1933 <-> 499, 877, 1098, 1385
1934 <-> 1165
1935 <-> 37, 631
1936 <-> 283, 757, 1262
1937 <-> 1858
1938 <-> 109, 555, 1102
1939 <-> 1085, 1329, 1577
1940 <-> 902, 1940
1941 <-> 364, 583
1942 <-> 719, 1281
1943 <-> 609, 760
1944 <-> 230
1945 <-> 1391, 1642
1946 <-> 1093, 1426, 1516
1947 <-> 1153
1948 <-> 212, 296, 500, 1684
1949 <-> 152, 737, 1386
1950 <-> 133, 296
1951 <-> 919, 1951
1952 <-> 921
1953 <-> 978, 1839
1954 <-> 657
1955 <-> 975, 1881
1956 <-> 55, 71, 235, 742
1957 <-> 1029, 1648
1958 <-> 1958
1959 <-> 886
1960 <-> 196, 301, 495
1961 <-> 674
1962 <-> 576, 1022, 1047
1963 <-> 883
1964 <-> 832, 1195, 1610
1965 <-> 1929
1966 <-> 745, 1308
1967 <-> 751
1968 <-> 524, 1968
1969 <-> 1076, 1184, 1790, 1884
1970 <-> 983, 1970
1971 <-> 1463
1972 <-> 1730
1973 <-> 457, 1318, 1421
1974 <-> 1328, 1497, 1974
1975 <-> 170, 1135, 1864
1976 <-> 1596
1977 <-> 70, 943, 1008
1978 <-> 804
1979 <-> 631
1980 <-> 522, 742, 1743
1981 <-> 1211, 1374
1982 <-> 597, 1685, 1728
1983 <-> 30, 931, 1313
1984 <-> 109, 720
1985 <-> 111
1986 <-> 767
1987 <-> 418, 701, 850
1988 <-> 1061
1989 <-> 1624
1990 <-> 744
1991 <-> 316
1992 <-> 346, 562, 1040, 1081
1993 <-> 685
1994 <-> 573
1995 <-> 381, 676, 1637, 1995
1996 <-> 576, 652
1997 <-> 554
1998 <-> 168
1999 <-> 818")

(def day-13-example "0: 3
1: 2
4: 4
6: 4")

(def day-13-input "0: 5
1: 2
2: 3
4: 4
6: 6
8: 4
10: 8
12: 6
14: 6
16: 14
18: 6
20: 8
22: 8
24: 10
26: 8
28: 8
30: 10
32: 8
34: 12
36: 9
38: 20
40: 12
42: 12
44: 12
46: 12
48: 12
50: 12
52: 12
54: 12
56: 14
58: 14
60: 14
62: 20
64: 14
66: 14
70: 14
72: 14
74: 14
76: 14
78: 14
80: 12
90: 30
92: 17
94: 18")
