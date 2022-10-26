public class Flower {
    private String name;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String country, double cost,int lifeSpan) {
        if (name.equals("") || name == null) {
            this.name = "Ромашка";
        } else {
            this.name = name;
        }

        if (country == "" || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost>=0){
            this.cost = cost;
        } else {
            this.cost = 1.00;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cost='" + String.format("%,2f",cost) + '\'' +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
