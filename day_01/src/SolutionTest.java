import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testCountFloors() {
        Solution s = new Solution();
        assertEquals(s.countFloors("((("), 3);
        assertEquals(s.countFloors(")))"), -3);
    }

    @Test
    void testFindBasement() {
        Solution s = new Solution();
        assertEquals(s.findBasement(")))"), 1);
        assertEquals(s.findBasement("()()())"), 7);
    }
}
