package com.acheron.elysium.security.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author svb
 */
@RequestMapping("/sample")
public interface SampleService {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @ResponseBody
    String greeting();

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    String users(@RequestParam("name") String name);
}
