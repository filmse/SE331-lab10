package camt.se331.shoppingcart.entity.transfer;

import java.util.Map;

/**
 * Created by Film on 4/25/2016.
 */
public class UserTransfer {
    private final String name;
    private final Map<String, Boolean> roles;

    public UserTransfer(String name, Map<String, Boolean> roles) {
        this.name = name;
        this.roles = roles;
    }

    public Map<String, Boolean> getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }
}
