import br.com.dio.desafio.dominio.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 =  new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JAVASCRIPT Developer");
        bootcamp2.setDescricao("Descricao Bootcamp JAVASCRIPT Developer");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Anderson: " + devAnderson.getConteudosIncritos());
        devAnderson.progredir();
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos Anderson: " + devAnderson.getConteudosIncritos());
        System.out.println("Conteudo concluidos Anderson: " + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularTotalXp());

        System.out.println("-----------");

        Dev devSol = new Dev();
        devSol.setNome("Sol L.");
        devSol.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudo inscritos Sol: " + devSol.getConteudosIncritos());
        devSol.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos Sol: " + devSol.getConteudosIncritos());
        System.out.println("Conteudo Concluidos Sol: " + devSol.getConteudosConcluidos());
        System.out.println("XP: " + devSol.calcularTotalXp());

    }
}
