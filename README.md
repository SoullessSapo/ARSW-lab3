# ARSW-lab3

### 📊 Cálculo de Media y Desviación Estándar usando una Lista Enlazada en Java

Este proyecto es una solución al taller de diseño orientado a objetos con genéricos, solicitado en el marco del curso ARSW.  
La aplicación calcula la **media** y **desviación estándar** de un conjunto de números reales leídos desde un archivo de texto, utilizando una **lista enlazada** implementada desde cero, y es compatible con la API de colecciones de Java.

---

## 🚀 Características

- **Lectura de datos** desde un archivo plano (uno por línea).
- **Almacenamiento** eficiente usando una lista enlazada genérica (`MyLinkedList<T>`).
- **Cálculo preciso** de la media y desviación estándar.
- **Pruebas unitarias** con JUnit para verificar la validez de los resultados.
- Proyecto estructurado con **Maven**.
- Todo el código fuente y documentación disponible en **GitHub**.

---

## 📁 Estructura del Proyecto

```
ARSW-networking/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/arswnetworking/
│   │   │       ├── ArswNetworkingApplication.java
│   │   │       ├── MyLinkedList.java
│   │   │       └── StatsUtil.java
│   │   └── resources/
│   │       └── data_col1.txt
│   └── test/
│       └── java/
│           └── org/example/arswnetworking/
│               └── ArswNetworkingApplicationTests.java
├── pom.xml
└── README.md
```

---

## 🛠️ Cómo ejecutar el proyecto

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/ARSW-networking.git
   cd ARSW-networking
   ```

2. **Agrega tus datos:**
    - Pon tu archivo de datos (uno por línea) en `src/main/resources/data_col1.txt`  
      _Ejemplo:_
      ```
      160
      591
      114
      229
      ...
      ```

3. **Compila y ejecuta el proyecto:**
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="org.example.arswnetworking.ArswNetworkingApplication"
   ```

   El programa te pedirá la ruta del archivo de datos; puedes poner:
   ```
   src/main/resources/data_col1.txt
   ```

---

## 🧪 Pruebas Unitarias

Las pruebas están implementadas con JUnit y verifican el cálculo de la media y desviación estándar para los datos de ejemplo.  
Para ejecutarlas:

```bash
mvn test
```

---

## 📊 Ejemplo de resultado

Para los siguientes datos de prueba (columna 1):

```
160
591
114
229
230
270
128
1657
624
1503
```

El resultado esperado es:

```
Mean: 550.60
Standard deviation: 572.03
```

---

## 📚 Diseño y Estructura

### 1. MyLinkedList<T>
- Implementación propia de una lista enlazada genérica.
- Métodos principales: `add`, `get`, `size`, y soporte para iterador.

### 2. StatsUtil
- Métodos estáticos para calcular media y desviación estándar usando la lista enlazada.

### 3. ArswNetworkingApplication
- Clase principal que orquesta la lectura de archivo, carga de datos en la lista y muestra los resultados.

### 4. Tests
- Pruebas con JUnit para validar la lógica con datos de ejemplo.

---

## 📜 Licencia

Este proyecto está bajo la licencia MIT.

---

## ✏️ Autor

Esteban Valencia Caicedo
Universidad escuela colombiana de ingeniería Julio Garavito

---

## 📎 Enlace del repositorio

[https://github.com/SoullessSapo/ARSW-networking](https://github.com/SoullessSapo/ARSW-networking)

---

> _Este proyecto es un ejercicio académico, adaptado del Personal Software Process for Engineers de Carnegie Mellon University._
