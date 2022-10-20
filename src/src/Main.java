import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso("java","Bootcamp java ifood",8);
        Mentoria javaWeb = new Mentoria("Spring", "Mentoria de spring boot com aws",2, LocalDate.now());
        System.out.println(javaWeb.getData());
        System.out.println(java.getTitulo());
    }
}