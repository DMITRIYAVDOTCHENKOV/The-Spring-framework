//Урок 1. Системы сборки Maven и Gradle для разработки Java приложений
//Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
//Задание:
//        1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
//        2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
//        3. Создайте класс Person с полями firstName, lastName и age.
//        4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
//5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       Person person1 = new Person("Иванов","Иван",93);

       Gson gson = new Gson();
// Сериализация объекта — преобразование объекта 'Person' в строку JSON
       String jsonString = gson.toJson(person1);

        System.out.println("Преобразование объекта Person в строку JSON:\n" + jsonString);

// Десериализовать объект — преобразовать строку JSON обратно в объект 'Person'
        Person person = gson.fromJson(jsonString, Person.class);

        System.out.println("\nПреобразование строки JSON в объект Person:\n"
                + person.toString());

    }
}
