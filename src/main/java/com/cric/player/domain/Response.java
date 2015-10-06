package com.cric.player.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@JsonSerialize(include=Inclusion.NON_NULL)
@XmlRootElement
public class Response {
	protected String code = "200";
	protected String description = "Ok";
	protected List<String> statusDetailCodes;
	protected List<MessageType> messages;
	private User user;
	
	public Response() {}
	public Response(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public Response statusDetailCodes(List<String> detailCodes) {
		this.statusDetailCodes = detailCodes;
		return this;
	}

	public Response messages(List<MessageType> messages) {
		this.messages = messages;
		return this;
	}
	public Response user(User user) {
		this.user = user;
		return this;
	}
}
