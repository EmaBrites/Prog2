package tp2.ej1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private ArrayList<Temporada> temporadas;
    private String creador;
    private String genero;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.temporadas = new ArrayList<>();
        this.creador = creador;
        this.genero = genero;
    }

    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public Temporada getTemporada(int numero) {
        for (Temporada temporada : temporadas) {
            if (temporada.getNumero() == numero) {
                return temporada;
            }
        }
        return null;
    }

    public int getVistosTemporada(int numero) {
        Temporada temporada = getTemporada(numero);
        int vistos = 0;
        for (Episodio episodio : temporada.getEpisodios()) {
            if (episodio.isVisto()) {
                vistos++;
            }
        }
        return vistos;
    }

    public int getVistos() {
        int vistos = 0;
        for (Temporada temporada : temporadas) {
            vistos += getVistosTemporada(temporada.getNumero());
        }
        return vistos;
    }

    public int getCalificacion() {
        int calificacion = 0;
        for (Temporada temporada : temporadas) {
            calificacion += temporada.getCalificacion();
        }
        return calificacion / temporadas.size();
    }

    public boolean isVisto() {
        return getVistos() == getEpisodios();
    }

    private int getEpisodios() {
        int episodios = 0;
        for (Temporada temporada : temporadas) {
            episodios += temporada.getEpisodios().size();
        }
        return episodios;
    }
}
