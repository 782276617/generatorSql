package com.warren.mapper;

import com.warren.pojo.goods;
import com.warren.pojo.goodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface goodsMapper {
    /**
     *  根据指定的条件获取数据库记录数,w_goods
     *
     * @param example
     */
    long countByExample(goodsExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,w_goods
     *
     * @param example
     */
    int deleteByExample(goodsExample example);

    /**
     *  根据主键删除数据库的记录,w_goods
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,w_goods
     *
     * @param record
     */
    int insert(goods record);

    /**
     *  动态字段,写入数据库记录,w_goods
     *
     * @param record
     */
    int insertSelective(goods record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,w_goods
     *
     * @param example
     */
    List<goods> selectByExample(goodsExample example);

    /**
     *  根据指定主键获取一条数据库记录,w_goods
     *
     * @param id
     */
    goods selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,w_goods
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") goods record, @Param("example") goodsExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,w_goods
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") goods record, @Param("example") goodsExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,w_goods
     *
     * @param record
     */
    int updateByPrimaryKeySelective(goods record);

    /**
     *  根据主键来更新符合条件的数据库记录,w_goods
     *
     * @param record
     */
    int updateByPrimaryKey(goods record);

    int insertBatchSelective(List<goods> records);

    int updateBatchByPrimaryKeySelective(List<goods> records);
}