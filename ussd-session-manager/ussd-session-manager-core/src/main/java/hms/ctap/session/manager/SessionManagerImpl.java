package hms.ctap.session.manager;

import com.google.common.base.Optional;
import hms.ctap.domain.UssdSession;
import hms.ctap.session.repo.UssdSessionRepo;

/**
 * Created by isuru on 12/18/14.
 */
public class SessionManagerImpl implements SessionManager {

    private final UssdSessionRepo ussdSessionRepo;

    public SessionManagerImpl(UssdSessionRepo ussdSessionRepo) {
        this.ussdSessionRepo = ussdSessionRepo;
    }

    @Override
    public UssdSession ussdSession(String sessionId) {
        return null;
    }

    @Override
    public UssdSession processInput(String sessionId, String input) {
        return null;
    }
}
