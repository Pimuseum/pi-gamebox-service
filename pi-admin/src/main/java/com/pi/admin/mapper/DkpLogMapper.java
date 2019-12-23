package com.pi.admin.mapper;


import com.pi.admin.model.wow.DkpLog;
import com.pi.admin.model.wow.DkpLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DkpLogMapper {
    int countByExample(DkpLogExample example);

    int deleteByExample(DkpLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DkpLog record);

    int insertSelective(DkpLog record);

    List<DkpLog> selectByExample(DkpLogExample example);

    DkpLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DkpLog record, @Param("example") DkpLogExample example);

    int updateByExample(@Param("record") DkpLog record, @Param("example") DkpLogExample example);

    int updateByPrimaryKeySelective(DkpLog record);

    int updateByPrimaryKey(DkpLog record);
}