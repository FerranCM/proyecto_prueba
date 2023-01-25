package colecciones.Basicos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Serie implements Serializable {
    @Serial
    private static final long serialVersionUID = 1l;
    private String titulo;
    private String genero;
    private Integer agnoPublicacion;
    private List <Actor> reparto = new ArrayList<>();

    public Serie(String titulo, String genero, Integer agnoPublicacion, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.agnoPublicacion = agnoPublicacion;
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAgnoPublicacion() {
        return agnoPublicacion;
    }

    public void setAgnoPublicacion(Integer agnoPublicacion) {
        this.agnoPublicacion = agnoPublicacion;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", agnoPublicacion=" + agnoPublicacion +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo) && Objects.equals(genero, serie.genero) && Objects.equals(agnoPublicacion, serie.agnoPublicacion) && Objects.equals(reparto, serie.reparto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, agnoPublicacion, reparto);
    }
}
