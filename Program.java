//import stuff here
import java.util.Scanner;
//Your code here
public class Program8{

    public static void main(String args[]){
    int a = 0;
    int b = 0;
    int c = 0;
    double avg = 0;
      Scanner value = new Scanner(System.in);
      System.out.println(" Enter a value: " );
      a = value.nextInt();
      Scanner value1 = new Scanner(System.in);
      System.out.println(" Enter a second value: " );
      b = value1.nextInt();

    int sum = a+b;
    int dif = a-b;
    int product = a*b;
    avg = (a+b)/2.0;
    int dif2 = Math.abs(a-b);
    avg = ((((double)((int)(avg*10)+.5))/10.0)-.05) ;
    System.out.println("The sum is "+ sum);
    System.out.println("The difference is "+ dif);
    System.out.println("The product is "+ product);
    System.out.println( "The average is "+ avg);  
    System.out.println("The distance  is "+ dif2);
    if (a>b){
    System.out.println("The maximum is "+ a);
    System.out.println("The Minimum is "+ b );
}
    else
    {
        System.out.println("The maximum is "+ b);
        System.out.println("The Minimum is "+ a );
    }

}
}

//Paste console output below:
/*
 Enter a value: 
54
 Enter a second value:
67
The sum is 121
The difference is -13
The product is 3618
The average is 60.5
The distance  is 13
The maximum is 67
The Minimum is 54
*/
