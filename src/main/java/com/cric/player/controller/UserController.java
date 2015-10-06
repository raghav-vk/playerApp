package com.cric.player.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cric.player.domain.Response;
import com.cric.player.domain.User;
import com.cric.player.exceptions.BadRequestException;
import com.cric.player.service.UserService;

@RequestMapping("/user/**")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@Autowired
	private UserService userService;
	
    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "user/index";
    }
    
	/**
 	 * Add a user.
 	 */
 	@RequestMapping(value = "/add", method = RequestMethod.POST)
 	@ResponseBody
 	public Response add(@RequestBody User user) {
 		logger.info("Welcome home! Add user {}.", user);
 		if(user == null)
 			throw new BadRequestException("Required parameters missing in request: " + user);
 		
 		return userService.add(user);
 	}
    
}
