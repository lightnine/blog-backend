package com.ll.blog.controller;

import com.ll.blog.entity.CategoryInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类信息控制器
 * @Author leon
 * @Date 2019/5/29 11:09
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    /**
     * 获取所有的分类信息
     * @return
     */
    @ApiOperation("获取所有分类信息")
    @GetMapping("/list")
    public List<CategoryInfo> listAllCategoryInfo() {
        return null;
    }

    /**
     * 通过ID获取一条分类信息
     * @param id
     * @return
     */
    @ApiOperation("获取某一条分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    public CategoryInfo getCategoryInfoById(@PathVariable Long id) {
        return null;
    }

    /**
     * 增加一条分类信息数据
     * @return
     */
    @ApiOperation("增加分类信息")
    @ApiImplicitParam(name = "name", value = "分类名称", required = true, dataType = "String")
    @PostMapping("")
    public String addCategoryInfo() {
        return null;
    }
    /**
     * 更新/编辑一条数据
     *
     * @param id
     * @return
     */
    @ApiOperation("更新/编辑分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @PutMapping("/{id}")
    public String updateCategoryInfo(@PathVariable Long id) {
        return null;
    }
    /**
     * 根据ID删除分类信息
     *
     * @param id
     * @return
     */
    @ApiOperation("删除分类信息")
    @ApiImplicitParam(name = "id", value = "分类ID", required = true, dataType = "Long")
    @DeleteMapping("/{id}")
    public String deleteCategoryInfo(@PathVariable Long id) {
        return null;
    }
}
