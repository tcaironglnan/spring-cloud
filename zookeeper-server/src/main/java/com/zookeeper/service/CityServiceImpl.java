package com.zookeeper.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.model.City;
import com.common.service.CityService;
import com.zookeeper.mapper.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:38
 **/
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
