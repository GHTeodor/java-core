package lesson4.sololearn;

import java.util.*;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {
//        System.out.println(players);
//        System.out.println(players.entrySet());
        players.forEach((player, score) -> { // score == key, player == value

            if (Objects.equals(score, Collections.max(players.values()))) // if (player.getValue() == Collections.max(players.values())) {
                System.out.println(player);
        });
    }
}