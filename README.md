# Spring No XML Config

Minimal example of Spring (no Boot) setup with no xml configuration 

Ensure that your servlet container (e.g. Tomcat) has the same servlet api lib
that you're using, e.g. javax.servlet-api vs jakarta.servlet-api. The SPI
that automatically registers the `WebApplicationInitializer` has to match
(obviously, but it will simply ignore your initializer otherwise with no message).
