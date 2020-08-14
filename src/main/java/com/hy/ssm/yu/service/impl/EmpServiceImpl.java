package com.hy.ssm.yu.service.impl;

import com.hy.ssm.yu.entity.Emp;
import com.hy.ssm.yu.mapper.EmpMapper;
import com.hy.ssm.yu.service.IEmpService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yukangze
 * @since 2020-07-27
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
