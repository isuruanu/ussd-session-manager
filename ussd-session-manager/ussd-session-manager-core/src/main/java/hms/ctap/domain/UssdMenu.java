package hms.ctap.domain;

/**
 * Created by isuru on 12/18/14.
 */
public interface UssdMenu {

    String menuContent();

    void inputActionBinding();

    UssdMenu processMenuAction(String input);

}
