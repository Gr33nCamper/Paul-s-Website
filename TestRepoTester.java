ssh cs15lsp22adi@ieng6.ucsd.edu 


public class TestRepoTester {

    @Test
    public void multiply() {
        assertEquals(4, TestRepo.testMultiply(1, 2));
    }
}
