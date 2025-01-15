package service.structure;

import enums.Direction;
import model.Player;
import enums.Position;

public abstract class Quadrant {

  private Player currPlayer;
  private final Position pos;
  private Integer courtPos;

  public Quadrant(Player currPlayer, Position pos, Integer num){
    this.currPlayer = currPlayer;
    this.pos = pos;
    this.courtPos = num;
  }

  public void rotate(Direction direction) {
    if (direction == Direction.FORWARD) {
      if (this.courtPos == 1) {
        this.courtPos=6;
      } else {
        courtPos--;
      }
    } else {
      if (this.courtPos == 6) {
        this.courtPos=1;
      } else {
        courtPos++;
      }
    }
  }

  public void setPlayer(Player currPlayer){
    this.currPlayer = currPlayer;
  }
  public Player getPlayer(){
    return this.currPlayer;
  }

  public Position getPos() {
    return this.pos;
  }
  public Integer getCourtPos(){
    return this.courtPos;
  }
}
