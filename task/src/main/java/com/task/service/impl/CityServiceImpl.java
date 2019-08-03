package com.task.service.impl;

import com.task.dao.CityRepository;
import com.task.model.City;
import com.task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:38
 **/
@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {

        return cityRepository.findAll();
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
//    @Override
//    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
//        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(pageNum, pageSize);
//        List<UserDomain> userDomains = userDao.selectUsers();
//        PageInfo result = new PageInfo(userDomains);
//        return result;
//    }
}
