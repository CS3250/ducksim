import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedheadDuckTest {
    @Test void RedheadDuckTestQuack() {
        Duck classUnderTest = new RedheadDuck();
        assertEquals("quack", classUnderTest.quack(), "redhead duck should only quack");
    }
}
