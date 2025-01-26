package datatypes.identifiers;

import java.util.UUID;

public class IdentifierSample {
    public static void main(String[] args) {
        System.out.println("Best datatype for business identifiers are UUID");
        String policyNumber = "61243658";
        UUID businessIdentifier = UUID.randomUUID();
        System.out.println("BusinessId for policy number: "+ policyNumber+" is: "+ businessIdentifier);
    }
}
