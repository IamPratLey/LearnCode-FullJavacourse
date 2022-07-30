public class practiceset_third {
    public static void main(String[] args) {
        //Today we will solve some of the best problems in Java related to strings! Here is the Chapter 3 – Practice Set

        //Question 1 -Write a Java program to convert a string to lowercase.
        String lower = "LOWERCASE";
        System.out.println(lower.toLowerCase());

        //Question 2- Write a Java program to replace spaces with underscores.
        String replace = "  space  underscores  ";
        System.out.println(replace.replaceAll(" ", "_"));


        //Question 3 - Write a Java program to fill in a letter template which looks like below:

        // letter = “Dear <|name|>, Thanks a lot”

        // Replace <|name|> with a string (some name)
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Jugi");
        System.out.println(letter);

        //Question 4 - Write a Java program to detect double and triple spaces in a string.
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Question 5 - Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Karry, This Java Course is nice. Thanks”

        String myLetter = "Dear Karry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);


    }
}
