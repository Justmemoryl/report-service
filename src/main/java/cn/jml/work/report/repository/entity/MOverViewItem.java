package cn.jml.work.report.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 18:53
 **/
@Data
@ToString
@EqualsAndHashCode
public class MOverViewItem implements Serializable {
    /**
     * 任务唯一标识，使用主键自增策略
     */
    private Integer missionid;
    /**
     * 任务来源，非外键关联任务来源表(mission_source)，可新增、删除、修改等
     */
    private Integer sourceid;
    /**
     * 任务名称，任务简要概述
     */
    private String  missionName;
    /**
     * 任务类型，非外键关联任务类型表(mission_type)，用于新建和更新任务时选择当前任务详细状态
     */
    private Integer missionType;
    /**
     * 任务描述，任务详细描述
     */
    private String  missionDesc;
    /**
     * 任务当前状态，分为"待办"，"进行中"，"已完成"，"其他状态"四个阶段，默认值为0(待办)，0-待办，1-进行中，2-已完成，-1-其他状态
     */
    private Integer missionStatus;
    /**
     * 任务详细状态，非外键关联任务进程表(mission_process)，记录当前任务详细进度，当mission_status为"进行中"时，此字段必填
     */
    private Integer missionStatusDetail;
    /**
     * 任务备注，当mission_status为"其他状态"时，此字段必填
     */
    private String  missionRemark;
    /**
     * 任务创建时间，使用服务器时间，记录任务创建时间
     */
    private Date    missionCreateTime;
    /**
     * 任务更新时间，使用服务器时间，记录任务更新时间
     */
    private Date    missionUpdateTime;
    /**
     * 任务完成时间，使用服务器时间，记录任务完成时间
     */
    private Date    missionFinishTime;
    /**
     * 扩展字段，暂不使用
     */
    private String  missionExtension1;
    /**
     * 扩展字段，暂不使用
     */
    private String  missionExtension2;
    /**
     * 扩展字段，暂不使用
     */
    private String  missionExtension3;

}
