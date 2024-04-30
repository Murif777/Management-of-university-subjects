package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Archivo {

    public static void guardar(ArrayList<Estudiante> listaEst) throws IOException {
        File directorio = new File(".");//path
        File f = new File(directorio, "Estudiante.txt");//crear el archivo

        FileWriter fw = new FileWriter(f, true);//flujo fw
        try (BufferedWriter bw = new BufferedWriter(fw) //flujo bw
                ) {
            for (int j = 0; j < listaEst.size(); j++) {
                Estudiante estudiante = listaEst.get(j);
                bw.write(estudiante.getCodigo() + "," + estudiante.getNombre() + "," + estudiante.getApellido());//ir escribiendo el archivo
                ArrayList<Cursos> cursos = (ArrayList<Cursos>) estudiante.getCursos();//abriendo cursos
                for (int i = 0; i < cursos.size(); i++) {
                    Cursos cu = cursos.get(i);
                    bw.write("," + cu.getCodigo() + "," + cu.getNombreCurso() + "," + cu.getCreditos() + "," + cu.getNota());//escribir cursos 
                }
                bw.write("\n");//salto de linea
            }
            bw.close();//cerrar flujo
        }
    }

    public static ArrayList<Estudiante> leer() throws FileNotFoundException, IOException {
        File directorio = new File(".");//path
        File f = new File(directorio, "Estudiante.txt");//crear el archivo
        FileReader fr = new FileReader(f);//flujo fw
        ArrayList<Estudiante> listaEst;
        try (BufferedReader br = new BufferedReader(fr)) {
            listaEst = new ArrayList<>();//crear array
            String linea = "";
            while ((linea = br.readLine()) != null) {//leer el archivo separando por comas
                String vector[] = linea.split("[,]");
                int n = vector.length;
                // Crear una nueva lista de cursos para cada estudiante
                ArrayList<Cursos> listaCur = new ArrayList<>();//abrir cursos
                for (int i = 3; i < n; i += 4) {//recorrer cursos del archivo
                    String codigoCurso = vector[i];
                    String nombreCurso = vector[i + 1];
                    int creditosCurso = Integer.parseInt(vector[i + 2]);
                    float notaCurso = Float.parseFloat(vector[i + 3]);
                    Cursos curso = new Cursos(codigoCurso, nombreCurso, creditosCurso, notaCurso);
                    listaCur.add(curso);//guardar cursos leidos en array
                }
                Estudiante estudiante = new Estudiante(vector[0], vector[1], vector[2], listaCur);//guardar estudiante leido
                listaEst.add(estudiante);//agregar el estudiante a la array de estudiante
            }
            br.close();//cerrar flujo
        }
        return listaEst;//retornar la array 
    }

    public static void limpiar() throws IOException {
        File directorio = new File("."); //path
        File archivo = new File(directorio, "Estudiante.txt");
        // Verifica si el archivo existe antes de intentar limpiarlo
        if (archivo.exists()) {
            try (Writer writer = new FileWriter(archivo, false); // false indica que se sobrescribirá el archivo
                     BufferedWriter bw = new BufferedWriter(writer)) {
            }
        }
    }

    public static boolean verificar() throws IOException {
        File directorio = new File("."); // directorio actual, puedes ajustar la ruta según sea necesario
        File archivo = new File(directorio, "Estudiante.txt");
        return archivo.exists() && archivo.length() > 0;//retorna si existe el archivo y si esta vacio
    }
}
