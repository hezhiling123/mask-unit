//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.mask.mask.common.core.framework.web.exception;

import cn.mask.mask.common.core.framework.web.enums.ResultCode;

public class MaskException extends Exception {
    private String code;
    private String msg;

    public MaskException(Throwable t) {
        super(t);
        this.code = ResultCode.SYS_ERR.getCode();
        this.msg = ResultCode.SYS_ERR.getMsg();
    }

    public MaskException(ResultCode resultCode, String msg) {
        this.code = resultCode.getCode();
        this.msg = msg;
    }

    public MaskException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MaskException(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
