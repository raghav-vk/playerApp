package com.cric.player.integration.client;

import java.util.List;

import com.cric.player.domain.Series;
import com.cric.player.domain.Teams;

public interface YQLClient {

	Series getUpComingSeries();
	
	List<Teams> getTeams();
}
