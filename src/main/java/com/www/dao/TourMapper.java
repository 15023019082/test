package com.www.dao;

import com.www.pojo.Tour;

public interface TourMapper {
    int deleteByPrimaryKey(Integer tourId);

    int insert(Tour record);

    int insertSelective(Tour record);

    Tour selectByPrimaryKey(Integer tourId);

    int updateByPrimaryKeySelective(Tour record);

    int updateByPrimaryKey(Tour record);
}