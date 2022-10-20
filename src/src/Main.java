import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso();
        java.setTitulo("Curso java");
        java.setDescricao("Bootcamp java development");
        java.setCargaHoraria(80);

        Mentoria javaWeb = new Mentoria();
        javaWeb.setTitulo("Mentoria java");
        javaWeb.setDescricao("Treinamento em spring boot");
        javaWeb.setData(LocalDate.now());

        Bootcamp ifood = new Bootcamp();
        ifood.setNome("Ifood backend");
        ifood.setDescricao("Bootcamp ifood para desenvolvimento java");
        ifood.getConteudos().add(java);
        ifood.getConteudos().add(javaWeb);

        Dev abraao = new Dev();
        abraao.setNome("Abraao");
        abraao.InscreverBootcamp(ifood);

        Dev lucas = new Dev();
        lucas.setNome("Lucas");
        lucas.InscreverBootcamp(ifood);
        System.out.println(lucas.getConteudoInscrito());
    }
}