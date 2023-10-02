package Task2;

public class Task2 {
    public static void main(String[] args) {
        final String[] input = {"Hi", "WoRlD", "man"};


        for (int i = 0; i < input.length - 1; i++) {
            int uppercaseCount1 = countUppercaseLetters(input[i]);
            int uppercaseCount2 = countUppercaseLetters(input[i + 1]);

            if (uppercaseCount1 < uppercaseCount2) {
                String temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
            }
        }

        //===========================================================================

        for (String str : input)

        {
            System.out.println(str);
        }
    }


    private static int countUppercaseLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
