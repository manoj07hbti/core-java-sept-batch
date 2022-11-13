package modal;

import java.util.Objects;

public class Restaurant {

    String name;
    String location;
    String type;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id && name.equals(that.name) && location.equals(that.location) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type, id);
    }

    public Restaurant(String name, String location, String type, int id) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
