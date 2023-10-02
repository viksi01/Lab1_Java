package Task5;

public class Shipment {
    private String transport;
    public Shipment(ReceivePoint receivePoint, double weight) {
        if (receivePoint.isAllowedReceivePoint()) {
            setTransport(weight);
        } else {
            this.transport = "bicycle";
        }
    }

    public String getTransport() {
        return transport;
    }


    public void setTransport(double weight) {
        if (weight <= 10.0) {
            this.transport = "bicycle";
        } else if (weight <= 100.0) {
            this.transport = "truck";
        } else if (weight <= 10000.0) {
            this.transport = "plane";
        } else if (weight <= 100000.0) {
            this.transport = "train";
        } else {
            System.out.println("Too heavy item!");
        }
    }

}
