package service.structure;

import model.Player;
import enums.Position;

public class OH2 extends Quadrant {
  public OH2(Player currPlayer) {
    super(currPlayer, Position.OUT, 5);
  }
}