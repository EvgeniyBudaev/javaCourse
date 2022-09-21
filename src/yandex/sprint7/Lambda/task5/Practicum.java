package yandex.sprint7.Lambda.task5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class University {
    private Consumer<String> onGraduate;
    private Predicate<String> examsFreeTester;
    private Supplier<Boolean> openTester;
    private Function<String, Integer> studentToGroup;

    public void setOnGraduate(Consumer<String> onGraduate) {
        this.onGraduate = onGraduate;
    }

    public void graduate(String student) {
        System.out.println("Студент(ка) " + student + " успешно окончил(а) университет.");
        if (onGraduate != null) {
            onGraduate.accept(student);
        }
    }

    public void setExamsFreeTester(Predicate<String> examsFreeTester) {
        this.examsFreeTester = examsFreeTester;
    }

    public boolean tryWithoutExams(String candidate) {
        if (examsFreeTester == null) {
            return false;
        }
        if (examsFreeTester.test(candidate)) {
            System.out.println("Абитуриент " + candidate + " поступает без экзаменов! :)");
            return true;
        } else {
            System.out.println("Абитуриент " + candidate + " не может поступить без экзаменов. :(");
            return false;
        }
    }

    public void setOpenTester(Supplier<Boolean> openTester) {
        this.openTester = openTester;
    }

    public boolean isUniOpen() {
        if (openTester == null) {
            return false;
        }
        if (openTester.get()) {
            System.out.println("Здание университета открыто для посещения.");
            return true;
        } else {
            System.out.println("Здание университета закрыто для посещения.");
            return false;
        }
    }

    public void setStudentToGroup(Function<String, Integer> studentToGroup) {
        this.studentToGroup = studentToGroup;
    }

    public void printStudentGroup(String student) {
        if (studentToGroup == null) {
            System.out.println("Группы в университете ещё не созданы.");
            return;
        }
        System.out.println("Студенту " + student
                + " следует пройти в аудиторию для занятий у группы №"
                + studentToGroup.apply(student));
    }
}

public class Practicum {

    public static void main(String[] args) {
        List<String> graduatesClub = new ArrayList<>();

        Set<String> contestWinners = new HashSet<>();
        contestWinners.add("Иван Петров");
        contestWinners.add("Пётр Иванов");

        Set<String> covidStudents = new HashSet<>();

        University uni = new University();
        uni.setOnGraduate(graduatesClub::add);
        uni.setExamsFreeTester(contestWinners::contains);
        uni.setOpenTester(covidStudents::isEmpty);
        uni.setStudentToGroup(String::length);

        System.out.println("Открыт ли универсистет? ");
        uni.isUniOpen();

        String student = "Яна Практикумова";
        System.out.println("Может ли " + student + " поступить без экзаменов?");
        uni.tryWithoutExams(student);

        uni.printStudentGroup(student);

        uni.graduate(student);
    }
}
