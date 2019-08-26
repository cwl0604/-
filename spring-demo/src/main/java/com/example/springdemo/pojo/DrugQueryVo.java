package com.example.springdemo.pojo;

public class DrugQueryVo {
    private Drug drug;
    private DrugCustom drugCostom;
    public Drug getDrug() {
        return drug;
    }
    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    public DrugCustom getDrugCostom() {
        return drugCostom;
    }
    public void setDrugCostom(DrugCustom drugCostom) {
        this.drugCostom = drugCostom;
    }
}
