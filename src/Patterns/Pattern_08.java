/*
Pattern name : pyramid
 	 	 	*
 	 	* 	* 	*
 	* 	* 	* 	* 	*
* 	* 	* 	* 	* 	* 	*
 */
package Patterns;
public class Pattern_08 {
    public static void main(String[] args) {
        int row = 5;
        int col = (row * 2 ) - 1;
        int mid = col / 2 - 1 ;

        for (int i=0; i<row; i++){
            for(int j=0; j<=col; j++){
                if (j>mid-i && j<mid+i){
                    System.out.print("* \t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
