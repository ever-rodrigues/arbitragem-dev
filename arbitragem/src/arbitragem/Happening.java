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
    private Set<Referee> refereeList = new LinkedHashSet<>();
    private Set<Training> trainingList = new LinkedHashSet<>();


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

    public Set<Referee> getRefereeList() {
        return refereeList;
    }

    public void setRefereeList(Set<Referee> refereeList) {
        this.refereeList = refereeList;
    }

    public Set<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(Set<Training> trainingList) {
        this.trainingList = trainingList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Happening happening = (Happening) o;
        return eventTime == happening.eventTime && Objects.equals(eventType, happening.eventType) && Objects.equals(matchList, happening.matchList) && Objects.equals(refereeList, happening.refereeList) && Objects.equals(trainingList, happening.trainingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, eventTime, matchList, refereeList, trainingList);
    }

    @Override
    public String toString() {
        return "Happening{" +
                "eventType='" + eventType + '\'' +
                ", eventTime=" + eventTime +
                ", matchList=" + matchList +
                ", refereeList=" + refereeList +
                ", trainingList=" + trainingList +
                '}';
    }
}
