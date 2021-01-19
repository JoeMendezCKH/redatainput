package com.joe.input.mapper;

import com.joe.input.model.ItDeptDict;
import com.joe.input.model.ItDeptDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItDeptDictMapper {
    long countByExample(ItDeptDictExample example);

    int deleteByExample(ItDeptDictExample example);

    int deleteByPrimaryKey(String deptCode);

    int insert(ItDeptDict record);

    int insertSelective(ItDeptDict record);

    List<ItDeptDict> selectByExampleWithRowbounds(ItDeptDictExample example, RowBounds rowBounds);

    List<ItDeptDict> selectByExample(ItDeptDictExample example);

    ItDeptDict selectByPrimaryKey(String deptCode);

    int updateByExampleSelective(@Param("record") ItDeptDict record, @Param("example") ItDeptDictExample example);

    int updateByExample(@Param("record") ItDeptDict record, @Param("example") ItDeptDictExample example);

    int updateByPrimaryKeySelective(ItDeptDict record);

    int updateByPrimaryKey(ItDeptDict record);
}