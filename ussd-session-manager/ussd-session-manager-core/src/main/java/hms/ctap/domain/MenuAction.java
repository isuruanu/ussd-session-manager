package hms.ctap.domain;

/**
 * Created by isuru on 12/18/14.
 */
public interface MenuAction {
     UssdMenu onAction(UssdSessionContext ctx);
}
