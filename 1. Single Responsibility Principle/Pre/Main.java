/*
In this problem, we are introducing a Dictionary. But the 'DictionaryClass' has so many responsibilities like finding, updating, printing, deleting a word.
We know that in single responsibility principle, a class should not have more than one responsibility.
Thus, The following implementation clearly violates the Single Responsibility Principle.
*/


class DictionaryClass {
    String word;
    int length;

    String getWord ()
    {
        return word;
    }
    void setWord(String word)
    {
        this.word= word;
    }
    boolean findWord (String word) {
        
        //Return true if found
        //else 
        return false;
    }
    int LengthOf (String word)
    {
        //returns length of a word
        return 1;
    }
    void editWordInformation(String word){
        // Able to update the meaning of a word
    }
    void deleteWord(String word){
        // Deletes a word
    }
    void printWordWithMeaning (String word){
        // Prints word with meaning
    }
}


public class Main {
    public static void main (String[] args) {
        System.out.println ("\n--> Violation of Single Responsibility Principle\n");
    }
}
