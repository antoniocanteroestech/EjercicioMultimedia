package es.estech.acantero;
/*
        Escribe una clase Multimedia para almacenar información de los objetos de tipo
        multimedia (películas, discos, mp3,mp4...). Esta clase contiene título, autor, formato, y
        duración como atributos. El formato puede ser uno de los siguientes: wav, mp3, midi, avi,
        mov, mpg, cdAudio y dvd. El valor de todos los atributos se pasa por parámetro en el
        momento de crear el objeto. Esta clase tiene además, un método para devolver cada uno
        de los atributos y un método toString() que devuelve la información del objeto. Por último,
        un método equals() que recibe un objeto de tipo Multimedia y devuelve true en caso de
        que el título y el autor sean iguales y false en caso contrario.

        Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película
        tiene, además de los atributos heredados, un actor principal y una actriz principal. Se
        permite que uno de los dos sea nulo, pero no los dos. La clase debe tener dos métodos
        para obtener los nuevos atributos y debe sobreescribir el método toString() para reflejar la
        nueva información.

        Escribe una clase ListaMultimedia para almacenar objetos de tipo multimedia. La clase
debe tener un atributo, que sea un array de objetos Multimedia y un entero para contar
cuantos objetos hay almacenados. Además, tiene un constructor y los siguientes
métodos:
el constructor recibe un entero por parámetro indicando el número máximo de
objetos que va a almacenar.
int size(): devuelve el número de objetos que hay en la lista.
boolean add(Multimedia m): añade el objeto al final de la lista, y devuelve true, en
caso de que la lista esté llena, devuelve false.
Multimedia get(int position): devuelve el objeto situado en la posición especificada.
String toString(): devuelve la información de los objetos que están en la lista.

Escribe una clase Disco, que herede de la clase Multimedia ya realizada. La clase
Disco tiene, aparte de los elementos heredados, un atributo para almacenar el género al
que pertenece (rock, pop, ópera...). La clase debe tener un método para obtener el nuevo
atributo y debe sobreescribir el método toString() para que devuelva toda la información.

*/


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
