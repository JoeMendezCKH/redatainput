package com.joe.input.mapper;

import com.joe.input.model.ItDrugDict;
import com.joe.input.model.ItDrugDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItDrugDictMapper {
    long countByExample(ItDrugDictExample example);

    int deleteByExample(ItDrugDictExample example);

    int deleteByPrimaryKey(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec, @Param("drugIndicator") Integer drugIndicator);

    int insert(ItDrugDict record);

    int insertSelective(ItDrugDict record);

    List<ItDrugDict> selectByExampleWithRowbounds(ItDrugDictExample example, RowBounds rowBounds);

    List<ItDrugDict> selectByExample(ItDrugDictExample example);

    ItDrugDict selectByPrimaryKey(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec, @Param("drugIndicator") Integer drugIndicator);

    int updateByExampleSelective(@Param("record") ItDrugDict record, @Param("example") ItDrugDictExample example);

    int updateByExample(@Param("record") ItDrugDict record, @Param("example") ItDrugDictExample example);

    int updateByPrimaryKeySelective(ItDrugDict record);

    int updateByPrimaryKey(ItDrugDict record);
}