import java.util.*;

public class UsernameAvailabilityChecker {

    public static void main(String[] args) {

        HashMap<String, Integer> usernames = new HashMap<>();

        usernames.put("john_doe", 1);
        usernames.put("alice123", 2);
        usernames.put("wick", 3);

        String newUsername = "john_doe";

        if(usernames.containsKey(newUsername)) {

            System.out.println("Username already taken");

            List<String> suggestions = new ArrayList<>();

            suggestions.add(newUsername + "1");
            suggestions.add(newUsername + "2025");
            suggestions.add("official_" + newUsername);

            System.out.println("Suggestions: " + suggestions);
        }
        else {
            System.out.println("Username available");
        }
    }
}