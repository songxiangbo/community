package life.majiang.community.community.dto;

import lombok.Data;


@Data
public class NotificationDTO {
    private Long id;
    private String gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerId;
    private String typeName;
    private Integer type;

}
