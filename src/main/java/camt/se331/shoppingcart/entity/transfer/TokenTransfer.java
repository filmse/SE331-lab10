package camt.se331.shoppingcart.entity.transfer;

/**
 * Created by Film on 4/25/2016.
 */

public class TokenTransfer {
    private final String token;
    public TokenTransfer(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
