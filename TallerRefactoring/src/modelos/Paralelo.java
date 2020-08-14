package modelos;

import java.util.ArrayList;

public class Paralelo {
    public int numero;
    public Profesor profesor;
    public ArrayList<Estudiante> estudiantes;
    public Estudiante ayudante;
    public String codigoMateria;
    public String nombreMateria;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    //Imprime el listado de estudiantes registrados
    public void mostrarListado(){
        //No es necesario implementar
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(double notaInicial) {
        this.notaInicial = notaInicial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    
    
}
