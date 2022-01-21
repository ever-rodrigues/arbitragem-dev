package arbitragem;

public class Team {
    private String name;
    private String State;
    private String League;


    public Team(String name, String state, String league) {
        this.name = name;
        State = state;
        League = league;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "name='" + name + '\'' +
                ", State='" + State + '\'' +
                ", League='" + League + '\'' +
                '}';
    }
}
