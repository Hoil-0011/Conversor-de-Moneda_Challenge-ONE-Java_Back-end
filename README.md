# Conversor-de-Moneda_Challenge-ONE-Java_Back-end

Este proyecto es una aplicación de consola escrita en Java que permite convertir entre distintas monedas utilizando datos en tiempo real desde una API externa.

---

## 💡 ¿Qué hace?

Permite al usuario:

1. Seleccionar un tipo de conversión (por ejemplo, de Dólar a Peso Argentino).
2. Ingresar una cantidad.
3. Obtener el resultado convertido utilizando tasas reales de cambio desde [ExchangeRate API](https://www.exchangerate-api.com/).

---

## 🛠 Tecnologías utilizadas

- **Java 17+**
- **Gson** (para parsear JSON)
- **API pública de ExchangeRate**
- **`HttpClient`** (Java estándar para hacer peticiones HTTP)

---

## 🧪 Tipos de conversión disponibles

| Opción | Conversión                        |
|--------|------------------------------------|
| 1      | DÓLAR → PESO ARGENTINO             |
| 2      | PESO ARGENTINO → DÓLAR             |
| 3      | DÓLAR → REAL BRASILEÑO             |
| 4      | REAL BRASILEÑO → DÓLAR             |
| 5      | DÓLAR → PESO COLOMBIANO            |
| 6      | PESO COLOMBIANO → DÓLAR            |
| 7      | Salir del programa                 |

---

## 📦 Estructura

- `Main.java`: contiene la lógica principal, el menú y la conversión.
- `ConsultaMoneda.java`: clase encargada de realizar la petición HTTP a la API.
- `Moneda.java`: record que mapea la estructura del JSON recibido.
  
---

## 📥 ¿Cómo ejecutar?

1. Asegúrate de tener **Java instalado** (JDK 17 o superior recomendado).
2. Clona este repositorio o copia el código fuente.
3. Agrega la librería **Gson** al proyecto (puedes usar Maven, Gradle o descargar el `.jar`).
4. Compila y ejecuta `Main.java`.

---

## 🧠 Ejemplo de uso

```bash
Seleccione una opción para la conversión:
1: DÓLAR >>> PESO ARGENTINO
...

Ingresa la cantidad de USD a convertir a ARS:
100

$100 USD son $87350.5 ARS
