package com.dao;

import com.model.pojo.Ware;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WareMapper {
    List<Ware> getWare(Ware ware);
    Integer updateWare(Ware ware);
    Integer addWare(Ware ware);
    Integer delectWare(@Param("wid") Integer wid);
}
