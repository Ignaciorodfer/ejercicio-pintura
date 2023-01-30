public class MainPintura {

    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        
        Rectangulo rectangulo = new Rectangulo("rec", 20, 35);
        Esfera esfera = new Esfera("esf", 15);
       Cilindro cilindro= new Cilindro("cil", 10, 30);
        
        System.out.println("Cantidad de pintura necesaria para pintar el " +  rectangulo +  ": " + pintura.cantidadDePinturaNecesaria(rectangulo) + " metros cuadrados");

        System.out.println("Cantidad de pintura necesaria para pintar el " + esfera + ": " + pintura.cantidadDePinturaNecesaria(esfera) + " metros cuadrados");

        System.out.println("Cantidad de pintura necesaria para pintar el " +  cilindro + ": " + pintura.cantidadDePinturaNecesaria(cilindro) + " metros cuadrados");
    }
}