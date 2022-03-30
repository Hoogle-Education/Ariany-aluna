import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        String entrada = in.next();

        System.out.println(entrada + " " + in.next());

        in.close(); 
    }
}
