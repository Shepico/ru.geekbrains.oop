package lesson5;

public class MainClass {

    public static void main (String[] args) {

        lesson5.Employee[] perEmployee = new lesson5.Employee[5];
        perEmployee = createEmployee(perEmployee);
        for (int i=0; i<perEmployee.length; i++) {
            if (perEmployee[i].getAge()>40) {
                perEmployee[i].getFullInfo();
            }
        }


    }

    public static lesson5.Employee[] createEmployee(lesson5.Employee[] arrEmployee) {
        arrEmployee[0] = new lesson5.Employee("Иванов", "Директор", "1@2.ru", "+79171112222",99900.5f,53);
        arrEmployee[1] = new lesson5.Employee("Петров", "Бухгалтер", "2@2.ru", "+79171113333",79900.0f,43 );
        arrEmployee[2] = new lesson5.Employee("Сидоров", "Технолог", "3@2.ru", "+79171114444",79400.3f,39 );
        arrEmployee[3] = new lesson5.Employee("Игнатов", "Менеджер", "4@2.ru", "+79171115555",59350.0f,33 );
        arrEmployee[4] = new lesson5.Employee("Соловьева", "Уборщица", "5@2.ru", "+79171116666",29000.0f,62 );
        return (arrEmployee);
    }



}
