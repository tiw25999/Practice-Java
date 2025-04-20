package item1;
public abstract class SoccerPlayer {
    String name;
    int number;
    String team;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return "**"+name + " " + number + " " + team;
    }
}