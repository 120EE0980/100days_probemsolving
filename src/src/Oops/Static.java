package Oops;

public class Static {

        static class Test {
            static String name;

            public Test(String name) {
                this.name = name;
            }
            @Override
            public String toString() {
                return name;
            }
        }
//we can create main anywhere
        public static void main(String[] args) {
            Test a = new Test("Kunal");
            Test b = new Test("Rahul");

           // System.out.println(a);

       System.out.println(a.name);
       System.out.println(b.name);
        }
    }

