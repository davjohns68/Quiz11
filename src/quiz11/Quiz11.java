/*
 * Overloaded maxOccurring methods that return:
 *  a) The mode in a list of integers and
 *  b) The mode in a Map of characters
 *
 * Created by David Johnson, October 11, 2017
 * for CS211 course, Bellevue College
 */
package quiz11;

import java.util.*;

public class Quiz11 {

    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(1); list.add(1); list.add(1); list.add(2); list.add(3);
          System.out.println(Quiz11.maxOccurrences(list)); // 3

          Map<Character,Integer> map = new HashMap<>();
          map.put('a',1); map.put('b',1); map.put('c',1); map.put('d',13); 
          System.out.println(Quiz11.maxOccurrences(map)); // 3 
    }
    
    // Returns the number of times the most frequently occurring integer (the mode) occurs in the list
    public static int maxOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequentCount = 0;
        
        for(int number: numbers) {
            if(frequencyMap.containsKey(number)) {
                int counter = frequencyMap.get(number);
                frequencyMap.put(number, counter + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }
        
        for(int number: frequencyMap.keySet()) {
            if(frequencyMap.get(number) > mostFrequentCount) {
                mostFrequentCount = frequencyMap.get(number);
            }
        }
        return mostFrequentCount;
    }
 
    // Returns the number of times the most frequently occurring character (the mode) occurs in the list
    public static int maxOccurrences(Map<Character, Integer> characters) {
        int mostFrequentCount = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int number: characters.values()) {
            if(frequencyMap.containsKey(number)) {
                int counter = frequencyMap.get(number);
                frequencyMap.put(number, counter + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }
        
        for(int number: frequencyMap.keySet()) {
            if(frequencyMap.get(number) > mostFrequentCount) {
                mostFrequentCount = frequencyMap.get(number);
            }
        }       
        return mostFrequentCount;
    }
}
