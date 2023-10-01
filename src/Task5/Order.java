package Task5;

public class Order {
    private final Item item;
    private final  Customer customer;
    private final DeparturePoint departurePoint;
    private final ReceivePoint receivePoint;
    private final Shipment shipment;
    public Order(Item item, Customer customer, DeparturePoint departurePoint, ReceivePoint receivePoint, double weight) {
        this.item = item;
        this.customer = customer;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
        this.shipment = new Shipment(weight);
    }

    public void createOrder() {
        System.out.println("Order Information:");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Departure Point: " + departurePoint.getAdress());
        System.out.println("Receive Point: " + receivePoint.getAdress());
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Weight: " + item.getWeight() + " kg");
        System.out.println("Shipment Method: " + shipment.getTransport());
    }





}
