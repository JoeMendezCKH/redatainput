package com.joe.input.mapper;

import com.joe.input.model.ItVLabItemDict;
import com.joe.input.model.ItVLabItemDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItVLabItemDictMapper {
    long countByExample(ItVLabItemDictExample example);

    int deleteByExample(ItVLabItemDictExample example);

    int deleteByPrimaryKey(String itemCode);

    int insert(ItVLabItemDict record);

    int insertSelective(ItVLabItemDict record);

    List<ItVLabItemDict> selectByExampleWithRowbounds(ItVLabItemDictExample example, RowBounds rowBounds);

    List<ItVLabItemDict> selectByExample(ItVLabItemDictExample example);

    ItVLabItemDict selectByPrimaryKey(String itemCode);

    int updateByExampleSelective(@Param("record") ItVLabItemDict record, @Param("example") ItVLabItemDictExample example);

    int updateByExample(@Param("record") ItVLabItemDict record, @Param("example") ItVLabItemDictExample example);

    int updateByPrimaryKeySelective(ItVLabItemDict record);

    int updateByPrimaryKey(ItVLabItemDict record);
}