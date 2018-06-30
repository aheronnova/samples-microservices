package com.acheron.elysium.security.controller;

import com.acheron.elysium.security.api.controller.SampleServiceController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author svb
 */
@Component
public class SampleServiceControllerImpl implements SampleServiceController {

    @Override
    @HystrixCommand
    public String greeting() {
        return "Welcome";
    }

    @Override
    @HystrixCommand
    public String users(@RequestParam("name") String name) {
        throw new NotImplementedException();
    }
}
