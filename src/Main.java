public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(26);
        cliente.setTelefono("2933333434");
        cliente.setCredito(120.20);
        System.out.println("cliente: "+cliente.getNombre()+"\r\n"+"Edad: "+cliente.getEdad()+
                "\r\n"+"Telefono: "+cliente.getTelefono()+"\r\n"+"Credito: "+cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Adolfo");
        trabajador.setEdad(52);
        trabajador.setTelefono("2411987643");
        trabajador.setSalario(1600.50);
        System.out.println("\r\n"+"Trabajador: "+trabajador.getNombre()+"\r\n"+"Edad: "+trabajador.getEdad()+
                "\r\n"+"Telefono: "+trabajador.getTelefono()+"\r\n"+"Salario: "+trabajador.getSalario());
    }
}
class Persona{
    String nombre;
    int edad;
    String telefono;
    public void setNombre (String nombre){
        this.nombre= nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setTelefono (String telefono){
        this.telefono= telefono;
    }
    public String getTelefono (){
        return this.telefono;
    }
}
class Cliente extends Persona{
    double credito;
    public void setCredito (double credito){
        this.credito = credito;
    }
    public double getCredito (){
        return this.credito;
    }
}
class Trabajador extends Persona{
    double salario;
    public void setSalario (double salario){
        this.salario = salario;
    }
    public double getSalario (){
        return this.salario;
    }
}