
public class FizzBuzz {
    public String fizzBuzzString(String str) {
        if(str == null) return null;
        String normalizedString = str.toLowerCase();
        if (normalizedString.startsWith("f") && normalizedString.endsWith("b")) return "FizzBuzz";
        if (normalizedString.startsWith("f"))  return "Fizz";
        if (normalizedString.endsWith("b")) return "Buzz";

        return str;
    }
}