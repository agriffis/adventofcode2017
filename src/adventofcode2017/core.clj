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

(defn spiral-offset
  "Return offset (diagonal jog) for the given value."
  ([value]
   (apply spiral-offset value (spiral-ring value)))
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
         offset (spiral-offset input ring base)]
     (+ ring offset)))
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

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
