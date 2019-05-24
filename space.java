public class StringCount
public static void main(String[] args) {
String input = "Java is great";
 int numOfWords = count(input);
  System.out.println("input: " + input);
System.out.println("count of words: " + numOfWords);
 input = "";
 numOfWords = count(input);
System.out.println("input: " + input);
System.out.println("count of words: " + numOfWords)
input = null;
numOfWords = count(input);  
System.out.println("input: " + input);
System.out.println("count of words: " + numOfWords);
}
public static int count(String sentence){
if(sentence == null || sentence.isEmpty())
return 0;
}
String[] words = sentence.split("\\s+");
return words.length; }
}
