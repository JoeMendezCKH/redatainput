package com.joe.input.mapper;

import com.joe.input.model.ItClinicItemDict;
import com.joe.input.model.ItClinicItemDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItClinicItemDictMapper {
    long countByExample(ItClinicItemDictExample example);

    int deleteByExample(ItClinicItemDictExample example);

    int deleteByPrimaryKey(@Param("itemClass") String itemClass, @Param("itemCode") String itemCode);

    int insert(ItClinicItemDict record);

    int insertSelective(ItClinicItemDict record);

    List<ItClinicItemDict> selectByExampleWithRowbounds(ItClinicItemDictExample example, RowBounds rowBounds);

    List<ItClinicItemDict> selectByExample(ItClinicItemDictExample example);

    ItClinicItemDict selectByPrimaryKey(@Param("itemClass") String itemClass, @Param("itemCode") String itemCode);

    int updateByExampleSelective(@Param("record") ItClinicItemDict record, @Param("example") ItClinicItemDictExample example);

    int updateByExample(@Param("record") ItClinicItemDict record, @Param("example") ItClinicItemDictExample example);

    int updateByPrimaryKeySelective(ItClinicItemDict record);

    int updateByPrimaryKey(ItClinicItemDict record);
}