package arbitragem;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Var extends Referee{

    private Set<Event> eventsToDo = new LinkedHashSet<>();
    private Set<Event> eventsDone = new LinkedHashSet<>();

    public Var(String name,String position) {
        super(name,position);
    }


    public void addEventsMatch(Event events){
        this.eventsToDo.addAll(events.getMatches());
        events.getOnVars().add(this);
    }

    public void addEventsTraining(Event events){
        this.eventsToDo.addAll(events.getTrainingPrograms());
        events.getOnVars().add(this);
    }

    public void develop() {
        Optional<Event> events = this.eventsToDo.stream().findFirst();
        if (events.isPresent()) {
            this.eventsDone.add(events.get());
            this.eventsToDo.remove(events.get());
        }
        else {
            System.out.println("You already did this Event");
        }
    }

    public double calcTotalXP(){
        return this.eventsDone
                .stream()
                .mapToDouble(Event::calcXP)
                .sum();
    }

    public Set<Event> getEventsToDo() {
        return eventsToDo;
    }

    public void setEventsToDo(Set<Event> eventsToDo) {
        this.eventsToDo = eventsToDo;
    }

    public Set<Event> getEventsDone() {
        return eventsDone;
    }

    public void setEventsDone(Set<Event> eventsDone) {
        this.eventsDone = eventsDone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Var var = (Var) o;
        return Objects.equals(eventsToDo, var.eventsToDo) && Objects.equals(eventsDone, var.eventsDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eventsToDo, eventsDone);
    }
}
