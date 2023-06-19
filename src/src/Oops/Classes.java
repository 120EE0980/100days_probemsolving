package Oops;

public class Classes {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers = new int[5];
        //store 5 names
        String[] names = new String[5];
        //data of 5 students:{roll no,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];
        //just declaring
        //Student nish;
        Student nish = new Student();// no arguments so its going to call constructor with no arguments
        //constructor is special function that runs when u create an object and it allocates some variables
        //Student rahul=new Student(2,"rahul",23);
        //bind these arguments with objects
       // nish.rno=120;//we cannot add properties like salary that is not there in class Student
        //here java will call its by default constructor
        System.out.println(nish.rno);//prints default values if not initiated
        System.out.println(nish.name);
        Student obj;
        for (int i = 0; i < 10000000; i++) {
          obj=new Student();
        }
    }
}
 //   class=logical construct;object=physical reality(occupies memory)
    //object of class Student has Student datatype(class is nothing but datatype)
    //variables inside object are instance variables//dot operator is used to access them
class Student{
    int rno;
    String name;
    float marks;
//we need a way to add the values of above
     //properties object by object
     //we need one word to access every object  ....this
      Student() {
          this.rno=12;
          this.name="nish";
          this.marks=16f;
     }
     //finalisation

     @Override
     protected void finalize() throws Throwable {
         System.out.println("object is destroyed");
     }
 }
//The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it.
//This reference is, more or less, the address in memory of the object allocated by new.
//This reference is then stored in the variable.
//in Java we cant access memory address;
// cannot cause object reference to point to arbitrary memory location and cant manipulate it;
//Thus, in Java, all class objects must be dynamically allocated.
