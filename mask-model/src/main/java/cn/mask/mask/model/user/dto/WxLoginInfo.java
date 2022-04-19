package cn.mask.mask.model.user.dto;

import lombok.Data;

/**
 * @author mask
 */
@Data
public class WxLoginInfo {
    private String code;
    private UserInfo userInfo;
}
