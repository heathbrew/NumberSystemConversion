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
