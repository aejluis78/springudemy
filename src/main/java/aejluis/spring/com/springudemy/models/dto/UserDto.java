package aejluis.spring.com.springudemy.models.dto;

import aejluis.spring.com.springudemy.models.User;

public class UserDto {
	private String title;
	private User user;
	
	
	public UserDto() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
