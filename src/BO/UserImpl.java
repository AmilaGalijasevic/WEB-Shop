package BO;

import java.sql.SQLException;


import DTO.User;

public class UserImpl implements UserBO {
	DAO.UserImpl userDao = new DAO.UserImpl();

	@Override
	public User validateUser(String email, String pass) {
		User u = null;
		try {	
		
		if (email != null && pass != null) {
			System.out.println("bo okej");
			u = userDao.validateUser(email, pass);
		}
		} catch(SQLException s){
			
			s.printStackTrace();
		}
		return u;
	}

	@Override
	public boolean addUser(User user) {
		
		if(user!= null){
			try {
				userDao.addUser(user);
				System.out.println("user bo add user metoda : " + user);
				return true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		return false;
	}

	@Override
	public boolean deleteUser(String email, String pass) {
		try{
		if (email != null && pass != null) {
			userDao.deleteUser(email, pass);
		}
		} catch(SQLException s){
			s.printStackTrace();
		}
		return true;
		
	}

}
