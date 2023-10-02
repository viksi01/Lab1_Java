package Task5;

public class DeliveryService {
    public static void main(String[] args) {

        OrderArray orderArray = new OrderArray(10);

        Customer customer1 = new Customer("Diana");
        Customer customer2 = new Customer("Yana");
        ReceivePoint receivePoint1 = new ReceivePoint("Drohobych");
        ReceivePoint receivePoint2 = new ReceivePoint("Lviv");
        DeparturePoint departurePoint1 = new DeparturePoint("Kyiv");
        DeparturePoint departurePoint2 = new DeparturePoint("Lviv");
        Item item1 = new Item("Computer", 100);
        Item item2 = new Item("Book", 0.300);


        Order order1 = new Order(orderArray, item1, customer1, departurePoint1, receivePoint1, item1.getWeight());
        Order order2 = new Order(orderArray, item2, customer2, departurePoint2, receivePoint2, item2.getWeight());

        orderArray.addOrder(order1);
        orderArray.addOrder(order2);

        //==============================================================================================================
        orderArray.displayOrders();

        orderArray.removeOrder(0);


        orderArray.displayOrders();


    }
}
