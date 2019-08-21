package com.qo.s;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qo.m.*;;

@Service
@Transactional
public interface UserService {

	User saveuser(User user);
	
	User updateuser(User user);
	
	void deleteuser(User user);
	   
    List<User> getallusers();
}
