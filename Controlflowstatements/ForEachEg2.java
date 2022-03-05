package Controlflowstatements;
//Calculate the sum of all elements of an array

public class ForEachEg2 {
    public static void main(String[] args) {
        //an array of numbers
        int[] numbers = {3,4,5,-5,0,12};
        int sum = 0;

        // iterating through each element of the array
        for (int num : numbers ) {
            sum += num;
        }
        System.out.println("sum = "+ sum);

    }
}
