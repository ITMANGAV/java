import java.util.ArrayList;
import java.util.List;

public class cw1 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<String>();
        planets.add("Юпитер");
        planets.add("Сатурн");

        String[] SunSystem = new String[] { "Меркурий", "Венера", "Земля", "Марс" };

        for (int i = 0; i < 15; i++) {
            planets.add(SunSystem[(int) (Math.random() * 3)]);
        }
        for (String string : planets) {
            System.out.println(string);
        }

        System.out.println(countplanets(planets, "Земля"));
    }

    public static int countplanets(List<String> planets, String planetName) {
        int count = 0;
        for (String i : planets) {
            if (i.equals(planetName)) {
                count++;
            }
        }
        return count;
    }
}
