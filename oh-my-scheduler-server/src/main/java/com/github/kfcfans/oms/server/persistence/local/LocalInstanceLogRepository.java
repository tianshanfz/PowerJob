package com.github.kfcfans.oms.server.persistence.local;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.stream.Stream;

/**
 * 本地运行时日志数据操作层
 *
 * @author tjq
 * @since 2020/4/27
 */
public interface LocalInstanceLogRepository extends JpaRepository<LocalInstanceLogDO, Long> {

    // 流式查询
    Stream<LocalInstanceLogDO> findByInstanceIdOrderByLogTime(Long instanceId);

    // 删除数据
    long deleteByInstanceId(Long instanceId);

}
