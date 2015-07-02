package com.yomisupply.controller.admin;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yomisupply.domain.User;
import com.yomisupply.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;

//	@Autowired
//	private ModelService modelService;

	@RequestMapping(value = "/checklogin", method = RequestMethod.POST)
	public String checklogin(
			@RequestParam(value = "username", required = false, defaultValue = "") String username,
			@RequestParam(value = "password",required = false,defaultValue = "")String password) {
		User user = userService.getUserByUsernamePassword(username, password);
		if(user == null){
			
		}
		return null;
	}

//	@RequestMapping(value = "/getModelById", method = RequestMethod.GET)
//	@ResponseBody
//	public Object getModelByid(
//			@RequestParam(value = "id", required = false, defaultValue = "") String id) {
////		Model model = modelService.getModelById(id);
////		System.out.println(model);
////		return model;
//		return null;
//	}
//
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
//	public String insert(
//			@RequestParam(value = "username", required = false, defaultValue = "") String username) {
////		try {
////			userService.insertUser(username);
////			return "ok";
////		} catch (Exception e) {
////			e.printStackTrace();
////			return "error";
////		}
//		return null;
//	}
//
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public void test(HttpServletResponse response, PrintWriter out) {
//		out.write("test");
//	}
}
