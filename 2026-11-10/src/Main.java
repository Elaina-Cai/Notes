import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Test1 test1 = new Test1();
        test1.print1(100,200);
        System.out.println();

        Test2 test2 = new Test2();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入t的值（支持小数）:");
        double t = sc.nextDouble();
        double y1 = test2.print21(t);
        double y2 = test2.print21(t);
        System.out.println("y = "+y1);
        System.out.println("y = "+y2);
        sc.close();
        System.out.println();

        Test3 test3 = new Test3();
        test3.print3();
        System.out.println();

        Tset4 tset4 = new Tset4();
        tset4.print4();
        System.out.println();

        Test5 test5 = new Test5();
        test5.print5();
        System.out.println();

        Test6 test6 = new Test6();
        test6.print6();
        System.out.println();
    }
}
