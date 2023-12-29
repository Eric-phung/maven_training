package fr.lernejo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void testOpAdd() {
        Sample sample = new Sample();
        assertEquals(5, sample.op(Sample.Operation.ADD, 2, 3));
    }

    @Test
    void testOpMult() {
        Sample sample = new Sample();
        assertEquals(6, sample.op(Sample.Operation.MULT, 2, 3));
    }

    @Test
    void testFactPositive() {
        Sample sample = new Sample();
        assertEquals(120, sample.fact(5));
    }

    @Test
    void testFactZero() {
        Sample sample = new Sample();
        assertEquals(1, sample.fact(0));
    }

    @Test
    void testFactException() {
        Sample sample = new Sample();
        assertThrows(IllegalArgumentException.class, () -> sample.fact(-1));
    }
}
