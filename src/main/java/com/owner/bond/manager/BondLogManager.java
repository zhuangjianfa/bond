/**
 * Copyright © 2020 ECHRONOS Corp. All rights reserved.
 * This software is proprietary to and embodies the confidential
 * technology of ECHRONOS Corp.  Possession, use, or copying
 * of this software and media is authorized only pursuant to a
 * valid written license from ECHRONOS Corp or an authorized sublicensor.
 */
package com.owner.bond.manager;

import com.owner.bond.dao.BondLogDao;
import com.owner.bond.model.BondLog;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


/**
 * BondLog Manager
 * 
 * @author zhuangjf
 * @date 2021-09-03
 */
@Component
public class BondLogManager extends ServiceImpl<BondLogDao, BondLog> {

}
