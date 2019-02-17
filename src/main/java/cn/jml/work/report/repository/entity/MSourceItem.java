package cn.jml.work.report.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * 该表用于描述任务来源，如重构版本、常规版本、线上BUG等
 * 
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 19:50
 **/
@Data
@ToString
@EqualsAndHashCode
public class MSourceItem implements Serializable {
    /**
     * 使用主键自增策略
     */
    private Integer sourceid;
    /**
     * 来源简要概述
     */
    private String  sourceName;
    /**
     * 来源信息详细描述
     */
    private String  sourceDesc;
    /**
     * 当前来源是否有效，1-有效，0-失效
     */
    private Integer sourceStatus;
    /**
     * 扩展字段，暂不使用
     */
    private String  sourceExtension1;
}
