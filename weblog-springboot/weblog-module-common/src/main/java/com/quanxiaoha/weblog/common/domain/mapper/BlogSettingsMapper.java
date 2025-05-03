package com.quanxiaoha.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.quanxiaoha.weblog.common.domain.dos.BlogSettingsDO;
import com.quanxiaoha.weblog.common.domain.dos.UserDO;

import java.time.LocalDateTime;


public interface BlogSettingsMapper extends BaseMapper<BlogSettingsDO> {
}
