import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void m() {
        Main m = new Main();
        Assertions.assertEquals(m.add(1, 2), 3);
    }
}
