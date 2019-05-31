package com.ll.blog.controller;

import com.ll.blog.dto.ArticleDto;
import com.ll.blog.entity.CategoryInfo;
import com.ll.blog.entity.Comment;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 后台接口控制器
 *
 * @Author leon
 * @Date 2019/5/29 13:47
 */
@RestController
@RequestMapping("/admin")
public class BackController {
    /* 后台登录用户*/
    private static String username = "leon";
    private static String password = "123456";

    /**
     * 通过ID获取一篇文章，内容为MD源码格式
     *
     * @param id
     * @return
     */
    @ApiOperation("获取一篇文章，内容为md源码格式")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @GetMapping("articles/{id}")
    public ArticleDto getArticleDtoById(@PathVariable Long id) {
        return null;
    }

    /**
     * 增加一篇文章
     *
     * @return
     */
    @ApiOperation("增加一篇文章")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "summary", value = "文章简介", required = true, dataType = "String"),
            @ApiImplicitParam(name = "isTop", value = "文章是否置顶", required = true, dataType = "Boolean"),
            @ApiImplicitParam(name = "categoryId", value = "文章分类对应ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "文章md源码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pictureUrl", value = "文章题图url", required = true, dataType = "String")
    })
    @PostMapping("articles/")
    public String addArticle(@RequestBody ArticleDto articleDto) {
        return null;
    }

    /**
     * 删除一篇文章
     * @param id
     * @return
     */
    @ApiOperation("删除一篇文章")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @DeleteMapping("articles/{id}")
    public String deleteArticleById(@PathVariable Long id) {
        return null;
    }

    /**
     * 编辑/更新一篇文章
     * @param id
     * @param articleDto
     * @return
     */
    @ApiOperation("编辑/更新一篇文章")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "文章标题", required = true, dataType = "String"),
            @ApiImplicitParam(name = "summary", value = "文章简介", required = true, dataType = "String"),
            @ApiImplicitParam(name = "isTop", value = "文章是否置顶", required = true, dataType = "Boolean"),
            @ApiImplicitParam(name = "categoryId", value = "文章分类对应ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "content", value = "文章md源码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pictureUrl", value = "文章题图url", required = true, dataType = "String")
    })
    @PutMapping("articles/{id}")
    public String updateArticle(@PathVariable Long id, @RequestBody ArticleDto articleDto) {
        return null;
    }

    /**
     * 改变某篇文章分类
     * @param id
     * @param categoryId
     * @return
     */
    @ApiOperation("改变文章分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "categoryId", value = "分类ID", required = true, dataType = "Long"),
    })
    @PutMapping("articles/{id}/categories/{categoryId}")
    public String changeArticleCategory(@PathVariable Long id, @PathVariable Long categoryId) {
        return null;
    }

    /**
     * 更改文章题图信息
     * @param id
     * @param pictureUrl
     * @return
     */
    @ApiOperation("更改文章题图信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "pictureUrl", value = "题图Url", required = true, dataType = "String")
    })
    @PutMapping("articles/{id}/picture/{pictureUrl}")
    public String updateArticlePicture(@PathVariable Long id, @PathVariable String pictureUrl) {
        return null;
    }

    /**
     * 增加分类信息
     * @param categoryInfo
     * @return
     */
    @ApiOperation("增加分类信息")
    @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    @PostMapping("categories/")
    public String addCategoryInfo(@RequestBody CategoryInfo categoryInfo) {
        return null;
    }

    /**
     * 更新/编辑分类信息
     * @param id
     * @param categoryInfo
     * @return
     */
    @ApiOperation("更新/编辑分类信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    })
    @PutMapping("categories/{id}")
    public String updateCategoryInfo(@PathVariable Long id, @RequestBody CategoryInfo categoryInfo) {
        return null;
    }

    /**
     * 删除分类信息
     * @param id
     * @return
     */
    @ApiOperation("删除分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @DeleteMapping("categories/{id}")
    public String deleteCategoryInfo(@PathVariable Long id) {
        return null;
    }

    /**
     * 获取某一条分类信息
     * @param id
     * @return
     */
    @ApiOperation("获取某一条分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @GetMapping("categories/{id}")
    public CategoryInfo getCategoryInfo(@PathVariable Long id) {
        return null;
    }

    /**
     * 删除文章评论信息
     * @param id
     * @return
     */
    @ApiOperation("删除文章评论信息")
    @ApiImplicitParam(name = "id", value = "评论ID", required = true, dataType = "Long")
    @DeleteMapping("comments/articles/{id}")
    public String deleteArticleComment(@PathVariable Long id) {
        return null;
    }
    /**
     * 通过id删除某一条留言
     *
     * @param id
     * @return
     */
    @ApiOperation("删除一条留言")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @DeleteMapping("comments/{id}")
    public String deleteComment(@PathVariable Long id) {
        return null;
    }
    /**
     * 回复留言/评论，通过id去找到对应的Email
     *
     * @param id
     * @return
     */
    @ApiOperation("回复留言/评论")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @GetMapping("comments/reply/{id}")
    public String replyComment(@PathVariable Long id) {
        return null;
    }
    /**
     * 通过id获取某一条评论/留言
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一条评论/留言")
    @ApiImplicitParam(name = "id", value = "评论/留言ID", required = true, dataType = "Long")
    @GetMapping("comments/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return null;
    }
}
