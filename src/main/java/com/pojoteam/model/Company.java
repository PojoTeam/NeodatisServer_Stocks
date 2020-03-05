package com.pojoteam.model;

import java.io.Serializable;

public class Company implements Serializable {
    private String companyName;
    private String symbol;
    private String description;
    private String logo;
    private int marketCap;

    public Company() {
    }

    public Company(String companyName, String symbol, String description, String logo, int marketCap) {
        this.companyName = companyName;
        this.symbol = symbol;
        this.description = description;
        this.logo = logo;
        this.marketCap = marketCap;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }
}
