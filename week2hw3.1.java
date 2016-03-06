import java.io.*;
import java.util.Scanner;

public class Circle {
    double r;
    Circle(double er)
    {
        r  =  er;
    }
    double Arc(int an){
        return (2*r*3.14)*an/360;
    }
    double Pie(int an){
        return (r*r*3.14)*an/360;
    }
    public static void main(String[] args) {
        int code[]=new int[100];
        double  r[]=new double[100];
        int num,i,snum,ang;
        double rd;
        
        System.out.print("幾個圓：");
        Scanner s   =   new Scanner(System.in);
        num         =   s.nextInt();
        for(i=1;i<=num;i++)
        {
            code[i]=i;
            System.out.print("No."+i+" 請輸入半徑：");
            Scanner ra  =   new Scanner(System.in);
            r[i]        =   ra.nextDouble(); 
        }
        System.out.print("輸入編號：");
        Scanner c   =   new Scanner(System.in);
        snum        =   c.nextInt();
        System.out.print("輸入角度：");
        Scanner a   =   new Scanner(System.in);
        ang         =   a.nextInt();
        if(snum>num || snum<=0)
            System.out.println("找不到此編號!!");
        else
        {
            rd=r[snum];
            Circle ci   =   new Circle(rd);
            System.out.println("編號："+code[snum]);
            System.out.println("半徑："+r[snum]);
            System.out.println("弧長："+ci.Arc(ang));
            System.out.println("面積："+ci.Pie(ang));              
        }
    }
}
