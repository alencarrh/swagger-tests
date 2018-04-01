package swagger.tests.exception.status;

public class ServiceUnavailableException extends HttpStatusException {

    public ServiceUnavailableException() {
    }

    public ServiceUnavailableException(final String message) {
        super(message);
    }

    public ServiceUnavailableException(final Throwable cause) {
        super(cause);
    }

    public ServiceUnavailableException(final Throwable cause, final String message) {
        super(message, cause);
    }

    public ServiceUnavailableException(final String key, final String value) {
        super(key, value);
    }

    public ServiceUnavailableException(final Throwable cause, final String key, final String value) {
        super(cause, key, value);
    }

    @Override
    public int getStatusCode() {
        return 503;
    }
}
