package hms.ctap.domain;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by isuru on 12/18/14.
 */
@Table(name = "ussd_session")
public class MysqlUssdSession implements UssdSession {

    @Column(name = "mobile_no", unique = false, nullable = false)
    private String mobileNo;

    @Id
    @Column(name = "session_id", unique = true, nullable = false)
    private String sessionId;

    @Column(name = "ussd_menu", unique = false, nullable = false)
    private String ussdMenu;

    @OneToMany
    @JoinColumn(name="session_id", referencedColumnName = "session_id")
    private Set<MySqlUssdSessionContextEntry> sessionContexts;

    public MysqlUssdSession() {
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUssdMenu() {
        return ussdMenu;
    }

    public void setUssdMenu(String ussdMenu) {
        this.ussdMenu = ussdMenu;
    }

    @Override
    public String mobileNo() {
        return mobileNo;
    }

    @Override
    public String sessionId() {
        return sessionId;
    }

    @Override
    public String currentUssdMenu() {
        return ussdMenu;
    }

    @Override
    public UssdSessionContext ussdSessionContext() {
        return null;
    }

    public Set<MySqlUssdSessionContextEntry> getSessionContexts() {
        return sessionContexts;
    }

    public void setSessionContexts(Set<MySqlUssdSessionContextEntry> sessionContexts) {
        this.sessionContexts = sessionContexts;
    }
}
