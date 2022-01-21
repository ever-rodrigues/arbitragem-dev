package arbitragem;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Var extends Referee{

    private Set<Subject> matchToDo = new LinkedHashSet<>();
    private Set<Subject> matchDone = new LinkedHashSet<>();


    public void addHappening(Happening happening){
        this.matchToDo.addAll(happening.getMatchList());
        happening.getRefereeList().add(this);
    }

    public void develop(){
        Optional<Subject> subject = this.matchDone.stream().findFirst();
        if(subject.isPresent()){
            this.matchDone.add(subject.get());
            this.matchToDo.remove(subject.get());
        }else {
            System.out.println("You are not aplyed no any Match");
        }
    }

    public double calcTotalXp(){
        return this.matchDone
                .stream()
                .mapToDouble(Subject::calcXP)
                .sum();
    }


    public Set<Subject> getMatchToDo() {
        return matchToDo;
    }

    public void setMatchToDo(Set<Subject> matchToDo) {
        this.matchToDo = matchToDo;
    }

    public Set<Subject> getMatchDone() {
        return matchDone;
    }

    public void setMatchDone(Set<Subject> matchDone) {
        this.matchDone = matchDone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Var var = (Var) o;
        return Objects.equals(matchToDo, var.matchToDo) && Objects.equals(matchDone, var.matchDone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchToDo, matchDone);
    }
}
