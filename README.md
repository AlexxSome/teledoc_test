# teledoc_test
Construir un CRUD en SPRINGBOOT con Restful API, JPA, Postgresql, JWT para la siguientes tablas Futbolista, Club y Usuario.


# Pregunta 1
¿Diferencia entre anotaciones @Component, @Repository y @Service en Spring?
R.- @Component Estereotipo genérico para manejar componentes, @Repository esteretipo para capa de persistencia, @Service estereotipo para capa de servicios

# Pregunta 2
Construir un CRUD en SPRINGBOOT con Restful API, JPA, Postgresql, JWT para la siguientes
tablas Futbolista, Club y Usuario.

|Llamada|Descripción|Parámetros|Seguridad |
|-------|-----------|----------|----------|
|POST /api/login|Ingresar login y password retorna token Bearer|String login, String password| |
|GET /api/futbolistas|Lista todos los futbolistas|    |Token |
|GET /api/clubes|Lista todos los clubes|    |Token |
|POST /api/futbolistas|Crea un futbolista|Futbolista f|Token |
|GET /api/futbolistas/idClub|Lista todos los futbolistas de un Club|Integer id (club)|Token |
|DELETE /api/futbolistas/id|Elimina un futbolista de un club|Integer id(futbolista)|   |



Entregar el código fuente y el modelo de datos.

R.- https://github.com/AlexxSome/teledoc_test.git
Modelo de datos en la raíz del git “modeloBD.mwb”


# Pregunta 3
En una carrera de 2 tortugas, la tortuga 1 viaja a velocidad constante “V1” y ya ha recorrido una
distancia “X1”, mientras que la tortuga 2 comienza a viaja a velocidad constante “V2”. ¿En qué
momento se podrían encontrar ambas tortugas y qué condición se requiere para que esto
ocurra? Resolver esta pregunta en una hoja de papel y adjuntar imagen de la solución.
R.- Sabiendo que la velocidad es igual a la distancia divida por el tiempo  (V=x/t), se encuentran en el instante x1 + v1*t = v2*t  => t = x1/(v2-v1), el punto de partida de la carrera es el mismo, ambos avanzan en la misma dirección, recorren la misma trayectoria, las 2 velocidades son constantes, en un instante la tortuga 1 está en el punto x1 y la tortuga 2 sigue en el punto de partida o distancia cero, para que ambas se crucen deben haber recorrido la misma distancia en el mismo tiempo, esto se cumple solo si v2 > v1.


# Pregunta 4
Las palabras rotor, salas y seres son palabras llamadas “palindrome”, dado que se puede leer
hacia la derecha como a la izquierda y suena igual. Construir una función que evalúe si una
palabra es palindrome.
● is_palindrome(“salas”) → verdadero
● is_palindrome(“casa”) → falso
● is_palindrome( "Sometamos o matemos" ) → verdadero
Entregar la función en java.

R.- public boolean esPalindromo(String cadena){
    for(int i=0; i<cadena.length();i++){
        if(cadena.charAt(i) != cadena.charAt(cadena.length() -i -1)){
            return false;
        }
    }
    return true;
}


