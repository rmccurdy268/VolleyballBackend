package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTests {
  @Test
  void basicInfoTest(){
    Player testPlayer = new Player("Jarrett", 1);
    assertEquals(1, testPlayer.getId());
    assertEquals("Jarrett", testPlayer.getName());
  }

  @Test
  void equalsTest(){
    Player testPlayer = new Player("Jarrett", 1);
    Player tester = new Player("Jarrett", 1);
    assertEquals(testPlayer, tester);
  }
}
