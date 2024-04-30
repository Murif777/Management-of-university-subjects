package Modelo;

import java.util.List;

public class Estudiante extends Persona {//hereda de personax|
    //definir atributos
    private String codigo;
    private List<Cursos> cursos;
    //constructores
    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String apellido,List<Cursos> cursos) {
        super(nombre, apellido);
        this.codigo = codigo;
        this.cursos = cursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    

}
