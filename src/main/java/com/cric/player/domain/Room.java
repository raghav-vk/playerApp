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
public class Room {
	private int noOfUsersAllowed;
	private float priceMoney;
	private float entryFee;
	private List<User> users;
	private String winner;
	private String runner;
}
