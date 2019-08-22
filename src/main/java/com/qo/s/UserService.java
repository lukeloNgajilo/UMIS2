package com.qo.s;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qo.m.*;

@Service
@Transactional
public interface UserService {

	Users saveuser(Users user);
	
	Users updateuser(Users user);
	
	void deleteuser(Users user);
	   
    List<Users> getallusers();
}
