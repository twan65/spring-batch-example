package com.springboot.batch.post;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Component
public class  BatchTasks {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_POST_DELETE_BATCH = "http://localhost:8080/post/delete";
    private static final String TASK_ZONE = "Asia/Tokyo";

    @Scheduled(cron = "${cron.post-delete}", zone = TASK_ZONE)
    public void execute() {
        log.info("deletePostBatch() start");
        restTemplate.delete(URL_POST_DELETE_BATCH);
        log.info("deletePostBatch() end");
    }

}
