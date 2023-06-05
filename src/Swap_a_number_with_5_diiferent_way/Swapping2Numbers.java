package Swap_a_number_with_5_diiferent_way;

import com.sun.tools.javac.Main;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("// //Logic using Third variable");
        System.out.println("Before swapping the values are "+a+" "+b);

        int  t = a;
        a = b;
        b = t;
        System.out.println("After Swapping the values are "+a+" "+b);

        System.out.println("                                               ");
        System.out.println("//Logic2 Without using third variable using + and - operator");
        int x=10;
        int y=20;
        System.out.println("Before swapping the values are "+x+" "+y);
        x=x+y;//X value is now 30
        y=x-y;//now value of y will be 10 when 30-20=10
        x=x-y;//now value of x will be 20 when 30-10=20
        System.out.println("After Swapping the values are "+x+" "+y);


        System.out.println("                                              ");
        System.out.println("//Logic3 Without using third variable using * and / operator");
        int c=10;
        int d=20;//Here the variables value should not be a zero
        System.out.println("Before swapping the values are "+c+" "+d);
        c=c*d;//c value is now 200
        d=c/d;//now value of d will be 10 when 200/20=10
        c=c/d;//now value of x will be 20 when 200/10=20
        System.out.println("After Swapping the values are "+c+" "+d);

        System.out.println("                                              ");
        System.out.println("//Logic4 in single line");
        int i=10;
        int j=20;
        System.out.println("Before swapping the values are "+i+" "+j);
        j= i+j-(i=j);
        System.out.println("After Swapping the values are "+i+" "+j);
    }
    }

