package work01;

public class Utilitor {
    //1.2
    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException();

        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();

        }
        return value;

    }

    //1.3
    public static double testPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }
    //1.4
    public static long  computelsbn10(long isbn10){
        int sum = 0;

        for (int i=1; i<=9; i++) {
            long currentDigit = isbn10 % 10;
            sum += (int) (currentDigit * i);
            isbn10 /= 10;
        }

        int checkDigit = 11 - (sum % 11);
        return checkDigit;

    }


}
