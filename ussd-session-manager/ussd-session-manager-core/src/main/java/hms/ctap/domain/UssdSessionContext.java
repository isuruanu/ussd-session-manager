package hms.ctap.domain;

import com.google.common.base.Optional;

import java.util.Map;

/**
 * Created by isuru on 12/18/14.
 */
public interface UssdSessionContext {
    
    Map<String, String> getContext();

    Optional<String> getValue(String key);

}
