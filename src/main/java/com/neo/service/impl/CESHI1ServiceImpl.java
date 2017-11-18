package com.neo.service.impl;

import com.neo.entity.CESHI1;
import com.neo.repository.CESHI1Repostitory;
import com.neo.repository.UserRepository;
import com.neo.service.CESHI1Service;
import com.neo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */
@Service
public class CESHI1ServiceImpl  implements CESHI1Service {

    @Autowired
    private CESHI1Repostitory ceshi1Repository;

    @Override
    public List<CESHI1> findAll() {
        return ceshi1Repository.findAll();
    }
}
