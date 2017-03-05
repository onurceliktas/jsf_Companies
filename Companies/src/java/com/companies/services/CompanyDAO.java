package com.companies.services;

import java.util.ArrayList;
import java.util.List;
import com.companies.pojos.Companies;
import com.companies.util.HibernateUtil;
import org.hibernate.Query;
import com.companies.beans.DemoBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author onur
 */
public class CompanyDAO {

    private Integer companyId;
    private DemoBean dm;
    private Companies company;

    public CompanyDAO() {
        dm = new DemoBean();
        company = new Companies();
    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

    public DemoBean getDm() {
        return dm;
    }

    public void setDm(DemoBean dm) {
        this.dm = dm;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

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
        company.setCompanyCity("");
        company.setCompanyDistrict("");
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
        company.setCompanyCity(null);
        company.setCompanyDistrict(null);
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
        company.setCompanyCity("");
        company.setCompanyDistrict("");

    }

    public List<Companies> readCompanies() {
        List<Companies> list = new ArrayList<>();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from  Companies");
        list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }

}
