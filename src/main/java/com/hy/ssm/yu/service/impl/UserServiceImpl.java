package com.hy.ssm.yu.service.impl;

import com.hy.ssm.yu.entity.User;
import com.hy.ssm.yu.mapper.UserMapper;
import com.hy.ssm.yu.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yukangze
 * @since 2020-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
