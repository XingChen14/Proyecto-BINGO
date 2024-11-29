Programación Orientada a Objetos
Tercer Examen Parcial - Proyecto Final
Semestre 2024-2

________________


Tómbola de Bingo


En esta liga se describe el funcionamiento del juego Bingo. Un juego de Bingo consiste 
de dos partes importantes, las cartas de los jugadores 
https://www.techopedia.com/gambling-guides/how-to-play-bingo#:~:text=You%20will%20receive%20a%20bingo,%2C%20or%20diagonally%2C%20wins%20bingo.

y una tómbola de donde se toman números que se van anunciando conforme van saliendo. En esta liga hay un ejemplo de una aplicación en línea que trabaja como una tómbola.
https://letsplaybingo.io/

El proyecto final consiste en hacer un programa que trabaje como la tómbola con los números del Bingo y la verificación de una carta. 

La tómbola tendrá el siguiente comportamiento:


1. Configuración. Se configurará la tómbola para indicar las bolas que saldrán aleatoriamente. Esta configuración dependerá de cómo se están jugando las cartas. Estas podrán ser cómo se ven en la siguiente imagen. Se debe seleccionar uno de los 38 patrones que se muestran a continuación.
https://protospiel.online/wp-content/uploads/sites/23/2020/10/Winning-Protospiel-Bingo-Patterns-v3.png
2. Sacar Bola. Sale una bola aleatoria, que no haya salido antes y que corresponda a alguna de las líneas en juego.
3. Verificar Carta Potencial. El verificador recibe una carta y determina si el jugador gana con esta carta o no, dado el patrón que se está jugando y las bolas que han salido hasta el momento. 
4. Mostrar Historial. Aparecerán acomodadas en su posición todas las bolas que han salido hasta el momento. El historial de las bolas que han salido se ve como en la siguiente imagen.  Cada vez que sale una bola, se marca esta en la tabla de manera que se facilite verificar la carta de un ganador potencial.   
https://v.etsystatic.com/video/upload/q_auto/bingo_caller_ktm6es.jpg

Además, la aplicación cumplirá con los siguientes requerimientos.
   1. El usuario interactúa con la tómbola mediante una GUI del tipo que se utilizaron durante el semestre.
   2. La aplicación debe utilizar herencia, interfaces y clases abstractas en donde sea apropiado.
   3. Se entregará en un Google Doc (SI NO USAS ESTE FORMATO TIENES 0), un reporte final en el que se describa detalladamente el funcionamiento de la aplicación. Además del código fuente (CON FORMATO CODE BLOCKS NADA DE FONDO NEGRO  SI USAS UN FONDO QUE NO SEA BLANCO, TIENES 0), se debe entregar un diagrama de clases y explicar cómo es la interacción entre éstas. LAS CLASES NO PUEDEN TENER ATRIBUTOS EXTRAS O QUE SON INCORRECTOS. No es necesario describir cada línea de código, pero si se debe explicar en general:
   1. Qué modela cada clase.
   2. Qué hace cada método de cada clase.

Esta especificación podrá cambiar cuando encuentre puntos que no consideré o cuando me percate de algún error o ambigüedad. 

Se evaluará:
   1. El funcionamiento del programa.
   2. El uso de buenas prácticas de programación; el apego a las recomendación de codificación por ejemplo para el nombre de clases, atributos, métodos y variables.
   3. La ortografía en comentarios y mensajes dentro del programa.
   4. El acomodo del código en cada clase, por ejemplo el sangrado.
   5. En el reporte se evaluará coherencia y claridad en la expresión y las descripciones. Así mismo, se evaluará la ortografía del reporte. Su estructura puede ser similar a la de los reportes de laboratorio. 
   6. El reporte deberá describir completamente toda la aplicación y tener una organización coherente.
   7. El reporte deberá incluir el código de la aplicación, incluyendo las clases proporcionadas. Antes de cada método se deberá describir, en prosa, el funcionamiento del mismo.
   8. ENTREGAR VIDEO NARRADO.
