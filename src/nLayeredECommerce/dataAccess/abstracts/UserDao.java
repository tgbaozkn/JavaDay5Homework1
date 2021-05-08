package nLayeredECommerce.dataAccess.abstracts;

import java.util.List;

import nLayeredECommerce.entities.concretes.User;


public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id); //bana bir tane id ver sana o userý gostereyim
	List<User> getAll();
}
