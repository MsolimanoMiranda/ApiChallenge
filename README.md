#Microservicio del Reto Intercorp

#Herramientas Utilizadas:


#Se creeo un paquete para manejar errores:


#Para la validacion de errores Javax,SpringBootValidation,jackson


#Secreo un paquete para la documentacion con Swagger.


#Levantar el Servicio en docker :
```html
$ git clone https://github.com/MsolimanoMiranda/InterCorpBack.git
$ cd docker-spring-boot
$ mvn clean package
$ java -jar target/AppChallenge-1-0.0.1-SNAPSHOT.jar
access http://localhost:8080
$ sudo docker build -t spring-boot:1.0 .
$ sudo docker run -d -p 8080:8080 -t spring-boot:1.0
```
Ruta de Acceso http://localhost:8080


Swagger: http://localhost:8080/swagger-ui.html#/


```html
API Crear Evaluacion :
Metodo: POST
EndPoint: localhost:8080/api/create
La siguiente api permite crear una evaluacion con los datos del cliente
Ejemplo en el cuerpo:
{"nombres": "Juan", "apellidos": "Pérez","correo":"msolimano_prueba@gmail.com", "puntuacion": 7, "fecha_inscripcion": "01-01-2020"}

Api Listar evaluacion:
Metodo: GET
EndPoint: localhost:8080/api/listar
La siguiente api permite litar todas las evaluciones

Api Listar evaluacion en un rango de Fechas:
Metodo: GET
EndPoint: localhost:8080/api/listaFind?fecha_inicio=01-01-2020&fecha_fin=20-06-2020
La siguiente api permite litar todas las evaluciones en un rango de fechas

Api crear Detalle de Evalucion
Metodo: POST
EndPoint: localhost:8080/detalle/create
La siguiente api permite crear un comentario detalle para la evaluacion
Ejemplo en el cuerpo:
{"id_evaluacion": "5ee22d94dec6d55216bd9c8b", "comentario": "comentario de prueba"}


Api Listar por Detalle de evaluacion
Metodo: GET
EndPoint:localhost:8080/detalle/listar?id=5ee22d94dec6d55216bd9c8b

```

