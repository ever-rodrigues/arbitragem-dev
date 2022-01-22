package arbitragem;

public abstract class Details {
    private String title;
    private String description;

    protected static final double XP_DEFAULT = 10;

    public abstract double calcXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}