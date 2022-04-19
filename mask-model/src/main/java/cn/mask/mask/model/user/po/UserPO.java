package cn.mask.mask.model.user.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author mask
 */
@Data
@Builder
@AllArgsConstructor
public class UserPO {
    private Integer id;
    private String username;
    private String nickname;
    private String password;
    private Integer gender;
    private LocalDate birthday;
    private String userLevel;
    private String mobile;
    private String weiXinOpenid;
    private String email;
    private String sessionKey;
    private String portraitUrl;
    private String status;
    private String creatorId;
    private String creatorName;
    private String createName;
    private LocalDateTime createTime;
    private String updaterId;
    private String updaterName;
    private LocalDateTime updateTime;
}