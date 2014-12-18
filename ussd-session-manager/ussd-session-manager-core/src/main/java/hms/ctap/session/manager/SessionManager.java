package hms.ctap.session.manager;

import com.google.common.base.Optional;
import hms.ctap.domain.UssdSession;

/**
 * Created by isuru on 12/18/14.
 */
public interface SessionManager {

    UssdSession ussdSession(String sessionId);

    UssdSession processInput(String sessionId, String input);

}
