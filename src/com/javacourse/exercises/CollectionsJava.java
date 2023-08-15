package com.javacourse.exercises;

import java.util.Arrays;

class StringMagic {

    public boolean areAnagrams(String str1, String str2) {
        if(str1 == null || str2 == null){
            return false;
        } else if (str1.length() != str2.length()){
            return false;
        } 
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //Convertir strings en Arrays
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        
    return Arrays.equals(strArray1, strArray2);
    }
    
    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        
        if(sentence == null){
            return "INVALID";
        }else if(sentence.isEmpty()){
            return "";
        }

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string

        // TODO: Split the sentence into words using the split method. 
        // Use " " as the delimiter to match space.
        String[] words = sentence.split(" ");
        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder reverseSentence = new StringBuilder();

        // TODO: Loop through each word in the words array.

            // TODO: For each word, create a StringBuilder and reverse the word.
            // Append the reversed word, followed by a space, to the reversed sentence.
        for(String word : words){
             StringBuilder reverseWord = new StringBuilder(word);
             reverseWord.reverse();
             reverseSentence.append(reverseWord).append(" ");
        }


        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        return reverseSentence.toString().trim();
    
    
    }
}
class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        return  (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');
    }

    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.isEmpty()){
            return false;
        }else{
            char[] arrayChars = str.toCharArray();
            for(char character: arrayChars){
                if(!Character.isDigit(character) && !isHexadecimalChar(character)){
                    return false; }
                    
            }
        }
        return true;
    }

    
}



public class CollectionsJava {

	public static void main(String[] args) {
		// areAnagrams method
        StringMagic stringMagic = new StringMagic();
        boolean areAnagramsResult = stringMagic.areAnagrams("hola", "aloh");
        System.out.println("Son 'hola' y 'aloh' anagrams? " + areAnagramsResult);

        //reverseWordsInSentence method
        String sentence = "Hello world";
        StringMagic stringMagic2 = new StringMagic();
        String reversedSentence = stringMagic2.reverseWordsInSentence(sentence);
        System.out.println("Oracion al revez: " + reversedSentence);

        //isHexadecimal method
        MyString myString = new MyString("1a2b3c");
        boolean isHexadecimalResult = myString.isHexadecimal();
        System.out.println("Es '1a2b3c' una string hexadecimal? " + isHexadecimalResult);
   	}

}
