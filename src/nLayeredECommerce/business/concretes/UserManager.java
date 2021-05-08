package nLayeredECommerce.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import nLayeredECommerce.entities.concretes.User;
import nLayeredECommerce.business.abstracts.CheckService;
import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.dataAccess.concretes.GmailUserDao;
public class UserManager implements UserService, CheckService{
	private GmailUserDao gmailuserdao;
	boolean deger = true;
	String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	@Override
	public void signup(User user) {
		if(passwordConfirming(user) && emailConfirming(user) && firstLastNameConfirm(user)) {
			save(user);
			gmailuserdao.add(user);
			
		}
	 
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+ " "+ user.getLastname()+"   You are registered.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user, String email, String password) {
		if(user.getMail() == email && user.getPassword() == password) {
		
			System.out.println("Sisteme baþarýlý bir þekilde giriþ yaptýnýz.");
		}
		else {
			System.out.println("Hatalý kullanýcý adý ya da þifre!");
		}
		
		
	}



	@Override
	public boolean passwordConfirming(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println(passwordConfirming(user)+"You have to change your password, It's length must be equal to 6 or more than 6. ");
			deger = !deger;
		}
		else if(user.getPassword().length() < 6)
		{
			System.out.println(passwordConfirming(user)+"Your password  is suitable for 	membership.");
			
			
		}
		// TODO Auto-generated method stub
		return deger;
	}

	@Override
	public boolean emailConfirming(User user) {
		if (pattern.matcher(user.getMail()).find()) {
			System.out.println(emailConfirming(user));
			
		}
		else {
			deger = !deger;
			System.out.println("Yanlýþ email");
		}
		// TODO Auto-generated method stub
		return deger;
	}

	@Override
	public boolean firstLastNameConfirm(User user) {
		if(user.getName().length() >=2 && user.getLastname().length() >= 2) {
			deger = true;
		}
		else {
			deger = !deger;
			System.out.println("Ad ve sýyad en az iki karakterden oluþmalýdýr.");
		}
		// TODO Auto-generated method stub
		return deger;
	}



}
