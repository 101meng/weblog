package com.quanxiaoha.weblog.admin.service;

public interface AdminStatisticsService {

    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();
    void statisticsTagArticleTotal();
}
