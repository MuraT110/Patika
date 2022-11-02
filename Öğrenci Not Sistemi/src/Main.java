public class Main {
    public static void main(String[] args) {
        Course mat=new Course("matematik","mat101","mat");
        Course fizik=new Course("fizik","fizik101","fzk");
        Course kimya=new Course("kimya","kimya101","KMY");

        Teacher t1=new Teacher("İLYAS HOCA","09201154","MAT");
        Teacher t2=new Teacher("NESLİHAN HOCA","0914452154","FZK");
        Teacher t3=new Teacher("MURAT HOCA","05312054","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4 , "140744015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkVerbalNote(80, 40, 25);
        s1.isPass();

        Student S2 = new Student("Güduk Necmi", 4, "24621145", mat, fizik, kimya);
        S2.addBulkExamNote(100,50,40);
        S2.addBulkVerbalNote(90, 60, 80);
        S2.isPass();

        Student S3=new Student("Hayta İsmail",4,"34521211",mat,fizik,kimya);
        S3.addBulkExamNote(50,80,30);
        S3.addBulkVerbalNote(60,100,50);



















    }

}
