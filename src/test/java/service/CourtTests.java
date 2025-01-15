package service;

import enums.Direction;
import model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourtTests {
  private Court myCourt;
  @BeforeEach
  void setup(){
    myCourt = new Court();
    ArrayList<Player> playersList = new ArrayList<>();
    for (int i = 0; i < 6; i++){
      playersList.add(new Player(String.format("Player %d", i), i));
    }
    myCourt.setLineup(playersList);
  }

  @Test
  void rotateTest(){
    assertEquals(0, myCourt.getPlayer(1).getId());
    myCourt.rotate(Direction.FORWARD);
    assertEquals(1, myCourt.getPlayer(1).getId());
    myCourt.rotate(Direction.FORWARD);
    assertEquals(2, myCourt.getPlayer(1).getId());
    myCourt.rotate(Direction.BACKWARD);
    assertEquals(1, myCourt.getPlayer(1).getId());
    myCourt.rotate(Direction.FORWARD);
    assertEquals(2, myCourt.getPlayer(1).getId());
    assertEquals(3, myCourt.getPlayer(2).getId());
    myCourt.rotate(Direction.FORWARD);
    assertEquals(4, myCourt.getPlayer(2).getId());
  }

  /*
  @Test
  void rotateShowcase(){
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.FORWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
    myCourt.rotate(Direction.BACKWARD);
    myCourt.showCourt();
  }
   */
}
