package com.yomisupply.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//	@Autowired
//	private UserService userService;

//	@Autowired
//	private ModelService modelService;

	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	@ResponseBody
	public Object getUserByid(
			@RequestParam(value = "id", required = false, defaultValue = "") String username) {
//		User user = userService.getUserById(id);
//		System.out.println(user);
//		return user;
		return null;
	}

	@RequestMapping(value = "/getModelById", method = RequestMethod.GET)
	@ResponseBody
	public Object getModelByid(
			@RequestParam(value = "id", required = false, defaultValue = "") String id) {
//		Model model = modelService.getModelById(id);
//		System.out.println(model);
//		return model;
		return null;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(
			@RequestParam(value = "username", required = false, defaultValue = "") String username) {
//		try {
//			userService.insertUser(username);
//			return "ok";
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "error";
//		}
		return null;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void test(HttpServletResponse response, PrintWriter out) {
		out.write("test");
	}
}
