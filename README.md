Conversor de Monedas en Java

Este es un proyecto simple hecho en Java que permite convertir monedas utilizando una API de tasas de cambio en tiempo real.

El programa funciona desde la consola y permite elegir distintas conversiones de monedas.


Funcionalidades

El programa permite convertir entre las siguientes monedas:

Dólar (USD) → Peso Argentino (ARS)

Peso Argentino (ARS) → Dólar (USD)

Dólar (USD) → Real Brasileño (BRL)

Real Brasileño (BRL) → Dólar (USD)

Dólar (USD) → Peso Colombiano (COP)

Peso Colombiano (COP) → Dólar (USD)

El usuario selecciona una opción del menú e ingresa el monto que desea convertir.

El programa consulta una API externa para obtener la tasa de cambio actual y luego calcula el resultado.


Tecnologías utilizadas


Java

HttpClient

Gson para procesar JSON

ExchangeRate API para obtener tasas de cambio


Estructura del proyecto


El proyecto está dividido en varias clases para organizar mejor el código:

Principal:
Contiene el menú del programa y la interacción con el usuario.

ConsumoAPI:
Se encarga de conectarse con la API de tasas de cambio.

Calculos:
Realiza las operaciones matemáticas para convertir el monto.


Cómo ejecutar el proyecto

Clonar el repositorio

git clone https://github.com/DiKaizen/ConversorDeMonedas.git

Abrir el proyecto en tu IDE (IntelliJ, Eclipse, etc.)

Ejecutar la clase:

Principal.java

Seleccionar una opción del menú e ingresar el monto a convertir.
