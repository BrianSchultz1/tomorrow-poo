
package com.mycompany.tomorrow.poo.app;

import com.mycompany.tomorrow.poo.bo.CursoBO;
import com.mycompany.tomorrow.poo.entity.Curso;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        Curso curso = new Curso();
        CursoBO cursobo = new CursoBO();
        
        curso.setNome("Java oo");
        cursobo.incluir(curso);
    }
}
