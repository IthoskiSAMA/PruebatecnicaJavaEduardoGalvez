# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Configura el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR desde el contexto de construcción
COPY target/cliente-persona.jar /app/cliente-persona.jar

# Expone el puerto en el que la aplicación escuchará
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "/app/cliente-persona.jar"]
