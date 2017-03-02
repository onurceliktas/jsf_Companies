package com.companies.pojos;

public class Companies implements java.io.Serializable {

    private Integer companyId;
    private String companyName;
    private String companyAddress;
    private String companyWeb;

    public Companies() {
    }

    public Companies(String companyName, String companyAddress, String companyWeb) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyWeb = companyWeb;
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

}
