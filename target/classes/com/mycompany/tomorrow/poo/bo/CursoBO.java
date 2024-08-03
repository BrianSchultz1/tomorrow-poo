package com.mycompany.tomorrow.poo.bo;

import com.mycompany.tomorrow.poo.dao.CursoDAO;
import com.mycompany.tomorrow.poo.entity.Curso;


/**
 *
 * @author aluno
 */
public class CursoBO {
    public void incluir(Curso curso) {
        CursoDAO cursodao = new CursoDAO();
        cursodao.incluir(curso);
    }
    
}
