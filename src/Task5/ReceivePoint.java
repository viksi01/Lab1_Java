package Task5;

public class ReceivePoint {
    private final String receivePoint;

    private final String [] allowedReceivePoints = {"Lviv", "Kyiv", "Kherson", "Kharkiv",
                                                    "Dnipro", "Odessa", "Mykolaiv", "Cherkasy",
                                                    "Ivano-Frankivsk", "Kropyvnytskyi",
                                                    "Khmelnytskyi", "Donetsk"};

    public boolean isAllowedReceivePoint() {
        for (String allowedPoint : allowedReceivePoints) {
            if (allowedPoint.equals(receivePoint)) {
                return true;
            }
        }
        return false;
    }

    public ReceivePoint(String receivePoint) {
        this.receivePoint = receivePoint;
    }

    public String getReceivePoint() {
        return receivePoint;
    }

}
