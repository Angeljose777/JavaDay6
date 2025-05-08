public class AgeValidationTest {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validate(16); // Will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        }

        try {
            validator.validate(21); // Valid case
        } catch (InvalidAgeException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        }
    }
}

