import java.io.*;
import java.util.*;

//抽象類別
abstract class Shape {
    //抽象函式(直接分號就好)
    abstract double area();
}
//圓形
class Circle extends Shape {
    double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area() {
        return 3.14 * r * r;
    }
}
//矩形
class Rectangle extends Shape {
    double width, height;
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public double area() {
        return width * height;
    }
}
//三角形
class Triangle extends Shape{
    double end,height;
    public Triangle(double e,double h){
        this.end = e;
        this.height = h;
    }
    public double area(){
        return end*height/2;
    }
}
//橢圓
class Oval extends Shape{
    double aline,bline;
    public Oval(double a,double b){
        this.aline = a;
        this.bline = b;
    }
    public double area(){
        return aline*bline*3.14;
    }
}
class hw4 {
    public static void main(String[] args) {
        int num,i,op;
        char []shape  =   new char[100];
        double [][]edge   =   new double[100][2];
        System.out.print("請輸入要幾個圖形：");
        Scanner n = new Scanner(System.in);
        num =   n.nextInt();
        for(i=0;i<num;i++)
        {
            System.out.print("選擇形狀：1)圓形 2)矩形 3)三角形 4)橢圓形：");
            Scanner option = new Scanner(System.in);
            op  =   option.nextInt();
            switch(op)
            {
                case 1:
                shape[i]='c';
                System.out.print("半徑：");
                Scanner r = new Scanner(System.in);
                edge[i][0]  =   r.nextDouble();
                break;
                
                case 2:
                shape[i]='r';
                System.out.print("長：");
                Scanner l = new Scanner(System.in);
                edge[i][0]  =   l.nextDouble();
                System.out.print("寬：");
                Scanner w = new Scanner(System.in);
                edge[i][1]  =   w.nextDouble();
                break;
                
                case 3:
                shape[i]='t';
                System.out.print("底：");
                Scanner e = new Scanner(System.in);
                edge[i][0]  =   e.nextDouble();
                System.out.print("高：");
                Scanner h = new Scanner(System.in);
                edge[i][1]  =   h.nextDouble();
                break;
                
                case 4:
                shape[i]='o';
                System.out.print("短邊：");
                Scanner a = new Scanner(System.in);
                edge[i][0]  =   a.nextDouble();
                System.out.print("長邊：");
                Scanner b = new Scanner(System.in);
                edge[i][1]  =   b.nextDouble();    
                break;
                
                default:
                i--;
                break;
            }
        }
        System.out.println("");
        for(i=0;i<num;i++)
        {
            System.out.print("No."+(i+1)+" 形狀：");
            if(shape[i]=='c')
            {
                System.out.println("圓形");
                Shape sha   =   new Circle(edge[i][0]);
                System.out.print("     面積：");
                System.out.println(sha.area());
            }
            else if(shape[i]=='r')
            {
                System.out.println("矩形");
                Shape sha   =   new Rectangle(edge[i][0],edge[i][1]);
                System.out.print("     面積：");
                System.out.println(sha.area());
            }
            else if(shape[i]=='t')
            {
                System.out.println("三角形");
                Shape sha   =   new Triangle(edge[i][0],edge[i][1]);
                System.out.print("     面積：");
                System.out.println(sha.area());
            }
            else if(shape[i]=='o')
            {
                System.out.println("橢圓形");
                Shape sha   =   new Oval(edge[i][0],edge[i][1]);
                System.out.print("     面積：");
                System.out.println(sha.area());
            }
            
        }
    }
}
