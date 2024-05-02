package com.dao;

import com.entity.ShenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenbaoView;

/**
 * 申报 Dao 接口
 *
 * @author 
 * @since 2021-04-06
 */
public interface ShenbaoDao extends BaseMapper<ShenbaoEntity> {

   List<ShenbaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}