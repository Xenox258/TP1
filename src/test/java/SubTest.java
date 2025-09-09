import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @Test
    void testSub() {
        // Cas simple
        assertEquals(2, Sub.sub(5, 3), "5 - 3 doit être égal à 2");

        // Cas avec résultat négatif
        assertEquals(-1, Sub.sub(2, 3), "2 - 3 doit être égal à -1");

        // Cas avec zéro
        assertEquals(5, Sub.sub(5, 0), "5 - 0 doit être égal à 5");
        assertEquals(0, Sub.sub(0, 0), "0 - 0 doit être égal à 0");
    }
}
