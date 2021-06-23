import java.util.LinkedHashMap;
import java.util.Set;

public class RomanNumerals {

    private String numerals;
    private int accumulatedValue;
    LinkedHashMap<String, Integer> numeralMap = new LinkedHashMap();

    public RomanNumerals(String numerals) {
        this.numerals = numerals;
        accumulatedValue = 0;

        numeralMap.put("IX", 9);
        numeralMap.put("X", 10);
        numeralMap.put("IV", 4);
        numeralMap.put("V", 5);
    }

    public int romanNumeralsToInteger() {

        for (String key : numeralMap.keySet()) {
            consumeNumeral(key);
        }

        return accumulatedValue + numerals.length();
    }

    private void consumeNumeral(String targetNumeral) {
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
