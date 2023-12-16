// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

package OOPS.Question1;

import java.util.Scanner;

class  Area{
    int length;
    int bredth;
    public void setDim(int len, int bre){
        this.length = len;
        this.bredth = bre;
    }

    public int getArea(){
        return length * bredth;
    }
}
public class Q1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and breadth : ");
        System.out.print("Length ==> ");
        int len = sc.nextInt();
        System.out.print("Length ==> ");
        int bre = sc.nextInt();
        Area a = new Area ();
        a.setDim(len,bre);
        System.out.println("Area is  "+a.getArea());
    }

}
