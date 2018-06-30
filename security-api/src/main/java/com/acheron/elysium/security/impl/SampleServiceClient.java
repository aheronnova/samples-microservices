package com.acheron.elysium.security.impl;

import com.acheron.elysium.security.api.SampleService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author svb
 */
@FeignClient("security")
public interface SampleServiceClient extends SampleService {
}
