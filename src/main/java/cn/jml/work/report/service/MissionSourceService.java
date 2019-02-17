package cn.jml.work.report.service;

import cn.jml.work.report.controller.MissionSourceAction;
import cn.jml.work.report.controller.entity.MissionSourceInfo;
import cn.jml.work.report.repository.MSourceRepository;
import cn.jml.work.report.repository.entity.MSourceItem;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Justmemoryl Email: justmemoryl@foxmail.com
 * @version 1.0 created at 2018/12/16 20:10
 **/
@Slf4j
@RestController
public class MissionSourceService implements MissionSourceAction {

    @Autowired
    private MSourceRepository repository;

    @Override
    public List<MissionSourceInfo> getSource(@PathVariable(required = false) String id) {
        return transferTo(repository.selectItems(null == id ? null : NumberUtils.toInt(id)));
    }

    private List<MissionSourceInfo> transferTo(List<MSourceItem> items) {
        List<MissionSourceInfo> result = new ArrayList<>();
        if (null != items && !items.isEmpty())
            for (MSourceItem item : items) {
                MissionSourceInfo info = new MissionSourceInfo();
                info.setSourceName(item.getSourceName());
                info.setSourceDesc(item.getSourceDesc());
                result.add(info);
            }
        return result;
    }
}
