import java.io.*;
import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {

        int code[] = new int[100];
        double r[][] = new double[100][2];
        int num, i, snum;
        double aa, bb;

        System.out.print("幾個橢圓：");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (i = 1; i <= num; i++) {
            code[i] = i;
            System.out.print("No." + i + " 請輸入短邊：");
            Scanner ra = new Scanner(System.in);
            r[i][0] = ra.nextDouble();
            System.out.print("No." + i + " 請輸入長邊：");
            Scanner rb = new Scanner(System.in);
            r[i][1] = ra.nextDouble();
        }
        System.out.print("輸入編號：");
        Scanner c = new Scanner(System.in);
        snum = c.nextInt();
        if (snum > num || snum <= 0) {
            System.out.println("找不到此編號!!");
        } else {
            aa = r[snum][0];
            bb = r[snum][1];
            Oval ov =   new Oval(aa,bb);
            System.out.println("編號：" + code[snum]);
            System.out.println("短邊：" + r[snum][0]);
            System.out.println("長邊：" + r[snum][1]);
            System.out.println("面積：" + ov.Arc());
        }
    }
}

class Circle {

    double r;

    Circle(double er) {
        r = er;
    }

    double Arc(int an) {
        return (2 * r * 3.14) * an / 360;
    }

    double Pie(int an) {
        return (r * r * 3.14) * an / 360;
    }
}

class Oval extends Circle {

    protected double rb;

    public Oval(double a, double b) {
        super(a);
        rb = b;
    }

    double Arc() {
        return 3.14 * rb * r;
    }
}
