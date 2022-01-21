package arbitragem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Event {
    protected static final double XP_DEFAULT=10;
    private String title;
    private String description;
    private Date date;
    private Time time;
    private String place;


    private Set<Match> matches = new LinkedHashSet<>();
    private Set<TrainingProgram> trainingPrograms = new LinkedHashSet<>();
    private Set<Referee> onReferees = new HashSet<>();
    private Set<Var> onVars = new HashSet<>();
    private Set<Supervisor> onSupervisors = new HashSet<>();



    public abstract double calcXP();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }

    public Set<TrainingProgram> getTrainingPrograms() {
        return trainingPrograms;
    }

    public void setTrainingPrograms(Set<TrainingProgram> trainingPrograms) {
        this.trainingPrograms = trainingPrograms;
    }

    public Set<Referee> getOnReferees() {
        return onReferees;
    }

    public void setOnReferees(Set<Referee> onReferees) {
        this.onReferees = onReferees;
    }

    public Set<Var> getOnVars() {
        return onVars;
    }

    public void setOnVars(Set<Var> onVars) {
        this.onVars = onVars;
    }

    public Set<Supervisor> getOnSupervisors() {
        return onSupervisors;
    }

    public void setOnSupervisors(Set<Supervisor> onSupervisors) {
        this.onSupervisors = onSupervisors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(description, event.description) && Objects.equals(date, event.date) && Objects.equals(time, event.time) && Objects.equals(place, event.place) && Objects.equals(matches, event.matches) && Objects.equals(trainingPrograms, event.trainingPrograms) && Objects.equals(onReferees, event.onReferees) && Objects.equals(onVars, event.onVars) && Objects.equals(onSupervisors, event.onSupervisors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, date, time, place, matches, trainingPrograms, onReferees, onVars, onSupervisors);
    }
}
