package com.joe.input.mapper;

import com.joe.input.model.ItPatMasterIndex;
import com.joe.input.model.ItPatMasterIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItPatMasterIndexMapper {
    long countByExample(ItPatMasterIndexExample example);

    int deleteByExample(ItPatMasterIndexExample example);

    int deleteByPrimaryKey(String patientId);

    int insert(ItPatMasterIndex record);

    int insertSelective(ItPatMasterIndex record);

    List<ItPatMasterIndex> selectByExampleWithBLOBsWithRowbounds(ItPatMasterIndexExample example, RowBounds rowBounds);

    List<ItPatMasterIndex> selectByExampleWithBLOBs(ItPatMasterIndexExample example);

    List<ItPatMasterIndex> selectByExampleWithRowbounds(ItPatMasterIndexExample example, RowBounds rowBounds);

    List<ItPatMasterIndex> selectByExample(ItPatMasterIndexExample example);

    ItPatMasterIndex selectByPrimaryKey(String patientId);

    int updateByExampleSelective(@Param("record") ItPatMasterIndex record, @Param("example") ItPatMasterIndexExample example);

    int updateByExampleWithBLOBs(@Param("record") ItPatMasterIndex record, @Param("example") ItPatMasterIndexExample example);

    int updateByExample(@Param("record") ItPatMasterIndex record, @Param("example") ItPatMasterIndexExample example);

    int updateByPrimaryKeySelective(ItPatMasterIndex record);

    int updateByPrimaryKeyWithBLOBs(ItPatMasterIndex record);

    int updateByPrimaryKey(ItPatMasterIndex record);
}