package hms.ctap.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by isuru on 12/18/14.
 */
public class MySqlUssdSessionContextEntry implements UssdSessionContextEntry {

    @Id
    String id;

    @Column(name = "key", nullable = false)
    String key;

    @Column(name = "value", nullable = false)
    String value;

    @ManyToOne
    @JoinColumn(name="session_id", referencedColumnName = "session_id")
    MysqlUssdSession sessionId;

    public MySqlUssdSessionContextEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MysqlUssdSession getSessionId() {
        return sessionId;
    }

    public void setSessionId(MysqlUssdSession sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    public String value() {
        return value;
    }
}
