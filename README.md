# Registrar logs en graylog con spring boot

Mediante input **HTTP GELF** configurado en graylog se podra almacenar la informacion de nuestro proyecto.

Requisitos:
  - Docker
  - Docker Compose

teniendo los requisitos instalados copiar el archivo docker-compose-graylog.yml al servidor y ejecutar el siguiente comando para que se realice la instalacion de los contenedores

  ```bash
  docker-compose -f docker-compose-graylog.yml -p graylog_demo up -d
  ```

luego de terminar la instalacion ingresar al navegador con el siguiente link 
  >http://localhost:9000

  - user: admin
  - password: admin

## Configuracion

- Menu **System / Inputs**
  - Select Inputs **GELF HTTP**
  - Select button **Launch new input**
    - Title **Title of input** 
    - Select option **Global**
    - Select button **Save**

luego de generar dicha configuracion debe mostrarse la configuracion con el titulo y ejecutandose.

## Probar configuracion
  ```bash
  curl -X POST http://172.20.24.204:12201/gelf -p0 -d '{"message":"hello graylog", "host":"192.168.68.62", "facility":"test", "topic": "meme"}'
  ```
