public class DisplayArrayWays {
    public static void main(String[] args) {

        float[] marks_2 = {95, 96, 97, 98, 99};

//       1. Native Way of Displaying Array
        System.out.println("\nNative Way of Displaying Array");
        System.out.println("Value at index 0 of array Marks_2 " + marks_2[0]);
        System.out.println("Value at index 1 of array Marks_2 " + marks_2[1]);
        System.out.println("Value at index 2 of array Marks_2 " + marks_2[2]);
        System.out.println("Value at index 3 of array Marks_2 " + marks_2[3]);
        System.out.println("Value at index 4 of array Marks_2 " + marks_2[4]);


//       2. Displaying Array elements using for loop
        System.out.println("\nDisplaying Array elements using for loop");
        for (int i = 0; i < marks_2.length; i++) {
            System.out.println("value of array at index "+i+" is "+marks_2[i]);
        }

//       3.  Displaying Array elements using for-each  loop
        System.out.println("\nDisplaying Array elements using for-each loop");
        for (float elements : marks_2) {
            System.out.println("Value of array at index "+elements);
        }

    }
}
