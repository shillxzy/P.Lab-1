//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Delivery
{
    void deliverPackage();
}


class StandardDelivery implements Delivery
{
    public void deliverPackage()
    {
        System.out.println("Пакет доставлено стандартною доставкою.");
    }
}

class ExpressDelivery implements Delivery
{
    public void deliverPackage()
    {
        System.out.println("Пакет доставлено експрес-доставкою.");
    }
}

abstract class DeliveryFactory
{
    public abstract Delivery createDelivery();
}

class StandardDeliveryFactory extends DeliveryFactory
{
    public Delivery createDelivery()
    {
        return new StandardDelivery();
    }
}

class ExpressDeliveryFactory extends DeliveryFactory
{
    public Delivery createDelivery()
    {
        return new ExpressDelivery();
    }
}


class Main
{
    public static void main(String[] args)
    {
        DeliveryFactory factory = new StandardDeliveryFactory();
        Delivery delivery = factory.createDelivery();
        delivery.deliverPackage();

        factory = new ExpressDeliveryFactory();
        delivery = factory.createDelivery();
        delivery.deliverPackage();

    }
}