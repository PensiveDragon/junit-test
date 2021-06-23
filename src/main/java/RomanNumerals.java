import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomanNumerals {

    public int romanNumeralsToInteger(String numerals) {

        int accumulatedValue = 0;

        String iv = "IV";
        String v = "V";
        String ix = "IX";
        String x = "X";

        HashMap<String, Integer> numeralMap = new HashMap();

        numeralMap.put(iv, 4);
        numeralMap.put(v, 5);
        numeralMap.put(ix, 9);
        numeralMap.put(x, 10);

        if (numerals.startsWith(ix)){
            accumulatedValue += numeralMap.get(ix);
            numerals = popOffNumeral(numerals,ix);
        }

        if (numerals.startsWith(x)){
            accumulatedValue += numeralMap.get(x);
            numerals = popOffNumeral(numerals,x);
        }

        if (numerals.startsWith(iv)){
            accumulatedValue += numeralMap.get(iv);
            numerals = popOffNumeral(numerals,iv);
        }

        if (numerals.startsWith(v)){
            accumulatedValue += numeralMap.get(v);
            numerals = popOffNumeral(numerals,v);
        }



        return accumulatedValue + numerals.length();
    }

    public String popOffNumeral(String numerals, String targetNumerals){
        return numerals.substring(targetNumerals.length());
    }

    /*
    I = 1
    V = 5
    X = 10
    L = 50
    C = 100
    D = 500
    M = 1000

    3999 is the highest usual number in Roman numerals
    ...
    MCMLXXXVII = 1987
    Thousand, Hundred-less-than-Thousand, Fifty-Thirty-Five-Two
     */

}
