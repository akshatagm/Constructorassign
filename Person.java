public class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setgender(String gender){
        this.gender=gender;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;


    }

    public String getgender() {
        return gender;
    }



    public void setAge(int age){
        this.age=age;
    }

    void Displayinfo(){
        System.out.println(getname()+" "+getAge()+" "+getgender());
    }
}

