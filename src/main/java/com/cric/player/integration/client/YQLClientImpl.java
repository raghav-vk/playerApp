package com.cric.player.integration.client;

import generated.Query;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.cric.player.domain.Series;
import com.cric.player.domain.Teams;
import com.cric.player.transform.YQLTransformer;

public class YQLClientImpl implements YQLClient{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private String serviceUrl;

	@Value("${yql.team.query}")
	private String teamQuery;
	
	@Value("${yql.service.params}")
	private String serviceParams;
	
	@Autowired
	@Qualifier(value="yqlRestTemplate")
	private RestTemplate restTemplate;
	
	private YQLTransformer yqlTransformer = new YQLTransformer();
	
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	
	@Override
	public Series getUpComingSeries() {

		return null;
	}

	@Override
	public List<Teams> getTeams() {
		logger.debug("Getting All available teams");
		Query teamResp = restTemplate.getForObject(serviceUrl+"q=" + this.teamQuery+this.serviceParams,Query.class);
		return yqlTransformer.transformTeamResponseToTeams(teamResp);
	}
}
