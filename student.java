public class student  {
    String name;
    int id;
    String  major;
    String  EMAIL;

     public student(String na, int i, String m, String e) {
        this.name = na;
        this.id = i;
        this.major = m;
        this.EMAIL = e;
    }
    public void  display    () {
     System.out.println("student Name: " + name);
     System.out.println("student ID: " + id);
     System.out.println("student Major: " + major);
     System.out.println("student EMAIL: " + EMAIL);
          System.out.println("-----------------------------" );
    }
}
class Main {
    public static void main(String[] args) {
      
student s1 = new student("ahmed ", 2026001, "computer engineering","ahmed@example.com");
student s2 = new student("sara  ", 2026002, "cyber security","sara@example.com");

        s1.display();
        s2.display();
       }   }
