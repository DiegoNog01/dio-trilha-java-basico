public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo numero deve ser maior que o primeiro");
    }
}