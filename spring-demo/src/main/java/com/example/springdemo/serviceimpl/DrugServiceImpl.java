package com.example.springdemo.serviceimpl;

import com.example.springdemo.mapper.DrugMapperCustom;
import com.example.springdemo.pojo.DrugCustom;
import com.example.springdemo.pojo.DrugQueryVo;
import com.example.springdemo.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugMapperCustom drugMapperCustom;
    @Override
    public List<DrugCustom> findall(DrugQueryVo drugQueryVo) throws Exception {
        // TODO Auto-generated method stub
        return drugMapperCustom.findall(drugQueryVo);
    }
    @Override
    public List<DrugCustom> findDrugByName(String drugname) throws Exception {
        // TODO Auto-generated method stub
        return drugMapperCustom.findDrugByName(drugname);
    }
    @Override
    public void deleteById(int drugid) {
        drugMapperCustom.deleteById(drugid);

    }


}