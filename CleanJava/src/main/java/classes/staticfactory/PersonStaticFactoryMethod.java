package classes.staticfactory;

import java.time.LocalDate;

public class PersonStaticFactoryMethod {
    private String name;
    private LocalDate birthDate;

    private PersonStaticFactoryMethod(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public static PersonStaticFactoryMethod of(String name, LocalDate birthDate) {
        return new PersonStaticFactoryMethod(name, birthDate);
    }

    public static PersonStaticFactoryMethod of(String name) {
        return new PersonStaticFactoryMethod(name, LocalDate.now());
    }

    @Override
    public String toString() {
        return "PersonStaticFactoryMethod{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
