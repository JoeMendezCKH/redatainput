package com.joe.input.mapper;

import com.joe.input.model.ItDrugPriceList;
import com.joe.input.model.ItDrugPriceListExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ItDrugPriceListMapper {
    long countByExample(ItDrugPriceListExample example);

    int deleteByExample(ItDrugPriceListExample example);

    int deleteByPrimaryKey(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec, @Param("firmId") String firmId, @Param("startDate") Date startDate);

    int insert(ItDrugPriceList record);

    int insertSelective(ItDrugPriceList record);

    List<ItDrugPriceList> selectByExampleWithRowbounds(ItDrugPriceListExample example, RowBounds rowBounds);

    List<ItDrugPriceList> selectByExample(ItDrugPriceListExample example);

    ItDrugPriceList selectByPrimaryKey(@Param("drugCode") String drugCode, @Param("drugSpec") String drugSpec, @Param("firmId") String firmId, @Param("startDate") Date startDate);

    int updateByExampleSelective(@Param("record") ItDrugPriceList record, @Param("example") ItDrugPriceListExample example);

    int updateByExample(@Param("record") ItDrugPriceList record, @Param("example") ItDrugPriceListExample example);

    int updateByPrimaryKeySelective(ItDrugPriceList record);

    int updateByPrimaryKey(ItDrugPriceList record);
}