-Todo el programa cuenta con manejo de errores por que dudo que se cierre o de algún error, sin embargo, no esta libre de otros erroes-
El programa esta dieñado para cubrir con las necesidades principales descritas durante la problemática, sin embargo tiene ciertos detalles por ver, aunque primero veremos su funcionamiento

El menú puede hacer lo siguiente en el mismo orden con ciertas modificaciones a mi gusto: 
Registrar estudiante
Ver lista de estudiantes
Agregar libro nuevo
Ver libros nuevos
Registrar atención en ventanilla - reemplazado
Atender estudiante - igual, pero con cambios de lógica esperada
Registrar devolución de libro - En este caso cambia a un submenu que permite pedir o devolver un libro
Ver pila de devoluciones - Esta desaparece en caso de verla (es como si se acommodaran los libros en un estante)
Insertar calificación - Funcionamiento esperado
Mostrar calificaciones ordenadas (inorden) 
Registrar materia (código y nombre)
Ver materias registradas
Conectar salones
Ver conexiones de un salón
Salir


1.-  El registro del estudiante funciona perfectamente, sin embargo, no se agregó un manejo de errores que permita diferenciar cuando dos alumnos tienen el mismo nombre, clase, grupo y grado
    aunque la situación planteada anteriormente es casi imposible de que ocurra de forma real, el programa no tiene manejo de errores en caso de duplicados, por lo que simplemente registrará
    dos alumnos con los mismos datos, aunque esto no influye en nada

2.- Funcionamiento esperado

3.- Funcionamiento esperado

4.- Similar al punto uno, en este caso si es posible tener mas de 1 libro en stock por lo que tendrían los mismos datos, así que puede considerarse un error o no

5.- Genera un turno aleatoriamente entre 2 y 6, esto con el fin de darle mas realismo

6.- Se debe dar enter para pasar al siguiente turno, en el caso del nombre del alumno no se hizo que estrictamente lo entregue el alumno que lo solicito, sino que cualquiera puede entregar
    cualquier libro siempre y cuando este prestado, esto con fines prácticos de no tener que ingresar el nombre del alumno correcto siempre y cuando se recuerde el nombre del libro exacto
    aunque puede ser algo ilógico hasta cierto punto, me tomé dicha libertad con fines prácticos, además de que así haría menos pesado su desarollo y también más ligera la parte práctica del código
    -
    En esta parte se puede elegir entre pedir un libro prestado o uno devolverlo, esa parte si cuenta con manejo de errores medianamente preciso para el caso de que quieran devolver un libro que no
    existe, no ha sido prestado o bien, que quieran pedir prestado un libro que ya esta prestado.
    -
    En caso de que haya más de un libro con el mismo nombre, se pueden prestar sin problemas de que choque la lógica pensando que ya se presto, es decir, si por ejemplo hay dos principito, se
    pueden prestar ambos sin problema alguno a diferentes personas (no es necesario que sean alumnos o que estén registrados, ya que así funcionan algunas bibliotecas, igualmente por eso cualquiera
    puede devolverlos, o al menos así lo pensé también)

7.- Funcionamiento esperado

8.- Permite ver la pila de los libros devueltos, pero esta desaparecerá en cuanto se vean ya que será como devolverlos al estante y también por que usa un pop en vez de un ciclo for (creí que eso
    sería lo mejor), aunque el historial sigue intacto con la opción 7 y creo que funciona de la forma más optima

9.- Sinceramente consideré en cambiar esta opción a la número 11 (y pasar la 11 y 12 en vez de la 9 y 10), sin embargo no hay ningún inconveniente en querer ingresar una calificacíon en una clase que
    no existe, ya que el programa simplemente dirá que la clase no se encontró y ya.
    -
    Se puede ingresar una calificacíon de cualquier tipo, incluso negativa aunque no sea lo ideal (consideré en poner un manejo de erroes, pero me parecía innecesario al menos en esta situación, aunque
    en una situación laboral real si debí ponerle el manejo de datos en caso de números menores a 0 y mayores a 10 ya que en teoría no se puede)
    -
    Otro error que dejé pendiente es que no tiene una validacíon de si el estudiante existe o no, por lo que se le puede asignar una calificacíón a un alumno inexistente siempre y cuando la materia si
    exista

10.- Funcionamiento óptimo y con manejo de errores prudente

11.- Se puede ingresar el código que sea aunque no lo recomiendo ya que será dificil recordarlo e igualmente con el nombre

12.- Funcionamiento esperado (ideal para ver el código de la materia o copiarlo y pegarlo si es que se ingreso uno complicado de recordar)

13.- Funcioamiento esperado

14.- Funcionamiento esperado

15.- Cerrar el programa
