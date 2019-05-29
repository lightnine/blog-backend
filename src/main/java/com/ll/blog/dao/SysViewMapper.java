package com.ll.blog.dao;

import com.ll.blog.entity.SysView;
import java.util.List;

public interface SysViewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysView record);

    SysView selectByPrimaryKey(Long id);

    List<SysView> selectAll();

    int updateByPrimaryKey(SysView record);
}