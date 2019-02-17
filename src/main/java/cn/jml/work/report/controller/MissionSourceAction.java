package cn.jml.work.report.controller;

import cn.jml.work.report.controller.entity.MissionSourceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 20:03
 **/
@RequestMapping(value = "/report/source")
public interface MissionSourceAction {

    @GetMapping(value = { "/overview", "/overview/{id}" }, produces = { "application/json;charset=UTF-8" })
    List<MissionSourceInfo> getSource(String id);
}
