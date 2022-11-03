package repository;

import team.Team;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    protected ArrayList<Team> teams = new ArrayList<>();

    public Repository(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    boolean add() {return true;}
    boolean remove() {return true;}
    boolean edit() {return true;}
}
