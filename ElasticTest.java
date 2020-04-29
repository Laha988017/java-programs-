import java.util.Scanner;
/* 
1.	Elastic Words
In this challenge, you must think about words as elastics. What happens when do you tend an elastic applying a constant traction force at both ends? Every part (or letter, in this case) of the elastic will expand, with the minimum expansion at the ends, and the maximum expansion in the center.
If the word has an odd length, the effective central character of the word will be the pivot that splits the word into two halves.
"ABC" -> Left = "A" | Center = "B" | Right = "C"
If the word has an even length, you will consider two parts of equal length, with the last character of the left half and the first character of the right half being the center.
"ABCD" -> Left = "AB" | Right = "CD"
You will represent the expansion of a letter repeating it as many times as its numeric position (so counting the indexes from/to 1, and not from 0 as usual) in its half, with a crescent order in the left half and a decrescent order in the right half.
Word = "ANNA" 

Left = "AN"
Right = "NA"

Left = "A" * 1 + "N" * 2 = "ANN"
Right = "N" * 2 + "A" * 1 = "NNA"

Word = Left + Right = "ANNNNA"
If the word has an odd length, the pivot (the central character) will be the peak (as to say, the highest value) that delimits the two halves of the word.
Word = "KAYAK"

Left = "K" * 1 + "A" * 2 = "KAA"
Pivot = "Y" * 3 = "YYY"
Right = "A" * 2 + "K" * 1 = "AAK"

Word = Left + Pivot + Right = "KAAYYYAAK"
Given a word, implement a function that returns the elasticized version of the word as a string.
Examples
elasticize("ANNA") ➞ "ANNNNA"

elasticize("KAYAK") ➞ "KAAYYYAAK"

elasticize("X") ➞ "X"
*/
public class ElasticTest {
    public static void main(String[] args) {
        StringBuilder left = new StringBuilder();
        StringBuilder pivot = new StringBuilder();
        StringBuilder right = new StringBuilder();
        StringBuilder newWord = new StringBuilder();
        //left = right = pivot = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        sc.close();
        if(word.length()==1||word.length()==0)
        {
            System.out.print(word);
        }
        else if(word.length()%2==0)
        {
            for(int i=0;i<word.length()/2;i++)
                left.append(stringMultiply(word.charAt(i),word.indexOf(word.charAt(i))+1));
            for(int i=word.length()/2;i<word.length();i++)
                right.append(stringMultiply(word.charAt(i),word.indexOf(word.charAt(i))+1));
            newWord = left.append(right);
            /*left = word.substring(0, word.length()/2);
            right = word.substring(word.length()/2,word.length());*/
        }
        else
        {
            for(int i=0;i<word.length()/2;i++)
                left.append(stringMultiply(word.charAt(i),word.indexOf(word.charAt(i))+1));
            
            pivot.append(stringMultiply(word.charAt(word.length()/2),word.indexOf(word.charAt(word.length()/2+1))+2));

            for(int i=word.length()/2+1;i<word.length();i++)
                right.append(stringMultiply(word.charAt(i),word.indexOf(word.charAt(i))+1));
            newWord = left.append(pivot.append(right));
            /*left = word.substring(0, word.length()/2);
            pivot = word.substring(word.length()/2, word.length()/2+1);
            right = word.substring(word.length()/2+1,word.length());*/
        }
        //System.out.println(left);
        //System.out.println(pivot);
        //System.out.println(right);
        System.out.println(newWord);
    }
    public static String stringMultiply(char s, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(s);
        }
        return sb.toString();
    }
}