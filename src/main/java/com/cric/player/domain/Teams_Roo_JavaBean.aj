// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cric.player.domain;

import com.cric.player.domain.Player;
import com.cric.player.domain.TeamType;
import com.cric.player.domain.Teams;
import java.util.List;

privileged aspect Teams_Roo_JavaBean {
    
    public String Teams.getTeamName() {
        return this.teamName;
    }
    
    public void Teams.setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public String Teams.getShortName() {
        return this.shortName;
    }
    
    public void Teams.setShortName(String shortName) {
        this.shortName = shortName;
    }
    
    public String Teams.getCountry() {
        return this.country;
    }
    
    public void Teams.setCountry(String country) {
        this.country = country;
    }
    
    public String Teams.getRank() {
        return this.rank;
    }
    
    public void Teams.setRank(String rank) {
        this.rank = rank;
    }
    
    public TeamType Teams.getTeamType() {
        return this.teamType;
    }
    
    public void Teams.setTeamType(TeamType teamType) {
        this.teamType = teamType;
    }
    
    public List<Player> Teams.getAllRounders() {
        return this.allRounders;
    }
    
    public void Teams.setAllRounders(List<Player> allRounders) {
        this.allRounders = allRounders;
    }
    
    public List<Player> Teams.getBatsmans() {
        return this.batsmans;
    }
    
    public void Teams.setBatsmans(List<Player> batsmans) {
        this.batsmans = batsmans;
    }
    
    public List<Player> Teams.getBowlers() {
        return this.bowlers;
    }
    
    public void Teams.setBowlers(List<Player> bowlers) {
        this.bowlers = bowlers;
    }
    
    public List<Player> Teams.getWicketKeepers() {
        return this.wicketKeepers;
    }
    
    public void Teams.setWicketKeepers(List<Player> wicketKeepers) {
        this.wicketKeepers = wicketKeepers;
    }
    
    public List<Player> Teams.getOthers() {
        return this.others;
    }
    
    public void Teams.setOthers(List<Player> others) {
        this.others = others;
    }
    
}