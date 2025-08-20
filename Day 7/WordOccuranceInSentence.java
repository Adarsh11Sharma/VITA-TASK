import  java.util.*;
public class WordOccuranceInSentence{

public static int WordOccuranceInSentence(String sentence,String word){

/*
            if(sentence==null || word==null || sentence.isEmpty()||word.isEmpty()){
                     return 0;
                }
sentence=sentence.toLowerCase();
word = word.toLowerCase();

String cleanSentence=sentence.replaceAll("[\\p{P}\\p{S}]", " ");

String words[]=cleanSentence.split("\\s+");
int count=0;
for(String w:words){
    if(w.equals(word)){
        count++;
    }
}



return count;
*/

 if (sentence == null || word == null || sentence.isEmpty() || word.isEmpty()) {
            return 0;
        }
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;
        int index = 0;
        
        while ((index = sentence.indexOf(word, index)) != -1) {
            count++;
            index += word.length(); // Move past the found word
        }
        
        return count;
}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       String sentence="welcome to VITA. VITA is CDAC centre. Savitama’m is director";

       String word="VITA";

       WordOccuranceInSentence(sentence, word);
      

      int count=WordOccuranceInSentence(sentence, word);
      System.out.println(count);


    }

    
}