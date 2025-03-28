public class alumno {
    String nombre;
    double[] calificaciones;

   
    public alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

   
    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Promedio de calificaciones: " + calcularPromedio());
    }
}