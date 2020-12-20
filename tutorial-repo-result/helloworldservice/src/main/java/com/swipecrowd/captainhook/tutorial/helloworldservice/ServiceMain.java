package com.swipecrowd.captainhook.tutorial.helloworldservice;

import com.swipecrowd.captainhook.tutorial.helloworldservice.server.ServerProperties;
import com.swipecrowd.captainhook.framework.server.Controller;

public class ServiceMain {
    public static void main(String[] args) {
        Controller.run(
                new ServerProperties(),
                args);
    }
}

