package com.promise.security.service.impl;

import com.promise.security.entity.Log;
import com.promise.security.dao.LogMapper;
import com.promise.security.service.LogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author dengpengtao
 * @since 2019-08-09
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
