package com.joe.input.mapper;

import com.joe.input.model.ItExamItemDict;
import com.joe.input.model.ItExamItemDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItExamItemDictMapper {
    long countByExample(ItExamItemDictExample example);

    int deleteByExample(ItExamItemDictExample example);

    int deleteByPrimaryKey(String itemCode);

    int insert(ItExamItemDict record);

    int insertSelective(ItExamItemDict record);

    List<ItExamItemDict> selectByExampleWithRowbounds(ItExamItemDictExample example, RowBounds rowBounds);

    List<ItExamItemDict> selectByExample(ItExamItemDictExample example);

    ItExamItemDict selectByPrimaryKey(String itemCode);

    int updateByExampleSelective(@Param("record") ItExamItemDict record, @Param("example") ItExamItemDictExample example);

    int updateByExample(@Param("record") ItExamItemDict record, @Param("example") ItExamItemDictExample example);

    int updateByPrimaryKeySelective(ItExamItemDict record);

    int updateByPrimaryKey(ItExamItemDict record);
}