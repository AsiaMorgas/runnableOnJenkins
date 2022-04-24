import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void shouldPrintCorrectPhrase() {
        String stringToPrint = "A project runnable on jenkins";
        Assertions.assertTrue(Main.printSomething().equals(stringToPrint));
    }
}
