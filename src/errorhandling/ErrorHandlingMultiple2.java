package errorhandling;

public class ErrorHandlingMultiple2 {

    public static void main(String[] args) {
        try {

            int num = 10 / 0;
            System.out.println("nilai1: " + num);

            int[] number = {1, 2, 3};
            System.out.println("nilai2: " + number[3]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e2) {

            System.out.println("Catch Error2: " + e2);

        } finally {
            System.out.println("Terakhir dieksekusi");
        }

        System.out.println("Diluar try and catch");
    }

}
