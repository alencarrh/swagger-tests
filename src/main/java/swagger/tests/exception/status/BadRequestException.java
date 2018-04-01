package swagger.tests.exception.status;

import java.util.Map;

public class BadRequestException extends HttpStatusException {

    public BadRequestException() {
    }

    public BadRequestException(final String message) {
        super(message);
    }

    public BadRequestException(final Throwable cause) {
        super(cause);
    }

    public BadRequestException(final Throwable cause, final String message) {
        super(message, cause);
    }

    public BadRequestException(final String key, final String value) {
        super(key, value);
    }

    public BadRequestException(final Map<String, String> additionalInformation) {
        super(additionalInformation);
    }

    public BadRequestException(final Throwable cause, final String key, final String value) {
        super(cause, key, value);
    }

    public BadRequestException(final Throwable cause, final Map<String, String> additionalInformation) {
        super(cause, additionalInformation);
    }

    @Override
    public int getStatusCode() {
        return 400;
    }
}
