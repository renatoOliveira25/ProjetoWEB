/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoweb.util;

import br.com.projetoweb.model.Usuario;
import br.com.projetoweb.model.dao.DAOHibernateUtil;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
 * Realiza a autenticação de usuário e senha no banco de dados
 * 
 * @author Renato
 */
public class Autentication {
    
    private SessionFactory factory;
    
    public Autentication() {
        
    }
    
    public boolean userAutentication(Usuario usuario) {
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("login", usuario.getLogin()));
        criteria.add(Restrictions.eq("senha", usuario.getPass()));

        return criteria.uniqueResult() != null;
    }
    
}
        //DetachedCriteria criterio = DetachedCriteria.forClass(Usuario.class, "usuario");
        //criterio.add(Restrictions.eq("usuario.login", usuario.getLogin()));
        //criterio.add(Restrictions.eq("usuario.pass", usuario.getPass()));
        //criterio.getExecutableCriteria(DAOHibernateUtil.getSessionFactory().openSession()).list(); 