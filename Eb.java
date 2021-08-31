
class Eb
{
   public static void main(String[] args)
   {
      int i=450;
      double billpay=0;
     if(i>0 & i<200)
   {
     int x=i-100;
     billpay = (100*1)+(x*2);
   }
    else if (i>200 & i<400) 
      {
       int x=i-200;
       billpay =(200*2)+(x*4);
      }
    else if (i>400)
    {
      
      if (i<500)
     {
      int x=i-400;
      billpay =(400*3)+(x*5);
      } 
      else 
      {
      int x=i-500;
      billpay =(400*3)+(100*5)+(x*6); 
      }
    }
       System.out.println("Bill to pay :"+ billpay );
    }
 }
 
 
