package com.cric.player.domain;

import javax.xml.bind.annotation.XmlEnum;


@XmlEnum
public enum TeamType {
    T20,
    ODI,
    TEST;

    public String value() {
        return name();
    }

    public static TeamType fromValue(String v) {
        return valueOf(v);
    }

}
