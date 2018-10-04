public class Main {
  public static void main(String[] args){
    String word = "curriculum";

    // Split word into array of characters
    String[] wordArray = word.split("");

    // Loop through each character of the word
    for(int i=0; i<wordArray.length; i++){

      // If character equals 'c' or 'u', print _
      if(wordArray[i].equals("c") || wordArray[i].equals("u")){
        System.out.print("_ ");
      }

      // Else, print the letter
      else{
        System.out.print(wordArray[i] + " ");
      }
    }
  }
}
