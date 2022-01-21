package arbitragem;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TrainingProgram extends Event {

    private int cargaHoraria;

    private Set<Var> onVars = new HashSet<>();
    private Set<PitchReferee> onPitchReferes = new HashSet<>();
    private Set<Supervisor> onTrainingSuper = new HashSet<>();

    public TrainingProgram(String title, String description, String date, String time, String place) {
        super(title, description, date, time, place);
    }


    @Override
    public Set<Var> getOnVars() {
        return onVars;
    }

    @Override
    public void setOnVars(Set<Var> onVars) {
        this.onVars = onVars;
    }

    public Set<PitchReferee> getOnPitchReferes() {
        return onPitchReferes;
    }

    public void setOnPitchReferes(Set<PitchReferee> onPitchReferes) {
        this.onPitchReferes = onPitchReferes;
    }

    public Set<Supervisor> getOnTrainingSuper() {
        return onTrainingSuper;
    }

    public void setOnTrainingSuper(Set<Supervisor> onTrainingSuper) {
        this.onTrainingSuper = onTrainingSuper;
    }

    @Override
    public double calcXP(){
        return XP_DEFAULT+15;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainingProgram that = (TrainingProgram) o;
        return cargaHoraria == that.cargaHoraria && Objects.equals(onVars, that.onVars) && Objects.equals(onPitchReferes, that.onPitchReferes) && Objects.equals(onTrainingSuper, that.onTrainingSuper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargaHoraria, onVars, onPitchReferes, onTrainingSuper);
    }
}
