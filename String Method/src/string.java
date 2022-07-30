public class string {
    public static void main(String[] args){
        System.out.println("String Methods operate on Java Strings. They can be used to find the length of the string, convert to lowercase, etc.");

        System.out.println("(Indexes of the above string are as follows: 0-K, 1-a, 2-r, 3-r, 4-y)");

//        Method	Description
//        1. length() -->	Returns the length of String name. (5 in this case)
//        2. toLowerCase()	-->	Converts all the characters of the string to the lower case letters.
//        3. toUpperCase()	-->	Converts all the characters of the string to the upper case letters.
//        4. trim()	-->	Returns a new String after removing all the leading and trailing spaces from the original string.
//        5. substring(int start)-->
//        Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]
//
//        6. substring(int start, int end)	-->	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
//        7. replace(‘r’, ‘p’)	-->	Returns a new string after replacing r with p. Kappy is returned in this case. (This method takes char as argument)
//        8. startsWith(“Ka”)	-->	Returns true if the name starts with the string “Ka”. (True in this case)
//        9. endsWith(“ry”)	-->	Returns true if the name ends with the string “ry”. (True in this case)
//        10. charAt(2)	-->	Returns the character at a given index position. (r in this case)
//        11. indexOf(“s”)	-->	Returns the index of the first occurrence of the specified character in the given string.
//        12. lastIndexOf(“r”)	-->	Returns the last index of the specified character from the given string. (3 in this case)
//        13. equals(“Karry”)	-->	Returns true if the given string is equal to “Karry” false otherwise [Case sensitive]
//        14.equalsIgnoreCase(“karry”)	-->	Returns true if two strings are equal, ignoring the case of characters.

//        Escape Sequence Characters :
//        The sequence of characters after backslash ‘\’ = Escape Sequence Characters
//        Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
//        Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.


        String name = "Karry";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Karry     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

       // System.out.println(name.startsWith("Kar"));
       // System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Karryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

       // System.out.println(name.equals("Harry"));
        //System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence\tdouble quote");
        System.out.println("I am escape sequence\ndouble quote");
        System.out.println("I am escape sequence double quote\\");




    }

}
