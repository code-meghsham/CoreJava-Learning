/*
Pattern Name : inverted right-angled triangle
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*

*/
package Patterns;
public class Pattern_03 {
    public static void main(String[] args) {

        int n=5;

        for (int i=0 ; i<n; i++)
        {
            for (int j=0; j<n-i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
