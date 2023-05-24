public class Automovil {
    private String color;
    private String modelo;
    public Automovil(){

    }
    public Automovil(String color, String modelo){
        this.color = color;
        this.modelo = modelo;
    } // constructor de objetos

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
