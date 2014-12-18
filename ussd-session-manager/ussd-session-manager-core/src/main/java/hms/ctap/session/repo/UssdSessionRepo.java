package hms.ctap.session.repo;

import hms.ctap.domain.UssdSession;

/**
 * Created by isuru on 12/18/14.
 */
/*
Mysql, mongo, derby, in-memory implementations are planned.
* */
public interface UssdSessionRepo {

    UssdSession upsert(UssdSession ussdSession);

    UssdSession query(String sessionId);

}
