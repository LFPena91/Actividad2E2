public class Automovil {
    //Creamos los atributos
    private String color;
    private String modelo;

    //constructor vacio
    public Automovil(){
    }
    //constructor con los atributos
    public Automovil(String color, String modelo){
        this.color = color;
        this.modelo = modelo;
    } // constructor de objetos

    //metodos
    public void arrancar(){
        System.out.println("Auto encendido....");
    }
    public void acelerar(){
        System.out.println("Auto acelerando....");
    }
    public void frenar(){
        System.out.println("Auto frenando....");
    }


}
