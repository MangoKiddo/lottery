package com.mango.rpc.services;

import com.mango.rpc.req.QueryActivityReq;
import com.mango.rpc.resp.ActivityRes;

/**
 * @description: 活动rpc服务
 * @author: mango
 * @time: 2023/4/15 16:48
 */
public interface IActivityBooth {

    /**
     * 查询活动
     * @param req
     * @return
     */
    ActivityRes queryActivityById(QueryActivityReq req);
}
