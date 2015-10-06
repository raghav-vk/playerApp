package com.cric.player.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cric.player.domain.Response;
import com.cric.player.domain.User;
import com.cric.player.repository.UserRepository;


public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	 	@Override
	 	public Response add(User user) {
	 		List<User> users = userRepository.findAll();
	 		
	 		if(users.size() >= 1) {
	 			// This should never happen this is only for safety
	 			for(User existingUsers : users) 
	 				userRepository.delete(existingUsers);
	 		}
	 		User existingUser = users.get(0);
	 		if(existingUser != null)
	 			return new Response("400", "User already exists");
	 		userRepository.save(user);
	 		Response response = new Response("200", "Success");
	 		return response.user(user);
	 	}
	 
	 	public long countAllUsers() {
	 		return userRepository.count();
	 	}
	 
	 	public void deleteUser(User user) {
	 		userRepository.delete(user);
	 		
	 	}
	 
	 	public List<User> findAllUsers() {
	 		return userRepository.findAll();
	 	}
	 
	 	public User findUser(BigInteger id) {
	 		return (User) userRepository.findOne(id);
	 	}
	 
	 	public List<User> findUserEntries(int arg0, int arg1) {
	 		// TODO Auto-generated method stub
	 		return null;
	 	}
	 
	 	public void saveUser(User arg0) {
	 		// TODO Auto-generated method stub
	 		
	 	}
	 
	 	public User updateUser(User arg0) {
	 		// TODO Auto-generated method stub
	 		return null;
	 	}	

}
