import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArithmaticTest {

    private final Arithmatic subject = new Arithmatic();

    @Before
    public void setUp() {
        System.out.println("I am in the setup method.");
    }

    @After
    public void tearDown() {
        System.out.println("I am in the tear down method.");
    }

    @Test
    public void arithmeticFivePlusTenEqualsFifteen() {
        System.out.println("Testing 5+10=15");
        assertThat(subject.add(5,10), is(15));
    }

    @Test
    public void arithmeticZeroPlusSixEqualsSix() {
        System.out.println("Testing 0+6=6");
        assertThat(subject.add(0,6), is(6));
    }


}