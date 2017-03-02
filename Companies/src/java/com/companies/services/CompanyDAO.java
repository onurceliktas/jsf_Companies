package com.companies.services;

import java.util.ArrayList;
import java.util.List;
import com.companies.pojos.Companies;
import com.companies.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author onur
 */
public class CompanyDAO {

    public void save(Companies company) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.save(company);
        ts.commit();
        company.setCompanyAddress("");
        company.setCompanyId(null);
        company.setCompanyName("");
        company.setCompanyWeb("");
    }

    public void update(Companies company) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.update(company);
        ts.commit();
        company.setCompanyAddress("");
        company.setCompanyId(null);
        company.setCompanyName("");
        company.setCompanyWeb("");
    }

    public void delete(Companies company) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.delete(company);
        ts.commit();
        company.setCompanyAddress("");
        company.setCompanyId(null);
        company.setCompanyName("");
        company.setCompanyWeb("");

    }

    public List<Companies> readCompanies() {
        List<Companies> list = new ArrayList<>();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from Companies");
        list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }

}
