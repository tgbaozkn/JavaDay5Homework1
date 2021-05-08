package nLayeredECommerce.business.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface CheckService {
   

    boolean passwordConfirming(User user);
    boolean emailConfirming(User user);
    boolean firstLastNameConfirm(User user);
}

