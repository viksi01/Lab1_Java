package Task5;

public class OrderArray {
    private final Order[] orders;
    private int currentIndex = 0;

    public OrderArray(int numberOfElements) {

        orders = new Order[numberOfElements];
    }

    public void addOrder(Order order) {
        if (currentIndex == orders.length) {
            System.out.println("Array is full!");
            return;
        }

        orders[currentIndex] = order;
        currentIndex++;
    }

    public void removeOrder(int index) {
        if (index >= 0 && index < currentIndex) {
            for (int i = index; i < currentIndex - 1; i++) {
                orders[i] = orders[i + 1];
            }
            orders[currentIndex - 1] = null;
            currentIndex--;
        } else {
            System.out.println("Wrong index!");
        }
    }

    public void displayOrders() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Order № " + (i + 1) + ":");
            System.out.println(orders[i].printOrder());
            System.out.println("--------------------------");
        }
    }
}
