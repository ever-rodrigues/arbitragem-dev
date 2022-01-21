package arbitragem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Match extends Event {
    private String home;
    private String away;
    private String stadium;
    private Referee referee;


    private Set<Var> onVars = new HashSet<>();
    private Set<PitchReferee> onPitchReferees = new HashSet<>();
    private Set<Supervisor> onSupervisors = new HashSet<>();

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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Match match = (Match) o;
        return Objects.equals(home, match.home) && Objects.equals(away, match.away) && Objects.equals(stadium, match.stadium) && Objects.equals(referee, match.referee) && Objects.equals(onVars, match.onVars) && Objects.equals(onPitchReferees, match.onPitchReferees) && Objects.equals(onSupervisors, match.onSupervisors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), home, away, stadium, referee, onVars, onPitchReferees, onSupervisors);
    }
}
