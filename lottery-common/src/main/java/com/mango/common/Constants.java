package com.mango.common;

/**
 * @description: 常量
 * @author: mango
 * @time: 2023/4/15 16:24
 */
public class Constants {



    public enum ResponseCode {
        SUCCESS("0", "操作成功"),
        FAIL("-1","未知错误"),
        ILLEGAL_PARAMETER("-2","非法参数"),
        INDEX_DUP("-3","主键冲突");

        private String code;
        private String message;

        ResponseCode(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

    }
}
