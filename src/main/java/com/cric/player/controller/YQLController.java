package com.cric.player.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cric.player.domain.Response;
import com.cric.player.service.YQLService;

@RequestMapping("/yql/**")
@Controller
public class YQLController {
	private static final Logger logger = LoggerFactory.getLogger(YQLController.class);
	
	@Autowired
	private YQLService yqlService;
	
    @RequestMapping
    public String index() {
        return "yql/index";
    }
    
	/**
 	 * Add a user.
 	 */
 	@RequestMapping(value = "/populate-teams", method = RequestMethod.GET)
 	@ResponseBody
 	public Response populateTeams() {
 		logger.info("Populate Teams.");
 		yqlService.populateTeams();
 		return new Response("200", "Ok");
 	}
}
