

public class Ontap1 {


 

    public static int sum(int x, int y) {
        return x + y;
    }

    public static class Student{
        String name;
        int age;
        String id;

        public Student(String name, int age, String id){
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public void display(){
            System.out.println ("Ten: "+ name);
            System.out.println ("Tuoi: "+age);
            System.out.println ("id: "+id);
            System.out.println ("Resolve conflict test success");

    }


    public static String combine(String a , String b){
        return a + b;
    }
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Tham trị
        System.out.println("Tong (tham tri): " + sum(a, b));

        // Tham biến
        int[] arr = {1, 2, 3, 4};
        modifyArray(arr);
        System.out.print("Mang sau khi thay doi (tham bien): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        String str1 = "Ss1 11";
        String str2 = "Ss2 2";
        System.out.println("\nString comb: "+ combine(str1, str2));


        String str = "Hello World";
        char[] charArray = str.toCharArray();

        System.out.println("Các ký tự trong chuỗi:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        Student student = new Student("Phuc", 22, "Soo2123");
        student.display();



    }
}

