package com.cg.cltr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.UserBean;
import com.cg.service.ILoginService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private ILoginService ls;
	
	@PostMapping("/login")
	public String login(@RequestBody UserBean ub, HttpSession ses) {
		UserBean u = ls.validateUser(ub);
		if(u != null) {
			ses.setAttribute("name", ub.getUserID());
			return "login success";
		}
		else {
			return "invalid cred";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession ses) {
		if(ses.getAttribute("name")!=null) {
			ses.invalidate();
		}
		return "logout success";
	}

}
