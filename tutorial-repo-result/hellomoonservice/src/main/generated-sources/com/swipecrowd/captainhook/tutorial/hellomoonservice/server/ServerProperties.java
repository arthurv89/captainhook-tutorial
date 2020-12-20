package com.swipecrowd.captainhook.tutorial.hellomoonservice.server;

import com.swipecrowd.captainhook.framework.common.response.Output;
import com.swipecrowd.captainhook.framework.common.response.Response;
import com.swipecrowd.captainhook.framework.server.AbstractServerProperties;
import com.swipecrowd.captainhook.framework.server.IOType;
import com.swipecrowd.captainhook.framework.server.Input;
import com.swipecrowd.captainhook.framework.server.Request;
import com.google.common.collect.ImmutableMap;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;

import java.util.Map;

public class ServerProperties extends AbstractServerProperties {
    private static final String HelloMoonEndpoint = "HelloMoon";

    @Getter
    private final String packageName = "com.swipecrowd.captainhook.tutorial.hellomoonservice";

    @Getter
    private final String serverName = "Hello Moon Service";

    @Getter
    private final int port = Integer.parseInt("8081");


    @Getter
    protected Map<String, IOType<?, ?>> iOTypes = createIoTypesMap();

    private ImmutableMap<String, IOType<? extends Input, ? extends Output>> createIoTypesMap() {
        return ImmutableMap.<String, IOType<? extends Input, ? extends Output>>builder()
                .put(HelloMoonEndpoint, new IOType<>(new TypeToken<Request<com.swipecrowd.captainhook.tutorial.hellomoonservice.activity.hellomoon.HelloMoonInput>>() {}, new TypeToken<Response<com.swipecrowd.captainhook.tutorial.hellomoonservice.activity.hellomoon.HelloMoonOutput>>() {}))
                .build();
    }
}
