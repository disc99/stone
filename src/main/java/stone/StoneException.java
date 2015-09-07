package stone;

public class StoneException extends RuntimeException {

    public StoneException(String m) {
        super(m);
    }

    // TODO
//    public StoneException(String m, ASTree t) {
//        super(m + " " + t.location());
//    }
}