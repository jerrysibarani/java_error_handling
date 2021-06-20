package errorhandling;

public class ErrorHandling1 {

    public static void main(String[] args) {

        try {
            int number = 10 / 5;
            System.out.println("Nilainya adalah: " + number);
            
        } catch (ArithmeticException e) {
            System.out.println("Erornya: " + e);
        }
        finally{
            System.out.println("Coding ini tetap dijalankan");
        }        
        System.out.println("Coding diluat statement try and catch..");        
        
    }
}
