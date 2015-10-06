package com.cric.player.domain;

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
public class Player {
	private String firstName;
	private String lastName;
	private PlayerType playerType;
	private String matches;
	private String innings;
	private String runs;
	private String average;
	private String strikeRate;
	private String hundreds;
	private String fifties;
	private String wickets;
	private String catches;
	private String stumpings;
	private boolean isCaptain;
}
