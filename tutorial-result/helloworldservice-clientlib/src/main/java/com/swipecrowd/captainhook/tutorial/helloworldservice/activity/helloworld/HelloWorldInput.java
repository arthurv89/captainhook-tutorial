package com.swipecrowd.captainhook.tutorial.helloworldservice.activity.helloworld;

import lombok.Builder;
import lombok.Getter;
import com.swipecrowd.captainhook.framework.server.Input;

@Builder
@Getter
public class HelloWorldInput extends Input {
    private final String name;
}
