import static org.junit.Assert.*;
import org.junit.*; 

public class TestRepoTester {

    @Test
    public void multiply() {
        assertEquals(4, TestRepo.testMultiply(1, 2));
    }
}
