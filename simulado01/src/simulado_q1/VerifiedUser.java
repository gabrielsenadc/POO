package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User {
    private java.util.Date verifiedDate;

    public VerifiedUser(String name, Date verifiedDate) {
        super(name);
        this.verifiedDate = verifiedDate;
    }
    


}
