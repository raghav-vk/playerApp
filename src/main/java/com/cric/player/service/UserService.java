package com.cric.player.service;

import org.springframework.roo.addon.layers.service.RooService;

import com.cric.player.domain.Response;
import com.cric.player.domain.User;

@RooService(domainTypes = { com.cric.player.domain.User.class })
public interface UserService {

	Response add(User user);
}
