import java.util.Scanner;

public class App {

    public static boolean isVowel(String unknowed){
      
      switch (unknowed) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
          return true;    
        default:
          return false;
      }
    }
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println( isVowel("b") );

        do {

            int x = keyboard.nextInt();
            
            switch (x) {
                case 1:
                    System.out.println("testing case 1");
                    break;
                case 2:
                    System.out.println("testing case 2");
                    System.out.println("do this");
                    break;
                case 3: 
                    System.out.println("testing case 3");
                default:
                    System.out.println("you cannot use this option!");
                    break;
            }

        } while(true);
            
    }
}
