public class Scoreboard {
  private String b;
  private String r;
  private int bs;
  private int rs;
  private int c=0;
  public Scoreboard(String R, String B){
    r=R;
    b=B;
    bs = 0;
    rs = 0;
  }
  public void recordPlay(int s){
    if(s==0) c++;
    else if(c%2==0) rs+=s;
    else bs+=s;
  }
  public String getScore(){
    String sa ="";
    if(c%2==0) sa+=r;
    else sa +=b;
    return rs +"-"+bs+"-"+sa;
  }




  
}
