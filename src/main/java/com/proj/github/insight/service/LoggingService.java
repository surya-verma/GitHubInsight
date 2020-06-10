/**
 * 
 */
package com.proj.github.insight.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * LoggingService
 *
 * @author Surya Verma
 * @version 1.0
 * @since 2020-06-08
 */

public interface LoggingService {
	

    void logRequest(HttpServletRequest httpServletRequest, Object body);
    
    void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object body);

}
