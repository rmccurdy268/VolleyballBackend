package service.structure;

import model.Player;
import enums.Position;



public class MID2 extends Quadrant {
  private boolean subIn;
  public MID2(Player currPlayer) {
    super(currPlayer, Position.MID, 6);
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
