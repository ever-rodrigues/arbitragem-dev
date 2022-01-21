package arbitragem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Match extends Event {
    private Teams teamHome;
    private Teams teamAway;
    private String stadium;
    private Referee referee;


    private Set<Var> onVars = new HashSet<>();
    private Set<PitchReferee> onPitchReferees = new HashSet<>();
    private Set<Supervisor> onSupervisors = new HashSet<>();

    public Match(String title, String description, String date, String time, String place) {
        super(title, description, date, time, place);
    }


    public Set<Var> getOnVars() {
        return onVars;
    }

    public void setOnVars(Set<Var> onVars) {
        this.onVars = onVars;
    }

    public Set<PitchReferee> getOnPitchReferees() {
        return onPitchReferees;
    }

    public void setOnPitchReferees(Set<PitchReferee> onPitchReferees) {
        this.onPitchReferees = onPitchReferees;
    }

    public Set<Supervisor> getOnSupervisors() {
        return onSupervisors;
    }

    public void setOnSupervisors(Set<Supervisor> onSupervisors) {
        this.onSupervisors = onSupervisors;
    }

    @Override
    public double calcXP(){
        return XP_DEFAULT+10;
    }


    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Teams getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Teams teamHome) {
        this.teamHome = teamHome;
    }

    public Teams getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Teams teamAway) {
        this.teamAway = teamAway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Match match = (Match) o;
        return Objects.equals(teamHome, match.teamHome) && Objects.equals(teamAway, match.teamAway) && Objects.equals(stadium, match.stadium) && Objects.equals(referee, match.referee) && Objects.equals(onVars, match.onVars) && Objects.equals(onPitchReferees, match.onPitchReferees) && Objects.equals(onSupervisors, match.onSupervisors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teamHome, teamAway, stadium, referee, onVars, onPitchReferees, onSupervisors);
    }
}
