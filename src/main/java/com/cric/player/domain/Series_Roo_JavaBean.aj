// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cric.player.domain;

import com.cric.player.domain.Series;
import com.cric.player.domain.Teams;
import java.util.Date;
import java.util.List;

privileged aspect Series_Roo_JavaBean {
    
    public String Series.getSeriesName() {
        return this.seriesName;
    }
    
    public void Series.setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
    
    public List<Teams> Series.getTeamsInvolved() {
        return this.teamsInvolved;
    }
    
    public void Series.setTeamsInvolved(List<Teams> teamsInvolved) {
        this.teamsInvolved = teamsInvolved;
    }
    
    public String Series.getSeriesLocation() {
        return this.seriesLocation;
    }
    
    public void Series.setSeriesLocation(String seriesLocation) {
        this.seriesLocation = seriesLocation;
    }
    
    public String Series.getSeriesWinner() {
        return this.seriesWinner;
    }
    
    public void Series.setSeriesWinner(String seriesWinner) {
        this.seriesWinner = seriesWinner;
    }
    
    public String Series.getSeriesRunnerup() {
        return this.seriesRunnerup;
    }
    
    public void Series.setSeriesRunnerup(String seriesRunnerup) {
        this.seriesRunnerup = seriesRunnerup;
    }
    
    public Date Series.getStartDate() {
        return this.startDate;
    }
    
    public void Series.setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date Series.getEndDate() {
        return this.endDate;
    }
    
    public void Series.setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
