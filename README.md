# NumberSystemConversion
The digital circuits can be effectively represented by means of interconnected diagrams. This is being termed as schematic diagram. There is another way to describe digital circuits by using a textual language which is specifically intended to capture the defining features of digital design clearly and concisely.
Such languages exist, and they are called hardware description languages (HDLs). HDLs resemble high-level programming languages such as C or Python, but it’s important to understand that there is a fundamental difference: statements in HDL code involve parallel operation, whereas programming languages represent sequential operation.
Verilog is a hardware description language (HDL) used to model electronic systems. In this lab, you will learn to represent hardware circuits by using Verilog in depth. 
As the basic of Digital Design, you will perform number system conversion in today’s lab. Write the following programs in Python.
---------------------------------------
1.	Write a program to convert any decimal number into corresponding binary number.
Sample output:	Enter the number in Decimal system: (13)10
				Corresponding Binary Number is: (1101)2
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
        tobinary(13);
    }
}

2.	Write a program to convert any binary number into corresponding decimal number.
Sample output:	Enter the number in binary system: (1100)2
				Corresponding Decimal Number is: (12)10
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


3.	Write a program to convert any binary number into corresponding Octal number.
Sample output:	Enter the number in binary system: (1100)2
				Corresponding Octal Number is: (14)8
public class bintooctal {
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

    static void tooctal(int decimal){
        int octal[] = new int[40];    
         int index = 0;    
         while(decimal > 0){    
           octal[index++] = decimal%8;    
           decimal = decimal/8;    
         }    
         for(int i = index-1;i >= 0;i--){    
           System.out.print(octal[i]);    
         }    
    System.out.println(); 
    } 

    public static void main(String[] args) {
        int Dec = getDecimal(1100);
        tooctal(Dec);
        
    }
}


4.	Write a program to convert any binary number into corresponding Hexadecimal number.
Sample output:	Enter the number in binary system: (10010)2
Corresponding Hexadecimal Number is: (12)16
public class bintohexa {
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
static String tohexa(int decimal){    
            int rem;  
            String hex="";   
            char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
           while(decimal>0)  
            {  
              rem=decimal%16;   
              hex=hexchars[rem]+hex;   
              decimal=decimal/16;  
            }  
           return hex;  
    }
public static void main(String[] args){
        int Dec = getDecimal(10010); 
        System.out.println(tohexa(Dec));
    }

}



5.	Write a program to convert any Octal number into corresponding Hexadecimal number.
Sample output:	Enter the number in Octal system: (567)8
Corresponding Decimal Hexadecimal is: (177)16
public class octaltohexa {
    static int getDecimal(int octal){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(octal == 0){  
            break;  
          } else {  
              int temp = octal%10;  
              decimal += temp*Math.pow(8, n);  
              octal = octal/10;  
              n++;  
           }  
        }  
        return decimal;  
    }
    static String tohexa(int decimal){    
        int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
       while(decimal>0)  
        {  
          rem=decimal%16;   
          hex=hexchars[rem]+hex;   
          decimal=decimal/16;  
        }  
       return hex;  
    }  
    public static void main(String[]args){
        int Oct = getDecimal(567);
        System.out.println(tohexa(Oct));
    }
}



6.	Write a program to convert any decimal number into corresponding Hexadecimal number.
Sample output:	Enter the number in binary system: (345)10
Corresponding Octal Number is: (159)16
public class dectohexa {
  static String tohexa(int decimal){    
    int rem;  
    String hex="";   
    char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
   while(decimal>0)  
    {  
      rem=decimal%16;   
      hex=hexchars[rem]+hex;   
      decimal=decimal/16;  
    }  
   return hex;  
}  
    public static void main(String args[]) {
        System.out.println(tohexa(345));
    }
}
