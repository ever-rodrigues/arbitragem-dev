package arbitragem;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class PitchReferee extends Referee{

    private Set<Event> eventsToDO = new LinkedHashSet<>();
    private Set<Event> eventsDone = new LinkedHashSet<>();

    public PitchReferee(String name,String position) {
        super(name,position);
    }

    public void addEventMatch(Event events){
        this.eventsToDO.addAll(events.getMatches());
        events.getOnReferees().add(this);
    }
    public void addEventTraining(Event events){
        this.eventsToDO.addAll(events.getTrainingPrograms());
        events.getOnReferees().add(this);
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
    public double calcularTotalXp(){
        return this.eventsDone
                .stream()
                .mapToDouble(Event::calcXP)
                .sum();
    }
}
