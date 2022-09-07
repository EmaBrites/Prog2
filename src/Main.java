import tp1.Persona;
import tp2.ej1.Episodio;
import tp2.ej1.Serie;
import tp2.ej1.Temporada;
import tp2.ej4.Cancha;
import tp2.ej4.Sistema;
import tp2.ej4.Turno;
import tp2.ej4.Usuario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Persona persona = new Persona(1);
        System.out.println(persona);*/

        /*Episodio episodio = new Episodio("titulo", "descripcion");
        Temporada temporada = new Temporada(1);
        Serie serie = new Serie("titulo", "descripcion", "creador", "genero");
        temporada.agregarEpisodio(episodio);
        serie.agregarTemporada(temporada);
        serie.getTemporada(1).getEpisodio(0).calificar(5);
        System.out.println(serie.getTemporada(1).getEpisodio(0).getCalificacion());
        System.out.println(serie.getTemporada(1).getCalificacion());
        System.out.println(serie.getCalificacion());*/

        // tp2.ej4
        Cancha f1 = new Cancha("Futbol1", "futbol", 400);
        Cancha f2 = new Cancha("Futbol2", "futbol", 400);

        Cancha p1 = new Cancha("Paddle1", "paddle", 100);
        Cancha p2 = new Cancha("Paddle2", "paddle", 100);
        Cancha p3 = new Cancha("Paddle3", "paddle", 100);
        Cancha p4 = new Cancha("Paddle4", "paddle", 100);

        LocalDate fecha1 = LocalDate.of(2022, 7, 10);

        Usuario u1 = new Usuario("Juan", "Perez");
        Usuario u2 = new Usuario("Maria", "Gomez");

        Turno t1 = new Turno(f1, u1, 10, 2, fecha1);
        Turno t2 = new Turno(f2, u1, 12, 2, fecha1);
        Turno t3 = new Turno(p1, u1, 11, 1, fecha1);

        Sistema sistema = new Sistema();

        sistema.agregarTurno(t1);
        sistema.agregarTurno(t2);
        sistema.agregarTurno(t3);

        System.out.println(sistema.getTurnos());

    }
}