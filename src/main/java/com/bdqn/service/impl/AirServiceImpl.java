package com.bdqn.service.impl;

import com.bdqn.dao.AirDao;
import com.bdqn.pojo.Airindex;
import com.bdqn.pojo.District;
import com.bdqn.pojo.Superlei;
import com.bdqn.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirServiceImpl implements AirService {
    @Autowired
    AirDao ad;


    @Override
    public int count() {
        return ad.count();
    }

    @Override
    public List<Superlei> sel(Integer index, Integer size) {
        return ad.sel((index-1)*size,size);
    }

    @Override
    public int del(int id) {
        return ad.del(id);
    }

    @Override
    public List<District> Dsel() {
        return ad.Dsel();
    }

    @Override
    public int ins(Airindex a) {
        return ad.ins(a);
    }
}
