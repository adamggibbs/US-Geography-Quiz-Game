import java.util.*;
public class GuessAllStatesGame{
   private final String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
   private boolean complete = false;
   
   public GuessAllStatesGame(){
   
   }
   
   private boolean isState(String str){
      for(int i = 0; i < states.length; i++){       
         if(str.equals(states[i].toUpperCase())){
            return true;
         }      
      }//for
      
      return false;
   }
   
   private int findIndex(String str){
      for(int i = 0; i < states.length; i++){
         if(str.equals(states[i].toUpperCase())){
            return i;
         }       
      }//for
      return 0;
   }
   
   public void play(){
         boolean[] check = new boolean[50];
         int counter = 0;
      
         while(!complete){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a state.");
            
            String answer = scan.nextLine().toUpperCase();
            
            if(answer.equals("QUIT")){
               complete = true;
            }
            
            boolean correct = isState(answer);
            int index = findIndex(answer);
            boolean used = false;
            if(correct){
               used = check[index];
               check[index] = true;
            }
            
            if(complete){
               //nothing
            }else if(correct && used){
               System.out.println("You already guessed that state.");
            } else if(correct){
               System.out.println("Nice job!");
               counter++;
               System.out.println("You've guessed " + counter + " states!");
            } else {
               System.out.println("That's not a state");
            }
            
            if(counter == 50){
               complete = true;
               System.out.println("You guessed all 50 states!");
            }
         }//while    
      
      System.out.println("I hope you had fun!");
   }//play
}//class