package service;

import enums.Direction;
import model.Player;
import service.structure.*;

import java.util.ArrayList;
import java.util.List;


public class Court {
  private ArrayList<Quadrant> currLineup;
  private ArrayList<Player> frontRow;
  private ArrayList<Player> backRow;
  public Court(){
    currLineup = new ArrayList<Quadrant>();
    frontRow = new ArrayList<Player>();
    backRow = new ArrayList<Player>();
  }

  public void setLineup(List<Player> orderedLineup){
    currLineup.add(new Setter(orderedLineup.get(0)));
    currLineup.add(new OH1(orderedLineup.get(1)));
    currLineup.add(new MID1(orderedLineup.get(2)));
    currLineup.add(new OPP(orderedLineup.get(3)));
    currLineup.add(new OH2(orderedLineup.get(4)));
    currLineup.add(new MID2(orderedLineup.get(5)));

    frontRow.add(orderedLineup.get(1));
    frontRow.add(orderedLineup.get(2));
    frontRow.add(orderedLineup.get(3));

    backRow.add(orderedLineup.get(0));
    backRow.add(orderedLineup.get(4));
    backRow.add(orderedLineup.get(5));
  }

  public void showCourt(){
    Player one,two,three,four,five,six;
    one = two = three = four = five = six = new Player("", -1);
    for (int i = 0; i < currLineup.size(); i++){
      switch(currLineup.get(i).getCourtPos()){
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
      if (courtPos == currLineup.get(i).getCourtPos()){
        return currLineup.get(i).getPlayer();
      }
    }
    return null;
  }

  public void rotate(Direction direction){
    ArrayList<Player> newFront = new ArrayList<>();
    ArrayList<Player> newBack = new ArrayList<>();
    for (int i = 0; i < currLineup.size(); i++){
      currLineup.get(i).rotate(direction);
      if (currLineup.get(i).getCourtPos() >= 2 && currLineup.get(i).getCourtPos() <= 4){
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
