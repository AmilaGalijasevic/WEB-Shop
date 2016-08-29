package BO;

import DTO.User;

public interface UserBO {

	public User validateUser(String email, String pass);

	public boolean addUser(User user);

	public boolean deleteUser(String email, String pass);

}
