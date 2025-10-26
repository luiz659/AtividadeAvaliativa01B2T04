package fag.objetos;

public class Musica {
    private String titulo;
    private int duracaoSegundos;

    public Musica() {}

    public Musica(String titulo, int duracaoSegundos) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        if (duracaoSegundos > 0) {
            this.duracaoSegundos = duracaoSegundos;
        }
    }

 
    public String formatarDuracao() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        if (minutos > 0) {
            return String.format("%dm %ds", minutos, segundos);
        } else {
            return String.format("%ds", segundos);
        }
    }
}
