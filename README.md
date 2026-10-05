# KATA2

#### - OBJETIVOS
El objetivo de esta práctica es demostrar cómo un programa recibe datos mediante streams, cómo los valida y cómo produce una salida entendible.
Para ello se hará uso de los InputStream y OutputStream y se búsca que se entienda en dónde están las fronteras entre datos externos, transformación
y salida del programa.

#### - CÓMO COMPILAR Y EJECUTAR
En esta ocasión basta con simplemente estar en la clase `Main` que se encuentra en el paquete `software.ulpgc.katas` y en este 
clickar en el botón de runear que tiene el propio IntelliJ o usar shift + F10, de esta manera se compila y runea.

#### - DEPENDENCIAS Y VERSION DE JDK
- **Build System:** Maven
- **JDK:** openjdk-27
- En esta kata no se usó ninguna dependencia sino que se usaron las clases estándar de java que ya vienen incluidos en el propio JDK.

#### - ESTRUCTURA DE LA ENTREGA Y CLASES PRINCIPALES
- **Estructura:** La estándar de Maven
```
kata2/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── software.ulpgc.katas/
│   │   │       ├── Employee.java
│   │   │       ├── Gender.java
│   │   │       └── Main.java
│   │   └── resources/
│   └── test/
├── .gitignore
├── document.txt
├── kata2.iml
├── pom.xml
└── README.md
```
- **Clases Principales:** Main, Employee y Gender

#### - FLUJO DE GIT USADO
Se ha seguido una versión simplificada del modelo de flujo Gitflow, utilizando principalmente dos ramas: `main` como rama estable/principal y `develop` como 
rama de trabajo donde se integraron la mayoría de los commits.

Para clonar el repositorio se puede usar en la terminal del IntelliJ el comando `git clone`, pero también se puede hacer desde la propia interfaz antes de crear un proyecto.

## ENLACE AL VIDEO EXPLICATIVO
https://youtu.be/UBGOnvGSxBQ

En el video explicativo se muestra como se hizo la kata repitiendo los pasos que realizó el profesor en clases.
