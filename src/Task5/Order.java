package Task5;

public class Order {
    private final OrderArray orderArray;
    private final Item item;
    private final  Customer customer;
    private final DeparturePoint departurePoint;
    private final ReceivePoint receivePoint;
    private final Shipment shipment;
    public Order(OrderArray orderArray, Item item, Customer customer, DeparturePoint departurePoint, ReceivePoint receivePoint, double weight) {
        this.orderArray = orderArray;
        this.item = item;
        this.customer = customer;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
        this.shipment = new Shipment(receivePoint, weight);
    }


    public String printOrder() {
        return "Order Information:\n" +
                "Customer Name: " + customer.getName() + "\n" +
                "Departure Point: " + departurePoint.getDeparturePoint() + "\n" +
                "Receive Point: " + receivePoint.getReceivePoint() + "\n" +
                "Item Name: " + item.getName() + "\n" +
                "Item Weight: " + item.getWeight() + " kg\n" +
                "Shipment Method: " + shipment.getTransport();
    }

}
