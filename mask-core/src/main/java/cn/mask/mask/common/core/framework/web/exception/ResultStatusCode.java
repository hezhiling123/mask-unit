//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.mask.mask.common.core.framework.web.exception;

public enum ResultStatusCode {
    OK(200, "OK"),
    HTTP_ERROR_100(100, "1XX错误"),
    HTTP_ERROR_300(300, "3XX错误"),
    HTTP_ERROR_400(400, "4XX错误"),
    HTTP_ERROR_500(500, "5XX错误"),
    SIGN_ERROR(120, "签名错误"),
    TIME_OUT(130, "访问超时"),
    KICK_OUT(300, "您已经在其他地方登录，请重新登录！"),
    BAD_REQUEST(407, "参数解析失败"),
    INVALID_TOKEN(401, "无效的授权码"),
    INVALID_CLIENTID(402, "无效的密钥"),
    REQUEST_NOT_FOUND(404, "访问地址不存在！"),
    METHOD_NOT_ALLOWED(405, "不支持当前请求方法"),
    REPEAT_REQUEST_NOT_ALLOWED(406, "请求重复提交"),
    SYSTEM_ERR(500, "服务器运行异常"),
    PARAM_ERROR(561, "参数异常"),
    NOT_EXIST_USER_OR_ERROR_PWD(10000, "该用户不存在或密码错误"),
    NOT_PARAM_USER_OR_ERROR_PWD(10006, "用户名或密码为空"),
    LOGINED_IN(10001, "该用户已登录"),
    NOT_EXIST_BUSINESS(10002, "该用户不存在"),
    SHIRO_ERROR(10003, "登录异常"),
    UNAUTHO_ERROR(10004, "您没有该权限"),
    REDIS_ERROR(10006, "redis异常"),
    REDIS_CONNECT_ERROR(10007, "redis连接异常"),
    BIND_PHONE(10010, "请绑定手机号"),
    UPLOAD_ERROR(20000, "上传文件异常"),
    INVALID_CAPTCHA(30005, "无效的验证码"),
    USER_FROZEN(40000, "该用户已被冻结"),
    USER_BIND_ERROR(40002, "该第三方账号未绑定用户"),
    USER_NO_ACTIVATION(40001, "该用户未激活");

    private Integer code;
    private String msg;

    private ResultStatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
