public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("\nTask 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Task 3
        System.out.println("\nTask 3");
        String fullName2 = "Иванов Семён Семёнович";
        if (fullName2.contains("ё") || fullName2.contains("Ё")) {
            fullName2 = fullName2.replace('ё','е');
            fullName2 = fullName2.replace('Ё','Е');
        }
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);
    }
}