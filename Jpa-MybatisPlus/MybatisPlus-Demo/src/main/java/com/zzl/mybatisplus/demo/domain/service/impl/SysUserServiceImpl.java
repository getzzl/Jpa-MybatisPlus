package com.zzl.mybatisplus.demo.domain.service.impl;

import com.zzl.mybatisplus.demo.domain.entity.SysUser;
import com.zzl.mybatisplus.demo.domain.mapper.SysUserMapper;
import com.zzl.mybatisplus.demo.domain.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzl
 * @since 2020-12-13
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
