# Parte1-Grupo-12

# Este proyecto consiste en el desarrollo de una aplicación web basada en Spring Boot que gestiona un restaurante mediante una API REST y una interfaz web.
_____________________________________________________________________________________________________________________________________
# Se han implementado tres entidades principales:

  Cliente
  Pedido                        *La información se almacena en memoria (no persistente), utilizando estructuras tipo Map.*
  Plato
_______________________________________________________________________________________________________________________________________
# FUNCIONALIDADES
  # API REST
  Crear (POST)
  Leer (GET)
  Actualizar (PUT / PATCH)
  Eliminar (DELETE)

  # Interfaz web
  Se han desarrollado formularios HTML para interactuar con la aplicación:
  clientes.html
  pedidos.html            *Desde estos formularios se pueden realizar operaciones CRUD.*
  platos.html
_______________________________________________________________________________________________________________________________________
# TECNOLOGÍAS UTILIZADAS
  Java
  Spring Boot
  Maven
  HTML
  JavaScript
  CSS

_______________________________________________________________________________________________________________________________________
# EJECUCIÓN
  1. Ejecutar la aplicación desde RestauranteApplication.java
  2. Acceder desde el navegador a:
     http://localhost:8080/clientes.html
     http://localhost:8080/pedidos.html
     http://localhost:8080/platos.html

_______________________________________________________________________________________________________________________________________
# ESTRUCTRUA DEL PROYECTO
  src/main/java → lógica de la aplicación (controladores y modelos)
  src/main/resources/static → vistas HTML
