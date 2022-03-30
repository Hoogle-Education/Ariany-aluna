import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int size = input.nextInt();

        int[] array = new int[size];
        
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }

        input.close();
    }
}
