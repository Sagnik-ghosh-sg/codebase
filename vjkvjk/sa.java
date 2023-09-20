import java.util.*;
public class sa{
    /**
     * @param args
     */
    
    double a; 
    double b;
    int ft;
     int sw;
     double d;
     double f;
     int mft; 
     int msw;

    static Scanner sg=new Scanner(System.in);
      sa()
     {  stat=0.0;
        a=0.0;
        b=0.0;
        ft=0;
        sw=0;
        f=0.0;
        d=0.0;
        mft=0;
        msw=0;
     }
     void Daily_avg_input(){
        System.out.println("Enter avg food cost per day");
        ft=sg.nextInt();
        System.out.println("Enter sensed weight of the waste");
        sw=sg.nextInt(); 
        System.out.println("Enter avg food cost per person");
        f=sg.nextDouble();
        System.out.println("Enter no. of people dining");
        d=sg.nextDouble();
       
       

    }
     void day30_avg()
     {
        
             mft+=ft;
             
             msw+=sw;
             a+=f;
             b+=d;
             
   
    }

     
     void dd()
     {
      System.out.println(ft+"\t"+sw+"\t"+d+"\t"+f);
     }
     void dm()
     {
      System.out.println(mft+"\t"+msw+"\t"+a+"\t"+b);
     }
    
    
    public static void main(String args[])
    {int n=1;
      
     
       while(n==1)
       {
        sa ob=new sa();
        System.out.println( "enter 1 to enter the stats of the day");
        n=sg.nextInt();
         if(n==0)
         {
            continue;
         }
         for(int j=1;j<=12;j++)
         {
         for(int i=1;i<=3;i++)
         {
            ob.Daily_avg_input();
            ob.dd();
            ob.day30_avg();
         
         }
         
         ob.dm();

      }

       }
    
}
}