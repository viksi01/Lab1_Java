package Task1;

public class Task1 {
    public static void main(String[] args) {
        final int result = calculator(6, 2, '/');
        System.out.println(result);
    }

    private static int calculator(final int firstNumber, final int secondNumber, final char operator) {
        final char ADDITION = '+';
        final char SUBSTRUCTION = '-';
        final char MULTIPLICATION = '*';
        final char DIVISION = '/';

        switch (operator) {
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBSTRUCTION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber == 0) {
                    System.out.println("The number can't be divided by zero");

                } else {
                    return firstNumber / secondNumber;
                }
            default:
                System.out.println("Wrong operand");
        }
        return 0;
    }
}
