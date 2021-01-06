package L1;
import java.util.Scanner;

public class L1
{
    public static void main (String args[]) {
        Scanner scannerObj = new Scanner(System.in);
        int menuInput, i, j, totalChars, totalVowels;
        int repeat = 1;
        int noSentences = 0;
        String[] sentence = new String[10];
        String searchWord;

        while (repeat == 1)
        {
            printMenu();
            System.out.println("\nSelect an option:");
            menuInput = scannerObj.nextInt();
            String junk = scannerObj.nextLine();
            
            switch (menuInput)
            {
                case 1:
                    if (noSentences == 10) {
                        System.out.println("Sentence array is full. You cannot enter more than 10 sentences.");
                    } else {
                        System.out.println("Please enter a full Sentence.");
                        sentence[noSentences] = scannerObj.nextLine();
                        sentence[noSentences] = sentence[noSentences].replace('\n', '\0');
                        noSentences++;
                    }
                    break;

                case 2:
                    System.out.println("All sentences in inputed order:");
                
                    for(i = 0; i < noSentences; i++)
                    {
                        System.out.println(sentence[i]);
                    }
                    break;

                case 3:
                    System.out.println("Total number of sentences:");
                    System.out.println(noSentences);
                    break;

                case 4:
                    System.out.println("All sentences in reverse order:");
                    for(i = 0; i < noSentences; i++)
                    {
                        System.out.println(sentence[noSentences - 1 - i]);
                    }
                    break;

                case 5:
                    System.out.println("Total no. of characters in all sentences:");
                    totalChars = 0;
                    for(i = 0; i < noSentences; i++)
                    {
                        totalChars = totalChars + sentence[i].length();
                    }
                    System.out.println(totalChars);
                    break;

                case 6:
                    System.out.println("Total no. vowels in all sentences:");
                    totalVowels = 0;
                    for(i = 0; i < noSentences; i++)
                    {
                        for(j = 0; j < sentence[i].length(); j++)
                        {
                            if ((sentence[i].toLowerCase()).charAt(j) == 'a' || (sentence[i].toLowerCase()).charAt(j) == 'e' || (sentence[i].toLowerCase()).charAt(j) == 'i' || (sentence[i].toLowerCase()).charAt(j) == 'o' || (sentence[i].toLowerCase()).charAt(j) == 'u')
                            {
                                totalVowels++;
                            }
                        }
                    }
                    System.out.println(totalVowels);
                    break;

                case 7:
                    System.out.println("Please enter a search word:");
                    searchWord = scannerObj.nextLine();
                    searchWord = searchWord.replace('\n', '\0');

                    System.out.println("Sentences that contain the search word:");
                    for(i = 0; i < noSentences; i++)
                    {
                        if( (sentence[i].toLowerCase()).indexOf(searchWord.toLowerCase()) > -1 )
                        {
                            System.out.println(sentence[i]);
                        }
                    }
                    break;

                case 8:
                    System.out.println("Please enter a search word:");
                    searchWord = scannerObj.nextLine();
                    searchWord = searchWord.replace('\n', '\0');

                    System.out.println("Sentences that contain the search word:");
                    for(i = 0; i < noSentences; i++)
                    {
                        if(sentence[i].indexOf(searchWord) > -1)
                        {
                            System.out.println(sentence[i]);
                        }
                    }
                    break;

                case 9:
                    repeat = 0;
                    break;

                default:
                    System.out.println("Invalid option");
            }

        }
        scannerObj.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("(1) Enter a full sentence.");
        System.out.println("(2) Print out all sentences entered thus far in the given order.");
        System.out.println("(3) Print out the number of sentences that have been entered thus far.");
        System.out.println("(4) Print out all sentences entered thus far in the reverse order.");
        System.out.println("(5) Print out the number of characters in all sentences combined.");
        System.out.println("(6) Calculate the total number of vowels contained in all stored sentences.");
        System.out.println("(7) Perform search for a given word using case insensitive comparisons.");
        System.out.println("(8) Perform search for a given word using case sensitive comparisons.");
        System.out.println("(9) End program.");
    }
}