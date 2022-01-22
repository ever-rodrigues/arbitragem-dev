package arbitragem.events;

import arbitragem.Details;

public class Training extends Details {

    private int workLoad;

    @Override
    public double calcXP() {
        return XP_DEFAULT+15;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }


    @Override
    public String toString() {
        return "Training{"
                +" title= "+getTitle()
                +" description= "+getDescription()
                +" work load= " + workLoad +'\''+
                '}';
    }
}
