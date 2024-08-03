/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tomorrow.poo.app;

import com.mycompany.tomorrow.poo.dao.CursoDAO;
import com.mycompany.tomorrow.poo.entity.Curso;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("Java oo");
        
        CursoDAO cursodao = new CursoDAO();
        cursodao.incluir(curso);
    }
}
