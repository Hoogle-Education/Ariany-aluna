import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args)  {
 
    Scanner in = new Scanner(System.in);
      
    int n = in.nextInt();
    int [] array = new int[n];  
        
    for(int i=0; i < n; i++) {
        array[i] = in.nextInt();
    }
    
    int num = array[0];
    int pos = 0;

    for(int j=1; j<array.length; j++) {
        if ( array[j] < num ){
            num = array[j];
            pos = j;
        }
    }
         
    System.out.println("Menor valor: " + num);
    System.out.println("Posicao: " + pos);
    
    }
 
}