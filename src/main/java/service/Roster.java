package service;

import model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Roster {
  HashMap<String, List<Integer>> lineups;
  ArrayList<Player> players;
  Integer nextId;

  public Roster(){
    nextId = 1;
    players = new ArrayList<>();
    lineups = new HashMap<>();
  }

  public void addPlayer(Player newPlayer){
    players.add(newPlayer);
  }

  public void addLineup(String name, List<Integer> lineup){
     lineups.put(name, lineup);
  }

  public List<Integer> getLineup(String name){
    return lineups.get(name);
  }

}
