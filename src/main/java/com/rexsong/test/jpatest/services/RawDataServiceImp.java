package com.rexsong.test.jpatest.services;

import com.rexsong.test.jpatest.entity.RawData;
import com.rexsong.test.jpatest.repository.RawDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RawDataServiceImp implements RawDataService {

    private RawDataRepository rawDataRepository;

    @Autowired
    public RawDataServiceImp(RawDataRepository repo){
        this.rawDataRepository = repo;
    }

    @Override
    public int createRawData(RawData rawdata) {
        RawData newData = rawDataRepository.save(rawdata);
        return newData.getId();
    }

    @Override
    public RawData findById(int id) {
        return rawDataRepository.findById(id).isPresent() ? rawDataRepository.findById(id).get() : new RawData();
    }
}
