# Sistema Eleitoral

Java RESTful APIs criadas para o Desafio de projeto na DIO.

## Principais Tecnologias
 - **Java 17**: Utilizei a versão LTS do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Quarkus**: Trabalhei com Quarkus, um framework Java para microsserviços e aplicações nativas da nuvem, conhecido por sua leveza e eficiência.Destaco sua capacidade de compilar aplicações Java em binários nativos para inicialização rápida e baixo consumo de memória.

 - **Docker**: Foi utilizado o Docker, uma plataforma de contêineres que simplifica o empacotamento e execução de aplicativos em ambientes isolados. Com Docker, é possível encapsular aplicativos e suas dependências em contêineres leves e portáteis, permitindo implantação consistente e escalabilidade fácil.

 - **OpenAPI (Swagger)**: Foi criado uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Quarkus oferece;


## 📚 Sobre o Projeto

O projeto é um  sistema distribuído e escalável para eleições, contendo aplicações responsáveis para votação, gerenciamento de eleição, e consulta de resultados utilizando Java, Docker, MongoDB e Quarkus.



## Modo de Uso

Para usar este projeto, siga estas etapas:

1. Clone este repositório para o seu computador:

```bash
git clone https://github.com/JamesCode-Ts/election-system.git
```

2. Configuração do Ambiente Java com SDKMAN!

```bash
curl -s "https://get.sdkman.io" | bash
sdk install java 17.0.6-tem
sdk use java 17.0.6-tem
```
3. Instalação do maven
```bash
sdk install maven 
```
4. Configuração do Quarkus
```bash
sdk install quarkus 2.16.4.Final
```
5. Configuração do Docker Compose
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
6. JVM Build e construção do Quarkus a seguir:

```bash
./mvnw package
```
7. Construir a Imagem Docker
```bash
docker build -f src/main/docker/Dockerfile.jvm -t election-system/election-management .
```
8. Executar o Script de Build CI/CD
```bash
cicd-build.sh
```





