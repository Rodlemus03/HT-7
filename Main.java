public class Main {
    public static void main(String[] args) {
        Traductor p1 = new Traductor(11, "casa", "house", "loger");
        Traductor p2 = new Traductor(23, "perro", "dog", "chien");
        Traductor p3 = new Traductor(25, "mujer", "woman", "femme");

        TOW tow = new TOW();
        System.out.println("Esta vacio: " + tow.esVacio() + "- Es hoja:" + tow.esHoja());
        tow.insertar(p1);
        System.out.println("Esta vacio: " + tow.esVacio() + "- Es hoja:" + tow.esHoja());
        tow.insertar(p3);
    }
}