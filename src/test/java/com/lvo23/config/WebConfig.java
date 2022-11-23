package com.lvo23.config;

import org.aeonbits.owner.Config;

/**
 * @author Vlad Litvinov
 */
@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();
}
