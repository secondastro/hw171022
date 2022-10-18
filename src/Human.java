import java.time.Year;
import java.util.Objects;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    private String job;

    public Human(String name, String town, int age, String job) {
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
        this.yearOfBirth = Year.now().getValue() - age;
        if (this.yearOfBirth < 0) {
            throw new IllegalArgumentException("Год рождения не может быть отрицательным");
        }
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
