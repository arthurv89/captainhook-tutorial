package com.swipecrowd.captainhook.tutorial.hellomoonservice;

import com.swipecrowd.captainhook.tutorial.hellomoonservice.server.ServerProperties;
import com.swipecrowd.captainhook.framework.server.Controller;

public class ServiceMain {
    public static void main(String[] args) {
        Controller.run(
                new ServerProperties(),
                args);
    }
}
