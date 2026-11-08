public class Calculadora {
    public int divide(int a, int b) {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }
        return a / b;
    }
    }
}