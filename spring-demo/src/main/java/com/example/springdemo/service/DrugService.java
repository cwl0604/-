package com.example.springdemo.service;

import com.example.springdemo.pojo.DrugCustom;
import com.example.springdemo.pojo.DrugQueryVo;

import java.util.List;


public interface DrugService {
    public List<DrugCustom> findall(DrugQueryVo drugQueryVo) throws Exception;
    public List<DrugCustom> findDrugByName(String drugname) throws Exception;
    public void deleteById (int drugid) ;
}

