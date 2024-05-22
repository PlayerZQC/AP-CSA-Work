public class Feeder{
  private int currentFood;
  public Feeder(int c){
    currentFood = c;
  }
  public void simulateOneDay(int numBirds){
    int r = (int)(Math.random()*100)+1;
    if(r>=95) currentFood = 0;
    else{
      int f = (int)(Math.random()*41)+10;
      currentFood-=(numBirds*f);
    }
    if(currentFood<0)currentFood = 0;
  }
  public int simulateManyDays(int numBirds, int numDays){
    int c = 0;
    while(c<numDays){
      simulateOneDay(numBirds);
      if(currentFood==0) return c;
      c++;
    }
    return c;
  } 
}
