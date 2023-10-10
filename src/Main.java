import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();

    }

//    1) Напишите четыре строки: С именем firstName — для хранения имени, middleName  — для хранения отчества,
//       lastName — для хранения фамилии, fullName — для хранения «Фамилия Имя Отчество».
//       Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
    public static void task1() {
        String firstName = "Tatiana";
        String middleName = "Sergeevna";
        String lastName = "Mazay";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);



//        2) Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich
//        на полностью заглавные буквы. В качестве строки с исходными данными используйте строку fullName
//        Результат в формате: «Данные Ф. И. О. сотрудника для заполнения отчета — …».
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }


//    3) Напишите программу, которая заменяет символ «ё» на символ «е». В качестве исходных данных используйте строку
//    fullName — «Иванов Семён Семёнович». Выведите в формате: «Данные Ф. И. О. сотрудника — ...».
    public static void task2() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}