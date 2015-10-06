package com.cric.player.domain;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum PlayerType {
	ALL_ROUNDER,
	BATSMAN,
	BOWLER, 
	WICKET_KEEPER,
	OTHER;

    public String value() {
        return name();
    }

    public static PlayerType fromValue(String v) {
        return valueOf(v);
    }	
}
