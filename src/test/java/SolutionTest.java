import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {
    private static long suiteStartTime;
    private long testStartTime;
    private Solution sut;
    private final String exemp = "1. Думаю, это   будет новой фичей. " +
            "2. Только не говорите никому,   что она возникла          случайно.";

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest");
        suiteStartTime = System.currentTimeMillis();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("StringTest complete: " + (System.currentTimeMillis() - suiteStartTime));
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Test started.");
        sut = new Solution();
        testStartTime = System.currentTimeMillis();
    }

    @AfterEach
    public void tearDown() {
        sut = null;
        System.out.println("Test complete:" + (System.currentTimeMillis() - testStartTime));

    }

    @Test
    public void countDigitsTest() {
        int expected = 2;
        int result = sut.countDigits(exemp);
        assertEquals(expected, result);
    }

    @Test
    public void countLetters() {
        int expected = 67;
        int result = sut.countLetters(exemp);
        assertEquals(expected, result);
    }

    @Test
    public void countSpacesTest() {
        int expected = 27;
        int result = sut.countSpaces(exemp);
        assertEquals(expected, result);
    }

    @Test
    public void replacerTest() {
        String expected = "1. Думаю, это будет новой фичей. 2. Только не говорите никому, что она возникла случайно.";
        String result = sut.replacer(exemp);
        assertEquals(expected, result);

    }


}
