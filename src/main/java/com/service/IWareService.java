package com.service;

import com.model.pojo.Ware;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IWareService {
    List<Ware> getWare(Ware ware);
    boolean updateWare( Ware ware);
    boolean addWare(Ware ware);
    boolean delectWare(Integer wid);
}
