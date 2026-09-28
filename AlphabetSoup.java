//Name: Matteo Thomasson
//Date: 09/27/26
//Description: This program creates an alphabet soup letter pool.

public class AlphabetSoup
{
    private String letters;
    private String company;

    public AlphabetSoup()
    {
        letters = "";
        company = "";
    }

    //Precondition: word is a non-null String.
    //Postcondition: word is added to the end of letters.
    public void add(String word)
    {
        letters += word;
    }

    //Precondition: letters contains at least one character.
    //Postcondition: returns a randomly selected character from letters.
    public char randomLetter()
    {
        int index = (int)(Math.random() * letters.length());
        return letters.charAt(index);
    }

    //Precondition: letters and company are valid Strings.
    //Postcondition: returns letters with company inserted in the center.
    public String companyCentered()
    {
        int middle = letters.length() / 2;
        return letters.substring(0, middle) + company + letters.substring(middle);
    }

    //Precondition: letters is a valid String.
    //Postcondition: removes the first vowel from letters, if one exists.
    public void removeFirstVowel()
    {
        for (int i = 0; i < letters.length(); i++)
        {
            char c = letters.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                letters = letters.substring(0, i) + letters.substring(i + 1);
                return;
            }
        }
    }

    //Precondition: num is non-negative and does not exceed the length of letters.
    //Postcondition: removes num letters from a random valid position in letters.
    public void removeSome(int num)
    {
        int start = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0, start) + letters.substring(start + num);
    }

    //Precondition: word is a valid String.
    //Postcondition: removes the first occurrence of word from letters, if found.
    public void removeWord(String word)
    {
        int position = letters.indexOf(word);

        if (position != -1)
        {
            letters = letters.substring(0, position)
                    + letters.substring(position + word.length());
        }
    }
}
