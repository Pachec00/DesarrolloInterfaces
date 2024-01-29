package actividad3.service;

public class AnimalesNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8765791721914674587L;

	public AnimalesNotFoundException() {
		super();
	}

	public AnimalesNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AnimalesNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AnimalesNotFoundException(String message) {
		super(message);
	}

	public AnimalesNotFoundException(Throwable cause) {
		super(cause);
	}

}
