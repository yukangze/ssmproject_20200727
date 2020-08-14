package com.hy.ssm.yu.service.impl;

import com.hy.ssm.yu.entity.Post;
import com.hy.ssm.yu.mapper.PostMapper;
import com.hy.ssm.yu.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
