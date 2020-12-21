package com.swipecrowd.captainhook.tutorial.hellomoonservice.server.activity.hellomoon;
import com.swipecrowd.captainhook.tutorial.helloworldservice.activity.helloworld.HelloWorldInput;
import com.swipecrowd.captainhook.tutorial.helloworldservice.client.Client;

import com.swipecrowd.captainhook.tutorial.hellomoonservice.activity.hellomoon.HelloMoonInput;
import com.swipecrowd.captainhook.tutorial.hellomoonservice.activity.hellomoon.HelloMoonOutput;
import com.swipecrowd.captainhook.framework.server.SimpleActivity;
import com.swipecrowd.captainhook.framework.server.Activity;
import org.springframework.stereotype.Component;
import rx.Observable;

import java.time.Instant;

@Activity
@Component
public class HelloMoonActivity extends SimpleActivity<HelloMoonInput, HelloMoonOutput> {
    @Override
    public Observable<HelloMoonOutput> enact(HelloMoonInput helloMoonInput) {
        final HelloWorldInput helloWorldInput = HelloWorldInput.builder().name(helloMoonInput.getName()).build();
        return new Client().helloWorldCall(helloWorldInput)
                .map(response -> HelloMoonOutput.builder()
                        .message(String.format("HelloMoonService received response from HelloWorldService: \"%s\"", response.getMessage()))
                        .respondingTime(Instant.now())
                        .build());
    }
}

