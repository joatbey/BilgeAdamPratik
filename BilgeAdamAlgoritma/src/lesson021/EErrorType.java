package lesson021;

public enum EErrorType {

	OUT_OF_BOUNDS(1001, "Sınırlarının dışında!!!"),
	SEAT_ALREADY_OCCPUIED(1002, "Seçilen yer dolu!!!");

	private String message;
	private int code;

	private EErrorType() {

	}

	private EErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}