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
