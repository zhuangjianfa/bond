/**
 * Copyright © 2020 ECHRONOS Corp. All rights reserved.
 * This software is proprietary to and embodies the confidential
 * technology of ECHRONOS Corp.  Possession, use, or copying
 * of this software and media is authorized only pursuant to a
 * valid written license from ECHRONOS Corp or an authorized sublicensor.
 */
package com.owner.bond.model;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * BondLog 实体类
 * 
 * @author zhuangjf
 * @date 2021-09-03
 */
@Data
@TableName("bond_log")
public class BondLog{


    /**
     *  id 
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     *  股票编码 
     */
    private Integer bondCode;
    /**
     *  股票名称 
     */
    private String bondName;
    /**
     *  股票当前价格 
     */
    private BigDecimal bondPrice;
    /**
     *  涨跌幅 
     */
    private BigDecimal bondQuoteChange;
    /**
     *  成交量，单位手 
     */
    private Long bondVolume;
    /**
     *  成交额 
     */
    private Long bondTurnover;
    /**
     *  振幅 
     */
    private BigDecimal bondAmplitude;
    /**
     *  当天最高价 
     */
    private BigDecimal bondMax;
    /**
     *  当天最低价 
     */
    private BigDecimal bondMin;
    /**
     *  开盘价 
     */
    private BigDecimal bondOpeningPrice;
    /**
     *  昨天收盘价 
     */
    private BigDecimal bondPreviousPrice;
    /**
     *  量比 
     */
    private BigDecimal bondVolumeRate;
    /**
     *  换手率 
     */
    private BigDecimal bondTurnoverRate;
    /**
     *  市盈率 
     */
    private BigDecimal bondPeRate;
    /**
     *  市净率 
     */
    private BigDecimal bondPbRate;
    /**
     *  创建时间 
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     *  开盘日期 
     */
    private LocalDateTime bondTime;
    /**
     *  均价 
     */
    private BigDecimal averagePrice;
}