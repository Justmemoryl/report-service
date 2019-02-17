package cn.jml.work.report.controller.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 20:15
 **/
@Data
@ToString
@EqualsAndHashCode
public class MissionSourceInfo implements Serializable {
    private String sourceName;
    private String sourceDesc;
}
