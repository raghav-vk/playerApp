package com.cric.player.repository;

import com.cric.player.domain.User;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = User.class)
public interface UserRepository {

    List<com.cric.player.domain.User> findAll();

}
