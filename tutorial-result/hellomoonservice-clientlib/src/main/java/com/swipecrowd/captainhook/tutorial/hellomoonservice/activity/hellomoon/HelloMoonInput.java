package com.swipecrowd.captainhook.tutorial.hellomoonservice.activity.hellomoon;

import lombok.Builder;
import lombok.Getter;
import com.swipecrowd.captainhook.framework.server.Input;

@Builder
@Getter
public class HelloMoonInput extends Input {
    private final String name;
}

