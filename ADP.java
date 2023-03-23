public interface ADP <T extends Comparable>{
    void insertar (T word);

    boolean existe(String id);
    T obtener(String id);

    boolean esHoja();

    boolean esVacio();

    void preorden();

    void inorden();

    void postorden();

    void eliminar(String id);
}
