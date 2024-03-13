public class Tester
{
    public static void main(String[] args)
    {
        CashRegister reg = new CashRegister();
        reg.addItem(12.50); // 12.5$
        reg.addItem(5.65); // 18.15$
        reg.addItem(7.23); // 25.38$
        reg.undo(); // Should remove 7.23$ (18.15$)
        reg.addItem(7.25); // 25.4$
        reg.enterPayment(20); // 25.4 - (20)
        reg.enterPayment(10); // 25.4 - (20 + 10)
        double change = reg.giveChange(); // 4.60$
        System.out.printf("Change:  %.2f%n", change);
        System.out.println("Expected: 4.60");

        reg.clear();
        reg.undo(); // Should not change anything
        reg.addItem(5.75); // 5.75$
        reg.addItem(25.00); // 30.75$
        reg.undo(); // Should remove the 25$ (5.75$)
        reg.undo(); // Should not change anything (5.75$)
        reg.addItem(24.99); // 30.74$
        reg.addItem(2.25); // 32.99$
        reg.addItem(16.72); // 49.71$
        reg.enterPayment(60); // 49.71 - (60)
        change = reg.giveChange(); //
        reg.undo(); // Should not change anything
        double change2 = reg.giveChange(); // After giving change the transaction is then reset
        System.out.printf("Change:  %.2f %.2f%n", change, change2);
        System.out.println("Expected: 10.29 0.00");
    }
}
