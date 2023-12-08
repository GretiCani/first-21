package com.first21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/benchmark")
public class BenchmarkController {

    @GetMapping
    public void getBenchmark() throws InterruptedException {
        Thread.sleep(3000);
        System.err.println("Current thread - "+Thread.currentThread());
    }
}
