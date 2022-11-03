package team;

import interfaces.Information;

public class Matches implements Information {
    private Team teamOne;
    private int scoreTeamOne;

    private Team teamTwo;
    private int scoreTeamTwo;

    public Matches(Team teamOne, int scoreTeamOne, Team teamTwo, int scoreTeamTwo) {
        this.teamOne = teamOne;
        this.scoreTeamOne = scoreTeamOne;
        this.teamTwo = teamTwo;
        this.scoreTeamTwo = scoreTeamTwo;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public int getScoreTeamOne() {
        return scoreTeamOne;
    }

    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int getScoreTeamTwo() {
        return scoreTeamTwo;
    }

    public void setScoreTeamTwo(int scoreTeamTwo) {
        this.scoreTeamTwo = scoreTeamTwo;
    }

    private Team getWinner(int scoreTeamOne, int scoreTeamTwo) {
        if (this.getScoreTeamOne() > this.getScoreTeamTwo())
            return this.getTeamOne();
        else return this.getTeamTwo();
    }

    @Override
    public void showDetails() {

    }
}
