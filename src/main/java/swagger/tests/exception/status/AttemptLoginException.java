package swagger.tests.exception.status;

import java.util.Map;

public class AttemptLoginException extends HttpStatusException {

    public AttemptLoginException() {
    }

    public AttemptLoginException(final String message) {
        super(message);
    }

    public AttemptLoginException(final String key, final String value) {
        super(key, value);
    }

    public AttemptLoginException(final Map<String, String> additionalInformation) {
        super(additionalInformation);
    }

    @Override
    public int getStatusCode() {
        return 401;
    }
}
