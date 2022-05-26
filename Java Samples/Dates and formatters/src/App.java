import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String text = sc.nextLine();

        Date date = formatter.parse(text);

        Date limitDate = formatter.parse("10/10/2002");
        System.out.println(date.before( limitDate ));

        System.out.println(formatter.format(date));

    }
}
