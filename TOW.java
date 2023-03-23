public class TOW implements ADP<Traductor> {

    private Traductor valor;
    private TOW izdo, dcho;

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && dcho ==null;
    }

    @Override
    public void insertar(Traductor word) {
        if (valor == null){
            this.valor = word;
        } else {
            if (word.compareTo(valor) < 0){
                if (izdo == null) izdo = new TOW();
                izdo.insertar(word);
            } else if (word.compareTo(valor) > 0) {
                if (dcho == null) dcho = new TOW();
                dcho.insertar(word);
            }  else {
                System.out.println("Imposible insertar este valor duplicado");
            }
        }
    }

    @Override
    public boolean existe(String id) {
        if (valor != null){
            if (id == valor.getId()){
                return true;
            } else if (id < valor.getId()) {
                return izdo.existe(id);
            }else{
                return dcho.existe(id);
            }
        } else {
            return false;
        }
    }

    @Override
    public Traductor obtener(String id) {
        if (valor != null){
            if (id == valor.getId()){
                return valor;
            } else if (id < valor.getId()) {
                return izdo.existe(id);
            }else{
                return dcho.existe(id);
            }
        } else {
            return null;
        }
    }

    @Override
    public void preorden() {

    }

    @Override
    public void inorden() {

    }

    @Override
    public void postorden() {

    }

    @Override
    public void eliminar(String id) {

    }
}
