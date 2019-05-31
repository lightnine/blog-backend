package com.ll.blog.controller;

import com.ll.blog.dto.ArticleCommentDto;
import com.ll.blog.dto.ArticleDto;
import com.ll.blog.dto.ArticleWithPictureDto;
import com.ll.blog.entity.CategoryInfo;
import com.ll.blog.entity.Comment;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author leon
 * @Date 2019/5/29 16:31
 */
@RestController
@RequestMapping("/api")
public class ForeController {
    /**
     * 获取所有文章列表
     *
     * @return
     */
    @ApiOperation("获取所有文章")
    @GetMapping("articles/")
    public List<ArticleWithPictureDto> listAllArticleInfo() {
        return null;
    }

    /**
     * 通过文章的ID获取对应的文章信息
     *
     * @param id
     * @return 自己封装好的文章信息类
     */
    @ApiOperation("通过文章ID获取文章信息")
    @GetMapping("articles/{id}")
    public ArticleDto getArticleById(@PathVariable Long id) {
        return null;
    }

    /**
     * 获取某一个分类下的所有文章
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一个分类下的所有文章")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @GetMapping("articles/category/{id}")
    public List<ArticleWithPictureDto> listArticleInfo(@PathVariable Long id) {
        return null;
    }

//    /**
//     * 获取最新的文章
//     *
//     * @return
//     */
//    @ApiOperation("获取最新的几篇文章")
//    @GetMapping("article/list/latest")
//    public List<ArticleWithPictureDto> listLatestArticle() {
//        return null;
//    }


    /**
     * 获取所有分类信息
     *
     * @return
     */
    @ApiOperation("获取所有分类信息")
    @GetMapping("categories/")
    public List<CategoryInfo> listAllCategoryInfo() {
        return null;
    }



    /**
     * 通过文章ID获取某一篇文章的评论信息
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一篇文章的评论信息")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @GetMapping("comments/articles/{id}")
    public List<ArticleCommentDto> listMessageByArticleId(@PathVariable Long id) {
        return null;
    }

    /**
     * 给某一篇文章增加一条评论信息
     *
     * @return
     */
    @ApiOperation("给文章中增加一条评论信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "评论信息", required = true, dataType = "String"),
            @ApiImplicitParam(name = "email", value = "Email地址，用于回复", required = false, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户自定义的名称", required = true, dataType = "String")
    })
    @PostMapping("comments/articles/{id}")
    public String addArticleComment(@PathVariable Long id, @RequestBody ArticleCommentDto articleCommentDto, HttpServletRequest request) {
        return null;
    }


    /**
     * 获取所有的留言信息
     *
     * @return
     */
    @ApiOperation("获取所有的留言信息")
    @GetMapping("comments/")
    public List<Comment> listAllComment() {
        return null;
    }

    /**
     * 增加一条留言
     *
     * @return
     */
    @ApiOperation("增加一条留言")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "评论信息", required = true, dataType = "String"),
            @ApiImplicitParam(name = "email", value = "Email地址，用于回复", required = false, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户自定义的名称", required = true, dataType = "String")
    })
    @PostMapping("comments/")
    public String addMessage(@RequestBody Comment comment, HttpServletRequest request) {
        return null;
    }
}
