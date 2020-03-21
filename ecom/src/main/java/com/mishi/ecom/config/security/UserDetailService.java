package com.mishi.ecom.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mishi.ecom.entity.Users;
import com.mishi.ecom.entity.UsersRepository;
@Service
public class UserDetailService implements UserDetailsService {

	@Autowired
	UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user =  usersRepository.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("No User found");
		
		
		return new com.mishi.ecom.config.security.UserDetails(user) ;
	}

}
