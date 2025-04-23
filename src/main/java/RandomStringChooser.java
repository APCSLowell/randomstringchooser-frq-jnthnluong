import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> wordList;
  public RandomStringChooser(String[] a){
    wordList = new ArrayList<String>();
    for(String words : a){
      wordList.add(words)
      }
  }
  public String getNext(){
    if(wordList.size() < 1) return "NONE";
    return wordList.remove((int)(Math.random()*wordList.size()));
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
