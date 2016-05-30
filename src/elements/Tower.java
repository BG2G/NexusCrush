package elements;

/**
 * Created by Nicolas on 5/30/2016.
 */
public class Tower extends Element {

    public int relative_i;
    public int relative_j;

    public Tower (int rel_i, int rel_j) {

        super.value = -1;

        relative_i = rel_i;
        relative_j = rel_j;
    }

}
