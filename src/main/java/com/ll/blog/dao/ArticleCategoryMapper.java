package com.ll.blog.dao;

import com.ll.blog.entity.ArticleCategory;
import java.util.List;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Long id);

    List<ArticleCategory> selectAll();

    int updateByPrimaryKey(ArticleCategory record);
}