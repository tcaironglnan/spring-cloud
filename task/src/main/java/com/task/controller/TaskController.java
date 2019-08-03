package com.task.controller;

import com.google.gson.Gson;
import com.task.model.City;
import com.task.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-05-23 10:52
 **/
@RestController
public class TaskController {

    @Autowired
    private CityService service;

    @RequestMapping("find")
    @ResponseBody
    public String findAll(ModelMap model) {
        List<City> all = service.findAll();
//        model.addAttribute("all",all);
        return new Gson().toJson(all);
    }
}
