package arbitragem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class EventSchedule {
    private String eventType;
    private int eventTime;

    private Set<Match> matchList = new LinkedHashSet<>();
    private Set<Var> varList = new LinkedHashSet<>();
    private Set<PitchReferee> pitchRefereeList = new HashSet<>();
    private Set<Supervisor> supervisorList = new LinkedHashSet<>();
    private Set<Training> trainingList = new LinkedHashSet<>();
    private Set<Details> details = new LinkedHashSet<>();


    public Set<PitchReferee> getPitchRefereeList() {
        return pitchRefereeList;
    }

    public void setPitchRefereeList(Set<PitchReferee> pitchRefereeList) {
        this.pitchRefereeList = pitchRefereeList;
    }

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

    public Set<Details> getSubjects() {
        return details;
    }

    public void setSubjects(Set<Details> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventSchedule eventSchedule = (EventSchedule) o;
        return eventTime == eventSchedule.eventTime && Objects.equals(eventType, eventSchedule.eventType) && Objects.equals(matchList, eventSchedule.matchList) && Objects.equals(varList, eventSchedule.varList) && Objects.equals(pitchRefereeList, eventSchedule.pitchRefereeList) && Objects.equals(supervisorList, eventSchedule.supervisorList) && Objects.equals(trainingList, eventSchedule.trainingList) && Objects.equals(details, eventSchedule.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, eventTime, matchList, varList, pitchRefereeList, supervisorList, trainingList, details);
    }

    @Override
    public String toString() {
        return "EventSchedule{" +
                "eventType='" + eventType + '\'' +"\n"+
                ", details=" + details +"\n"+
                ", eventTime=" + eventTime +"hs"+"\n"+
                ", varList=" + varList +"\n"+
                ", pitchRefereeList=" + pitchRefereeList +"\n"+
                ", supervisorList=" + supervisorList +"\n"+
                '}';
    }
}
