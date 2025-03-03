class DeliveryOrder
{
    private String recipient;
    private String address;
    private String deliveryType;

    private DeliveryOrder(Builder builder)
    {
        this.recipient = builder.recipient;
        this.address = builder.address;
        this.deliveryType = builder.deliveryType;
    }

    public void showDetails()
    {
        System.out.println("Замовлення: ");
        System.out.println("Отримувач: " + recipient);
        System.out.println("Адреса: " + address);
        System.out.println("Тип доставки: " + deliveryType);
    }

    public static class Builder
    {
        private String recipient;
        private String address;
        private String deliveryType = "Standard";

        public Builder setRecipient(String recipient)
        {
            this.recipient = recipient;
            return this;
        }

        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        public Builder setDeliveryType(String deliveryType)
        {
            if ("Standard" == deliveryType || "Express" == deliveryType)
            {
                this.deliveryType = deliveryType;
            }
            return this;
        }

        public DeliveryOrder build()
        {
            return new DeliveryOrder(this);
        }
    }
}

class Main3
{
    public static void main(String[] args)
    {
        DeliveryOrder order1 = new DeliveryOrder.Builder()
                .setRecipient("Іван Петренко")
                .setAddress("Київ, вул. Шевченка, 10")
                .setDeliveryType("Express")
                .build();

        DeliveryOrder order2 = new DeliveryOrder.Builder()
                .setRecipient("Ольга Сидоренко")
                .setAddress("Львів, вул. Франка, 25")
                .build();

        order1.showDetails();
        System.out.println("--------------------------------------------");
        order2.showDetails();
    }
}