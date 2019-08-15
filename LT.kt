import java.io.*
import java.util.HashMap

object LT {
    var x: String? = null
    var res =""
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        val dataIn = BufferedReader(InputStreamReader(System.`in`))

        val a: Int
        val b: String
        println("")
        println("From English to አማርኛ /ትግርኛ, press 1.")
        println("From አማርኛ /ትግርኛ to English , press 2.")
        b = dataIn.readLine()
        a = Integer.parseInt(b)
        if (a == 1) {
            println("Please Enter English characters to translate.")

            val x = dataIn.readLine().toLowerCase()
            //val y = x.length
            val z = x.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            println("The translated characters from English to  አማርኛ /ትግርኛ is:")


            val lan = object : HashMap<String, String>() {

                //private val serialVersionUID = 1L

                init {
                    put("he", "ሀ");put("hu", "ሁ");put("hi", "ሂ");put("ha", "ሃ");put("hie", "ሄ");put("h", "ህ");put("ho", "ሆ")
                    put("le", "ለ");put("lu", "ሉ");put("li", "ሊ");put("la", "ላ");put("lie", "ሌ");put("l", "ል");put("lo", "ሎ")
                    put("h.e", "ሐ");put("h.u", "ሑ");put("h.i", "ሒ");put("h.a", "ሓ");put("h.ie", "ሔ");put("h.", "ሕ");put("h.o", "ሖ")
                    put("me", "መ");put("mu", "ሙ");put("mi", "ሚ");put("ma", "ማ");put("mie", "ሜ");put("m", "ም");put("mo", "ሞ")
                    put("še", "ሠ");put("šu", "ሡ");put("ši", "ሢ");put("ša", "ሣ");put("šie", "ሤ");put("š", "ሥ");put("šo", "ሦ")
                    put("re", "ረ");put("ru", "ሩ");put("ri", "ሪ");put("ra", "ራ");put("rie", "ሬ");put("r", "ር") ;put("ro", "ሮ")
                    put("se", "ሰ");put("su", "ሱ");put("si", "ሲ");put("sa", "ሳ");put("sie", "ሴ");put("s", "ስ");put("so", "ሶ")
                    put("she", "ሸ");put("shu", "ሹ");put("shi", "ሺ");put("sha", "ሻ");put("shie", "ሼ");put("sh", "ሽ");put("sho", "ሾ")
                    put("qe", "ቀ");put("qu", "ቁ");put("qi", "ቂ");put("qa", "ቃ");put("qie", "ቄ");put("q", "ቅ");put("qo", "ቆ")
                    put("be", "በ");put("bu", "ቡ");put("bi", "ቢ");put("ba", "ባ");put("bie", "ቤ");put("b", "ብ");put("bo", "ቦ")
                    put("ve", "ቨ");put("vu", "ቩ");put("vi", "ቪ");put("va", "ቫ");put("vie", "ቬ");put("v", "ቭ");put("vo", "ቮ")
                    put("te", "ተ");put("tu", "ቱ");put("ti", "ቲ");put("ta", "ታ");put("tie", "ቴ");put("t", "ት");put("to", "ቶ")
                    put("che", "ቸ");put("chu", "ቹ");put("chi", "ቺ");put("cha", "ቻ");put("chie", "ቼ");put("ch", "ች");put("cho", "ቾ")
                    put("ne", "ነ");put("nu", "ኑ");put("ni", "ኒ");put("na", "ና");put("nie", "ኔ");put("n", "ን");put("no", "ኖ")
                    put("nye", "ኘ");put("nyu", "ኙ");put("nyi", "ኚ");put("nya", "ኛ");put("nyie", "ኜ");put("ny", "ኝ");put("nyo", "ኞ")
                    put("ae", "አ");put("u", "ኡ");put("i", "ኢ");put("a", "አ");put("ie", "ኤ");put("e", "እ");put("o", "ኦ")
                    put("ke", "ከ");put("ku", "ኩ");put("ki", "ኪ");put("ka", "ካ");put("kie", "ኬ");put("k", "ክ");put("ko", "ኮ")
                    put("khe", "ኸ");put("khu", "ኹ");put("khi", "ኺ");put("kha", "ኻ");put("khie", "ኼ");put("kh", "ኽ");put("kho", "ኾ")
                    put("oe", "ዐ");put("ou", "ዑ");put("oi", "ዒ");put("oa", "ዓ");put("oie", "ዔ");put("o", "ዕ");put("oo", "ዖ")
                    put("we", "ወ");put("wu", "ዉ");put("wi", "ዊ");put("wa", "ዋ");put("wie", "ዌ");put("w", "ው");put("wo", "ዎ")
                    put("ze", "ዘ");put("zu", "ዙ");put("zi", "ዚ");put("za", "ዛ");put("zie", "ዜ");put("z", "ዝ");put("zo", "ዞ")
                    put("zhe", "ዠ");put("zhu", "ዡ");put("zhi", "ዢ");put("zha", "ዣ");put("zhie", "ዤ");put("zh", "ዥ");put("zho", "ዦ")
                    put("ye", "የ");put("yu", "ዩ");put("yi", "ዪ");put("ya", "ያ");put("yie", "ዬ");put("y", "ይ");put("yo", "ዮ")
                    put("de", "ደ");put("du", "ዱ");put("di", "ዲ");put("da", "ዳ");put("die", "ዴ");put("d", "ድ");put("do", "ዶ")
                    put("je", "ጀ");put("ju", "ጁ");put("ji", "ጂ");put("ja", "ጃ");put("jie", "ጄ");put("j", "ጅ");put("jo", "ጆ")
                    put("ge", "ገ");put("gu", "ጉ");put("gi", "ጊ");put("ga", "ጋ");put("gie", "ጌ");put("g", "ግ");put("go", "ጎ")
                    put("xe", "ጸ");put("xu", "ጹ");put("xi", "ጺ");put("xa", "ጻ");put("xie", "ጼ");put("x", "ጸ");put("xo", "ጾ")
                    put("fe", "ፈ");put("fu", "ፉ");put("fi", "ፊ");put("fa", "ፋ");put("fie", "ፌ");put("f", "ፍ");put("fo", "ፎ")
                    put("pe", "ፐ");put("pu", "ፑ");put("pi", "ፒ");put("pa", "ፓ");put("pie", "ፔ");put("p", "ፕ");put("po", "ፖ")
                    put("", "  ");put(" ", " ");put(", ", " ፣");put(".", "።");put(":", ":-");put("!", "!") ;put("?", "?")
                    put(" a", " አ");put(" u", " ኡ");put(" i", " ኢ");put(" e", " እ");put(" o", " ኦ")

                }
            }


            var i = 0
            while (i < z.size) {
                if (z.size == 1 || z.size - 1 == i) {
                    res += lan[z[i]]
                    // System.out.println(res);
                } else {
                    if (i < z.size - 1) {
                        val l = z[i + 1]
                        //val A = z[i + 2]
                        if (l == "e" || l == "a" || l == "i" || l == "o" || l == "u") {
                            val con = z[i] + l
                            res += lan[con]
                            i++
                        } else {
                            res += lan[z[i]]

                        }
                    }
                }
                i++


            }
            print(res)


        }

