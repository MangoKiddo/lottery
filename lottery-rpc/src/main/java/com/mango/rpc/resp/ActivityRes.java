package com.mango.rpc.resp;


import com.mango.common.Result;
import com.mango.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @description:
 * @author: mango
 * @time: 2023/4/15 16:38
 */
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }

}
