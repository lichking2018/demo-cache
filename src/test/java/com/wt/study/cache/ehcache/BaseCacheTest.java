package com.wt.study.cache.ehcache;

import net.sf.ehcache.CacheManager;

/**
 * @ProjectName: workspace
 * @Package: com.wt.study.cache.ehcache
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019/2/1 5:16 PM
 * @Version: v1.0
 */
public class BaseCacheTest {
    private static final String configPath = "./src/main/resources/config/ehcache.xml";

    private CacheManager cacheManager;

    protected CacheManager getManager(){
        cacheManager = CacheManager.getCacheManager(configPath);
        return cacheManager;
    }

    protected void clearAll(){
        cacheManager.clearAll();
    }
}
