public class Try_Catch {
    public static void main(String[] args) {
        try {
            int result = 36/0;
        } catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
