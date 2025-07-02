public static void example() throws ArithmeticException {
    int result = 36 / 0;
}
public static void main(String[] args) {
    try {
        example();
    } catch (ArithmeticException e) {
        System.out.println(e);
    }
}
