import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralsTest {

    @ParameterizedTest(name = "{index} {0} has value {1}")
    @DisplayName("Bats")
    @CsvSource({
            "I,1",
            "II,2",
            "IV,4",
            "V,5",
            "VI,6",
            "IX,9",
            "X,10",
            "XI,11",
            "XIV,14",
            "XIX,19",
            "XX,20",
            "XXIV,24",
            "XL,40",
            "L,50",
            "MCMLXXXVII,1987"})
        public void roman_numeral_has_value(String numeral, int value) {
        assertThat(new RomanNumerals(numeral).romanNumeralsToInteger(), is(value));
    }

    @ParameterizedTest
    @CsvSource({
            "VI,I",
            "V,''",
            "MCMLXXXVII,CMLXXXVII",
            "CMLXXXVII,MLXXXVII",
            "MLXXXVII,LXXXVII",
            "LXXXVII,XXXVII",
            "XXXVII,XXVII",
            "XXVII,XVII",
            "XVII,VII",
            "VII,II",
            "II,I",
            "I,''"})
    public void roman_numeral_is_trimmed(String input, String output){
        assertThat(new RomanNumerals(input).popOffNumeral(input), is(output));
    }

    @Test
    public void V_becomes_Empty(){
        assertThat(new RomanNumerals("V").popOffNumeral("V"), is(""));
    }
}