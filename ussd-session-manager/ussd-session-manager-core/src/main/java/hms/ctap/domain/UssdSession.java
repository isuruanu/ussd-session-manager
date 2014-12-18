package hms.ctap.domain;

/**
 * Created by isuru on 12/18/14.
 */
public interface UssdSession {

    String mobileNo();

    String sessionId();

    String currentUssdMenu();

    UssdSessionContext ussdSessionContext();
}
