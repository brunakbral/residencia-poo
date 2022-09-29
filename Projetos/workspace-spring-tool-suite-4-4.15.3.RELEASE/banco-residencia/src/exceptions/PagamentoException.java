package exceptions;

public class PagamentoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PagamentoException() {
		super();
	}

	public PagamentoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PagamentoException(String message) {
		super(message);
	}

	public PagamentoException(Throwable cause) {
		super(cause);
	}



}
