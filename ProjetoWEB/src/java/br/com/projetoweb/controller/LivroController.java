/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoweb.controller;

import br.com.projetoweb.model.Livro;
import br.com.projetoweb.model.dao.LivroDAO;
import br.com.projetoweb.model.dao.LivroDAOImp;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Renato
 */
public class LivroController {

    private Livro livro;
    private DataModel listaLivros;

    public DataModel getListarLivros() {
        List<Livro> lista = new LivroDAOImp().list();
        listaLivros = new ListDataModel(lista);
        return listaLivros;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String prepararAdicionarLivro() {
        livro = new Livro();
        return "gerenciarLivro";
    }

    public String prepararAlterarLivro() {
        livro = (Livro) (listaLivros.getRowData());
        return "gerenciarLivro";
    }

    public String excluirLivro() {
        Livro livroTemp = (Livro) (listaLivros.getRowData());
        LivroDAO dao = new LivroDAOImp();
        dao.remove(livroTemp);
        return "index";
    }

    public String adicionarLivro() {
        LivroDAO dao = new LivroDAOImp();
        dao.save(livro);
        return "index";
    }

    public String alterarLivro() {
        LivroDAO dao = new LivroDAOImp();
        dao.update(livro);
        return "index";
    }
}
