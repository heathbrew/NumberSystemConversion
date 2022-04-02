public class dectooctal {
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
    public static void main(String args[]) {
        tooctal(127);
    }
}
