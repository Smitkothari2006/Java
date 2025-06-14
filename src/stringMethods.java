public class stringMethods {
    public static void main(String[] args) {
        String a = "Smit";
        String b = "Kothari";

        //Printing Default String
        System.out.println(a);
        System.out.println(b);

        //Printing the length of the String A and B

        int lengthA = a.length();
        int lenghtB = b.length();

        System.out.println(lengthA);
        System.out.println(lenghtB);

        //LowerCase
        System.out.println(a.toLowerCase());
        System.out.println(b.toLowerCase());

        //Upper Case
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());

        //Trim
        String unTrim = "   Smit Kothari    ";
        System.out.println(unTrim);
        System.out.println(unTrim.trim());

        //Replace of character
        System.out.println(a.replace('i','e'));

        //Replace string
        System.out.println(a.replace("i","ee"));

        //To Check if Sting Starts with ( " String ")
        System.out.println(a.startsWith("x"));
        System.out.println(b.startsWith("x"));

        //To check if String Ends with
        System.out.println(a.endsWith("t"));
        System.out.println(b.endsWith("i"));

        //To Check the Character any index
        System.out.println(a.charAt(2));
        System.out.println(b.charAt(2));

        //To Return the index of the first occurring String
        System.out.println(a.indexOf("mit"));
        System.out.println(b.indexOf("ot"));



    }
}
