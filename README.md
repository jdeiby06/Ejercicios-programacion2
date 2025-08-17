# Ejercicios-programacion2

Ejercicios del taller de programacion 2

\# Ejercicios de Programación

Este repositorio contiene los ejercicios de programación en Java del taller de nivelación.

\## Contenido

\- Calculadora Básica

\- Contador de Vocales y Consonantes

\- Invertir una Cadena

\## Instrucciones

1\. Clona el repositorio.

2\. Navega a cada directorio de ejercicios.

3\. Compila y ejecuta los archivos `.java` para probar los ejercicios

### Preguntas
#### GIT
1. Que es un repositorio en Git y como se diferencia de un proyecto "normal"
R/ Un repositorio gif es un almacenamiento virtual para proyectos y que permite guardar versiones del código a las que se puede acceder cuando sea necesario, por otro lado, Un proyecto es una hoja de cálculo adaptable, panel de tareas y hoja de ruta que se integra con las incidencias y PR en GitHub para realizar el seguimiento del trabajo de forma eficaz.
---------------
2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y
repository) y qué papel cumple cada una?
R/ Working directory: donde se ubican los archivos del proyecto, y donde se realizan las modificaciones.
Staging Area: área intermedia donde se seleccionan los cambios que se incluirán en el siguiente commit, Permitiendo tener control sobre qué modificaciones se van a guardar permanentemente en el repositorio
Repository: donde se almacenan de forma permanente los cambios confirmados, además de tener el historial completo de los cambios hechos al proyecto.
---------------
3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
R/ Objetos Blob: Representa el contenido de un archivo
Tree: Organizan los blobs y otros trees en una estructura jerárquica, representando la estructura del directorio
Commits: representa una instantánea del proyecto en un momento específico.
Tag: Es un puntero a un commit específico, usado para marcar versiones importantes como lanzamientos.
Cada uno de estos objetos se identifica con un hash SHA-1 único y se almacena de forma comprimida en el repositorio
---------------
4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
R/ Con el comando git commit se crea el commit, este almacenara una instantánea de los cambios preparados en ese momento del proyecto
---------------
5. ¿Cuál es la diferencia entre git pull y git fetch?
R/ git pull: copia los cambios desde un repositorio remoto directamente a tu directorio de trabajo.
git fetch: solo copia los cambios en tu repositorio Git local.

6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
R/ Branch: puntero móvil que apunta a una confirmación (commit) específica del historial del proyecto.
---------------
7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
R/Un merge se realiza con el comando git merge, el cual permite tomar las líneas independientes de desarrollo creadas por git branch e integrarlas en una sola rama. Pueden surgir conflictos cuando:
Dos ramas modifican la misma línea de código en un archivo, Una rama elimina un archivo que otra rama ha modificado o los cambios en una rama alteran la estructura de un archivo de manera que entra en conflicto con los cambios de otra rama. Cuando esto ocurre, Git se detiene justo antes de la confirmación de fusión para que puedas resolver los conflictos manualmente, git editará el contenido de los archivos afectados con indicadores visuales que marquen ambas caras del contenido conflictivo, así podrás saber que editar para resolver el conflicto.
---------------
8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
R/Funciona como una forma de almacenar información sobre lo que se incluirá en la próxima confirmación y organizar los cambios antes de que se guarden permanentemente en el historial del proyecto, si se omite, al ejecutar git commit se confirmarán todos los cambios que estén rastreados y modificados, pero no se incluirán los nuevos archivos que no hayan sido añadidos al área de staging.
---------------
9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
R/Un archivo de texto que le dice a Git qué archivos o carpetas ignorar en un proyecto, ayudando con el seguimiento de archivos al evitar que se incluyan archivos innecesarios o confidenciales como archivos temporales, configuraciones locales, o código compilado.
10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
R/“git commit –amend” se utiliza para modificar el último commit antes de que se comparta con otros usuarios, a diferencia de un nuevo commit, que crea una nueva entrada en el historial, incluso si los cambios son similares o complementarios.
11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
R/Se utiliza para guardar temporalmente los cambios no confirmados en un repositorio Git, es útil cuando, por ejemplo, estás trabajando en una característica y necesitas cambiar a otra rama para corregir un error, puedes usar git stash para guardar los cambios actuales, cambiar de rama, hacer la corrección y luego volver a tu rama original y aplicar los cambios guardados.
12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git
revert, git checkout)?
*R/*Git ofrece mecanismos como: git reset para deshacer cambios en el repositorio, git revert para deshacer cambios efectuados en el historial de confirmaciones de un repositorio y git checkout para restaurar archivos a un estado específico del historial.
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso
para gestión de forks?
*R/*Cuando se clona un repositorio, git crea automáticamente una conexión remota “origin”, el cual permite enviar cambios desde el repositorio local al repositorio remoto y recibir cambios del repositorio remoto hacia tu repositorio local. Los comandos para la gestión de forks son: git clone para crear una copia local de un repositorio remoto y git remote add para añadir un repositorio remoto a tu clon local.
14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git
diff, git show)?
*R/*Con el comando Git Log se lista las confirmaciones hechas sobre el repositorio en orden cronológico inverso, con gif diff se muestra las diferencias entre los distintos estados de los archivos o Commits y con git show se muestra información detallada de un commit en específico.
------------------------------------------------------------------------------------------------
#### Programación:
15. ¿Cuáles son los tipos de datos primitivos en Java?
*R/* - Logicos (Boolean)
     - Integrales (byte, short, int ylong)
     - Flotante (float y double)
     - Caracteres (char)
16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en
Java?
*R/*
   - If: se ejecuta cuando se cumple una condición especifica
   - Else: Se utiliza para definir un bloque de código que se ejecutará si no se cumple la condición if
   - Switch: Se utiliza para seleccionar una opción entre muchas otras.
   - Bucles: Los bucles se utilizan para ejecutar un bloque de código repetidamente mientras se 
17. ¿Por qué es importante usar nombres significativos para variables y métodos?
*R/*Es importante ya que estos hacen que las variables y métodos sean más fáciles de entender y recordar que hace cada una.
18. ¿Qué es la Programación Orientada a Objetos (POO)?
*R/*La programación orientada a objetos (POO) es un paradigma de programación, un modelo o un estilo de programación que proporciona unas guías acerca de cómo trabajar con él y que está basado en el concepto de clases y objetos. Este tipo de programación se emplea para estructurar un programa de software en piezas simples y reutilizables de planos de código (clases) para crear instancias individuales de objetos.
19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
*R/*Los cuatro pilares son: encapsulación, herencia, polimorfismo y abstracción
20. ¿Qué es la herencia en POO y cómo se utiliza en Java?
*R/*La herencia es un mecanismo que permite a una clase (subclase o clase derivada) adquirir las propiedades (atributos y métodos) de otra clase (superclase o clase base), en sí, crea una clase basándose de otra. En Java, la herencia se implementa utilizando la palabra clave extends.
21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
*R/*Los modificadores de acceso son palabras clave que controlan la visibilidad y accesibilidad de clases, métodos, variables y constructores, en java los mas comunes son public, protected y private (publico, protegido y privado).
22. ¿Qué es una variable de entorno y por qué son importantes para Java o la
programación en general?
*R/*Una variable de entorno es un valor con un nombre dinámico en tu computadora que puede influir en el comportamiento de los procesos en ejecución, son importantes para la programación ya que permiten configurar aplicaciones sin modificar el código fuente.
