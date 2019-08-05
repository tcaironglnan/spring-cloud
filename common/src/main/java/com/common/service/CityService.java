package com.common.service;

import com.common.model.City;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:37
 **/
public interface CityService {

    /**
     * 获取所有数据
     * @return “”
     */
    List<City> findAll();
}
