package com.promise.security.service.impl;

import com.promise.security.entity.Config;
import com.promise.security.dao.ConfigMapper;
import com.promise.security.service.ConfigService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置信息表 服务实现类
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements ConfigService {

}
