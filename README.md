Registrar logs en graylog con spring boot

Mediante input http gef configurado en graylog se podra almacenar la informacion de nuestro proyecto.

Requisitos:
  Docker
  Docker Compose

teniendo los requisitos instalados copiar el archivo docker-compose-graylog.yml al servidor y ejecutar el siguiente comando para que se realice la instalacion de los contenedores

  docker-compose -f docker-compose-graylog.yml -p graylog_demo up -d

luego de terminar la instalacion ingresar al navegador con el siguiente link 
  http://localhost:9000

  user: admin
  password: admin

configurar un input de tipo HTTP GELF, seleccionar la opcion GLOBAL y luego SAVE
en search apareceran todos los logs almacenados.

Para probar que este configurado correctamente abrir powershell y ejecutar el siguiente comando
  curl -X POST http://172.20.24.204:12201/gelf -p0 -d '{"message":"hello graylog", "host":"192.168.68.62", "facility":"test", "topic": "meme"}'
