package com.stackroute.agent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {
    @Autowired
    AgentServiceImpl agentService;

    @GetMapping("/health")
    public Health healthy(){

        return agentService.health();
    }

}
