/*
Pattern Name : horizontal diamond

*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
*	*	*	*	*	*
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*

 */
package Patterns;

public class Pattern_05 {
    public static void main(String[] args) {
       int n=6;
       myMethod(n);
       kunalMethod(n);
    }
        public  static  void  myMethod (int n){

        for (int i=0; i<n;i++)
        {
            for (int j=0; j < i ; j++ ){
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int  i=n; i>0;i--){
            for (int j=i; j>0;j--){
                System.out.print("*\t");
            }
            System.out.println();
            }
        }
        public static void kunalMethod (int n) {
        for (int row =0; row <2*n;row++){
            int totalColsInRow = row > n ? 2 *n -row : row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}



