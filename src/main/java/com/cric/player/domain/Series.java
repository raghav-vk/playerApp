package com.cric.player.domain;

import java.util.Date;
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
public class Series {
	private String seriesName;
	private List<Teams> teamsInvolved;
	private String seriesLocation;
	private String seriesWinner;
	private String seriesRunnerup;
	private Date startDate;
	private Date endDate;
}
