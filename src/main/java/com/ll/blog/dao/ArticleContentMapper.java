package com.ll.blog.dao;

import com.ll.blog.entity.ArticleContent;
import java.util.List;

public interface ArticleContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleContent record);

    ArticleContent selectByPrimaryKey(Long id);

    List<ArticleContent> selectAll();

    int updateByPrimaryKey(ArticleContent record);
}