package arbitragem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RefereeTeam {
    private int codeReferee;

    private Set<Var> varEnrolled = new HashSet<>();
    private Set<PitchReferee> pitchRefereesEnrolled = new HashSet<>();
    private Set<Supervisor> supervisorsEnrolled = new HashSet<>();

    public int getCodeReferee() {
        return codeReferee;
    }

    public void setCodeReferee(int codeReferee) {
        this.codeReferee = codeReferee;
    }

    public Set<Var> getVarEnrolled() {
        return varEnrolled;
    }

    public void setVarEnrolled(Set<Var> varEnrolled) {
        this.varEnrolled = varEnrolled;
    }

    public Set<PitchReferee> getPitchRefereesEnrolled() {
        return pitchRefereesEnrolled;
    }

    public void setPitchRefereesEnrolled(Set<PitchReferee> pitchRefereesEnrolled) {
        this.pitchRefereesEnrolled = pitchRefereesEnrolled;
    }

    public Set<Supervisor> getSupervisorsEnrolled() {
        return supervisorsEnrolled;
    }

    public void setSupervisorsEnrolled(Set<Supervisor> supervisorsEnrolled) {
        this.supervisorsEnrolled = supervisorsEnrolled;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefereeTeam that = (RefereeTeam) o;
        return codeReferee == that.codeReferee && Objects.equals(varEnrolled, that.varEnrolled) && Objects.equals(pitchRefereesEnrolled, that.pitchRefereesEnrolled) && Objects.equals(supervisorsEnrolled, that.supervisorsEnrolled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeReferee, varEnrolled, pitchRefereesEnrolled, supervisorsEnrolled);
    }
}
