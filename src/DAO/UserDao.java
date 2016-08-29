package DAO;

import java.sql.SQLException;

import DTO.User;

public interface UserDao {
	
	public User validateUser(String email, String pass) throws SQLException;
	
	public boolean addUser(User user) throws SQLException;
	
	public boolean deleteUser(String email, String pass) throws SQLException;
	
	
}
