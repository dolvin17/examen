public class Main {
    public static void main(String[] args) {
        ExpenseManager myManager = new ExpenseManager();
        // Pruebo con 50 pavos
        myManager.addExpense(50.0);
        System.out.println("Gasto de 50 añadido. Total: " + myManager.getTotalBalance());
        // Pruebo con un número negativo
        myManager.addExpense(-10.0);
        System.out.println("Intento añadir -10. Total sigue siendo: " + myManager.getTotalBalance());
    }
}

