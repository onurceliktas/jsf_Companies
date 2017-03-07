package com.companies.pojos;
// Generated Mar 7, 2017 1:10:23 PM by Hibernate Tools 4.3.1



/**
 * Companies generated by hbm2java
 */
public class Companies  implements java.io.Serializable {


     private Integer companyId;
     private String companyName;
     private String companyAddress;
     private String companyWeb;
     private String companyCity;
     private String companyDistrict;

    public Companies() {
    }

    public Companies(String companyName, String companyAddress, String companyWeb, String companyCity, String companyDistrict) {
       this.companyName = companyName;
       this.companyAddress = companyAddress;
       this.companyWeb = companyWeb;
       this.companyCity = companyCity;
       this.companyDistrict = companyDistrict;
    }
   
    public Integer getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public String getCompanyWeb() {
        return this.companyWeb;
    }
    
    public void setCompanyWeb(String companyWeb) {
        this.companyWeb = companyWeb;
    }
    public String getCompanyCity() {
        return this.companyCity;
    }
    
    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }
    public String getCompanyDistrict() {
        return this.companyDistrict;
    }
    
    public void setCompanyDistrict(String companyDistrict) {
        this.companyDistrict = companyDistrict;
    }




}


