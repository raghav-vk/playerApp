// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cric.player.domain;

import com.cric.player.domain.Room;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect Room_Roo_Mongo_Entity {
    
    declare @type: Room: @Persistent;
    
    @Id
    private BigInteger Room.id;
    
    public BigInteger Room.getId() {
        return this.id;
    }
    
    public void Room.setId(BigInteger id) {
        this.id = id;
    }
    
}
