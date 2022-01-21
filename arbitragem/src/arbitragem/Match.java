package arbitragem;

public class Match extends Subject {
    private Team teamHome;
    private Team teamAway;
    private String stadium;

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

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "Match{"
                +" Date: "+ getDate()
                +" teamHome= " + teamHome +
                ", teamAway= " + teamAway +
                ", stadium= '" + stadium + '\'' +
                '}';
    }
}
