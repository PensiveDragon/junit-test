import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralsTest {


    @Test
    public void I_is_1() {
        assertThat(new RomanNumerals("I").romanNumeralsToInteger(), is(1));
    }

    @Test
    public void II_is_2() {
        assertThat(new RomanNumerals("II").romanNumeralsToInteger(), is(2));
    }

    @Test
    public void IV_is_4() {
        assertThat(new RomanNumerals("IV").romanNumeralsToInteger(), is(4));
    }

    @Test
    public void V_is_5() {
        assertThat(new RomanNumerals("V").romanNumeralsToInteger(), is(5));
    }

    @Test
    public void VI_is_6() {
        assertThat(new RomanNumerals("VI").romanNumeralsToInteger(), is(6));
    }

    @Test
    public void IX_is_9() {
        assertThat(new RomanNumerals("IX").romanNumeralsToInteger(), is(9));
    }

    @Test
    public void X_is_10() {
        assertThat(new RomanNumerals("X").romanNumeralsToInteger(), is(10));
    }

    @Test
    public void XI_is_11() {
        assertThat(new RomanNumerals("XI").romanNumeralsToInteger(), is(11));
    }

    @Test
    public void XIV_is_14() {
        assertThat(new RomanNumerals("XIV").romanNumeralsToInteger(), is(14));
    }

    @Test
    public void XIX_is_19() {
        assertThat(new RomanNumerals("XIX").romanNumeralsToInteger(), is(19));
    }

    @Test
    public void XX_is_20() {
        assertThat(new RomanNumerals("XX").romanNumeralsToInteger(), is(20));
    }

    @Test
    public void XXIV_is_24() {
        assertThat(new RomanNumerals("XXIV").romanNumeralsToInteger(), is(24));
    }

    @Test
    public void XL_is_40() {
        assertThat(new RomanNumerals("XL").romanNumeralsToInteger(), is(40));
    }

    @Test
    public void L_is_50() {
        assertThat(new RomanNumerals("L").romanNumeralsToInteger(), is(50));
    }

    @Test
    public void MCMLXXXVII_is_1987() {assertThat(new RomanNumerals("MCMLXXXVII").romanNumeralsToInteger(), is(1987));}

    @Test
    public void VI_becomes_V(){
        assertThat(new RomanNumerals("VI").popOffNumeral("VI","V"), is("I"));
    }

    @Test
    public void V_becomes_Empty(){
        assertThat(new RomanNumerals("V").popOffNumeral("V","V"), is(""));
    }
}