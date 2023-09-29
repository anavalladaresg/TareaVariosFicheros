public class Main {

    public static void main(String[] args) {
        //LLamada a las otras clases
        Suma s = new Suma();
        Resta r = new Resta();

        //LLamada a los métodos de las otras clases
        s.suma();
        r.resta();
        s.multiplicar();
        r.dividir();
    }

}