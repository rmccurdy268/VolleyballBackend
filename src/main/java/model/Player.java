package model;

import enums.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
  private final Integer id;
  private final String name;
  private List<Position> positions;
  private Integer passRating;
  private Integer frontRowHitRating;
  private Integer backRowHitRating;
  private Integer serveReceiveRating;
  private Integer blockRating;
  private Integer serverRating;
  private Integer scrappyRating;
  private Integer setScore;
  private Integer positivity;
  private Integer communication;


  public Player(String name, Integer id){
    this.name = name;
    this.id = id;
    this.positions = new ArrayList<>();
  }
  // General info

  public String getName(){
    return this.name;
  }
  public void setPositions(List<Position> positions){this.positions = positions;}
  public void addPosition(Position position){
    this.positions.add(position);
  }
  public List<Position> getPositions(){
    return this.positions;
  }
  public Integer getId(){return this.id;}
  // Defense ratings

  public void setPassRating(Integer rating){
    this.passRating = rating;
  }
  public Integer getPassRating(){
    return this.passRating;
  }

  public void setScrappy(Integer rating){
    this.scrappyRating = rating;
  }
  public Integer getScrappyRating(){
    return this.scrappyRating;
  }

  public void setSetScore(Integer rating){
    this.setScore = rating;
  }
  public Integer getSetScore(){
    return setScore;
  }

  public void setServeReceiveRating(Integer rating){
    this.serveReceiveRating = rating;
  }
  public Integer getServeReceiveRating(){
    return this.serveReceiveRating;
  }

  public void setBlockRating(Integer rating){
    this.blockRating = rating;
  }
  public Integer getBlockRating(){
    return this.blockRating;
  }

  // Offense ratings
  public void setFrontRowHitRating(Integer rating){
    this.frontRowHitRating = rating;
  }
  public Integer getFrontRowHitRating(){
    return this.frontRowHitRating;
  }

  public void setBackRowHitRating(Integer rating){
    this.backRowHitRating = rating;
  }
  public Integer getBackRowHitRating(){
    return this.backRowHitRating;
  }
  
  public void setServerRating(Integer rating){
    this.serverRating = rating;
  }
  public Integer getServerRating(){
    return this.serverRating;
  }

  // Chemistry
  public void setPositivity(Integer rating){
    this.positivity = rating;
  }
  public Integer getPositivity(){
    return this.positivity;
  }

  public void setCommunication(Integer rating){
    this.communication = rating;
  }
  public Integer getCommunication(){
    return this.communication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Player player=(Player) o;
    return Objects.equals(getName(), player.getName()) && Objects.equals(getPositions(), player.getPositions()) && Objects.equals(getPassRating(), player.getPassRating()) && Objects.equals(getFrontRowHitRating(), player.getFrontRowHitRating()) && Objects.equals(getBackRowHitRating(), player.getBackRowHitRating()) && Objects.equals(getServeReceiveRating(), player.getServeReceiveRating()) && Objects.equals(getBlockRating(), player.getBlockRating()) && Objects.equals(getServerRating(), player.getServerRating()) && Objects.equals(getScrappyRating(), player.getScrappyRating()) && Objects.equals(getSetScore(), player.getSetScore()) && Objects.equals(getPositivity(), player.getPositivity()) && Objects.equals(getCommunication(), player.getCommunication());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getPositions(), getPassRating(), getFrontRowHitRating(), getBackRowHitRating(), getServeReceiveRating(), getBlockRating(), getServerRating(), getScrappyRating(), getSetScore(), getPositivity(), getCommunication());
  }
}
