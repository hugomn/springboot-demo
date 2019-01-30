package io.webstacker.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("demo")
public class DemoProperties {

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    /**
     * This is our welcome message
     */
    private String welcomeMsg = "Hello!";
}
