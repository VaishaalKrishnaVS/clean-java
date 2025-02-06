package classes.staticfactory;

import java.time.LocalDate;
import java.util.Map;

/**
 * This class demonstrates good and bad practices for object creation using
 * constructors vs static factory methods.
 *
 * Classic constructor approach shown in PersonClassicApproach:
 * - Uses traditional constructors for object creation
 * - Constructor names are fixed and less descriptive
 * - Multiple constructors with different parameters can be confusing
 * - Each constructor creates a new instance
 * 
 * Static factory method approach shown in PersonStaticFactoryMethod:
 * - Uses static factory methods for object creation
 * - Method names can be descriptive and indicate purpose
 * - Can control instance creation (caching, pooling etc)
 * - Can return different subtypes based on parameters
 * - Can return pre-constructed instances
 * 
 * Benefits of static factory methods:
 * 1. Better naming - methods can have descriptive names unlike constructors
 * 2. Not required to create new object each time - can cache/reuse instances
 * 3. Can return any subtype of return type
 * 4. Can encapsulate complex object creation logic
 * 5. Reduces verbosity of creating parameterized type instances
 *
 * Common naming conventions for static factory methods:
 * - from() - Type conversion
 * - of() - Aggregation
 * - valueOf() - Alternative to constructor
 * - getInstance() - Returns instance, possibly shared
 * - newInstance() - Returns new instance each time
 * - getType() - Like getInstance() but for different type
 * - newType() - Like newInstance() but for different type
 */

public class StaticFactoryMethodSample {
    public static void main(String[] args) {
        System.out.println("Show Classic Approach");
        showClassicApproach();

        System.out.println("Show Static Factory Method Approach");
        showStaticFactoryMethodApproach();
    }

    private static void showClassicApproach() {
        PersonClassicApproach person = new PersonClassicApproach("John", LocalDate.of(1990, 1, 1));
        System.out.println(person);
    }

    private static void showStaticFactoryMethodApproach() {
        PersonStaticFactoryMethod person = PersonStaticFactoryMethod.of("John", LocalDate.of(1990, 1, 1));
        System.out.println(person);

        // other inbuild classes that use static factory methods:
        // - java.util.EnumSet
        // - java.util.Collections
        // - java.util.Calendar
        // - java.util.Properties
        // - java.util.ResourceBundle
        Integer.valueOf(1);
        Map.of("key", "value");

    }

}
