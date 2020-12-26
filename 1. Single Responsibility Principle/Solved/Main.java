/*
To follow the Single Responsibility Principle, we need to break the 'DictionaryClass' into multiple classes such as 'findWord', 'LengthOfWord', 'EditWordInformation', 'DeleteWord' etc.
In this example, every class has a single responsibility which follows the Single Responsibility Principle.
*/


class DictionaryClass {
    String word;
    int length;

    String getWord ()
    {
        return this.word;
    }
    void setWord(String word)
    {
        this.word= word;
    }
}

class FindWord{

    boolean findWord (String word) {
        
        //Return true if found
        //else 
        return false;
    }
}

class LengthOfAWord{
    int LengthOf (String word)
    {
        //return length of a word
        return 1;
    }
}

class EditWordInformation{
    void editWordInformation(String word){
        // Able to update the meaning of a word
    }
}

class DeleteWord {
    void deleteWord(String word){
        // Deletes a word
    }
}

class PrintWordWithMeaning{
    void printWordWithMeaning (String word){
        // Prints word with meaning
    }
}


public class Main {
    public static void main (String[] args) {
        System.out.println ("\n--> Example of Single Responsibility Principle\n");
    }
}

