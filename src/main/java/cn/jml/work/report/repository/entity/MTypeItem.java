package cn.jml.work.report.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * 该表用于描述任务类型，如：设计开发型、测试联调型、数据处理型等
 * 
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 19:56
 **/
@Data
@ToString
@EqualsAndHashCode
public class MTypeItem implements Serializable {
    /**
     * 使用主键自增策略
     */
    private Integer typeid;
    /**
     * 类型简要概述
     */
    private String  typeName;
    /**
     * 类型信息详细描述
     */
    private String  typeDesc;
    /**
     * 当前类型是否有效，1-有效，0-失效
     */
    private Integer typeStatus;
    /**
     * 扩展字段，暂不使用
     */
    private String  typeExtension1;
}
