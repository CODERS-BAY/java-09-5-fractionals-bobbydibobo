package at.codersbay.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionalTest1 {

    @Test //check
    // A fractional can be created if positive natural numbers are passed as numerator and denominator --> check
    public void testFractionalCreation() {
        Fractional fractional = new Fractional(1, 2);

        assertThat(fractional.getNumerator()).isEqualTo(1);
        assertThat(fractional.getDenominator()).isEqualTo(2);
    }

    @Test //check
    // A fractional can be created if negative natural numbers are passed as numerator and denominator --> check
    public void testCreationWithNegativeNumerator() {
        Fractional fractional = new Fractional(-1, -2);

        assertThat(fractional.getNumerator()).isEqualTo(-1);
        assertThat(fractional.getDenominator()).isEqualTo(-2);
    }

    @Test //check
    // An IllegalArgumentException should be thrown when a negative value is passed for the denominator --> check
    public void testCreationWithNegativeDenominator() {
        Fractional fractional = new Fractional(1, -2);

        assertThat(fractional.getNumerator()).isEqualTo(1);
        assertThat(fractional.getDenominator()).isEqualTo(-2);
    }

    @Test
    // An IllegalArgumentException should be thrown when a null denominator is passed --> dunno why tho
    public void testCreationWithNullDenominator() {
        assertThrows(IllegalArgumentException.class,
                () -> new Fractional(1, null),
                "You shall not pass null!");
    }

    @Test //check
    // An IllegalArgumentException should be thrown when a null numerator is passed
    public void testCreationWithNullNumerator() {
        assertThrows(IllegalArgumentException.class,
                () -> new Fractional(null, 2),
                "You shall not pass null!");
    }

    @Test //check
    // An IllegalArgumentException should be thrown when a zero value is passed for the denominator --> check
    public void testCreationWithZeroDenominator() {
        assertThrows(IllegalArgumentException.class,
                () -> new Fractional(2, 0),
                "You shall not divide through zero!");
    }

    @Test //check
    // Passing null for the numerator is valid --> Check
    public void testCreationWithZeroNumerator() {
        Fractional fractional = new Fractional(0, 2);

        assertThat(fractional.getNumerator()).isEqualTo(0);
        assertThat(fractional.getDenominator()).isEqualTo(2);
    }
}