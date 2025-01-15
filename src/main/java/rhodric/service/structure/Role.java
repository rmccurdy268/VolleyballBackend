package rhodric.service.structure;

import rhodric.enums.Direction;
import rhodric.enums.SpecificPosition;
import rhodric.model.Player;

public class Role {

  private Player currPlayer;
  private Integer rotationPos;
  private SpecificPosition assignedRole;

  public Role(Player currPlayer, Integer rotationPos, SpecificPosition role){
    this.currPlayer = currPlayer;
    this.rotationPos = rotationPos;
    this.assignedRole = role;
  }

  public void rotate(Direction direction) {
    if (direction == Direction.FORWARD) {
      if (this.rotationPos == 1) {
        this.rotationPos=6;
      } else {
        rotationPos--;
      }
    } else {
      if (this.rotationPos == 6) {
        this.rotationPos=1;
      } else {
        rotationPos++;
      }
    }
  }

  public void setPlayer(Player currPlayer){
    this.currPlayer = currPlayer;
  }
  public Player getPlayer(){
    return this.currPlayer;
  }

  public Integer getRotationPos(){
    return this.rotationPos;
  }

  public SpecificPosition getAssignedRole() {
    return assignedRole;
  }

  public void setAssignedRole(SpecificPosition role) {
    this.assignedRole=role;
  }

}
