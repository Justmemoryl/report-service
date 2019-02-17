package cn.jml.work.report.repository;

import cn.jml.work.report.repository.entity.MSourceItem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 20:18
 **/
@Repository
public interface MSourceRepository {

    @Select("<script>SELECT source_name, source_desc FROM mission_source <when test='id != null'> WHERE source_id = #{id} </when></script>")
    @Results({
               @Result(property = "sourceName", column = "source_name"),
               @Result(property = "sourceDesc", column = "source_desc")
    })
    List<MSourceItem> selectItems(@Param(value = "id") Integer id);
}
