package com.cric.player.repository;

import com.cric.player.domain.Teams;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Teams.class)
public interface TeamsRepository {

    List<com.cric.player.domain.Teams> findAll();
}
