package cn.mask.mask.common.core.framework.web.enums;

/**
 * 参考阿里错误码列表
 * 成功返回00000,
 * A开头表示用户错误
 * B开头表示系统错误
 * C开头表示调用第三方错误
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-20 16:22:49
 */
public enum ResultCode {
    SUCCESS("00000", "成功"),
    /****************************用户异常开始************************************/
    USER_CLIENT_ERR("A0001", "用户端错误"),
    /**
     * 用户注册相关
     */
    USER_REG_ERR("A0100", "用户注册错误"),
    USER_NAME_CHECK_FAIL("A0110", "用户名校验失败"),
    USER_NAME_EXISTS("A0111", "用户名已存在"),
    PHONE_NUMBER_EXISTS("A0115", "该手机号已被占用"),
    EMAIL_EXISTS("A0116", "该邮箱已注册"),
    WEI_XIN_OPEN_ID_EXISTS("A0117", "该微信号已注册"),
    ALI_PAY_OPEN_ID_EXISTS("A0118", "该支付宝账号已绑定"),
    USER_NAME_CONTAINS_SENSITIVE_WORDS("A0112", "用户名包含敏感词"),
    USER_NAME_CONTAINS_SPECIAL_CHARACTERS("A0113", "用户名包含特殊字符"),
    PASSWORD_CHECK_FAIL("A0120", "密码校验失败"),
    PASSWORD_LENGTH_SHORT("A0121", "密码长度不够"),
    PASSWORD_NOT_STRONG("A0122","密码强度不够"),
    VERIFICATION_CODE_ERR("A0130", "验证码输入错误"),
    VERIFICATION_SMS_CODE_ERR("A0131", "短信验证码输入错误"),
    VERIFICATION_EMAIL_CODE_ERR("A0132", "邮件验证码输入错误"),
    VERIFICATION_VOICE_CODE_ERR("A0133", "语音验证码输入错误"),
    USER_CERT_NO_ERR("A0140", "用户证件异常"),
    USER_CERT_TYPE_NOT_SELECTED("A0141", "用户证件类型未选择"),
    ILLEGAL_MAINLAND_ID_CARD_NO("A0142", "大陆身份证号码校验非法"),
    ILLEGAL_PASSPORT_NO("A0143", "护照编号校验错误"),
    ILLEGAL_OFFICER_CERT_NO("A0144", "军官证编号校验非法"),
    /**注册信息校验失败**/
    USER_BASE_INFO_CHECK_FAIL("A0150", "用户信息校验失败"),
    PHONE_FORMAT_CHECK_FAIL("A0151", "手机号码校验失败"),
    ADDRESS_FORMAT_CHECK_FAIL("A0152", "地址格式校验失败"),
    EMAIL_FORMAT_CHECK_FAIL("A0153", "邮箱格式校验失败"),

    /**用户登录相关**/
    USER_LOGIN_ERR("A0200", "用户登录异常"),
    USER_NOT_EXISTS("A0201", "用户账户不存在"),
    USER_ACCOUNT_FROZEN("A0202", "用户账户被冻结"),
    USER_ACCOUNT_CANCEL("A0203", "用户账户已作废"),
    PASSWORD_NOT_EQUALS("A0210", "用户密码错误"),
    PASSWORD_NOT_EQUALS_EXCEED_LIMIT("A0211", "用户密码输错次数超限"),
    USER_IDENTIFICATION_CHECK_FAIL("A0223", "用户未获得第三方登录授权"),
    USER_TOKEN_EXPIRED("A0230","用户登录已过期"),
    USER_VERIFICATION_CODE_ERR("A0240", "用户验证码输入错误"),
    USER_VERIFICATION_CODE_ERR_EXCEED_LIMIT("A0241", "用户验证码输入错误次数超限"),

    /**权限相关**/
    ACCESS_PERMISSION_EXCEPTION("A0300", "访问权限异常"),
    ACCESS_NOT_AUTHORIZED("A0301","访问未授权"),
    AUTHORIZING("A0302", "正在授权中"),
    AUTHORIZATION_APPLICATION_REJECTED("A0303", "用户授权申请被拒绝"),
    ACCESS_INTERCEPT_BY_USER_PRIVACY_SETTING("A0310", "因访问对象隐私设置被拦截"),
    AUTHORIZATION_EXPIRED("A0311","授权已过期"),
    NO_PERMISSION_TO_USE_API("A0312", "无权限使用API"),

    /**入参校验相关**/
    REQUEST_PARAMETER_ERR("A0400", "用户请求参数错误"),
    ILLEGAL_MALICIOUS_JUMP_LINK("A0401", "包含非法恶意跳转链接"),
    INVALID_USER_INPUT("A0402", "无效的用户输入"),
    NULL_REQUIRED_PARAMETER("A0410", "请求必填参数为空"),
    INVALID_METHOD_ARGUMENT("A0411", "方法参数异常"),
    BIND_EXCEPTION("A0412", "参数校验异常"),
    REQUEST_JSON_PARSING_FAILED("A0427", "请求JSON解析失败"),

    /**上传文件校验相关**/
    UPLOAD_FILE_EXCEPTION("A0700", "上传文件异常"),
    FILE_TYPE_NOT_MATCH("A0701", "用户上传文件类型不匹配"),
    FILE_OVER_SIZE("A0702", "用户上传文件太大"),

