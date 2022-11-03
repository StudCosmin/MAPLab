///////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                       //
// BASKETBALL LIGA                                                                                       //
// An 'application' which aims to allow the user to keep track of a basketball league or manage it.      //
//                                                                                                       //
// User:                                                                                                 //
// - see a list of all the teams in the league                                                           //
// - detailed information for every team in the league                                                   //
// - detailed information for every player on those teams                                                //
// - detailed information for every manager on those teams                                               //
// - match history                                                                                       //
// - playoff race                                                                                        //
//                                                                                                       //
// Admin:                                                                                                //
// - add/remove/update teams                                                                             //
// - add/remove/update player's                                                                          //
// - add/remove/update manager                                                                           //
// - schedule new matches                                                                                //
//                                                                                                       //
// Join more than 3.5M users world wide - download today! Available on IOS & Android.                    //
//                                                                                                       //
///////////////////////////////////////////////////////////////////////////////////////////////////////////

package main;

import person.Manager;
import person.Player;
import repository.Repository;
import team.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();
        List<List<Player>> playersList = new ArrayList<List<Player>>();
        int counter = 0;

        // arrayList containing paths to the text files of the full names of every team
        ArrayList<String> pathToTeams = new ArrayList<>() {
            {
                add("TeamsInformation/Bulls/Team.txt");
                add("TeamsInformation/Cavaliers/Team.txt");
                add("TeamsInformation/Heat/Team.txt");
                add("TeamsInformation/Jazz/Team.txt");
                add("TeamsInformation/Lakers/Team.txt");
                add("TeamsInformation/Mavericks/Team.txt");
                add("TeamsInformation/Nets/Team.txt");
                add("TeamsInformation/Raptors/Team.txt");
                add("TeamsInformation/Timberwolves/Team.txt");
                add("TeamsInformation/Warriors/Team.txt");
            }
        };

        // arrayList containing paths to the text files of the manager of every team
        ArrayList<String> pathToManagers = new ArrayList<>() {
            {
                add("TeamsInformation/Bulls/Managers.txt");
                add("TeamsInformation/Cavaliers/Managers.txt");
                add("TeamsInformation/Heat/Managers.txt");
                add("TeamsInformation/Jazz/Managers.txt");
                add("TeamsInformation/Lakers/Managers.txt");
                add("TeamsInformation/Mavericks/Managers.txt");
                add("TeamsInformation/Nets/Managers.txt");
                add("TeamsInformation/Raptors/Managers.txt");
                add("TeamsInformation/Timberwolves/Managers.txt");
                add("TeamsInformation/Warriors/Managers.txt");
            }
        };

        // arrayList containing paths to the text files of the players of every team
        ArrayList<String> pathToPlayers = new ArrayList<>() {
            {
                add("TeamsInformation/Bulls/Players.txt");
                add("TeamsInformation/Cavaliers/Players.txt");
                add("TeamsInformation/Heat/Players.txt");
                add("TeamsInformation/Jazz/Players.txt");
                add("TeamsInformation/Lakers/Players.txt");
                add("TeamsInformation/Mavericks/Players.txt");
                add("TeamsInformation/Nets/Players.txt");
                add("TeamsInformation/Raptors/Players.txt");
                add("TeamsInformation/Timberwolves/Players.txt");
                add("TeamsInformation/Warriors/Players.txt");
            }
        };


        // for-each loop, looping through all the paths in the given array
        for (String path: pathToManagers) {
            String line;

            // exception handling
            // possible exceptions:
            //     IOException - readLine()
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                // we store the values of bufferedReader.readLine() in variable line, line by line
                // repeat this process until there are no more lines left to read
                while ((line = bufferedReader.readLine()) != null) {
                    // split the values we just read in function of ',' in a new array
                    String[] values = line.split(",");
                    // creating an object with those values
                    Manager manager = new Manager(
                            // firstName(string), lastName(string), age(int), salary(int), yearsOfExperience(int)
                            values[0], values[1], Integer.parseInt(values[2]),
                            Integer.parseInt(values[3]), Integer.parseInt(values[4])
                    );
                    // add the newly created object in an array list of the objects type
                    managers.add(manager);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // for-each loop, looping through all the paths in the given array
        for (String path: pathToPlayers) {
            String line;
            ArrayList<Player> players = new ArrayList<>();

            // exception handling
            // possible exceptions:
            //     IOException - readLine()
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                // we store the values of bufferedReader.readLine() in variable line, line by line
                // repeat this process until there are no more lines left to read
                while ((line = bufferedReader.readLine()) != null) {
                    // split the values we just read in function of ',' in a new array
                    String[] values = line.split(",");
                    // creating an object with those values
                    Player player = new Player(
                            values[0], values[1], Integer.parseInt(values[2]),
                            Integer.parseInt(values[3]), values[4], values[5]
                    );
                    // adding the player object to the arrayList of type Player
                    players.add(player);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            playersList.add(players);
        }

        for (String path: pathToTeams) {
            String line;

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                // we store the values of bufferedReader.readLine() in variable line, line by line
                // repeat this process until there are no more lines left to read
                while ((line = bufferedReader.readLine()) != null) {
                    // split the values we just read in function of ',' in a new array
                    String[] values = line.split(",");
                    // creating an object with those values
                    Team team = new Team(
                        values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3])
                    );
                    // adding the player object to the arrayList of type Player
                    teams.add(team);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        for (int index = 0; index <= teams.size(); ++index) {
//            teams.get(index).setManager(managers.get(index));
//            teams.get(index).setPlayers((ArrayList<Player>) playersList.get(index));
//        }
//        for (Team t: teams) {
//            t.setManager(managers.get(0));
//            t.setPlayers((ArrayList<Player>) playersList.get(0));
//        }
        for (Team t: teams) {
            t.setManager(managers.get(counter));
            t.setPlayers((ArrayList<Player>) playersList.get(counter));
            counter++;
        }

        for (Team t: teams) {
            System.out.println("============");
            System.out.println("Team: " + t.getName());
            System.out.println("Manager: " + t.getManager());
            System.out.println("Players: " + t.getPlayers());
            System.out.println("============\n");
        }

    }
}
