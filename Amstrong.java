class Armstrong2222
{
 public static void main(String[] args)
 {
   int i=371,a,x,r=0;
   a=i;
  while(a!=0)
  {
   x=a%10;
   	
   r=r+(x*x*x);
       System.out.println(r);
   a=a/10;
   }
    System.out.println(r);
    System.out.println(i);
   
   if(r==i)
   {
     System.out.println(i+"is an armstrong");
     }
   else
   { 
     System.out.println(i+"is not an armstrong");
     }  
}
}
