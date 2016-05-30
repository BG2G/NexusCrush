package elements;

/**
 * Created by Nicolas on 5/30/2016.
 */
public class Nexus extends Element {



    public int relative_i;
    public int relative_j;

    public Nexus (int rel_i, int rel_j) {
        super.value = -2;
        relative_i = rel_i;
        relative_j = rel_j;
    }
}
