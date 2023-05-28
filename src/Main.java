public class Main {
    public static void main(String[] args) {
        //creo un objeto de ferrari
        Ferrari objFerrari1 = new Ferrari("Rojo","Enzo");

        //llamo los metodos con el objeto
        objFerrari1.arrancar();
        objFerrari1.acelerar();
        objFerrari1.frenar();
    }
}