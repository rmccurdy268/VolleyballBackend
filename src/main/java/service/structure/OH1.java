package service.structure;

import model.Player;
import enums.Position;

public class OH1 extends Quadrant {
  public OH1(Player currPlayer) {
    super(currPlayer, Position.OUT, 2);
  }
}
