/**
 * 
 */
package ool.com.ofm.service;

import org.springframework.stereotype.Component;

/**
 * @author 1131080355959
 *
 */
@Component
public class HelloWorld implements ResourceService {
    @Override
    public String sayHello(String message) {
        return String.format("Hello, %s", message);
    }
}
