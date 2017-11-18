package com.neo.repository;

import com.neo.entity.CESHI1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */
public interface CESHI1Repostitory extends JpaRepository<CESHI1, Long> {

    List<CESHI1>  findAll();

}
