package com.companies.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import com.companies.pojos.Companies;
import com.companies.services.CompanyDAO;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

@Named(value = "demoBean")
@SessionScoped
public class DemoBean implements Serializable {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String city;
    private String district;
    private Map<String, String> cities;
    private Map<String, String> districts;
    private Companies company;

    public DemoBean() {
        company = new Companies();
    }

    @PostConstruct
    public void init() {
        cities = new HashMap<String, String>();
        cities.put("Istanbul", "Istanbul");
        cities.put("Ankara", "Ankara");

        Map<String, String> map = new HashMap<String, String>();
        map.put("Atasehir", "Atasehir");
        map.put("Beykoz", "Beykoz");
        map.put("Kadikoy", "Kadikoy");
        data.put("Istanbul", map);

        map = new HashMap<String, String>();
        map.put("Cankaya", "Cankaya");
        map.put("YeniMahalle", "YeniMahalle");
        data.put("Ankara", map);

    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public Map<String, String> getDistricts() {
        return districts;
    }
    
    public void onCityChange() {
        if(city !=null && !city.equals(""))
            districts = data.get(city);
        else
            districts = new HashMap<String, String>();
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

    public List<Companies> filterCompanies() {
        CompanyDAO companyDAO = new CompanyDAO();
        return companyDAO.filterCompanies();
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

}
