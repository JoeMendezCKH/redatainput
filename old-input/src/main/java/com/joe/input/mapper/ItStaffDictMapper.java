package com.joe.input.mapper;

import com.joe.input.model.ItStaffDict;
import com.joe.input.model.ItStaffDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItStaffDictMapper {
    long countByExample(ItStaffDictExample example);

    int deleteByExample(ItStaffDictExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItStaffDict record);

    int insertSelective(ItStaffDict record);

    List<ItStaffDict> selectByExampleWithRowbounds(ItStaffDictExample example, RowBounds rowBounds);

    List<ItStaffDict> selectByExample(ItStaffDictExample example);

    ItStaffDict selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItStaffDict record, @Param("example") ItStaffDictExample example);

    int updateByExample(@Param("record") ItStaffDict record, @Param("example") ItStaffDictExample example);

    int updateByPrimaryKeySelective(ItStaffDict record);

    int updateByPrimaryKey(ItStaffDict record);
}