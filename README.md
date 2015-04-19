Feature Toggle for Java
=======

This is a simple library firstly finished when I was attending TWU 42,
and thanks to **Junior Ales** my trainer, this is distributed as an open
source project.

## Usage

Add your feature toggle setting to `features.properties` resource file,
either turn it on or off, you can simply control a feature show or not.

## Example

Check `example` folder to see how to use.

Simply you can just do `gradle jar`, and copy to `WEB-INF/libs`, then
add
```xml
    <jsp-config>
        <taglib>
            <taglib-uri>http://hjk.kimleo.net/tlds/featureToggle</taglib-uri>
            <taglib-location>WEB-INF/lib/feature-toggle.jar</taglib-location>
        </taglib>
    </jsp-config>
```
to your `web.xml`. then you can use this as a taglib in JSP pages.

Check `example/web/index.jsp` to see how to use in JSP file.


## Todo

1. Simplify the way load to web application.
2. Move to maven central
3. Add more toggle checkers in different way.
