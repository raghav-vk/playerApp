package com.cric.player.transform;

import generated.Query;
import generated.Query.Results.Team;

import java.util.ArrayList;
import java.util.List;

import com.cric.player.domain.Teams;

public class YQLTransformer {

	public List<Teams> transformTeamResponseToTeams(Query teamResp) {
		List<Teams> teams = new ArrayList<Teams>();
		List<Team> yqlTeams = teamResp.getResults().getTeam();
		for(Team yqlTeam : yqlTeams ) {
			Teams team = new Teams();
			team.setShortName(yqlTeam.getShortName());
			team.setTeamName(yqlTeam.getTeamName());
			teams.add(team);
		}
		
		return teams;
	}

}
