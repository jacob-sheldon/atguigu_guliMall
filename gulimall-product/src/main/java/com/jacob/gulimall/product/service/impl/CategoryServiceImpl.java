package com.jacob.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jacob.gulimall.common.utils.PageUtils;
import com.jacob.gulimall.common.utils.Query;

import com.jacob.gulimall.product.dao.CategoryDao;
import com.jacob.gulimall.product.entity.CategoryEntity;
import com.jacob.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        return categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0
        ).peek(menu -> menu.setChildren(getChildren(menu, categoryEntities))).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null? 0:menu2.getSort());
        }).collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity -> {
            return Objects.equals(categoryEntity.getParentCid(), root.getCatId());
        }).peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all))).sorted((cat1, cat2) -> {
            return (cat1.getSort() == null ? 0 : cat1.getSort()) - (cat2.getSort() == null ? 0 : cat2.getSort());
        }).collect(Collectors.toList());
    }

}