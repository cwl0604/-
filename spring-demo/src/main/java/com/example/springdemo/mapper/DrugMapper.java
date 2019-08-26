package com.example.springdemo.mapper;

import com.example.springdemo.pojo.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper
public interface DrugMapper {
    public Drug findbyname(String name);
}
