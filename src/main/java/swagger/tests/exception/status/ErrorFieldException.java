package swagger.tests.exception.status;

public class ErrorFieldException extends Throwable{

	public ErrorFieldException(String field) {
		super(field);
	}
}
