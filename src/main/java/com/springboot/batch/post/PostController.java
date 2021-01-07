package com.springboot.batch.post;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @DeleteMapping("/post/delete")
    public void deletePost() {
        System.out.println("ポストの削除バッチです。");
    }
}
