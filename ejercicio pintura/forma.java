public class forma {
  private String nombre;

  
public forma(String nombre){
    this.nombre=nombre;
}

    public double area() {
        return 0;
    }

    public String toString() {
        return "Nombre de la forma: " + nombre;
    }

  }
     class Esfera extends forma {
        private double radio;
        public Esfera(String nombre, double radio) {
            super(nombre);
            this.radio = radio;
        }

        public double getArea() {
            return 4*Math.PI*radio*radio;
        }
        public String toString(){
            return "radio" + radio;
        }
    }

    
    class Rectangulo extends forma {
        private double Largo;
        private double Ancho;
        public Rectangulo(String nombre, double Largo, double Ancho) { 
            super(nombre);
            this.Largo = Largo;
            this.Ancho = Ancho;
        }
        public double getArea() {
            return Largo*Ancho;
        }
        public String toString(){
            return "Largo" + Largo + "Ancho" + Ancho;
        }
    }

    class Cilindro extends forma {
        private double altura;
        private double radio;

        public Cilindro(String nombre, double altura, double radio) {
            super(nombre);
            this.radio = radio;
            this.altura = altura;

        }
        public double getArea() {
            return Math.PI*radio*radio*altura;
        }

        
        public String toString(){
            return "altura" + altura + "radio" + radio;
        }

    }

     class Pintura {
        private double cobertura;
        public Pintura(double cobertura) {
            this.cobertura = cobertura;
        }
        public double cantidadDePinturaNecesaria(forma formas) {
            return formas.area()/cobertura;
        }
    }
  
