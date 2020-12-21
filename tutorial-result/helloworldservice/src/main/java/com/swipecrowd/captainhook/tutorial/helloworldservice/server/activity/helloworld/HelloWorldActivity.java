package com.swipecrowd.captainhook.tutorial.helloworldservice.server.activity.helloworld;

import com.swipecrowd.captainhook.tutorial.helloworldservice.activity.helloworld.HelloWorldInput;
import com.swipecrowd.captainhook.tutorial.helloworldservice.activity.helloworld.HelloWorldOutput;
import com.swipecrowd.captainhook.framework.server.SimpleActivity;
import com.swipecrowd.captainhook.framework.server.Activity;
import org.springframework.stereotype.Component;
import rx.Observable;

import java.time.Instant;

@Activity
@Component
public class HelloWorldActivity extends SimpleActivity<HelloWorldInput, HelloWorldOutput> {
    @Override
    public Observable<HelloWorldOutput> enact(HelloWorldInput helloWorldInput) {
        final HelloWorldOutput output = HelloWorldOutput.builder()
                .message(String.format("HelloMoonService received HelloWorldInput with name property: \"%s\"", helloWorldInput.getName()))
                .respondingTime(Instant.now())
                .build();

        return Observable.just(output);
    }
}

