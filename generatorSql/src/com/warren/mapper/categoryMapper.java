package com.warren.mapper;

import com.warren.pojo.category;
import com.warren.pojo.categoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface categoryMapper {
    /**
     *  根据指定的条件获取数据库记录数,w_category
     *
     * @param example
     */
    long countByExample(categoryExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,w_category
     *
     * @param example
     */
    int deleteByExample(categoryExample example);

    /**
     *  根据主键删除数据库的记录,w_category
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,w_category
     *
     * @param record
     */
    int insert(category record);

    /**
     *  动态字段,写入数据库记录,w_category
     *
     * @param record
     */
    int insertSelective(category record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,w_category
     *
     * @param example
     */
    List<category> selectByExample(categoryExample example);

    /**
     *  根据指定主键获取一条数据库记录,w_category
     *
     * @param id
     */
    category selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,w_category
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") category record, @Param("example") categoryExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,w_category
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") category record, @Param("example") categoryExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,w_category
     *
     * @param record
     */
    int updateByPrimaryKeySelective(category record);

    /**
     *  根据主键来更新符合条件的数据库记录,w_category
     *
     * @param record
     */
    int updateByPrimaryKey(category record);

    int insertBatchSelective(List<category> records);

    int updateBatchByPrimaryKeySelective(List<category> records);
}