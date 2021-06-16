   import java.util.Scanner;
   class Calculator{
   public static void main(String[]args){
   String yn;
   do
   {
	      Scanner sx=new Scanner(System.in);
   System.out.println("enter a first number");
   int no1=sx.nextInt();
     System.out.println("enter the operation");
   String sym =sx.next();  
  System.out.println("enter the second number");
   int no2=sx.nextInt();
  
   int res;
             switch(sym)
           {
			  case "+":
			  res=no1+no2;
			  System.out.println("this value is addition :"+res);
			  break;
			 case "-":
 			  res=no1-no2;
			  System.out.println("this value is substraction :" +res);
			  break;
			 case "*":
			  res=no1*no2;
			  System.out.println("this value is multiplication:" +res);
			  break;		
			 case "/" :
			 	res=no1/no2;
			  System.out.println("this value is division:" +res);
			  break;
               default:
			  System.out.println("this number is invalid");
			  break;
            }
          System.out.println("do you want to contuninue(press y for yes and n for No)");
		  yn=sx.next();
	  }while(yn.equals("y") || yn.equals("Y"));
  }
}

