package com.companies.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import com.companies.pojos.Companies;
import com.companies.services.CompanyDAO;

@Named(value = "demoBean")
@SessionScoped
public class DemoBean implements Serializable {

    private Companies company;

    public DemoBean() {
        company = new Companies();
    }

    public void save() {
        CompanyDAO companyDAO = new CompanyDAO();
        companyDAO.save(company);
    }

    public void update() {
        CompanyDAO companyDAO = new CompanyDAO();
        companyDAO.update(company);
    }

    public void delete() {
        CompanyDAO companyDAO = new CompanyDAO();
        companyDAO.delete(company);
    }

    public List<Companies> readCompanies() {
        CompanyDAO companyDAO = new CompanyDAO();
        return companyDAO.readCompanies();
    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

}
