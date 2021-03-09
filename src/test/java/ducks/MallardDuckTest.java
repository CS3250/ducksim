


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {
    @Test void MallardDuckTestQuack() {
        Duck classUnderTest = new MallardDuck();
        assertEquals("quuuaaack", classUnderTest.quack(), "mallard duck should only quack");
    }
}


