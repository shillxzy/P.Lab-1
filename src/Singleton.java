class DeliveryMethod
{
    private static DeliveryMethod instance;

    public static synchronized DeliveryMethod getInstance()
    {
        if (instance == null)
        {
            instance = new DeliveryMethod();
        }
        return instance;
    }

    public void processDelivery(String type)
    {
        if ("Standard" == type)
        {
            System.out.println("Доставлено стандартною доставкою.");
        }
        else if ("Express" == type)
        {
            System.out.println("Доставлено експресс-доставкою.");
        }
        else
        {
            System.out.println("Невідомий тип доставки.");
        }
    }
}

class Main1
{
    public static void main(String[] args)
    {
        DeliveryMethod manager = DeliveryMethod.getInstance();
        manager.processDelivery("Standard");
        manager.processDelivery("Express");
        manager.processDelivery("Faster");
    }
}