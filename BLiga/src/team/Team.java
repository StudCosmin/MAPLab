package team;

import interfaces.Information;
import person.Manager;
import person.Player;

import java.util.ArrayList;

public class Team implements Information {
    private String name;
    private Manager manager;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int wins;
    private int loses;
    private int numberOfTrophies;

    public Team(String name, Manager manager, ArrayList<Player> players, int wins, int loses, int numberOfTrophies) {
        this.name = name;
        this.manager = manager;
        this.players = players;
        this.wins = wins;
        this.loses = loses;
        this.numberOfTrophies = numberOfTrophies;
    }

    public Team(String name, int wins, int loses, int numberOfTrophies) {
        this.name = name;
        this.wins = wins;
        this.loses = loses;
        this.numberOfTrophies = numberOfTrophies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getNumberOfTrophies() {
        return numberOfTrophies;
    }

    public void setNumberOfTrophies(int numberOfTrophies) {
        this.numberOfTrophies = numberOfTrophies;
    }

    @Override
    public void showDetails() {

    }
}
