package nLayeredECommerce.business.abstracts;

import java.util.List;

import nLayeredECommerce.entities.concretes.User;

public interface UserService {
	void signup(User user);
	void login(User user,String email ,String password);
	void save(User user);
	void delete(User user);
	List<User> getAll();
	
}
