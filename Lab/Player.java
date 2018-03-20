public class Player{
  
  private String name;
  private String planet;
  private String color;
  private int age;
  
  public Spider(){
    this.name = "";
    this.planet = "";
    this.color = "";
    this.age = 0;
  }
  
  public String getName(){
    return this.name;
  }
  
  public String getPlanet(){
    return this.planet;
  }
  
  public String getColor () {
    return this.color;
  }
  
  public int age
  
  public void setHealth (int h) {
    this.health = h;
  }
  
  public void setAttack (int a) {
    this.attack = a;
  }
  
  public void setDefense (int d) {
    this.defense = d;
  }
  
  public String toString() {
    return
      "I am a spider. My informations:\n" +
      "\t health " + this.health +
      "\t attack " + this.attack + 
      "\t defense " + this.defense;
  }
}