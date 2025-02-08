public class StringClassExample {

    public static void main(String[] args) {

        // Declare and initialize a string

        String str1 = "Java";

        // 1. Get the length of the string

        int length = str1.length();

        System.out.println("Length of the string: " + length);  

        // 2. Get the character at the 0th index

        char firstCharacter = str1.charAt(0);

        //System.out.println("Character at index 0: " + firstCharacter); 
 
        // 3. Concatenate strings using + operator

        String fullName = "John" + "Doe";

        //System.out.println("Full Name (using +): " + fullName); 

        // 4. Concatenate strings using concat() method

        String name = "John".concat("Doe");

        //System.out.println("Full Name (using concat): " + name);  

        // 5. Compare two strings using equals() method

        String str2 = "Java";

        boolean isEqual = str1.equals(str2);

        //System.out.println("str1 equals str2: " + isEqual); 
 
        // 6. Compare two strings lexicographically using compareTo() method

        int comparisonResult = str1.compareTo(str2);

        //System.out.println("Comparing str1 and str2 using compareTo: " + comparisonResult);  

        // 7. Get a substring from the string (from index 0 to index 2)

        String substring = str1.substring(0, 2);

        //System.out.println("Substring (first 2 characters): " + substring);  

        // 8. Convert the string to lowercase

        String lowerCase = str1.toLowerCase();

        //System.out.println("Lowercase: " + lowerCase);  

        // 9. Convert the string to uppercase

        String upperCase = str1.toUpperCase();

        //System.out.println("Uppercase: " + upperCase); 
 
        // 10. Trim spaces from the string

        String paddedString = "  Java  ";

        String trimmedString = paddedString.trim();

        //System.out.println("After trim(): " + trimmedString);    
  }
}
