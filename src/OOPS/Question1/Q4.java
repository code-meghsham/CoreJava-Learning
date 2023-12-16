//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package OOPS.Question1;
class Triangle{
    double s1;
    double s2;
    double s3;
    double getArea(){
        double s = (s1+s2+s3)/2.0;
        return  Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
    }

    double getPerimeter (){
        return (s1+s2+s3)/2.0;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.s1=2;
        t.s2=3;
        t.s3=4;

        System.out.println( "Area ==> "+t.getArea());
        System.out.println( "Perimeter ==> "+t.getPerimeter());

    }


}
