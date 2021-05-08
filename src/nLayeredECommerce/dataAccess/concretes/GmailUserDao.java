package nLayeredECommerce.dataAccess.concretes;

import java.util.List;

import nLayeredECommerce.dataAccess.abstracts.UserDao;
import nLayeredECommerce.entities.concretes.User;

public class GmailUserDao implements UserDao {
	List<User> users;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google ile veritabanýna eklendi: " + user.getName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return users.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
