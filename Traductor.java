public class Traductor implements Comparable<Traductor> {

    private int id;
    private String ingles;
    private String espanol;
    private String frances;

    public Traductor(int id, String ingles, String espanol, String frances) {

    }


    @Override
    public int compareTo(Traductor word) {
        if ( id == word.id){
            return 0;
        } else if (id < word.id) {
            return -1;
        }
        return 1;
    }
}
