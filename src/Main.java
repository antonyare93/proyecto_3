public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.setEdad(29);
        persona1.setNombre("Antony");
        persona1.setTelefono("1234567890");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Teléfono: " + persona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}