package domain;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersioUID = 1111L;

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "user {"+name+","+id+"}";
    }

}
