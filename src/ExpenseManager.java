/**
 * Clase para gestionar los gastos personales de forma sencilla.
 * @author Karol 
 */
public class ExpenseManager {
    public double totalAmount = 0; 

    /**
     * Suma una cantidad al total si es mayor que cero.
     * @param amount La cantidad de dinero a añadir.
     */
    public void addExpense(double amount) {
        if (amount > 0) {
            totalAmount = totalAmount + amount;
        }
    }

    /**
     * Devuelve el total acumulado hasta el momento.
     * @return El saldo total.
     */
    public double getTotalBalance() {
        return totalAmount;
    }
}