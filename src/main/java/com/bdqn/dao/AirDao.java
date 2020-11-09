package com.bdqn.dao;

import com.bdqn.pojo.Airindex;
import com.bdqn.pojo.District;
import com.bdqn.pojo.Superlei;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AirDao {
    @Select("select count(*) from airindex")
    int count();

    @Select("SELECT * FROM `airindex` a JOIN district d on d.id=a.did LIMIT #{index} ,#{size} ")
    List<Superlei> sel(@Param("index")Integer index, @Param("size")Integer size);

    @Delete("delete from airindex where id =#{id}")
    int del(int id);

    @Select("select * from district")
    List<District> Dsel();

    @Insert("insert into airindex(did,`time`,pm10,`pm2.5`,station) values (#{did}  ,#{time} ,#{pm10} ,#{pm2_5} ,#{station} )")
    int ins(Airindex a);
}