    /****************************用户异常结束************************************/

    /****************************系统异常开始************************************/
    SYS_ERR("B0001", "系统执行出错"),
    SYS_OVER_TIME("B0100", "系统执行超时"),
    SYS_DISASTER_RECOVERY_TRIGGERED("B0200", "系统容灾功能被触发"),

    /**系统主动限制**/
    SYS_RATE_LIMIT("B0210", "系统限流"),
    SYS_FUNC_DEGRADATION("B0220", "系统功能降级"),

    /**系统资源耗尽**/
    SYS_RESOURCE_ERR("B0300", "系统资源异常"),
    SYS_OUT_OF_RESOURCE("B0310", "系统资源耗尽"),
    SYS_OUT_OF_MEMORY("B0312", "系统磁盘耗尽"),
    SYS_OUT_OF_FILE_HANDLE("B0313", "文件句柄耗尽"),
    SYS_OUT_OF_CONNECTION_POOL_SIZE("B0315", "系统连接池耗尽"),
    SYS_OUT_OF_THREAD_POOL("B0314", "系统连接池耗尽"),

    /**系统资源访问异常**/
    SYS_RESOURCE_ACCESS_EXCEPTION("B0320", "系统资源访问异常"),
    SYS_READ_DISK_FILE_FAIL("B0321", "系统读取磁盘异常"),

    /****************************系统异常结束************************************/
    /****************************第三方系统异常开始*******************************/
    INVOKE_THIRD_PARTY_SERVICE_ERR("C0001", "调用第三方服务出错"),
    MIDDLEWARE_SERVICE_ERR("C0100", "中间件服务出错"),

    /**RPC报错**/
    RPC_SERVICE_ERR("C0110", "RPC 服务出错"),
    RPC_SERVICE_NOT_FOUND("C0111", "RPC 服务未找到"),
    RPC_SERVICE_NOT_REGISTERED("C0112", "RPC 服务未注册"),
    INTERFACE_NOT_EXISTS("C0113", "接口不存在"),

    /**消息服务报错**/
    MSG_SERVICE_ERR("C0120", "消息服务出错"),
    MSG_SEND_ERR("C0121", "消息投递出错"),
    MSG_CONSUME_ERR("C0122", "消息消费出错"),
    MSG_DESCRIBE_ERR("C0123", "消息订阅出错"),
    MSG_GROUP_NOT_FOUND("C0124", "消息分组未查到"),

    /**缓存服务报错**/
    CACHE_SERVICE_ERR("C0130", "缓存服务出错"),
    KEY_LENGTH_OVER_SIZE("C0131 ", "key 长度超过限制"),
    VALUE_LENGTH_OVER_SIZE("C0132", "value 长度超过限制"),
    CACHE_OUT_OF_MEMORY("C0133", "存储容量已满"),

    /****/
    NOT_SUPPORT_DATA_FORMAT("C0134", "不支持的数据格式"),
    CONFIG_SERVICE_ERR("C0140 ", "配置服务出错"),
    VPN_SERVICE_ERR("C0150", "VPN 服务出错"),
    CDN_SERVICE_ERR("C0151", "CDN 服务出错"),
    DOMAIN_NAME_SERVICE_ERR("C0152", "域名解析服务出错"),
    GATEWAY_SERVICE_ERR("C0153", "网关服务出错"),
    THIRD_PARTY_OVER_TIME("C0154", "第三方系统执行超时"),

    /**服务超时**/
    RPC_OVER_TIME("C0210", "RPC 执行超时"),
    MSG_SEND_OVER_TIME("C0220", "消息投递超时"),
    CACHE_SERVICE_OVER_TIME("C0230", "缓存服务超时"),
    CONFIG_SERVICE_OVER_TIME("C0240", "配置服务超时"),
    DATABASE_OVER_TIME("C0250", "数据库服务超时"),

    /**数据库错误**/
    DATABASE_ERR("C0300", "数据库服务出错"),
    TABLE_NOT_EXISTS("C0311", "表不存在"),
    COLUMN_NOT_EXISTS("C0312", "列不存在"),
    MULTIPLE_COLUMNS_WITH_SAME_NAME_JOIN_MULTI_TABLE("C0321", "多表关联中存在多个相同名称的列"),
    DATABASE_LOCK("C0331", "数据库死锁"),
    PRIMARY_KEY_CONFLICT("C0341", "主键冲突"),

    /**第三方系统限制**/
    THIRD_PARTY_DISASTER_RECOVERY_SYS_TRIGGERED("C0400", "第三方容灾系统被触发"),
    THIRD_PARTY_RATE_LIMIT("C0401", "第三方系统限流"),
    THIRD_PARTY_FUNC_DEGRADATION("C0402", "第三方功能降级"),

    /**通知出错**/
    NOTIFICATION_SERVICE_ERR("C0500", "通知服务出错"),
    SMS_NOTIFICATION_SERVICE_FAIL("C0501", "短信提醒服务失败"),
    VOICE_NOTIFICATION_SERVICE_FAIL("C0502", "语音提醒服务失败"),
    EMAIL_NOTIFICATION_SERVICE_FAIL("C0503 ", "邮件提醒服务失败");

    /****************************第三方系统异常结束*******************************/

    /**
     * 报错状态码
     */
    private final String code;

    /**
     * 报错描述
     */
    private final String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
