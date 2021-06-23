import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    RomanNumerals subject = new RomanNumerals();


    @Test
    public void I_is_1() {
        assertThat(subject.romanNumeralsToInteger("I"), is(1));
    }

    @Test
    public void II_is_2() {
        assertThat(subject.romanNumeralsToInteger("II"), is(2));
    }

    @Test
    public void IV_is_4() {
        assertThat(subject.romanNumeralsToInteger("IV"), is(4));
    }

    @Test
    public void V_is_5() {
        assertThat(subject.romanNumeralsToInteger("V"), is(5));
    }

    @Test
    public void VI_is_6() {
        assertThat(subject.romanNumeralsToInteger("VI"), is(6));
    }

    @Test
    public void IX_is_9() {
        assertThat(subject.romanNumeralsToInteger("IX"), is(9));
    }

    @Test
    public void X_is_10() {
        assertThat(subject.romanNumeralsToInteger("X"), is(10));
    }

    @Test
    public void XI_is_11() {
        assertThat(subject.romanNumeralsToInteger("XI"), is(11));
    }

    @Test
    public void XIV_is_14() {
        assertThat(subject.romanNumeralsToInteger("XIV"), is(14));
    }

    @Test
    public void VI_becomes_V(){
        assertThat(subject.popOffNumeral("VI","V"), is("I"));
    }

    @Test
    public void V_becomes_Empty(){
        assertThat(subject.popOffNumeral("V","V"), is(""));
    }
}