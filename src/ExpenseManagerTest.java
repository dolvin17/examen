import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExpenseManagerTest {

    @Test
    public void testPositiveExpense() {
        ExpenseManager manager = new ExpenseManager();
        manager.addExpense(50.0);
        // Espero que el saldo sea 50.0"
        assertEquals(50.0, manager.getTotalBalance());
    }

    @Test
    public void testNegativeExpense() {
        ExpenseManager manager = new ExpenseManager();
        manager.addExpense(-10.0);
        // Espero que el saldo siga siendo 0.0
        assertEquals(0.0, manager.getTotalBalance());
    }
}

