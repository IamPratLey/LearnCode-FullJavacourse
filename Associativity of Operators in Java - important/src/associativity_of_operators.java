//rules in java when using the operators

//Precedence meaning - the right that somebody/something has to come before somebody/something else because he/she/it is more important

//Precedence in java means the operators are applied and evaluated based on precedence. for example (+,-) has less procedure compared to (*,!). hence * & / are calculated first.
//In case we like to change this order, we use parenthesis.
//In Java the original common BODMAS Rule doesn't work instead precendence and associativity works. when precendence of is same like * and / then associativity works.
//Whenever you start working on solving operators problem, first check the operators who has highest precedence value and then start solving but if you encounter operators which has same precendence value than check the associativity rule then start sloving.
//regular bodmass rule doesn't work in java the associativity and precedence works.


//Associativity
//        Associativity tells the direction of the execution of operators. It can either be left to right or vice versa.
//
//        / * -> L to R
//
//        + - -> L to R
//
//        ++, = -> R to L

public class associativity_of_operators {

    public static void main(String[] args){

                // Precedence & Associativity

                //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
                //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

                //System.out.println(a);
                //System.out.println(b);

                // Quick Quiz
                int x =6;
                int y = 1;
                //  int k = x * y/2;

                int b = 0;
                int c = 0;
                int a = 10;
                int k = (b*b - 4*a*c)/(2*a);
                System.out.println(k);

            }
        }





