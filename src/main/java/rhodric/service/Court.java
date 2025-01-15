package rhodric.service;

import rhodric.enums.Direction;
import rhodric.enums.SpecificPosition;
import rhodric.model.Player;
import rhodric.service.structure.Role;
import java.util.ArrayList;
import java.util.List;


public class Court {
  private ArrayList<Role> currLineup;
  private ArrayList<Player> frontRow;
  private ArrayList<Player> backRow;
  private List<SpecificPosition> listOfPositions;
  private boolean liberoIsIn;
  Roster roster;

  public Court(Roster roster){
    currLineup = new ArrayList<>();
    frontRow = new ArrayList<>();
    backRow = new ArrayList<>();
    listOfPositions = new ArrayList<>(List.of(SpecificPosition.SETTER,SpecificPosition.OUTSIDE1,SpecificPosition.MIDDLE1,SpecificPosition.OPPOSITE,SpecificPosition.OUTSIDE2,SpecificPosition.MIDDLE2));
    liberoIsIn = false;
    this.roster = roster;
  }

  //HELP ME I'M BROKEN
  public void setLineup(List<Integer> orderedLineup){
    for (int i = 0; i < 6; i++){
      currLineup.add(new Role(roster.getPlayer(orderedLineup.get(i)), i+1, listOfPositions.get(i)));
      if (i > 0 && i < 4){
        frontRow.add(roster.getPlayer(orderedLineup.get(i)));
      }
      else{
        backRow.add(roster.getPlayer(orderedLineup.get(i)));
      }
    }
  }

  public void showCourt(){
    Player one,two,three,four,five,six;
    one = two = three = four = five = six = new Player("", -1);
    for (int i = 0; i < currLineup.size(); i++){
      switch(currLineup.get(i).getRotationPos()){
        case 1:
          one = currLineup.get(i).getPlayer();
          break;
        case 2:
          two = currLineup.get(i).getPlayer();
          break;
        case 3:
          three = currLineup.get(i).getPlayer();
          break;
        case 4:
          four = currLineup.get(i).getPlayer();
          break;
        case 5:
          five = currLineup.get(i).getPlayer();
          break;
        case 6:
          six = currLineup.get(i).getPlayer();
          break;
        default:
          System.out.print("That shouldnt ave appened");
      }
    }
    System.out.print( "-------------------------\n");
    System.out.printf("| %d         %d         %d |\n", four.getId(), three.getId(), two.getId());
    System.out.print( "------------------------\n");
    System.out.print( "                        \n");
    System.out.printf("| %d         %d         %d |\n", five.getId(), six.getId(), one.getId());
    System.out.print( "-------------------------\n\n\n\n");


  }

  public Player getPlayer(Integer courtPos){
    for (int i = 0; i < currLineup.size(); i++){
      if (courtPos == currLineup.get(i).getRotationPos()){
        return currLineup.get(i).getPlayer();
      }
    }
    return null;
  }

  public void sub(Player subIn, Integer courtPos){
    for (int i = 1; i <= currLineup.size(); i++) {
      int currPos = currLineup.get(i).getRotationPos();
      if (currPos == courtPos){
        currLineup.get(i).setPlayer(subIn);
      }
    }
  }

  public void rotate(Direction direction){
    ArrayList<Player> newFront = new ArrayList<>();
    ArrayList<Player> newBack = new ArrayList<>();
    for (int i = 0; i < currLineup.size(); i++){
      currLineup.get(i).rotate(direction);
      if (currLineup.get(i).getRotationPos() >= 2 && currLineup.get(i).getRotationPos() <= 4){
        newFront.add(currLineup.get(i).getPlayer());
      }
      else{
        newBack.add(currLineup.get(i).getPlayer());
      }
    }
    frontRow = newFront;
    backRow = newBack;
  }
}
