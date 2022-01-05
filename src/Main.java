import com.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        Curso c1 = new Curso("JavaScript","descricao curso",4);
        Curso c2 = new Curso("Ruby","descricao curso",7);

        Mentoria mentoria = new Mentoria( "Mentoria Java","descricao mentoria",LocalDate.now());

        Bootcamp spread = new Bootcamp("Bootcamp Java","Descricao bootcamp java");
        spread.getConteudos().add(c1);
        spread.getConteudos().add(c2);
        spread.getConteudos().add(mentoria);

        Dev dev = new Dev();
        Dev dev1 = new Dev();
        dev.inscreverBootCamp(spread);
        dev1.inscreverBootCamp(spread);
        dev.setNome("Lucas");
        dev1.setNome("Matheus");

        System.out.println(dev.getNome() + " \n " + dev.getConteudosConcluidos() );
        System.out.println("Concluidos: "+ " \n " + dev.getConteudoInscritos() );
        System.out.println("Xp: " + dev.calcularTotalXp());

        System.out.println("-------------------------------------------------------------");
        System.out.println(dev1.getNome() + " \n " + dev1.getConteudosConcluidos() );
        System.out.println("Concluidos: " + " \n " + dev1.getConteudoInscritos() + "\n\n");
        System.out.println("Xp: " + dev1.calcularTotalXp());

        dev.progredir();
        dev1.progredir();

        System.out.println("********************* 1 progressão *********************");

        System.out.println(dev.getNome() + " \n " + dev.getConteudosConcluidos() );
        System.out.println("Concluidos: "+ " \n " + dev.getConteudoInscritos() );
        System.out.println("Xp: " + dev.calcularTotalXp());

        System.out.println("-------------------------------------------------------------");
        System.out.println(dev1.getNome() + " \n " + dev1.getConteudosConcluidos() );
        System.out.println("Concluidos: " + " \n " + dev1.getConteudoInscritos() + "\n\n");
        System.out.println("Xp: " + dev1.calcularTotalXp());

        dev.progredir();
        dev1.progredir();

        System.out.println("********************* 2 progressão *********************");

        System.out.println(dev.getNome() + " \n " + dev.getConteudosConcluidos() );
        System.out.println("Concluidos: "+ " \n " + dev.getConteudoInscritos() );
        System.out.println("Xp: " + dev.calcularTotalXp());

        System.out.println("-------------------------------------------------------------");
        System.out.println(dev1.getNome() + " \n " + dev1.getConteudosConcluidos() );
        System.out.println("Concluidos: " + " \n " + dev1.getConteudoInscritos() + "\n\n");
        System.out.println("Xp: " + dev1.calcularTotalXp());


    }
}
