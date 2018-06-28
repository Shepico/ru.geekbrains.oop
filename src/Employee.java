public class Employee {
    private String fio;
    private String posWork;
    private String email;
    private String fone;
    private float salary;
    private int age;

    public Employee (String fio, String posWork, String email, String fone, float salary, int age) {
        setFio(fio);
        setPosWork(posWork);
        setEmail(email);
        setFone(fone);
        setSalary(salary);
        setAge(age);

    }

    public void getFullInfo (){
        System.out.println (getFio() + " возраст:" + getAge()+ " телефон:"+getFone()+" e-mail:" + getEmail());
        System.out.println("Должность:" + getPosWork() + " Оклад:" + getSalary());
        System.out.println("*****************************************************");

    }

    public String getFio() {
        return fio;
    }

    public String getPosWork() {
        return posWork;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosWork(String posWork) {
        this.posWork = posWork;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        if (age<15 || age>85) {
            System.out.println("!!! Возраст введен не верно. Сотрудник должен быть старше 15 и младше 85 лет");
        } else this.age = age;
    }

}
