public class Persona {
    String nombre;
    String deporte;
    int edad;
 
    public Persona(String nombre, int edad) {
       this.nombre = nombre;
       this.edad = edad;
    }
 
    public void saludar() {
       System.out.println("Hola , mi nombre es" + this.nombre + ", y tengo " + this.edad + " años.");
    }
 
    public void setDeporte(String deporte) {
       this.deporte = deporte;
    }
 
    public void mostrarDeporte() {
       System.out.println("El deporte que practico es " + this.deporte + ".");
    }
 
    public void cumpleAnos() {
       ++this.edad;
       System.out.println("¡Feliz cumpleaños! Ahora tengo " + this.edad + " años.");
    }
 
    public static void main(String[] args) {
       Persona persona1 = new Persona((String)null, 20);
       persona1.saludar();
       persona1.setDeporte("fútbol");
       persona1.cumpleAnos();
    }
 }
 