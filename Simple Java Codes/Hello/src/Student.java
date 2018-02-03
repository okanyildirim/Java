public class Student extends People {

    private float gpa;

    Student(){
        super();
    }
    Student(String name,int age){
        super(name,age);
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

}
