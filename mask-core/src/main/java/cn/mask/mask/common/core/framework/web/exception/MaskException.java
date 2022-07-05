//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.mask.mask.common.core.framework.web.exception;

public class MaskException extends Exception {
    private Integer code;
    private String msg;

    public MaskException(Throwable t) {
        super(t);
        this.msg = ResultStatusCode.HTTP_ERROR_500.getMsg();
        this.code = ResultStatusCode.HTTP_ERROR_500.getCode();
    }

    public MaskException(String msg) {
        super(msg);
        this.msg = msg;
        this.code = ResultStatusCode.HTTP_ERROR_400.getCode();
    }

    public MaskException(ResultStatusCode resultStatusCode) {
        this.msg = resultStatusCode.getMsg();
        this.code = resultStatusCode.getCode();
    }

    public MaskException(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public MaskException(ResultStatusCode resultStatusCode, String msg) {
        this.code = resultStatusCode.getCode();
        this.msg = resultStatusCode.getMsg();
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
