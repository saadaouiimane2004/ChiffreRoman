package conversion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert1() {
        assertEquals("I", ArabicRomanNumerals.convert(1));
    }


    @Test
    public void testConvert5() {
        assertEquals("V", ArabicRomanNumerals.convert(5));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", ArabicRomanNumerals.convert(10));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", ArabicRomanNumerals.convert(4));
    }



}
