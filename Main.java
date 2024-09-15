public class Main {

    public static void main(String[] args) {
        Person p=new Person("Akshata",25,"female");
        System.out.println(p.getname()+" "+p.getAge()+" "+p.getgender());
        p.setAge(30);
        System.out.println();
        p.Displayinfo();

        Person p2=new Person("ABC",32);
        p2.setgender("NA");
        p2.Displayinfo();




    }
}
