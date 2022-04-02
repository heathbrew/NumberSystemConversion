import java.util.*;
public class bintodec {
    static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
              decimal += temp*Math.pow(2, n);  
              binary = binary/10;  
              n++;  
           }  
        }  
        return decimal;  
    }  
    public static void main(String[] args){
            //Scanner sc = new Scanner(System.in);
            //String binaryString= sc.nextLine();  
            //int decimal=Integer.parseInt(binaryString,2);  
            //System.out.println(decimal);
            //int binary = sc.nextInt();
            System.out.println(getDecimal(1100));
            
    }
}
