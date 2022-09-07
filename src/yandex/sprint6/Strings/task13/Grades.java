package yandex.sprint6.Strings.task13;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
		// реализуйте метод здесь
        String[] arr = grades.split(";");
        for (String str: arr) {
            String[] student = str.split(",");
            String name = capitalize(student[0]);
            String surname = capitalize(student[1]);
            String subject = student[2].toLowerCase();
            String grade = student[3];
            System.out.println(name + " " + surname + " " + subject + " — " + gradeToString(grade));
        }
    }


}
