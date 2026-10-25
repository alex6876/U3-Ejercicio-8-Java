Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Control Vehicular y Odómetro (Encapsulamiento y Acumulación de Estado en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🚗 Simulación de Control Vehicular y Odómetro (Encapsulamiento y Acumulación en Java)

Este proyecto es una aplicación en Java que modela el seguimiento del kilometraje acumulado de un vehículo automotor. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la validación de operaciones incrementales en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Vehiculo`**: Modela el automóvil y protege la integridad de sus datos de identificación y recorrido.
* **Atributos privados (`private`)**: `modelo`, `patente` y `kilometrajeAcumulado`, impidiendo la alteración directa desde fuera de la clase.
* **Constructor**: Inicializa el perfil del vehículo asignando el modelo, la patente y validando de manera defensiva que el odómetro comience en cero o en un valor válido.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el kilometraje total acumulado.
* **Métodos operativos de negocio**:
* `avanzar(double kilometro)`: Incrementa el odómetro acumulado siempre que la distancia ingresada sea estrictamente mayor a cero. Si se ingresa un valor negativo o nulo, rechaza la operación e informa una advertencia por consola.




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Vehiculo` (Toyota Supra), ejecuta múltiples desplazamientos válidos, simula un intento de avance inválido (con valor negativo) y muestra por consola el kilometraje final.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Avances:** El método `avanzar` comprueba que la distancia recorrida sea positiva (`kilometro > 0`). En caso de recibir números negativos, bloquea la actualización para evitar incongruencias en el odómetro.
2. **Encapsulamiento Estricto del Odómetro:** El campo `kilometrajeAcumulado` es privado, lo que garantiza que la única forma de sumar distancia sea mediante la ejecución controlada del método de negocio.
3. **Acumulación Coherente:** Cada desplazamiento exitoso se suma de forma progresiva al estado previo almacenado en la memoria del objeto.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
El kilometraje debe ser mayor a 0.
Kilometraje: 203.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de los datos internos del vehículo para prevenir modificaciones accidentales o alteraciones directas del odómetro.
* **Gestión de Invariantes:** Aseguramiento de que el kilometraje mantenga una progresión lógica y consistente a lo largo del ciclo de vida del objeto.
* **Diseño Modular:** Clara separación entre la lógica del modelo de transporte (`Vehiculo`) y la ejecución de pruebas del usuario (`Main`).
