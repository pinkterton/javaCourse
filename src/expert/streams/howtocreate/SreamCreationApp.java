package expert.streams.howtocreate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SreamCreationApp {
    public static void main(String[] args) {
        List<String> musicStyles = List.of("Rock", "Trance", "Pop", "Blues", "Classical music");
        musicStyles.stream()
                .sorted()
                .forEach(musicStyle -> System.out.println(musicStyles + "Extra text"));

        System.out.println(Stream.of("Rock", "Trance", "Pop", "Blues", "Classical music")
                .collect(Collectors.toList()));

        System.out.println("The number of elements in the array: " +
                Arrays.stream(new double[] {3.6, 6.7, 1.4, 5.5}).count());

        IntStream.range(0, musicStyles.size()).forEach(number -> System.out.println((number + 1)+ ". " + musicStyles.get(number)));



    }
}
