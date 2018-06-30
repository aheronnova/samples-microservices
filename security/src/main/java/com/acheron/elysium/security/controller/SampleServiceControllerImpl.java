/*
 * Copyright 2018 Acheron Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.acheron.elysium.security.controller;

import com.acheron.elysium.security.api.controller.SampleServiceController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

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
        throw new IllegalAccessError("Not implemented");
    }
}
