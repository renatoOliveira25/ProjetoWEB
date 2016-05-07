/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoweb.model.dao;

import br.com.projetoweb.model.Livro;
import java.util.List;

/**
 *
 * @author Renato
 */
public interface LivroDAO {
    public void save(Livro livro);
    public Livro getLivro(long id);
    public List<Livro> list();
    public void remove(Livro livro);
    public void update(Livro livro);
    
}
