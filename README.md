# Ian_Mery_Organizacion_modular_y_creacion_de_una_libreria_personalizada_S5

📋 Descripción del Proyecto:

Sistema Java para la gestión y análisis de datos de centros de cultivo marino para Salmontt. El proyecto permite cargar, procesar y buscar información sobre producción acuícola.

🏗️ Estructura del Proyecto:

```bash
proyecto-centros-cultivo/
├── resources/
│   └── cultivos.txt
└── src/
    ├── data/
    │   └── GestorDatos.java
    ├── model/
    │   └── Centro.java
    └── ui/
        └── Main.java
```

❓ Clases Implementadas:

Centro = Instancia un objeto Centro con propiedades como centroCultivo, tour, producto y cantidad.

GestorDatos = Lee los datos de un archivo .txt y los carga en una lista.

Main = Se encarga de ejecutar la busqueda en la lista de datos y realiza busquedas filtradas por nombre de centro, nombre de tour, producto, cantidad

🖥️ Funcionalidades:

Lee el archivo cultivos.txt desde la carpeta resources en la raíz

Parsea cada línea separada por punto y coma

Crea objetos Centro y los almacena en una lista

Maneja excepciones de lectura de archivos

Muestra todos los centros de cultivo y permite busqueda por distintos campos como tour, producto, cantidad, etc...


🖱️ Como ejecutar:

Para utilizar se ejecuta el archivo Main.java y desde ahi se utiliza el menu en terminal para realizar busquedas y mostrar la data.
