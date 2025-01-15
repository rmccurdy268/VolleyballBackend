package service.structure;

import model.Player;
import enums.Position;

public class MID1 extends Quadrant {
  private boolean subIn;
  public MID1(Player currPlayer) {
    super(currPlayer, Position.MID, 3);
    this.subIn = false;
  }

  public void sub(Player currPlayer){
    this.setPlayer(currPlayer);
    this.setSubIn(!this.subIn);
  }

  public boolean isSubIn() {
    return subIn;
  }

  public void setSubIn(boolean subIn) {
    this.subIn=subIn;
  }
}
