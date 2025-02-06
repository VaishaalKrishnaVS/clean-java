package classes.staticfactory;

import java.time.LocalDate;

public class PersonClassicApproach {
    private String name;
    private LocalDate birthDate;

    public PersonClassicApproach(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public PersonClassicApproach(String name) {
        this(name, LocalDate.now());
    }

    @Override
    public String toString() {
        return "PersonClassicApproach{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
