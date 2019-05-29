package com.ll.blog.dao;

import com.ll.blog.entity.CategoryInfo;
import java.util.List;

public interface CategoryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CategoryInfo record);

    CategoryInfo selectByPrimaryKey(Long id);

    List<CategoryInfo> selectAll();

    int updateByPrimaryKey(CategoryInfo record);
}