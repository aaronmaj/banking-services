FROM adoptopenjdk:11-jre-hotspot as builder
WORKDIR extracted
ARG JAR_FILE
ADD ${JAR_FILE}  app.jar

RUN java -Djarmode=layertools -jar app.jar extract

FROM adoptopenjdk:11-jre-hotspot
WORKDIR application
COPY --from=builder extracted/dependencies/  ./
COPY --from=builder extracted/spring-boot-loader/ ./
COPY --from=builder extracted/snapshot-dependencies/ ./
COPY --from=builder extracted/application/ ./

EXPOSE 8761
ENTRYPOINT["java","org.springframework.boot.loader.JarLauncher"]