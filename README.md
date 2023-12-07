# Implementación de Programación Concurrente en Bases de Datos NoSQL

## Nota: Mi repositorio es: https://github.com/zmartand/noSqlConcurrencia.git

## Enunciado de la Práctica:

Objetivos de la práctica:

En esta práctica, nuestro objetivo será obtener una comprensión práctica de cómo aplicar los principios de la programación concurrente en un entorno de base de datos NoSQL. Implementaremos diferentes estrategias de programación concurrente y evaluaremos su rendimiento al manejar grandes volúmenes de datos.

En la era actual de Big Data, las organizaciones generan y consumen cantidades enormes de información diariamente. Con tanta información disponible, las bases de datos tradicionales SQL pueden resultar ineficientes para manejar volúmenes de datos tan masivos y estructuras de datos complejas. Por lo tanto, las bases de datos NoSQL se han convertido en una elección popular debido a su escalabilidad y flexibilidad. Sin embargo, la eficiencia de estas bases de datos puede mejorarse aún más con el uso de la programación concurrente.

Detalles de la tarea:

Para la base de datos NoSQL, puedes optar por utilizar MongoDB, que es una base de datos orientada a documentos, o Apache Cassandra, que es una base de datos orientada a columnas. Ambas opciones son open-source y tienen amplia documentación disponible.

En cuanto a los datos, puedes utilizar conjuntos de datos públicos disponibles en recursos como Kaggle, Google Dataset Search o el Portal de Datos Abiertos del Gobierno. Sin embargo, elige un conjunto de datos que sea lo suficientemente grande para que sea relevante el uso de programación concurrente.

Podrías optar por un conjunto de datos relacionados con transacciones de comercio electrónico, tweets de Twitter, datos meteorológicos históricos, registros de sensores de IoT, etc. Recuerda, cuanto más grande y complejo sea el conjunto de datos, más interesantes serán los desafíos al implementar la programación concurrente.

Para la implementación de la programación concurrente, puedes usar herramientas y bibliotecas como ExecutorService y Future en Java, o ThreadPoolExecutor en Python. Estas herramientas te permiten gestionar la creación de hilos, su ejecución y la recolección de resultados de manera eficiente.

En cuanto a las pruebas de rendimiento, existen varias herramientas que puedes usar para monitorear y registrar el rendimiento de tu aplicación, como JMeter, Gatling o incluso las herramientas de monitoreo integradas en tu IDE.

Detalles de la tarea:

Configuración inicial: Inicia configurando una base de datos NoSQL (puedes elegir entre una base de datos clave-valor, orientada a documentos, orientada a columnas o una base de datos de grafos).

Modelado de datos: Modela un conjunto de datos para tu base de datos NoSQL elegida. Los datos deben ser lo suficientemente complejos para requerir el uso de programación concurrente (por ejemplo, un número significativo de registros o una estructura de datos compleja).

Implementación de programación concurrente: Implementa la programación concurrente para realizar operaciones en tu base de datos. Esto puede implicar el uso de múltiples hilos o procesos para manejar las operaciones de lectura y escritura, la implementación de bloqueos y otras estrategias de control de concurrencia, o el uso de bibliotecas de programación concurrente de alto nivel.

Pruebas y evaluación de rendimiento: Realiza pruebas de rendimiento en tu implementación. ¿Cómo se compara el rendimiento de tu implementación con y sin programación concurrente? Considera el tiempo de ejecución, el uso de recursos y cualquier otro factor de rendimiento relevante.

Informe de la práctica: Escribe un informe que documente tu enfoque, los desafíos que encontraste y cómo los resolviste, los resultados de tus pruebas de rendimiento y cualquier hallazgo o conclusión interesante que hayas obtenido de la práctica.

Consideraciones finales:

Este proyecto está diseñado para ser un desafío. Te animamos a que experimentes, investigues y explores diferentes enfoques y soluciones. ¡Buena suerte!

Rúbrica:

Entendimiento y modelado del problema (25%)

Entiende el problema y el contexto de la práctica.
Diseña e implementa correctamente un modelo de datos en MongoDB que se adapta al problema.
Implementación de la programación concurrente (25%)

Implementa correctamente los conceptos de programación concurrente en la práctica.
Usa adecuadamente los recursos de la computadora para optimizar la eficiencia y rendimiento.
Maneja adecuadamente los errores y las excepciones que puedan surgir durante la ejecución concurrente.
Interacción con la base de datos MongoDB (25%)

Establece correctamente la conexión con la base de datos MongoDB.
Realiza correctamente operaciones de lectura y escritura en la base de datos.
Maneja adecuadamente los errores y las excepciones que puedan surgir durante la interacción con la base de datos.
Análisis del rendimiento (15%)

Realiza un análisis cuantitativo y cualitativo del rendimiento de la práctica.
Compara y discute los resultados obtenidos con y sin la programación concurrente.
Calidad del código (10%)

Escribe código limpio, legible y bien comentado.
Sigue las mejores prácticas de codificación y estilo.

# NoSqlConcurrencia

This app was created with Bootify.io - tips on working with the code [can be found here](https://bootify.io/next-steps/).
Feel free to contact us for further questions.

## Development

When starting the application `docker compose up` is called and the app will connect to the contained services.
[Docker](https://www.docker.com/get-started/) must be available on the current system.

During development it is recommended to use the profile `local`. In IntelliJ `-Dspring.profiles.active=local` can be
added in the VM options of the Run Configuration after enabling this property in "Modify options". Create your own
`application-local.yml` file to override settings for development.

Lombok must be supported by your IDE. For IntelliJ install the Lombok plugin and enable annotation processing -
[learn more](https://bootify.io/next-steps/spring-boot-with-lombok.html).

In addition to the Spring Boot application, the DevServer must also be started. [Node.js](https://nodejs.org/) has to be
available on the system - the latest LTS version is recommended. On first usage and after updates the dependencies have to be installed:

```
npm install
```

The DevServer can now be started as follows:

```
npm run devserver
```

Using a proxy the whole application is now accessible under `localhost:8081`. All changes to the templates and JS/CSS
files are immediately visible in the browser.

## Build

The application can be built using the following command:

```
mvnw clean package
```

Node.js is automatically downloaded using the `frontend-maven-plugin` and the final JS/CSS files are integrated into the jar.

Start your application with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./target/noSqlConcurrencia-0.0.1-SNAPSHOT.jar
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as
environment variable when running the container.

```
mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=io.bootify/no-sql-concurrencia
```

## Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data MongoDB reference](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/)  
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Webpack concepts](https://webpack.js.org/concepts/)  
* [npm docs](https://docs.npmjs.com/)  
* [Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)  
* [Learn Spring Boot with Thymeleaf](https://www.wimdeblauwe.com/books/taming-thymeleaf/)  
