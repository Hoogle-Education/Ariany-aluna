
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
  public static void main(String[] args)  throws IOException {
    Scanner in = new Scanner(System.in);
    
    // quantidade de casos de teste
    int n  = in.nextInt(); 
    
    for(int i=0; i<n; i++) { 
      
        // numero a ser verificado
      int x = in.nextInt(); 
      
      // suponho que é primo (nao-composto)
      boolean ehComposto = false; 

      for( int j=2; j<x; j++) {
          if( x%j == 0){
            ehComposto = true;
            break;
          }
      }

      if(ehComposto == true) System.out.println(x + " nao eh primo");
      else System.out.println(x + " eh primo");
    }

  }
}
