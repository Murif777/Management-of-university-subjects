package Modelo;

public class Cursos {
    //definir atributos
    private String nombreCurso;
    private String codigo;
    private int creditos;
    private float nota;
    //contructores
    public Cursos() {
    }

    public Cursos(String codigo,String nombreCurso , int creditos, float nota) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.creditos = creditos;
        this.nota = nota;
    }
    // getters and setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

}
