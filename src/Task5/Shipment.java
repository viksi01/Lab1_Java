package Task5;

public class Shipment {
    private String transport;

    public Shipment(double weight) {
        setTransport(weight);
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(double weight) {
        if (weight < 10) {
            this.transport = "bicycle";
        } else if (weight < 100) {
            this.transport = "truck";
        } else if (weight < 10_000) {
            this.transport = "plane";
        } else if (weight < 100_000) {
            this.transport = "train";
        } else {
            System.out.println("Wrong type of weight!");
        }
    }
}
