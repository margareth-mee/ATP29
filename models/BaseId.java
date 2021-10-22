package models;

public class BaseId {
    public String id;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof BaseId) {
            BaseId base = (BaseId) obj;
            return this.id.equals(base.id);
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + this.id;
    }
}
