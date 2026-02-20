public class ExpenseManager {
    public double totalBalance = 0;
    // Para añadir un gasto
    public void addExpense(double amount) {
        if (amount > 0) {
            totalBalance = totalBalance + amount;
        }
    }
    // Para ver el total
    public double getTotalBalance() {
        return totalBalance;
    }
}

