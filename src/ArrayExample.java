public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Program to Demonstrate Array with its declaration , memory allocation and Initialization");
        // SYNTAX ==>  dataType[]  ArrayName;
        //Definition ==> Collection of Similar type of data

        // 1. Declaration and Memory Allocation in Same line
        float[] marks = new float[5];

        marks[0] = 95f; //Initialization
        marks[1] = 96f;//Initialization
        marks[2] = 97f; //Initialization
        marks[3] = 98f; //Initialization
        marks[4] = 99f; //Initialization


        System.out.println("Value at index 0 of array Marks " + marks[0]);
        System.out.println("Value at index 1 of array Marks " + marks[1]);
        System.out.println("Value at index 2 of array Marks " + marks[2]);
        System.out.println("Value at index 3 of array Marks " + marks[3]);
        System.out.println("Value at index 4 of array Marks " + marks[4]);


        // 2. Declaration and then Memory Allocation
        float[] marks_1;
        marks_1 = new float[5];

        marks_1[0] = 95f; //Initialization
        marks_1[1] = 96f;//Initialization
        marks_1[2] = 97f; //Initialization
        marks_1[3] = 98f; //Initialization
        marks_1[4] = 99f; //Initialization

        System.out.println("\nValue at index 0 of array Marks_1 " + marks_1[0]);
        System.out.println("Value at index 1 of array Marks_1 " + marks_1[1]);
        System.out.println("Value at index 2 of array Marks_1 " + marks_1[2]);
        System.out.println("Value at index 3 of array Marks_1 " + marks_1[3]);
        System.out.println("Value at index 4 of array Marks_1 " + marks_1[4]);

        // Direct Declare and initialize

        float[] marks_2 = {95, 96, 97, 98, 99};
        System.out.println("\nValue at index 0 of array Marks_2 " + marks_2[0]);
        System.out.println("Value at index 1 of array Marks_2 " + marks_2[1]);
        System.out.println("Value at index 2 of array Marks_2 " + marks_2[2]);
        System.out.println("Value at index 3 of array Marks_2 " + marks_2[3]);
        System.out.println("Value at index 4 of array Marks_2 " + marks_2[4]);

    }
}
