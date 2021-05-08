package nLayeredECommerce.entities.concretes;

public class User {
	int id ;
	String name ; 
	String lastname;
	String mail ;
	String password;
	public User() {
		
	}
	public User(int id, String name, String lastname, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
