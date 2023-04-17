import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Vitor " + devVitor.getConteudosInscritos());
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Vitor " + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Vitor " + devVitor.getConteudosConcluidos());
        System.out.println("XP " + devVitor.calcularXp());
        System.out.println("----------");

        Dev devjoao = new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João " + devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João " + devjoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João " + devjoao.getConteudosConcluidos());
        System.out.println("XP " + devjoao.calcularXp());
    }
}