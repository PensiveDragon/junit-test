import java.util.HashMap;

public class RomanNumerals {

    private String numerals;
    private int accumulatedValue;
    HashMap<String, Integer> numeralMap = new HashMap();

    String iv = "IV";
    String v = "V";
    String ix = "IX";
    String x = "X";

    public RomanNumerals(String numerals) {
        this.numerals = numerals;
        accumulatedValue = 0;

        numeralMap.put(iv, 4);
        numeralMap.put(v, 5);
        numeralMap.put(ix, 9);
        numeralMap.put(x, 10);
    }

    public int romanNumeralsToInteger() {

        miracleNumeralCalculator(ix, numeralMap);

        miracleNumeralCalculator(x, numeralMap);

        miracleNumeralCalculator(iv, numeralMap);

        miracleNumeralCalculator(v, numeralMap);

        return accumulatedValue + numerals.length();
    }

    private void miracleNumeralCalculator(String targetNumeral, HashMap<String, Integer> numeralMap) {
        if (numerals.startsWith(targetNumeral)) {
            accumulatedValue += numeralMap.get(targetNumeral);
            numerals = popOffNumeral(numerals, targetNumeral);
        }
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
