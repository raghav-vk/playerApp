// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cric.player.domain;

import com.cric.player.domain.Teams;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect Teams_Roo_Mongo_Entity {
    
    declare @type: Teams: @Persistent;
    
    @Id
    private BigInteger Teams.id;
    
    public BigInteger Teams.getId() {
        return this.id;
    }
    
    public void Teams.setId(BigInteger id) {
        this.id = id;
    }
    
}
