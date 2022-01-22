package arbitragem.events;

import arbitragem.Details;
import arbitragem.Team.Stadium;
import arbitragem.Team.Team;

public class Match extends Details {
    private Team teamHome;
    private Team teamAway;
    private Stadium stadium;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void createMatch(Team teamHome, Team teamAway, Stadium stadium,String date){
        this.teamHome=teamHome;
        this.teamAway=teamAway;
        this.stadium=stadium;
        this.date=date;

    }
    @Override
    public double calcXP() {
        return XP_DEFAULT+30;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Team teamAway) {
        this.teamAway = teamAway;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "Match{"
                +" Date: "+ date
                +" teamHome= " + teamHome +
                ", teamAway= " + teamAway +
                ", stadium= '" + stadium + '\'' +
                '}';
    }
}
