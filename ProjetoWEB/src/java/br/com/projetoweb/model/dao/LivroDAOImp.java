/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoweb.model.dao;

import br.com.projetoweb.model.Livro;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Renato
 */
public class LivroDAOImp implements LivroDAO {

    public void save(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(livro);
        t.commit();
    }

    public Livro getLivro(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Livro) session.load(Livro.class, id);
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("override")
    public List<Livro> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Livro").list();
        t.commit();
        return lista;
    }

    public void remove(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(livro);
        t.commit();
    }

    public void update(Livro livro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(livro);
        t.commit();

    }
}
