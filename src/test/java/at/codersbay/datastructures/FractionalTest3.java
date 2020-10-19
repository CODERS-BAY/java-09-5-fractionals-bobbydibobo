package at.codersbay.datastructures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class FractionalTest3 {

    @Test //check
    public void testIsEqualToSame() {
        assertThat(new Fractional(1, 2)).isEqualTo(new Fractional(1, 2));
        assertThat(new Fractional(1, 3)).isEqualTo(new Fractional(1, 3));
        assertThat(new Fractional(1, 8)).isEqualTo(new Fractional(1, 8));
    }

    @Test //check
    public void testIsEqualToReduced() {
        assertThat(new Fractional(1, 3)).isEqualTo(new Fractional(2, 6));
        assertThat(new Fractional(1, 3)).isEqualTo(new Fractional(3, 9));
        assertThat(new Fractional(2, 6)).isEqualTo(new Fractional(1, 3));
    }

    @Test //check
    public void testIsNotEqualTo() {
        assertThat(new Fractional(1, 3)).isNotEqualTo(new Fractional(2, 7));
        assertThat(new Fractional(1, 3)).isNotEqualTo(new Fractional(3, 1));
        assertThat(new Fractional(2, 9)).isNotEqualTo(new Fractional(1, 6));
    }

    @Test //check
    public void testIsEqualToZero() {
        assertThat(new Fractional(0, 3)).isEqualTo(new Fractional(0, 7));
        assertThat(new Fractional(0, 3)).isEqualTo(new Fractional(0, 1));
    }
}
