package com.rexsong.test.jpatest.controllers;

import com.rexsong.test.jpatest.entity.RawData;
import com.rexsong.test.jpatest.services.RawDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api/rawdata"})
@EnableAutoConfiguration
public class RawDataController {

    private final RawDataService rawDataService;

    @Autowired
    public RawDataController(RawDataService rawDataService) {
        this.rawDataService = rawDataService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findRawData/{id}")
    public RawData findRawData(@PathVariable("id") Integer id) {
        return rawDataService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public void save(RawData data){
        rawDataService.createRawData(data);
    }
}
