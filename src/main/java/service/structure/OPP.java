package service.structure;

import model.Player;
import enums.Position;

public class OPP extends Quadrant {
  public OPP(Player currPlayer) {
    super(currPlayer, Position.OPP, 4);
  }
}