package arbitragem.referee;

import arbitragem.Details;
import arbitragem.events.EventSchedule;

import java.time.LocalDateTime;
import java.util.*;

public class Supervisor extends Referee{

    private Set<Details> eventsToDo = new LinkedHashSet<>();
    private Set<Details> eventsDone = new LinkedHashSet<>();

    public void addHappening(EventSchedule eventSchedule){
        this.eventsToDo.addAll(eventSchedule.getSubjects());
        eventSchedule.getSupervisorList().add(this);
    }

    public void develop(){
        Optional<Details> subject = this.eventsToDo.stream().findFirst();
        if(subject.isPresent()){
            this.eventsDone.add(subject.get());
            this.eventsToDo.remove(subject.get());
        }else {
            System.out.println("You are not applied no any Match");
        }
    }

    public void eventsDone(){
        System.out.println("EVENTS DONE! "+"QUERY ON: "+ LocalDateTime.now());
        System.out.println(this.getName());
        Iterator<Details> iterator = eventsDone.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("<---END OF QUERY--->\n");
    }

    public void eventsToDo(){
        System.out.println("EVENTS TO DO! "+"QUERY ON: "+LocalDateTime.now());
        System.out.println(this.getName());
        Iterator<Details> iterator = eventsToDo.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("<---END OF QUERY--->\n");
    }

    public double calcTotalXp(){
        return this.eventsDone
                .stream()
                .mapToDouble(Details::calcXP)
                .sum();
    }


    public Set<Details> getEventsToDo() {
        return eventsToDo;
    }

    public void setEventsToDo(Set<Details> eventsToDo) {
        this.eventsToDo = eventsToDo;
    }

    public Set<Details> getEventsDone() {
        return eventsDone;
    }

    public void setEventsDone(Set<Details> eventsDone) {
        this.eventsDone = eventsDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supervisor that = (Supervisor) o;
        return Objects.equals(eventsToDo, that.eventsToDo) && Objects.equals(eventsDone, that.eventsDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventsToDo, eventsDone);
    }


    @Override
    public String toString() {
        return "Supervisor{"
                +"name: "+getName()
                +",federation: "+getFederation()
                +",caegory: " +getCategory()
                +",ocupation: "+getOccupation()
                +'}';
    }
}
