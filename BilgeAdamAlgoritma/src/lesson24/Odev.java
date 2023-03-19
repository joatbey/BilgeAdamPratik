package lesson24;

import java.io.FileReader; 
import java.io.IOException; 
import java.util.HashMap; 
import java.util.Map; 

public class Odev {

 public static String findMostRepeatedWord(Map<String, Integer> wordCounts) {
     String mostRepeatedWord = null; 
     int maxCount = 0;
     for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
         if (entry.getValue() > maxCount) {
             mostRepeatedWord = entry.getKey();
             maxCount = entry.getValue();
         }
     }
     return mostRepeatedWord;
 }


 public static void main(String[] args) {

     try {
         FileReader reader = new FileReader("mars.txt");

         int character; // Current character being read
         int numChars = 0; // Total number of characters
         int numWords = 0; // Total number of words
         int numLines = 0; // Total number of lines
         Map<String, Integer> wordCounts = new HashMap<String, Integer>(); // Kelime tekrarı
         String currentWord = ""; // Current word being built

         // Loop through the file one character at a time
         while ((character = reader.read()) != -1) {//-1 if the end of the stream has been reached
            
             numChars++; 
             
             // character whitespace ise (space, tab, or newline)
             if (Character.isWhitespace(character)) {
            	 // map boş degilse wordsu artir mapi güncelle
                 if (!currentWord.equals("")) {
                     numWords++;
                     if (wordCounts.containsKey(currentWord)) {
                         wordCounts.put(currentWord, wordCounts.get(currentWord) + 1);
                     } else {
                         wordCounts.put(currentWord, 1);
                     }
                     currentWord = ""; 
                 }
                 // If the current character is a newline, increment the line count
                 if (character == '\n') {
                     numLines++;
                 }
             } else {
                 //character whitspace değilse currentWorde ekle
                 currentWord += (char) character;
             }
         }

   
         reader.close();


         System.out.println("Karakter sayısı: " + numChars);
         System.out.println("Kelime sayısı: " + numWords);
         System.out.println("Satır sayısı: " + numLines);

         String mostRepeatedWord = findMostRepeatedWord(wordCounts);
         System.out.println("En çok tekrarlayan kelime: " + mostRepeatedWord + " (" + wordCounts.get(mostRepeatedWord) + " kere)");

     } catch (IOException e) {
         System.out.println("Dosya okunurken bir hata oluştu.");
         e.printStackTrace();
     }
 }
}
