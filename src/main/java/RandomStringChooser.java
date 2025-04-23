import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
   private String[] wordArray;
   private ArrayList<String> usedWords;
 
   public randomStringChooser(String[] a){
     wordArray = a;
     usedWords = new ArrayList<String>();
   }
   public String getNext(){
     if(usedWords.size() >= wordArray.length) return "NONE";
     String temp = wordArray[(int)(Math.random()*wordArray.length)];
     while(usedWords.contains(temp)){
       temp = wordArray[(int)(Math.random()*wordArray.length)];
       
     }
     usedWords.add(temp);
     return temp;
   }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
