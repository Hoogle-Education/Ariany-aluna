import java.util.ArrayList;
import java.util.List;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> sequence = new ArrayList<>();
        List<Aluno> escola = new ArrayList<>();

        sequence.add(5);
        sequence.add(3);
        sequence.add(4);
        sequence.add(6);
        sequence.add(2);

        for(int i=0; i<sequence.size(); i++){
            System.out.println(sequence.get(i));
        }

        Aluno a1 = new Aluno("joao", 12);
        Aluno a2 = new Aluno("Maria", 13);
        Aluno a3 = new Aluno("Pedrinho", 11);

        escola.add( new Aluno("joao", 12) );
        escola.add(a2);
        escola.add(a3);
        escola.add( new Aluno("Souza", 15) );

        Aluno toFind = new Aluno("joao", 12);

        System.out.println(escola.indexOf( toFind ));

        for(int i=0; i<escola.size(); i++){
            System.out.println(escola.get(i));
        }

    }
}
