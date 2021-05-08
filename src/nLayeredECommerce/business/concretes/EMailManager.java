package nLayeredECommerce.business.concretes;

import nLayeredECommerce.business.abstracts.EmailService;
import nLayeredECommerce.entities.concretes.User;

public class EMailManager implements EmailService {
	

	@Override
	public void sendMessage(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vericiationMail(User user, String email) {
		if(user.getMail() == email) {
			System.out.println("Your membership is realized successfully");
		}
		else {
			System.out.println("the verification mail is invalid.");
		}
		// TODO Auto-generated method stub
		
	}

}
