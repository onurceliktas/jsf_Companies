package com.companies.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import com.companies.pojos.Companies;
import com.companies.services.CompanyDAO;
import com.companies.util.HibernateUtil;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import org.hibernate.Query;
import org.hibernate.Session;

@Named(value = "demoBean")
@SessionScoped
public class DemoBean implements Serializable {

    private List<SelectItem> cities;
    private List<SelectItem> districts;
    private Companies company;
    private Companies selectedCompany;
    private Integer companyId;
    private List<Companies> filteredCompanies;

    public DemoBean() {
        company = new Companies();
    }

    @PostConstruct

    public void init() {
        cities = new ArrayList();
        cities.add(new SelectItem("Istanbul"));
        cities.add(new SelectItem("Ankara"));
    }

    public List<SelectItem> getCities() {
        return cities;
    }

    public List<SelectItem> getDistricts() {
        return districts;
    }

    public void onCityChange() {
        districts = new ArrayList();
        if (company.getCompanyCity().equals("Istanbul")) {
            districts.add(new SelectItem("Atasehir"));
            districts.add(new SelectItem("Beykoz"));
            districts.add(new SelectItem("Kadikoy"));
        } else if (company.getCompanyCity().equals("Ankara")) {
            districts.add(new SelectItem("Cankaya"));
            districts.add(new SelectItem("YeniMahalle"));
        }
    }

    public void onRowSelectCompany() {
        company = selectedCompany;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

    public List<Companies> getFilteredCompanies() {
        return filteredCompanies;
    }

    public void setFilteredCompanies(List<Companies> filteredCompanies) {
        this.filteredCompanies = filteredCompanies;
    }

    public Companies getSelectedCompany() {
        return this.selectedCompany;
    }

    public void setSelectedCompany(Companies selectedCompany) {
        this.selectedCompany = selectedCompany;
    }

}
