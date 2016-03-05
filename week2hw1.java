public class hw1 {

    public static void main(String[] args) {
		//試題1.1
        int hr1=4,min1=23,sec1=45;
        int hr2=13,min2=54,sec2=23;
        int t1=0,t2=0;
        System.out.println(hr1+"點"+min1+"分"+sec1+"秒到"+hr2+"點"+min2+"分"+sec2+"秒");
        min1=(hr1*60)+min1;
        t1=(min1*60)+sec1;
        min2=(hr2*60)+min2;
        t2=(min2*60)+sec2;
        t2-=t1;
        System.out.println("總秒數："+t2);
        //試題1.2
        int num[]={2,4,9,7,17};
        float tot=0,ave=0,sum=0;
        System.out.println("數字陣列：");
        for(int x:num)
        {
            System.out.print(x+" ");
            tot+=x;
            sum++;
        }
        ave=tot/sum;
        System.out.println("總和："+(int )tot+" 平均："+ave);
    }
    
}
