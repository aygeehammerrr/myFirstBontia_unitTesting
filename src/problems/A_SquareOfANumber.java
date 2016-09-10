
package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A_SquareOfANumber {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("src/TestCases/A3.in"));
    
        int TestCases = sc.nextInt();
        while(TestCases>0){
            int num = sc.nextInt();
           
                System.out.println(square(num));
                TestCases--;
        }
              
    }
    public static String square(int num){
         if(num<0){
                return "INVALID";
            }
            else if(num>1000){
                return "TOO BIG";
            }
            else
                return String.valueOf(num*num);   
    }
}
