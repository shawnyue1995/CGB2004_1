package day02;

import java.util.Objects;

/**
 * ����˽������:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * ����ȫ����(�ù��췽���Ĳ�������������������)���췽����Ĭ�Ϲ��췽��
 * ��дtoString�����������ַ�����ʽ��:"����,25,��,5000"
 * ��дequals������Ҫ��������ͬ����Ϊ����һ�¡�
 * @author Admin
 *
 */
public class Person {
    public static void main(String[] args) {
        person p=new person("����",25,"��",5000);
        System.out.println(p);
        person p2=new person("����",26,"Ů",6000);
        System.out.println(p.equals(p2));
    }


}
class person{
    private String name;
    private int age;
    private String gender;
    private int salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }


    public  person(){
    }
    public person(String name,int age,String gender,int salary){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

