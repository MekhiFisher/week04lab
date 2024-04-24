package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
				StringBuilder numbers = new StringBuilder();
				for (int i = 0; i < 10; i++) {
					numbers.append(i);
					if (i !=9 ) {
					numbers.append("-");
				}
					
				}
				System.out.println(numbers);
				
				
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
				List<String> stringList = new ArrayList<String>();
				List<String> asListExample = Arrays.asList("Mary", "Sam", "Debora");
				stringList.add("Samantha");
				stringList.add("Ky");
				stringList.add("Timothy");
				stringList.add("Holly");
				stringList.add("Tom");
				Arrays.asList("Mary", "Sam", "Debora");
				System.out.println(stringList);
				System.out.println(asListExample);
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
				
				System.out.println(shortestString(stringList));
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
				System.out.println(swappedElements(stringList));
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
				System.out.println(concatenateElementsOfList(stringList));
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
				List<String> searchResults = search(stringList, "y");
				for (String results : searchResults) {
					System.out.println(results);
					
				}
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				List<Integer> numberList = new ArrayList<Integer>();
				for (int i = 0; i < 11; i++) {
					numberList.add(i);
				}
				List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numberList);
				for (List<Integer> list : sortedNumbers) {
					for (Integer number : list) {
						System.out.println(number);
					}
					System.out.println("Next List---------------");
				}
				
				
				
				System.out.println(sortDivisibleNumbers(numberList));
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
				System.out.println(lengthOfStrings(stringList));
				System.out.println(stringList);
				
				// 9. Create a set of strings and add 5 values
				Set<String> nameSet = new HashSet<String>();
				nameSet.add("Lisa");
				nameSet.add("Chris");
				nameSet.add("Reza");
				nameSet.add("Arya");
				nameSet.add("Ernest");
				nameSet.add("Kimberlie");
				nameSet.add("Kendall");
				nameSet.add("Alex");
				System.out.println(nameSet);
				
				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
				System.out.println(matchString(nameSet, 'K'));

				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
				System.out.println(setToList(nameSet));
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
				Set<Integer> numberSet = new HashSet<Integer>();
				for (int i = 0; i < 11; i++) {
					numberSet.add(i);
				}
				
				
				
				System.out.println(filterEvenNumbers(numberSet));

				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
				Map<String, String> dictionary = new HashMap<String, String>();
				dictionary.put("Redundant", " Not or no longer needed or useful.");
				dictionary.put("Ramp", " A slope or inclined plane for joining two different levels, as at the entrance or betwqeen floors of a building.");
				dictionary.put("Superfluous", " Unnecessary, especially through being more than enough.");
				System.out.println(dictionary);
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
				System.out.println(valueOfTheKey(dictionary, "Redundant"));
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				System.out.println(countStartingLetters(stringList));

			}
			
			
			// Method 15:
			public static Map<Character, Integer> countStartingLetters(List<String> list) {
				Map<Character, Integer> results = new HashMap<Character, Integer>();
	
				for (String string : list) {
					char c = string.charAt(0);
					if (results.get(c) == null) {
						results.put(c, 1);
						
					} else {
						results.put(c, results.get(c) + 1);
					}
				}
				return results;
			}
			
			
			// Method 14:
			public static String valueOfTheKey(Map<String, String> map, String string) {
				for (String key : map.keySet()) {
						if (key.equals(string)) {
							return map.get(key);
					}
				}
				return " ";
			}
			// Method 12:
			public static Set<Integer> filterEvenNumbers(Set<Integer> numbers) {
				Set<Integer> result = new HashSet<Integer>();
				for (Integer number : numbers) {
					if (number % 2 == 0) {
						result.add(number);
					}
				}
				return result;
			}

			
			// Method 11:
			public static List<String> setToList(Set<String> set) {
				List<String> stringList1 = new ArrayList<String>();
				for (String string : set) {
					stringList1.add(string);
				}
				return stringList1;
			}


			// Method 10:
			public static Set<String> matchString(Set<String> strings, char a) {
				Set<String> stringsWithChar = new HashSet<String>();
				for (String string : strings) {
					if (string.charAt(0) == a ) {
						stringsWithChar.add(string);
					}
				}
				return stringsWithChar;
			}

			
			// Method 8:
			public static List<Integer> lengthOfStrings(List<String> strings) {
				List<Integer> length = new ArrayList<Integer>();
				for (String string : strings) {
					length.add(string.length());
					
				}
				return length;
			}

			
			// Method 7:
			public static List<List<Integer>> sortDivisibleNumbers(List<Integer> intList){
				List<List<Integer>> results = new ArrayList<List<Integer>>();
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				for (Integer number : intList) {
					if (number % 2 == 0) {
						results.get(0).add(number);
					}
					if (number % 3 == 0) {
						results.get(1).add(number);
					}
					if (number % 5 == 0) {
						results.get(2).add(number);
					}
					if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
						results.get(3).add(number);
					}
				}
				return results;
			}

			
			// Method 6:
			
			public static List<String> search(List<String> list, String str) {
				List<String> results = new ArrayList<String>();
				for (String string : list) {
					if (string.contains(str)) {
						results.add(string);
					}
				}
				return results;
			}
			
			// Method 5:
			public static String concatenateElementsOfList(List<String> str) {
				StringBuilder string = new StringBuilder();
				for (String strings : str) {
					string.append(strings + ", ");
				}
				return string.toString();
			}
			
			
			// Method 4:
			public static List<String> swappedElements(List<String> list){
				String temp = list.get(0);
				list.set(0, list.get(list.size() - 1));
				list.set(list.size() - 1, temp);
				return list;
				
					
					
					
				
			}
			
			
			// Method 3:
			public static String shortestString(List<String> stringList) {
				String currentShortest = stringList.get(0);
				for (String str : stringList) {
					if (str.length() < currentShortest.length()) {
						currentShortest = str;
					}
				}
				return currentShortest;
			}
			

		
	}


