// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
package OOPS.Question1;
 class Student {
     String name;
     int roll_no;
     String phone_no;
     String address;

     void setValue(String name, int roll_no, String phone_no, String address){
         this.name=name;
         this.roll_no=roll_no;
         this.phone_no=phone_no;
         this.address=address;
     }

     void showValue(){
         System.out.println("Name : "+this.name);
         System.out.println("Roll No : "+this.roll_no);
         System.out.println("Phone No : "+this.phone_no);
         System.out.println("Roll No : "+this.address);

     }
 }
public class Q2 {
    public static void main(String[] args) {
        Student s1 =new Student ();
        s1.setValue("Meghsham",76,"7066326068","Ratnagiri");


        Student s2 =new Student ();
        s2.setValue("Shrutika", 23,"7417539510","Shirwal");

        s1.showValue();
        System.out.println();
        s2.showValue();
    }
 }
