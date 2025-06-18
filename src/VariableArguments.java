public class VariableArguments {
    public static void sum(int ... args) {
        int result = 0;
    for(int a:args){
        result=result+a;
    }

        System.out.println("Sum is "+result);
    }
    public static void main(String[] args) {
        System.out.println("Program to understand Variable Arguments");
        sum(1,2,3);
    }
}
