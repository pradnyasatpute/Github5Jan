package Controlflowstatements;

public class StarPattern3 {
    public static void main(String[] args) {
        for (int i = 1;i<=4;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        for (int i = 1;i<=4;i++){   /**we can write the condition for i in another way : i<=3 bacause for i<=4 condition...when i=4 at that time j=0...then condition goes false  and print upto 3rd row and 3rd column */
            for (int j = 3;j>=i;j--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
