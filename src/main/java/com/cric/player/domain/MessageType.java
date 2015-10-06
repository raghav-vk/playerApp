package com.cric.player.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
public class MessageType {
	private String code;
	private String text;
	public MessageType(String code, String text) {
		super();
		this.code = code;
		this.text = text;
	}
	public MessageType() {
		super();
	}
}
