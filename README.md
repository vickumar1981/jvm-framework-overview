# JVM Frameworks (A Quick Overview)

We'll take a quick look at a few popular frameworks in the JVM.

This guide contains a simple hello world REST API in the following frameworks:

 - [Spring Boot w/ Webflux](https://spring.io/guides/gs/reactive-rest-service/)
 - [Micronaut](https://guides.micronaut.io/latest/creating-your-first-micronaut-app-gradle-java.html)
 - [Quarkus](https://quarkus.io/guides/getting-started)


Each application contains a single endpoint, `/hello` and has been tested
on Java 11.

All frameworks are reactive frameworks.

Boot times are on a Intel® Core™ i7-8750H CPU @ 2.20GHz × 6 processor,
and running the application in development mode.


## Spring Boot w/ WebFlux

To run, change into the `webflux` directory and run the application.

```shell
cd webflux/
./gradlew bootRun
```

### Details

|Version  |  Spring Boot 2.6.0|
|---------|-------------------|
|Server   |  Netty |
|Boot time|  ~750 ms |


## Micronaut

To run, change into the `micronaut` directory and run the application.

```shell
cd micronaut/
./gradlew run
```

### Details

|Version  |  Micronaut 2.0.8|
|---------|-------------------|
|Server   |  Netty |
|Boot time|  ~500 ms |

## Quarkus

To run, change into the `quarkus` directory and run the application.

```shell
cd quarkus/
./mvnw compile quarkus:dev
```

### Details

|Version  |  Quarkus 2.4.0|
|---------|-------------------|
|Server   |  Vert.x/Netty. |
|Boot time|  ~1.2 s |


