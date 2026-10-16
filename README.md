Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Sistema de Validación de Identidad y Autenticación OAuth (Clases Abstractas y Patrón Strategy en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🔐 Simulación de Proveedores de Identidad y Autenticación (POO y Patrón Strategy en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible de autenticación externa por tokens (Google, GitHub y Apple). Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **herencia de atributos protegidos**, el **Patrón de Comportamiento Strategy** y manejo de colecciones polimórficas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que define la identidad base y múltiples implementaciones especializadas para cada proveedor:

* **`ProveedorIdentidad` (Clase Abstracta)**: Define el contrato y los datos compartidos de cualquier servicio de autenticación externo.
* **Atributo protegido (`protected`)**: `nombreProveedor`, inicializado a través de los constructores de las subclases.
* **Método abstracto**: `validarToken(String tokenAcceso)`, que obliga a cada proveedor a implementar su propia lógica de validación de credenciales.


* **`AuthGoogle`**: Modela la integración con el proveedor de identidad de Google.
* **Comportamiento:** Valida tokens comparándolos contra la clave de prueba `"GOOGLE123"`.


* **`AuthGitHub`**: Modela la integración con el ecosistema de GitHub.
* **Comportamiento:** Valida tokens utilizando la cadena simulada `"GITHUB123"`.


* **`AuthApple`**: Modela la validación de credenciales mediante Apple ID.
* **Comportamiento:** Comprueba la autenticidad del token frente al valor `"APPLE123"`.


* **`Main`**: Punto de entrada del programa. Agrupa los distintos proveedores en una lista polimórfica (`ArrayList<ProveedorIdentidad>`), define un arreglo de tokens de prueba y ejecuta de forma iterativa las validaciones de acceso.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Credenciales Nulas o Vacías:** Todos los proveedores ejecutan una guardia inicial al verificar el token (`if (tokenAcceso == null || tokenAcceso.isEmpty())`), retornando `false` de inmediato ante entradas inválidas.
2. **Reutilización de Atributos mediante `super`:** Cada subclase invoca el constructor de la clase padre mediante `super("Nombre")`, asignando de forma limpia y centralizada el nombre identificatorio del proveedor.
3. **Polimorfismo en Iteración:** El bucle principal recorre la lista sin importar qué proveedor específico esté procesando, delegando el comportamiento dinámico a la implementación correspondiente de `validarToken(...)`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Verificando token con Google...
Proveedor: Google
Acceso autorizado
----------------------
Verificando token con GitHub...
Proveedor: GitHub
Acceso denegado
----------------------
Verificando token con Apple...
Proveedor: Apple
Acceso autorizado
----------------------

```

---

## 🚀 Conceptos de Programación Aplicados

* **Patrón Strategy:** Permite encapsular los algoritmos de validación de tokens de diferentes plataformas en clases independientes, haciendo que las reglas de autenticación sean completamente intercambiables.
* **Principio Abierto/Cerrado (OCP):** Es posible integrar nuevos proveedores de identidad externos (ej. `AuthMicrosoft`, `AuthFacebook`) creando una nueva clase que extienda de `ProveedorIdentidad`, sin modificar la lógica existente del sistema principal.
* **Abstracción y Encapsulamiento:** Oculta los detalles internos de validación de cada API externa detrás de una interfaz unificada.

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba muestran cómo aplicar el **Patrón Strategy** y el manejo de arquitecturas orientadas a autenticación en Java para estructurar sistemas robustos y desacoplados.
