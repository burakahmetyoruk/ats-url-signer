Apache Traffic Server Url Signer 4j
========

[![Apache License](http://img.shields.io/badge/license-ASL-blue.svg)](https://github.com/buraksarp/ats-url-signer/blob/master/LICENSE)
[![Build Status](https://travis-ci.org/buraksarp/ats-url-signer.svg)](https://travis-ci.org/buraksarp/ats-url-signer)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)

:lock: Java client to use Signed URL Plugin @Apache Traffic Server, implementation based on the [Signed URL Plugin](https://docs.trafficserver.apache.org/en/latest/admin-guide/plugins/url_sig.en.html)

Usage
--------

Download [the latest release JAR][1] or grab via Maven:
```xml
<dependency>
  <groupId>org.sarp.ats.urlsigner</groupId>
  <artifactId>urlsigner</artifactId>
  <version>1.0</version>
</dependency>
```
or Gradle:
```groovy
compile 'org.sarp.ats.urlsigner:urlsigner:1.0'
```

Supported Operations & Examples
--------

#### Sign URL

```java
String signedUrl = UrlSign.builder().setContentUrl("http://edge.sarp.net/public/magazine/object.pdf")
                .setClientIp("1.2.3.4")
                .setTimeToLive(2, TimeUnit.HOURS)
                .setParts(SigningPart.ONLY_ALL_DIRECTORY)
                .signWith(SignatureAlgorithm.HMAC_SHA1, "secret_key", 0)
                .compact();
```

#### (More operations to be added)

Building from the source
--------
```
git clone https://github.com/buraksarp/ats-url-signer
cd ats-url-signer
mvn clean install
```
