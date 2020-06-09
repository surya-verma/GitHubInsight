package com.proj.github.insight.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for Logging APIs
 *
 * @author Surya Verma
 * @version 1.0
 * @since 2020-06-08
 */

@RestController
@RequestMapping("/api/util")
public class LoggingController {

  Logger logger = LoggerFactory.getLogger(com.proj.github.insight.controller.LoggingController.class);

  @GetMapping("/testLogLevel")
  public String index() {
    logger.trace("A TRACE Message");
    logger.debug("A DEBUG Message");
    logger.info("An INFO Message");
    logger.warn("A WARN Message");
    logger.error("An ERROR Message");

    return "Howdy! Check out the Logs to see the output...";
  }
}
