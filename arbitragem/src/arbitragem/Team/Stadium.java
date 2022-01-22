package arbitragem.Team;

public class Stadium {
    private String name;
    private Team ownerTeam;

    public Stadium(String name, Team ownerTeam) {
        this.name = name;
        this.ownerTeam = ownerTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getOwnerTeam() {
        return ownerTeam;
    }

    public void setOwnerTeam(Team ownerTeam) {
        this.ownerTeam = ownerTeam;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", ownerTeam=" + ownerTeam +
                '}';
    }
}
