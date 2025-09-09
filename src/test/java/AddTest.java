package main.java.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.add.Add;

public class AddTest {

    @Test
    void testAdd() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3));
        assertEquals(0, add.add(-1, 1));
        assertEquals(0, add.add(0, 0));
        assertEquals(-15, add.add(-7, -8));
    }

    public static void main(String[] args) {
        AddTest test = new AddTest();
        test.testAdd();
        System.out.println("All tests passed.");
    }
}