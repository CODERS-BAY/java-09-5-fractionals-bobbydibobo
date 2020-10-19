package at.codersbay.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionalTest4 {

    @Test //check
    public void testMultiplicationWithNaturalNumber() {
        assertThat(new Fractional(1, 6).multiply(3))
                .isEqualTo(new Fractional(3, 6));
    }

    @Test //check
    public void testMultiplicationWithOne() {
        assertThat(new Fractional(1, 11).multiply(1))
                .isEqualTo(new Fractional(1, 11));
    }

    @Test //check
    public void testMultiplicationWithZero() {
        assertThat(new Fractional(1, 9).multiply(0))
                .isEqualTo(new Fractional(0, 9));
    }

    @Test //check
    public void testMultiplicationWithHalf() {
        assertThat(new Fractional(1, 2).multiply(new Fractional(1, 2)))
                .isEqualTo(new Fractional(1, 4));
    }

    @Test //check
    public void testMultiplicationComplex() {
        assertThat(new Fractional(2, 3).multiply(new Fractional(7, 8)))
                .isEqualTo(new Fractional(14, 24));
    }

    @Test // wtf why tho Java
    public void testMultiplicationWithNegatives() {
        assertThat(new Fractional(-2, 3).multiply(new Fractional(7, -3)))
                .isEqualTo(new Fractional(-14, -9));
    }
}
