package com.bdqn.service;

import com.bdqn.dao.AirDao;
import com.bdqn.pojo.Airindex;
import com.bdqn.pojo.District;
import com.bdqn.pojo.Superlei;

import java.util.List;

public interface AirService {
    int count();

    List<Superlei> sel(Integer index, Integer size);

    int del(int id);

    List<District> Dsel();

    int ins(Airindex a);
}
