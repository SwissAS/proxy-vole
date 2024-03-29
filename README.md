![Project Logo](https://github.com/SwissAS/proxy_vole/blob/master/resources/misc/logo.png "Logo")
# proxy_vole
Java proxy detection library


Introduction:
-------------
The intent of this project is to build a framework to detecting the proxy settings
used by the current platform. There are multiple strategies available to detect the 
proxy settings. Proxy Vole will detect proxy settings from: 
KDE, Gnome, Windows, Firefox, Internet Explorer, ...

See java doc for usage examples and API details. 

Building
--------
An Eclipse project to build the source is included. 
For windows some native code is used to read the IE proxy configuration.
For the windows dll an Visual Studio project is included.
There is also an maven build file to create an JAR file for deployment.
To build and use the library you will need Java 1.5 or higher.
For some features you will need Java 1.6 or higher

License:
--------
This project is released under BSD license (see LICENSE for details).

Have fun
 