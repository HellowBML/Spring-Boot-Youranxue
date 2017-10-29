package com.youranxue.domain.mapper;

import com.youranxue.domain.model.PublisherMst;
import com.youranxue.domain.model.PublisherMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublisherMstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int countByExample(PublisherMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int deleteByExample(PublisherMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int deleteByPrimaryKey(Integer publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int insert(PublisherMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int insertSelective(PublisherMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    List<PublisherMst> selectByExample(PublisherMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    PublisherMst selectByPrimaryKey(Integer publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int updateByExampleSelective(@Param("record") PublisherMst record, @Param("example") PublisherMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int updateByExample(@Param("record") PublisherMst record, @Param("example") PublisherMstExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int updateByPrimaryKeySelective(PublisherMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table youranxue.publisher_mst
     *
     * @mbggenerated Sun Oct 29 15:04:33 CST 2017
     */
    int updateByPrimaryKey(PublisherMst record);
}