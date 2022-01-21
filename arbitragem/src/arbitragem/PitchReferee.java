package arbitragem;

import java.time.LocalDateTime;
import java.util.*;

public class PitchReferee extends Referee{

    private Set<Subject> eventsToDo = new LinkedHashSet<>();
    private Set<Subject> eventsDone = new LinkedHashSet<>();

    public void addHappening(Happening happening){
        this.eventsToDo.addAll(happening.getSubjects());
        happening.getPitchRefereeList().add(this);
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
        System.out.println(PitchReferee.this.getName());
        Iterator<Subject> iterator = eventsDone.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("<---END OF QUERY--->\n");
    }

    public void eventsToDo(){
        System.out.println("EVENTS TO DO! "+"QUERY ON: "+LocalDateTime.now());
        System.out.println(PitchReferee.this.getName());
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

    @Override
    public String toString() {
        return "PitchReferee{" +
                "name= " + getName() +
                ",category= " +getCategory()
                +",federation= "+getFederation()
                +",ocupation= "+getOccupation()
                +'}';
    }
}
