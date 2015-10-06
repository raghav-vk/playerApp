package com.cric.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cric.player.domain.Teams;
import com.cric.player.integration.client.YQLClient;
import com.cric.player.repository.TeamsRepository;

public class YQLServiceImpl implements YQLService {

	@Autowired
	private YQLClient yqlClient;

	@Autowired
	private TeamsRepository teamsRepository;
	
	@Override
	public void populateTeams() {
		
		List<Teams> teams = yqlClient.getTeams();
		
		for(Teams team : teams) {
			teamsRepository.save(team);
		}
		
	}
}
