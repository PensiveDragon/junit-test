import java.util.LinkedHashMap;
import java.util.Set;

public class RomanNumerals {

    private String numerals;
    private int accumulatedValue;
    private LinkedHashMap<String, Integer> numeralMap = new LinkedHashMap<>();

    public RomanNumerals(String numerals) {
        this.numerals = numerals;
        accumulatedValue = 0;

        numeralMap.put("M", 1000);
        //numeralMap.put("CM", 900);
        numeralMap.put("D", 500);
        //numeralMap.put("CD", 400);
        numeralMap.put("C", 100);
        //numeralMap.put("XC", 90);
        numeralMap.put("L", 50);
        //numeralMap.put("XL", 40);
        numeralMap.put("X", 10);
        //numeralMap.put("IX", 9);
        numeralMap.put("V", 5);
        //numeralMap.put("IV", 4);
        numeralMap.put("I", 1);
    }
/*
    public int romanNumeralsToInteger() {

        // if first numeral is lower in value than second numeral, accumlatedValue += (second numeral value - first numeral value).

        for (String key : numeralMap.keySet()) {
            if ((numerals.length() > 1) && (numeralMap.get(String.valueOf(numerals.charAt(0))) < numeralMap.get(String.valueOf(numerals.charAt(1))))) {
                consumeNumeral(key, true);
            } else {
                for (int i = 0; i < 3; i++) {
                    consumeNumeral(key, false);
                }
            }
        }
        return accumulatedValue;
    }
  */

    public int romanNumeralsToInteger() {
        while (!numerals.isEmpty()) {
            String firstNumeral = numeralAtPosition(0);
            if (isFirstNumeralSmaller()) {
                consumeNumeral( firstNumeral, true);
            } else {
                consumeNumeral(firstNumeral, false);
            }
        }
        return accumulatedValue;
    }

    private String numeralAtPosition(int i) {
        return String.valueOf(numerals.charAt(i));
    }

    public boolean isFirstNumeralSmaller() {
        if (numerals.length() > 1) {
            String firstNumeral = numeralAtPosition(0);
            String secondNumeral = numeralAtPosition(1);
            if (numeralMap.get(firstNumeral) < numeralMap.get(secondNumeral)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void consumeNumeral(String targetNumeral, Boolean subtract) {
        if (numerals.startsWith(targetNumeral)) {
            if (subtract){
                accumulatedValue -= numeralMap.get(targetNumeral);
            } else {
                accumulatedValue += numeralMap.get(targetNumeral);
            }
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
