public class octaltodec {
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
    public static void main(String[] args){
        System.out.println(getDecimal(121));
    }
}
