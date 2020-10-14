public class ADataClass {
    private String name;
    private String description;

    public ADataClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return name + ", " + description;
    }
}