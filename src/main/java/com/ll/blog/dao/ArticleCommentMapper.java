package com.ll.blog.dao;

import com.ll.blog.entity.ArticleComment;
import java.util.List;

public interface ArticleCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleComment record);

    ArticleComment selectByPrimaryKey(Long id);

    List<ArticleComment> selectAll();

    int updateByPrimaryKey(ArticleComment record);
}