        if (a == 2) {
            println("please Enter አማርኛ /ትግርኛ characters to translate.")
            val x = dataIn.readLine()
            //val y = x.length
            val z = x.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            println("The translated characters from አማርኛ /ትግርኛ  to English is:")


            val lan = object : HashMap<String, String>() {

               // private val serialVersionUID = 1L

                init {
                    put("ሀ", "he");put("ሁ ", "hu");put(" ሂ", "hi");put("ሃ", "ha");put("ሄ", "hie");put("ህ", "h");put("ሆ", "ho")
                    put("ለ", "le");put("ሉ", "lu");put("ሊ", "li");put("ላ", "la");put("ሌ", "lie");put("ል", "l");put("ሎ", "lo")
                    put("ሐ", "he");put("ሑ", "hu");put("ሒ", "hi");put("ሓ", "ha");put("ሔ", "hie");put("ሕ", "h");put("ሖ", "ho")
                    put("መ", "me");put("ሙ", "mu");put("ሚ", "mi");put("ማ", "ma");put("ሜ", "mie");put("ም", "m");put("ሞ", "mo")
                    put("ሠ", "se");put("ሡ", "su");put("ሢ", "si");put("ሣ", "sa");put("ሤ", "sie");put("ሥ", "s");put("ሦ", "so")
                    put("ረ", "re");put("ሩ", "ru");put("ሪ", "ri");put("ራ", "ra");put("ሬ", "rie");put("ር", "r");put("ሮ", "ro")
                    put("ሰ", "se");put("ሱ", "su");put("ሲ", "si");put("ሳ", "sa");put("ሴ", "sie");put("ስ", "s");put("ሶ", "so")
                    put("ሸ", "she");put("ሹ", "shu");put("ሺ", "shi");put("ሻ", "sha");put("ሼ", "shie");put("ሽ", "sh");put("ሾ", "sho")
                    put("ቀ", "qe");put("ቁ", "qu");put("ቂ", "qi");put("ቃ", "qa");put("ቄ", "qie");put("ቅ", "q");put("ቆ", "qo")
                    put("በ", "be");put("ቡ", "bu");put("ቢ", "bi");put("ባ", "ba");put("ቤ", "bie");put("ብ", "b");put("ቦ", "bo")
                    put("ቨ", "ve");put("ቩ", "vu");put("ቪ", "vi");put("ቫ", "va");put("ቬ", "vie");put("ቭ", "v");put("ቮ", "vo")
                    put("ተ", "te");put("ቱ", "tu");put("ቲ", "ti");put("ታ", "ta");put("ቴ", "tie");put("ት", "t");put("ቶ", "to")
                    put("ቸ", "che");put("ቹ", "chu");put("ቺ", "chi");put("ቻ", "cha");put("ቼ", "chie");put("ች", "ch");put("ቾ", "cho")
                    put("ነ", "ne");put("ኑ", "nu");put("ኒ", "ni");put("ና", "na");put("ኔ", "nie");put("ን", "n");put("ኖ", "no")
                    put("ኘ", "nye");put("ኙ", "nyu");put("ኚ", "nyi");put("ኛ", "nya");put("ኜ", "nyie");put("ኝ", "ny");put("ኞ", "nyo")
                    put("አ", "ae");put("ኡ", "u");put("ኢ", "i");put("አ", "a");put("ኤ", "ie");put("እ", "e");put("ኦ", "o")
                    put("ከ", "ke");put("ኩ", "ku");put("ኪ", "ki");put("ካ", "ka");put("ኬ", "kie");put("ክ", "k");put("ኮ", "ko")
                    put("ኸ", "khe");put("ኹ", "khu");put("ኺ", "khi");put("ኻ", "kha");put("ኼ", "khie");put("ኽ", "kh");put("ኾ", "kho")
                    put("ዐ", "oe");put("ዑ", "ou");put("ዒ", "oi");put("ዓ", "oa");put("ዔ", "oie");put("ዕ", "e");put("ዖ", "oo")
                    put("ወ", "we");put("ዉ", "wu");put("ዊ", "wi");put("ዋ", "wa");put("ዌ", "wie");put("ው", "w");put("ዎ", "wo")
                    put("ዘ", "ze");put("ዙ", "zu");put("ዚ", "zi");put("ዛ", "za");put("ዜ", "zie");put("ዝ", "z");put("ዞ", "zo")
                    put("ዠ", "zhe");put("ዡ", "zhu");put("ዢ", "zhi");put("ዣ", "zha");put("ዤ", "zhie");put("ዥ", "zh");put("ዦ", "zho")
                    put("የ", "ye");put("ዩ", "yu");put("ዪ", "yi");put("ያ", "ya");put("ዬ", "yie");put("ይ", "y");put("ዮ", "yo")
                    put("ደ", "de");put("ዱ", "du");put("ዲ", "di");put("ዳ", "da");put("ዴ", "die");put("ድ", "d");put("ዶ", "do")
                    put("ጀ", "je") ;put("ጁ", "ju");put("ጂ", "ji"); put("ጃ", "ja"); put("ጄ", "jie");put("ጅ", "j");put("ጆ", "jo")
                    put("ገ", "ge");put("ጉ", "gu") ;put("ጊ", "gi");put("ጋ", "ga");put("ጌ", "gie");put("ግ", "g");put("ጎ", "go")
                    put("ጸ", "tse");put("ጹ", "tsu");put("ጺ", "tsi");put("ጻ", "tsa"); put("ጼ", "tsie");put("ጸ", "ts");put("ጾ", "tso")
                    put("ፈ", "fe");put("ፉ", "fu");put("ፊ", "fi");put("ፋ", "fa");put("ፌ", "fie");put("ፍ", "f");put("ፎ", "fo")
                    put("ፐ", "pe");put("ፑ", "pu");put("ፒ", "pi");put("ፓ", "pa");put("ፔ", "pie"); put("ፕ", "p");put("ፖ", "po")
                    put(" ", " "); put("", "");put("፣ ", ", ") ; put("።", ".") ; put("？", "?")  ;put("!", "!") ; put(":-", ";")


                }
            }


            for (i in z.indices) {

                res += lan[z[i]]
            }

            print(res)


        }


    }
}