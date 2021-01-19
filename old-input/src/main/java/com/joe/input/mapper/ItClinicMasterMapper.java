package com.joe.input.mapper;

import com.joe.input.model.ItClinicMaster;
import com.joe.input.model.ItClinicMasterExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItClinicMasterMapper {
    long countByExample(ItClinicMasterExample example);

    int deleteByExample(ItClinicMasterExample example);

    int deleteByPrimaryKey(@Param("visitNo") Integer visitNo, @Param("visitDate") Date visitDate);

    int insert(ItClinicMaster record);

    int insertSelective(ItClinicMaster record);

    List<ItClinicMaster> selectByExampleWithRowbounds(ItClinicMasterExample example, RowBounds rowBounds);

    List<ItClinicMaster> selectByExample(ItClinicMasterExample example);

    ItClinicMaster selectByPrimaryKey(@Param("visitNo") Integer visitNo, @Param("visitDate") Date visitDate);

    int updateByExampleSelective(@Param("record") ItClinicMaster record, @Param("example") ItClinicMasterExample example);

    int updateByExample(@Param("record") ItClinicMaster record, @Param("example") ItClinicMasterExample example);

    int updateByPrimaryKeySelective(ItClinicMaster record);

    int updateByPrimaryKey(ItClinicMaster record);
}