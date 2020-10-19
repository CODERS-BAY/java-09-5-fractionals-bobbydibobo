package at.codersbay.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionalTest7 {
    
    @Test //check
    public void testSubtractNaturalNumber() {
        assertThat(new Fractional(3, 7).subtract(3))
                .isEqualTo(new Fractional(-18, 7));
    }

    @Test //check
    public void testSubtractZero() {
        assertThat(new Fractional(3, 7).subtract(0))
                .isEqualTo(new Fractional(3, 7));
    }

    @Test //check
    public void testSubtractFractional() {
        assertThat(new Fractional(2, 4).subtract(new Fractional(3, 8)))
                .isEqualTo(new Fractional(1, 8));
    }

    @Test //check
    public void testSubtractFractional2() {
        assertThat(new Fractional(4, 5).subtract(new Fractional(1, 3)))
                .isEqualTo(new Fractional(7, 15));
    }

    @Test //check
    public void testSubtractZeroFractional() {
        assertThat(new Fractional(2, 5).subtract(new Fractional(0, 11)))
                .isEqualTo(new Fractional(2, 5));
    }
}
