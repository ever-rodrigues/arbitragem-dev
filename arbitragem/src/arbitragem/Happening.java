package arbitragem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Happening {
    private String eventType;
    private int eventTime;

    private Set<Match> matchList = new LinkedHashSet<>();
    private Set<Var> varList = new LinkedHashSet<>();
    private Set<Supervisor> supervisorList = new LinkedHashSet<>();
    private Set<Training> trainingList = new LinkedHashSet<>();
    private Set<Subject> subjects = new LinkedHashSet<>();


    public Set<Supervisor> getSupervisorList() {
        return supervisorList;
    }

    public void setSupervisorList(Set<Supervisor> supervisorList) {
        this.supervisorList = supervisorList;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getEventTime() {
        return eventTime;
    }

    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }

    public Set<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(Set<Match> matchList) {
        this.matchList = matchList;
    }

    public Set<Var> getVarList() {
        return varList;
    }

    public void setVarList(Set<Var> varList) {
        this.varList = varList;
    }

    public Set<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(Set<Training> trainingList) {
        this.trainingList = trainingList;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Happening happening = (Happening) o;
        return eventTime == happening.eventTime && Objects.equals(eventType, happening.eventType) && Objects.equals(matchList, happening.matchList) && Objects.equals(varList, happening.varList) && Objects.equals(supervisorList, happening.supervisorList) && Objects.equals(trainingList, happening.trainingList) && Objects.equals(subjects, happening.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, eventTime, matchList, varList, supervisorList, trainingList, subjects);
    }

}
