# Gestor de Procesos del Sistema y Subprocesos en Java

Conjunto de utilidades desarrolladas en **Java** para la administración de procesos del sistema operativo, auditoría de recursos de hardware/CPU, lanzamiento multiplataforma de subprocesos y procesamiento híbrido de argumentos por línea de comandos (CLI).

## 🚀 Módulos Incluidos

- **Monitorización del Sistema (`MonitorProcesosSistema.java`):** Inspección en tiempo real del proceso activo mediante `ProcessHandle` y `ProcessHandle.Info`, obteniendo el PID actual, PID del proceso padre, comando ejecutable, usuario del sistema operativo, versión de la JVM y núcleos de CPU disponibles (`Runtime.getRuntime().availableProcessors()`).
- **Orquestación Multiplataforma de Subprocesos (`OrquestadorSubprocesos.java`):** Detección dinámica del sistema operativo (`Windows` / `Linux`), creación de procesos hijos mediante `ProcessBuilder`, supervisión de estado activo (`isAlive()`) y sincronización bloqueante con `waitFor()`.
- **Procesamiento Híbrido de Argumentos (`ProcesadorArgumentosCLI.java`):** Captura flexible de parámetros de entrada de un proceso admitiendo tanto argumentos por línea de comandos (`String[] args`) como lectura interactiva por consola (`Scanner`).

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java (JDK 17+)
- **APIs Estándar:** `java.lang.ProcessBuilder`, `java.lang.ProcessHandle`, `java.lang.Runtime`, `java.util.Optional`, `java.util.Scanner`
- **Conceptos Clave:** Programación multiproceso, concurrencia, auditoría de procesos del SO, portabilidad Windows/Linux

## 📂 Estructura del Proyecto

```text
├── src/
│   ├── MonitorProcesosSistema.java     # Inspección de PID, proceso padre, usuario y núcleos de CPU
│   ├── OrquestadorSubprocesos.java     # Lanzamiento y sincronización de procesos hijos (ProcessBuilder)
│   └── ProcesadorArgumentosCLI.java    # Captura híbrida de parámetros CLI y consola
└── README.md
```

## ▶️ Cómo Ejecutarlo

1. Clona este repositorio:
   ```bash
   git clone https://github.com/hugomsedeno/java-gestor-procesos-sistema.git
   ```
2. Compila y ejecuta cualquiera de los módulos:
   ```bash
   javac src/MonitorProcesosSistema.java
   java -cp src MonitorProcesosSistema
   ```

---
Desarrollado por **Hugo Marín Sedeño** — [LinkedIn](https://www.linkedin.com/in/hugo-marín-sedeño-79bb27302) | [GitHub](https://github.com/hugomsedeno)

