public class variable {

    int a = 10; //instance variable
    static double b = 209999.9; //static variable
    static  String c = "static varible outside main class below";
    public static void main(String[] args) {

     boolean x = true; //local variable



        // printing value using static
        variable staticvar = new variable();
         System.out.println(staticvar.a);
         System.out.println(b);
        System.out.println(x);
         System.out.println(staticvar.c);


    }
}

// literal - any fix value given to variable which can't be changed. like 'c', "string". 9; etc
// Variable - variable is the name of memory location where we store different types of variable.