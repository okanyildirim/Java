public class Run {

    public static void main(String[] args){

        System.out.println("Hello World");

        People p1=new People();
        People p2=new People("Okan",22);
        People s1= new Student();
        Student s2= new Student("Yiğit",12);

        System.out.println("People1:"+ "İsim: " +p1.getName()+"Yaş: "+p1.getAge());
        System.out.println("People2:"+ "İsim: " +p2.getName()+"Yaş: "+p2.getAge());
        System.out.println("People3:"+ "İsim: " +s1.getName()+"Yaş: "+s1.getAge());
        System.out.println("People4:"+ "İsim: " +s1.getName()+"Yaş: "+s1.getAge());

        System.out.println("//////////////////////////////////////////////////////");

        p1.setName("Volkan");
        p1.setAge(20);
        s2.setGpa((float)3.5);

        System.out.println("People1:"+ "İsim: " +p1.getName()+"Yaş: "+p1.getAge());
        System.out.println("People2:"+ "İsim: " +p2.getName()+"Yaş: "+p2.getAge());
        System.out.println("People3:"+ "İsim: " +s1.getName()+"Yaş: "+s1.getAge());
        System.out.println("People4:"+ "İsim: " +s1.getName()+"Yaş: "+s1.getAge()+"GPA:"+s2.getGpa());
    }
}
