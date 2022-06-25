package programaniya.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participiant> {
    private String name;
    private List<T> participiants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipiant(T participiant) {
        participiants.add(participiant);
        System.out.println("In command " + name + " was added new participiant" +
                " with name " + participiant.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Winner team: " + winnerName);
    }
}
