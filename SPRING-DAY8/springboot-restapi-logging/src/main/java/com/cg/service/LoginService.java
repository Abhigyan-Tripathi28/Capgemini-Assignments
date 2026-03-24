package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.UserBean;
import com.cg.repo.IUserBeanRepo;

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	private IUserBeanRepo ubrepo;
	
//	public LoginService(IUserBeanRepo ubrepo) {
//		// TODO Auto-generated constructor stub
//		this.ubrepo=ubrepo;
//	}

	@Override
	public UserBean validateUser(UserBean ub) {
		// TODO Auto-generated method stub
		Optional<UserBean> op =ubrepo.findById(ub.getUserID());
		
		if(op.isPresent()) {
			if(op.get().getPass().equals(ub.getPass())) {
				return op.get();
			}
		}
		return null;
	}

}
