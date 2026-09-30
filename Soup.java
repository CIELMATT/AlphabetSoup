//Name: Matteo Thomasson
//Date: 09/29/26
//Description: This program manipulates an alphabet soup letter
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //Precondition: word is a non-empty string
    //Postcondition: word is added to letters
    public void add(String word){
        letters += word;
    }


    //Precondition: Letters contains at least 1 char
    //Postcondition: Returns one random char from letters
    public char randomLetter(){
        if (letters.length() == 0) {
            return ' ';
        }
        
        int index = (int)(Math.random() * letters.length());
        return letters.charA(index);
    }


    //Letters and company are valid strings
    //Postcondition: returns letters with company placed in the center
    public String companyCentered(){
        int middle = letters.length() / 2;
        return letters.substring(0,middle) + company + letters.substring(middle);
    }


    //Precondition: Letters is a valid string
    //PostconditionL removes the first vowel from letters
    public void removeFirstVowel(){
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'I' || c == 'O' || c == 'U') {

                letters = letters.substring(0,i) + letters.substring(i + 1);
                return;
            }
        }
    }

    //Precondition: Num is between 0 and the length of letters
    //Postcondition: removes num letters from a random position in letters
    public void removeSome(int num){
        int start = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0,start) + letters.substring(start + num);
    }

    //Precondition: word is a valid string
    //Postcondition: removes word from letters if it is found
    public void removeWord(String word){
        int position = letters.indexOf(word);

        if (position != -1) {
            letters = letters.substring(0,position)
                    + letters.substring(position + word.length());
    }
}
