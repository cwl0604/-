package com.example.springdemo.mapper;

import com.example.springdemo.pojo.DrugCustom;
import com.example.springdemo.pojo.DrugQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Mapper
public interface DrugMapperCustom {
    public List<DrugCustom> findDrugByName(String drugname) throws Exception;
    public List<DrugCustom> findall(DrugQueryVo drugQueryVo) throws Exception;

    public void deleteById (int drugid) ;
}

