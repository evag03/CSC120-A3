import java.util.Scanner;
import java.util.Random;
//import java.util.Arrays;


class Conversation {

  public static void main(String[] arguments) {

    String[] canned_responses = {"That's so cool!", "Wow!", "I never thought about that.", "Oh...", "Interesting..."};
    //String[] transcript = {};

    // You will start the conversation here.
    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    System.out.println("How many rounds? ");
    //Trying to implement transcript
    //String[] add_to_transcript = new_input[n+1];
    //String[] n = transcript.length;
    //System.out.println(Arrays.toString(transcript));  
    //for(int i = 0; i<n; i++) {  
      //newArr[i] = arr[i];  
      //userInput[i] = transcript[i]
    //}  
    int round_number = userInput.nextInt();
    userInput.nextLine();

    int rounds_passed = 0;
    System.out.println("Hi there! What do you want to talk about?");
    boolean should_response_change = false;
    
    while (rounds_passed != round_number) {
      String user_response = userInput.nextLine();
      
      // Look for words to mirror
      String[] user_response_list = user_response.split(" ");

      for (int i = 0; i < user_response_list.length; i++){
        if (user_response_list[i].equals("I")){
          int position = i;
          user_response_list[position] = ("you");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("I")){
          int position = i;
          user_response_list[position] = ("You");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("you")){
          int position = i;
          user_response_list[position] = ("I");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("You")){
          int position = i;
          user_response_list[position] = ("I");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("your")){
          int position = i;
          user_response_list[position] = ("my");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("Your")){
          int position = i;
          user_response_list[position] = ("My");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("are")){
          int position = i;
          user_response_list[position] = ("am");
          should_response_change = true;
          continue;
        }
        else if (user_response_list[i].equals("Are")){
          int position = i;
          user_response_list[position] = ("Am");
          should_response_change = true;
          continue;
        }
      }
      
      if (should_response_change == true) {
        String mirror_response = String.join(" ", user_response_list);
        System.out.println(mirror_response + "?");
      }
      else {
        int index = random.nextInt(canned_responses.length);
        System.out.println(canned_responses[index]);
        //String[] transcript.join(canned_responses[index]);
      }
      rounds_passed = rounds_passed + 1;
    }
    userInput.close();
    
  }
}