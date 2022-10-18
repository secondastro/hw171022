import java.time.Year;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    private String job;

    public Human(String name, String town, int age, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = Year.now().getValue() - age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
