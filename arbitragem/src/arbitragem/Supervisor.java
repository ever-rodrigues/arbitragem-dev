package arbitragem;

import javax.swing.text.Position;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Supervisor extends Referee{

    public Supervisor(String name,String position) {
        super(name,position);
    }


    private Set<Event> eventsToDO = new LinkedHashSet<>();
    private Set<Event> eventsDone = new LinkedHashSet<>();

   public void addEventsMatch(Event events){
       this.eventsToDO.addAll(events.getMatches());
        events.getOnSupervisors().add(this);
   }
   public void addEventsTraining(Event events){
       this.eventsToDO.addAll(events.getTrainingPrograms());
       events.getOnSupervisors().add(this);
   }


    public void develop() {
        Optional<Event> events = this.eventsToDO.stream().findFirst();
        if (events.isPresent()) {
            this.eventsDone.add(events.get());
            this.eventsToDO.remove(events.get());
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




    public Set<Event> getEventsToDO() {
        return eventsToDO;
    }

    public void setEventsToDO(Set<Event> eventsToDO) {
        this.eventsToDO = eventsToDO;
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
        Supervisor that = (Supervisor) o;
        return Objects.equals(eventsToDO, that.eventsToDO) && Objects.equals(eventsDone, that.eventsDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eventsToDO, eventsDone);
    }
}
