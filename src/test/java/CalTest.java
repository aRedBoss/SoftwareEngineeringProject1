import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalTest {
    Cal cal=new Cal();

    @Test
    void addMe() {
        assertEquals(9, cal.addMe(4, 5));
    }

    @Test
    void subMe() {
        assertEquals(1, cal.subMe(5, 4));

    }

    @Test
    void mulMe() {
        assertEquals(20, cal.mulMe(5, 4));
    }

    @Test
    void divMe() {
        assertEquals(3, cal.divMe(6, 2));
    }
}