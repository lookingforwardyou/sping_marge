package com.service.impl;

import com.dao.WareMapper;
import com.model.pojo.Ware;
import com.service.IWareService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WareServiceImpl implements IWareService {

    @Resource
    private WareMapper wareMapper;

    @Override
    public List<Ware> getWare(Ware ware) {
        return wareMapper.getWare(ware);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public boolean updateWare( Ware ware) {
        boolean flag=false;
        int i=wareMapper.updateWare(ware);
        if(i>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean addWare(Ware ware) {
        boolean flag=false;
        int i=wareMapper.addWare(ware);
        if(i>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean delectWare(Integer wid) {
        boolean flag=false;
        int i=wareMapper.delectWare(wid);
        if(i>0){
            flag=true;
        }
        return flag;
    }
}
