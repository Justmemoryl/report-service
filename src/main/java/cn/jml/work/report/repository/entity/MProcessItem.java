package cn.jml.work.report.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * 该表用于根据任务类型描述任务流程，如：设计开发型任务需要--文档设计、代码编写、自测联调等流程
 * 
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 19:58
 **/
@Data
@ToString
@EqualsAndHashCode
public class MProcessItem implements Serializable {
    /**
     * 使用主键自增策略
     */
    private Integer processid;
    /**
     * 流程简要概述
     */
    private String  processName;
    /**
     * 流程信息详细描述
     */
    private String  processDesc;
    /**
     * 当前流程是否有效，1-有效，0-失效
     */
    private Integer processStatus;
    /**
     * 扩展字段，暂不使用
     */
    private String  processExtension1;
}
