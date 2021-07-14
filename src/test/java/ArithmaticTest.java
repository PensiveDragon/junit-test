import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArithmaticTest {

    private final Arithmatic subject = new Arithmatic();

    @BeforeEach
    public void setUp() {
        System.out.println("I am in the setup method.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("I am in the tear down method.");
    }

    @Test
    public void arithmeticFivePlusTenEqualsFifteen() {
        System.out.println("Testing 5+10=15");
        assertThat(subject.add(5,10), equalTo(15));
    }

    @Test
    public void arithmeticZeroPlusSixEqualsSix() {
        System.out.println("Testing 0+6=6");
        assertThat(subject.add(0,6), equalTo(6));
    }


}