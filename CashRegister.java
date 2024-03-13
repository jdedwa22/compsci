public class CashRegister
{

    private int itemCount;
    private double totalPrice;
    private double previous;

    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice + price;
        previous = price;
    }

    public void undo()
    {
        if (previous != 0)
        {
            totalPrice = totalPrice - previous;
            itemCount--;
            previous = 0;
        }
    }

    public void enterPayment(double amount)
    {
        totalPrice = totalPrice - amount;
    }

    public double giveChange()
    {
        double change = -totalPrice;
        totalPrice = 0;
        itemCount = 0;
        previous = 0;
        if (change == -0.00)
        {
            return -change;
        }
        return change;
    }

    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
        previous = 0;
    }
}
