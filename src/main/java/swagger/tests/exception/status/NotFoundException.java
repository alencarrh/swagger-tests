package swagger.tests.exception.status;

public class NotFoundException extends HttpStatusException {

    public NotFoundException() {
    }

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final String key, final String value) {
        super(key, value);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }
}
