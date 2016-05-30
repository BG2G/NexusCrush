package elements;

/**
 * Created by Nicolas on 5/30/2016.
 */
public enum Type {

    Tower(-2),
    Nexus(-1),
    Empty(0),
    Yasuo(1),
    Malphite(2),
    Braum(3),
    Ezreal(4),
    LeeSin(5);


    int value;
    Type(int i) {
        value = i;
    }
}
