package OOPs_Basics.encapsulation;

import java.io.Serializable;

public class UserBean implements Serializable{	//rule-1 : Must be public and implement Serializable(i)
	private String userName,password;	//rule-2 : data members and member functions must private
	
	public UserBean() {
		//constructor should be public
	}
	
	// rule-3 : must have public getters and setters
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return this.userName;
	}
	public String getPassword() {
		return this.password;
	}
}
