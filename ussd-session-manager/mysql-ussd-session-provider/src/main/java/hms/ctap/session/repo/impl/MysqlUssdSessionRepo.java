package hms.ctap.session.repo.impl;

import hms.ctap.domain.UssdSession;
import hms.ctap.session.repo.UssdSessionRepo;

/**
 * Created by isuru on 12/18/14.
 */
public class MysqlUssdSessionRepo implements UssdSessionRepo {

    @Override
    public UssdSession upsert(UssdSession ussdSession) {
        return null;
    }

    public void remove(UssdSession ussdSession) {

    }

    @Override
    public UssdSession query(String sessionId) {
        return null;
    }
}
