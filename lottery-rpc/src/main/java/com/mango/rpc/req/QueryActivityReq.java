package com.mango.rpc.req;

import java.io.Serializable;

/**
 * @description:
 * @author: mango
 * @time: 2023/4/15 16:38
 */
public class QueryActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
