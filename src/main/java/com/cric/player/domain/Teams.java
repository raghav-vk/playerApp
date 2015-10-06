package com.cric.player.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
@JsonSerialize(include=Inclusion.NON_NULL)
@XmlRootElement
public class Teams {
	private String teamName;
	private String shortName;
	private String country;
	private String rank;
	private TeamType teamType;
	private List<Player> allRounders;
	private List<Player> batsmans;
	private List<Player> bowlers;
	private List<Player> wicketKeepers;
	private List<Player> others;
	
}
