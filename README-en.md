# Electoral System

Java RESTful APIs created for the project challenge at DIO.

## Main Technologies
- **Java 17**: I used the LTS version of Java to take advantage of the latest innovations that this robust and widely used language offers.
- **Quarkus**: I worked with Quarkus, a Java framework for microservices and cloud-native applications, known for its lightweight and efficiency. I highlight its ability to compile Java applications into native binaries for fast startup and low memory consumption.
- **Docker**: Docker was used, a container platform that simplifies the packaging and execution of applications in isolated environments. With Docker, it is possible to encapsulate applications and their dependencies in lightweight and portable containers, allowing consistent deployment and easy scalability.
- **OpenAPI (Swagger)**: An effective and easy-to-understand API documentation was created using OpenAPI (Swagger), perfectly aligned with the high productivity that Quarkus offers.

## About the Project
The project is a distributed and scalable system for elections, containing applications responsible for voting, election management, and result consultation using Java, Docker, MongoDB, and Quarkus.

## Usage
To use this project, follow these steps:

1. Clone this repository to your computer:

    ```bash
    git clone https://github.com/JamesCode-Ts/election-system.git
    ```

2. Java Environment Setup with SDKMAN!

    ```bash
    curl -s "https://get.sdkman.io" | bash
    sdk install java 17.0.6-tem
    sdk use java 17.0.6-tem
    ```

3. Maven Installation

    ```bash
    sdk install maven 
    ```

4. Quarkus Configuration

    ```bash
    sdk install quarkus 2.16.4.Final
    ```

5. Docker Compose Configuration

    ```bash
    docker-compose -f docker-compose.yml -f common.yml up -d reverse-proxy jaeger mongodb opensearch graylog

    curl -H "Content-Type: application/json" \
    -H "Authorization: Basic YWRtaW46YWRtaW4=" \
    -H "X-Requested-By: curl" \
    -X POST -v -d '{"title":"udp
    input","configuration":{"recv_buffer_size":262144,"bind_address":"0.0.0.0","port":12201,"de
    compress_size_limit":8388608},"type":"org.graylog2.inputs.gelf.udp.GELFUDPInput","global":t
    rue}' http://logging.private.dio.localhost/api/system/inputs

    docker-compose up -d caching database
    ```

6. JVM Build and Quarkus Build following:

    ```bash
    ./mvnw package
    ```

7. Build Docker Image

    ```bash
    docker build -f src/main/docker/Dockerfile.jvm -t election-system/election-management .
    ```

8. Run CI/CD Build Script

    ```bash
    cicd-build.sh
    ```

