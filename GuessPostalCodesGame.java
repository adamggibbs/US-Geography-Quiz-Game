import java.util.*;
public class GuessPostalCodesGame{
   private int rounds;
   
   public GuessPostalCodesGame(){
      rounds = 50;
   }
   
   public GuessPostalCodesGame(int round){
      rounds = round;
   }
   
   public void play(){
      boolean[] check = new boolean[50];
      
      for(int i = 0; i < rounds; i++){
         boolean again = true;
         int tries = 1;
         
         Question q = new Question();
         boolean another = true;
         while(another){
            q = new Question();
            if(!check[q.getIndex()]){
               another = false;
               check[q.getIndex()] = true;
            }
         }
         
         while(again){
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the postal code for " + q.getState() + "?");
            String answer = scan.nextLine();
            String correct = q.getPostalCode();
            answer = answer.toUpperCase();
            if(answer.equals(correct)){
               System.out.println("That's correct!");
               again = false;
            } else if(tries < 3){
               System.out.println("Try again...");
               tries++;
            } else {
               System.out.println("The correct answer was " + q.getPostalCode());
               again = false;
            }
         }//while    
         
      }//for
      
      System.out.println("I hope you had fun!");
   }//play
}//class