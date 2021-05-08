package nLayeredECommerce.core;

import nLayeredECommerce.JGoogle.JGoogleManager;

public class jGoogleManagerAdapter implements LoggerService{


	@Override
	public void logToSystem() {
		// TODO Auto-generated method stub
		JGoogleManager googlemanager = new JGoogleManager();
		System.out.println("baþka yetkilendirme servisine adapte olabilir durumda.");
		googlemanager.log();
	}

}
