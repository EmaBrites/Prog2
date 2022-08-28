package tp2.ej1;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Episodio> getEpisodios() {
        return new ArrayList<>(episodios);
    }

    // Supongo que los episodios están ordenados por número
    public Episodio getEpisodio(int numero){
        return episodios.get(numero);
    }

    public int getCalificacion() {
        int calificacion = 0;
        for (Episodio episodio : episodios) {
            calificacion += episodio.getCalificacion();
        }
        return calificacion / episodios.size();
    }
}
