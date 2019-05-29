package com.ll.blog.dao;

import com.ll.blog.entity.ArticleInfo;
import java.util.List;

public interface ArticleInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleInfo record);

    ArticleInfo selectByPrimaryKey(Long id);

    List<ArticleInfo> selectAll();

    int updateByPrimaryKey(ArticleInfo record);
}