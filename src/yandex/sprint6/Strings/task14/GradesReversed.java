package yandex.sprint6.Strings.task14;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> list = new ArrayList<>();
        for (String student: grades) {
            String[] arr = student.split(" ");
            String[] arrNoDash = {
                    arr[0].toLowerCase(), arr[1].toLowerCase(), arr[2].toLowerCase(), gradeStringToInt(arr[4])};
            String str = String.join(",", arrNoDash);
            list.add(str);
        }
        return String.join(";", list);
    }

}