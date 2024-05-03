package exception;

public class IllegalArgumentException extends Exception{
    public IllegalArgumentException() {
        super();
    }

    public IllegalArgumentException(String mensagem) {
        super(mensagem);
    }
}
