//import java.util.*;
public class dectobin{
    static void tobinary(int decimal){
        int binary[] = new int[40];    
         int index = 0;    
         while(decimal > 0){    
           binary[index++] = decimal%2;    
           decimal = decimal/2;    
         }    
         for(int i = index-1;i >= 0;i--){    
           System.out.print(binary[i]);    
         }    
    System.out.println(); 
    } 
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();
        //Integer.toBinaryString() method
        //System.out.println(Integer.toBinaryString(13));
        tobinary(10);
    }
}