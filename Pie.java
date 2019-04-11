package e.l.circle_1;

public class Pie {

    private String name;
    private float zhi;
    private int color;

    public Pie(String name, float zhi, int color) {
        this.name = name;
        this.zhi = zhi;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pie{" +
                "name='" + name + '\'' +
                ", zhi=" + zhi +
                ", color=" + color +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getZhi() {
        return zhi;
    }

    public void setZhi(float zhi) {
        this.zhi = zhi;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
