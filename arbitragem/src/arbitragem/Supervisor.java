package arbitragem;

import java.time.LocalDateTime;
import java.util.*;

public class Supervisor extends Referee{

    private Set<Subject> eventsToDo = new LinkedHashSet<>();
    private Set<Subject> eventsDone = new LinkedHashSet<>();

    public void addHappening(Happening happening){
        this.eventsToDo.addAll(happening.getSubjects());
        happening.getSupervisorList().add(this);
    }

    public void develop(){
        Optional<Subject> subject = this.eventsToDo.stream().findFirst();
        if(subject.isPresent()){
            this.eventsDone.add(subject.get());
            this.eventsToDo.remove(subject.get());
        }else {
            System.out.println("You are not applied no any Match");
        }
    }

    public void eventsDone(){
        System.out.println("EVENTS DONE! "+"QUERY ON: "+ LocalDateTime.now());
        Iterator<Subject> iterator = eventsDone.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("<---END OF QUERY--->\n");
    }

    public void eventsToDo(){
        System.out.println("EVENTS TO DO! "+"QUERY ON: "+LocalDateTime.now());
        Iterator<Subject> iterator = eventsToDo.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("<---END OF QUERY--->\n");
    }

    public double calcTotalXp(){
        return this.eventsDone
                .stream()
                .mapToDouble(Subject::calcXP)
                .sum();
    }


    public Set<Subject> getEventsToDo() {
        return eventsToDo;
    }

    public void setEventsToDo(Set<Subject> eventsToDo) {
        this.eventsToDo = eventsToDo;
    }

    public Set<Subject> getEventsDone() {
        return eventsDone;
    }

    public void setEventsDone(Set<Subject> eventsDone) {
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
