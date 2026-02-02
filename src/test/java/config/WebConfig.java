package config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${prop}.properties",
        "classpath:local.properties"
})

public interface WebConfig extends Config {
    @Key("base.url")
    String baseUrl();

    @Key("remote.url")
    String remoteUrl();

    @Key("is.remote")
    Boolean isRemote();

    @Key("browser.version")
    String browserVersion();

    @Key("browser")
    String browser();

}
