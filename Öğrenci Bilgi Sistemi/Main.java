public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Pisagor", "111", "MAT");
        Teacher t2 = new Teacher("Einstein", "222", "FZK");
        Teacher t3 = new Teacher("Marie Curie", "333", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Olcay Alıcı", 4, "123", mat, fizik, kimya);
        s1.addBulkExamNote(100,85,65);
        s1.isPass();

        Student s2 = new Student("Uğur Kaan", 4, "321", mat, fizik, kimya);
        s2.addBulkExamNote(80,90,100);
        s2.isPass();

        Student s3 = new Student("MırMır Mıroğlu", 4, "456", mat, fizik, kimya);
        s3.addBulkExamNote(40,90,70);
        s3.isPass();


    }
}
