# Usa una imagen base que tenga Java
FROM openjdk:17-jdk-slim

# Crea un directorio de trabajo
WORKDIR /app

# Copia el archivo JAR ya construido al contenedor
COPY target/cuenta_movimientos-0.0.1-SNAPSHOT.jar /app/cuenta_movimientos.jar

# Configura el contenedor para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "/app/cuenta_movimientos.jar"]
