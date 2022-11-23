package com.lvo23.config;

import org.aeonbits.owner.ConfigFactory;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;

/**
 * @author Vlad Litvinov
 */
public class WebConfigProvider {

    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void configure() {

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        String remoteUrl = config.getRemoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}
