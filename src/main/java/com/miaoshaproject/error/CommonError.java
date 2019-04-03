package com.miaoshaproject.error;

/**
 * Create by Alan on 2019/02/24
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
