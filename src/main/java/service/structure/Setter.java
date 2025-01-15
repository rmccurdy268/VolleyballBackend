package service.structure;

import model.Player;
import enums.Position;

public class Setter extends Quadrant {
  public Setter(Player currPlayer) {
    super(currPlayer, Position.SET, 1);
  }
}
