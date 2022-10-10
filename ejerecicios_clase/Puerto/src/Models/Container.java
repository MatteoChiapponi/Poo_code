package Models;

public class Container implements Comparable<Container>{
    private Integer id;
    private String originCountry;
    private Boolean dangerousLoad;

    public Container(Integer id, String originCountry, Boolean dangerousLoad) {
        this.id = id;
        this.originCountry = originCountry;
        this.dangerousLoad = dangerousLoad;
    }

    @Override
    public int compareTo(Container o) {return id.compareTo(o.id);}

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", originCountry='" + originCountry + '\'' +
                ", dangerousLoad=" + dangerousLoad +
                '}';
    }

    public Boolean getDangerousLoad() {
        return dangerousLoad;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
