package test;
import java.util.Scanner;
import java.io.*;
public class Test {

    public static void main(String[] args) {
		//試題2.1
		String name;
		int birth,year,mon,day;
		System.out.print("請輸入姓名：");
		Scanner	n	=	new Scanner(System.in);
		name	=	n.nextLine();
		System.out.print("請輸入出生年月日(ex:19990814)：");
		Scanner	b	=	new Scanner(System.in);
		birth	=	b.nextInt();
		day		=	birth%100;
		mon	=	(birth/100)%100;
		year	=	(birth/10000)-1911;
		System.out.println("姓名："+name+"\n民國"+year+"年"+mon+"月"+day+"日");
		//試題2.2
		double num1,num2,ans=0;
		int op;
		System.out.println("請輸入兩個浮點數：");
		System.out.print("Number1：");
		Scanner x	=	new Scanner(System.in);
		num1		=	x.nextDouble();
		System.out.print("Number2：");
		Scanner y	=	new Scanner(System.in);
		num2		=	y.nextDouble();
		System.out.print("選擇運算子：1)+ 2)- 3)* 4)/ ：");
		Scanner i	=	new Scanner(System.in);
		op			=	i.nextInt();
		switch(op)
		{
			case 1:
			ans	=	num1+num2;
			System.out.println("答案："+ans);
			break;
			case 2:
			ans	=	num1-num2;
			System.out.println("答案："+ans);
			break;
			case 3:
			ans	=	num1*num2;
			System.out.println("答案："+ans);
			break;
			case 4:
			if(num2==0)
				System.out.println("分母不能為零!!");
			else
			{
				ans =	num1/num2;
				System.out.println("答案："+ans);
				break;
			}
			dafault:
			break;
		}
		//試題2.3
		int year,i,count=0;
		System.out.print("請輸入一個西元年份：");
		Scanner y	=	new Scanner(System.in);
		year		=	y.nextInt();
		System.out.println("西元"+year+"年之前的閏年");
		for(i=year;i>0;i--)
		{
			if(i%400==0)
			{
				System.out.print(i+" | ");
				count++;
				if(count%5==0)
					System.out.println("");
			}
			else if(i%4==0&&i%100!=0)
			{
				System.out.print(i+" | ");
				count++;
				if(count%5==0)
					System.out.println("");
			}
		}
		//試題2.4
		int num,i,snum,op;
        char sn[][]=new char[100][100];
        int sc[]=new int[100],code[]=new int[100];
        String n;
        System.out.print("幾位學生：");
        Scanner nu	=	new Scanner(System.in);
        num		=	nu.nextInt();
        for(i=0;i < num;i++)
        {
            code[i]=i+1;
            System.out.print((i+1)+".學生姓名：");
            Scanner name	=	new Scanner(System.in);
            n		=	name.nextLine();
            sn[i]=n.toCharArray();
            System.out.print("  成績：");
            Scanner	score	=	new	Scanner(System.in);
            
            try{
                sc[i]=Integer.parseInt(score.nextLine());
            }catch(NumberFormatException e) { 
                    System.out.println("輸入格式有誤");
                    sc[i]=-1;
            }
        }
        System.out.print("請輸入編號搜尋資料：");
        Scanner co	=	new Scanner(System.in);
        snum	=	co.nextInt();
        op=-1;
        for(i=0;i<num;i++)
        {
                if(code[i]==snum)
                {
                        System.out.print(snum+".學生姓名：");
                        System.out.print(sn[i]);
						System.out.print("    成績：");
						if(sc[i]==-1)
							System.out.println("輸入時格式錯誤!!");
						else	
							System.out.println(sc[i]);
                        op=1;
                }
        }
        if(op==-1)
                System.out.println("找不到此編號!!");
	
    }    
}