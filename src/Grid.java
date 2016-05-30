import elements.Element;
import elements.Type;

/**
 * Created by Nicolas on 5/30/2016.
 */
public class Grid {

    private Element[][] grid;
    private int size;
    private int length;

    public Grid (int size, int length, Type[] types) {

        this.size = size;
        this.length = length;

        grid = new Element[length][size];

        generateGrid(size, length, types);

    }

    private void generateGrid(int size, int length, Type[] types){

    }

    public boolean moveAllowed() {
        return false;
    }

    private void fill(){


        for(int i = length-1; i> length-1 - size; i--) {
            for(int j = 0; j< size; j++) {
                //TODO Check for empty
                if(true) {
                    fillColumn(j);
                }
            }

        }

    }

    private void fillColumn(int j){

    }

}
