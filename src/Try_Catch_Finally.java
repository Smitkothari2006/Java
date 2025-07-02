public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int result = 36 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            int result = 36 / 6;
            System.out.println("Finally block result:" + result);
        }
    }
}