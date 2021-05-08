package nLayeredECommerce.business.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface EmailService {
	void sendMessage(String email);
	void vericiationMail(User user , String email);
	
}
