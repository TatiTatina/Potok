import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Наша","Таня","громко","плачет,","уронила","в","речку","мяч"));
        Stream<String> stream = list.stream();
        System.out.println(getStringFromStream(stream));
    }
    public static String getStringFromStream(Stream stringStream){
        return stringStream.collect(Collectors.joining(" ")).toString();
    }
}
