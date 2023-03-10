public class Pet {
    private String tip;
    private String name;
    private String color;

    public Pet(String tip, String name, String color){
        this.tip = tip;
        this.name = name;
        this.color = color;
    }

    public Pet() {
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "tip='" + tip + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

