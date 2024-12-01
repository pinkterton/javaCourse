package beginner.endsection;

public class EndLevelTask {
    public static void main(String[] args) {
        String nameActor = "Rami Malek";
        int yearBirth = 1981;
        int monthBirth = 5;
        int dayBirth = 12;

        String[] movies = {"Mr.Robot", "Bohemian Rhapsody", "Need for Speed", "Papillon" , "Oppenheimer"};
        float[] ratings = {8.5f, 7.9f, 6.4f, 7.2f, 8.3f};

        System.out.println("Name: " + nameActor);
        final int currentYear = 2024;
        int age = currentYear - yearBirth;
        System.out.println("Age: " + age);

        System.out.print("Movies: ");
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i] + " - " + getRatings(ratings[i]) + ", ");
        }
        System.out.print("...");


    }

    static String getRatings(float ratings) {
            if (ratings <= 5.0f)
                return "bad";
            else if ((ratings > 5.0f) && (ratings < 6.5f))
                return "average";
            else if (ratings > 6.5f && ratings < 7.0f)
                return "good";
            else if (ratings > 7.0f && ratings < 8.0f)
                return "very good";
            else
                return "awesome";
    }

}
