package cn.mask.mask.common.core.framework.web;

import cn.mask.mask.common.core.framework.web.enums.ResultCode;

import java.io.Serializable;

public class WrapperResponse<T> implements Serializable {
    private static final long serialVersionUID = 5778573516446596671L;
    public static String SUCCESS = ResultCode.SUCCESS.getCode();
    public static String MSG_SUCCESS = "成功";
    public static String MSG_WARNING = "成功但有告警";
    public static String MSG_FAIL = "失败";
    private String code = ResultCode.SUCCESS.getCode();
    private String type;
    private String message;
    private T data;

    public WrapperResponse() {
    }

    public WrapperResponse(String code, String type, String message, T data) {
        this.code = code;
        this.type = type;
        this.message = message;
        this.data = data;
    }

    public static <T> WrapperResponse<T> success(T data) {
        return new WrapperResponse<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), MSG_SUCCESS, data);
    }

    public static <T> WrapperResponse<T> success(String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_SUCCESS;
        return new WrapperResponse<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), message, data);
    }

    public static <T> WrapperResponse<T> info(ResultCode resultCode, String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_SUCCESS;
        return new WrapperResponse<T>(resultCode.getCode(), WrapperResponse.ResponseType.TYPE_INFO.getType(), message, data);
    }

    public static <T> WrapperResponse<T> warning(ResultCode resultCode, String message, T data) {
        message = message != null && message.length() > 0 ? message : resultCode.getMsg();
        return new WrapperResponse<T>(resultCode.getCode(), WrapperResponse.ResponseType.TYPE_WARNING.getType(), message, data);
    }

    public static <T> WrapperResponse<T> warning(ResultCode resultCode, T data) {
        return new WrapperResponse<T>(resultCode.getCode(), WrapperResponse.ResponseType.TYPE_WARNING.getType(), resultCode.getMsg(), data);
    }

    public static <T> WrapperResponse<T> error(ResultCode resultCode, String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_FAIL;
        return new WrapperResponse<T>(resultCode.getCode(), WrapperResponse.ResponseType.TYPE_ERROR.getType(), message, data);
    }

    public static <T> WrapperResponse<T> error(String code, String message, T data) {
        message = message != null && message.length() > 0 ? message : MSG_FAIL;
        return new WrapperResponse<T>(code, WrapperResponse.ResponseType.TYPE_ERROR.getType(), message, data);
    }


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static enum ResponseType {
        TYPE_SUCCESS("success"),
        TYPE_INFO("info"),
        TYPE_WARNING("warning"),
        TYPE_ERROR("error");

        private final String type;

        ResponseType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }
    }
}
