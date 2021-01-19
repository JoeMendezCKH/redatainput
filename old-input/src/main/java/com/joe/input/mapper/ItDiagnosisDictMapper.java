package com.joe.input.mapper;

import com.joe.input.model.ItDiagnosisDict;
import com.joe.input.model.ItDiagnosisDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItDiagnosisDictMapper {
    long countByExample(ItDiagnosisDictExample example);

    int deleteByExample(ItDiagnosisDictExample example);

    int deleteByPrimaryKey(@Param("diagnosisCode") String diagnosisCode, @Param("diagnosisName") String diagnosisName);

    int insert(ItDiagnosisDict record);

    int insertSelective(ItDiagnosisDict record);

    List<ItDiagnosisDict> selectByExampleWithRowbounds(ItDiagnosisDictExample example, RowBounds rowBounds);

    List<ItDiagnosisDict> selectByExample(ItDiagnosisDictExample example);

    ItDiagnosisDict selectByPrimaryKey(@Param("diagnosisCode") String diagnosisCode, @Param("diagnosisName") String diagnosisName);

    int updateByExampleSelective(@Param("record") ItDiagnosisDict record, @Param("example") ItDiagnosisDictExample example);

    int updateByExample(@Param("record") ItDiagnosisDict record, @Param("example") ItDiagnosisDictExample example);

    int updateByPrimaryKeySelective(ItDiagnosisDict record);

    int updateByPrimaryKey(ItDiagnosisDict record);
}