
class  quest1_b {
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args) {

         quest1_b s1 = new quest1_b();
         quest1_b s2 = new  quest1_b();

        s1.name = "Sam";
        s1.roll_no = 1;
        s1.phone_no = "9876543210";
        s1.address = "Mumbai";

        s2.name = "John";
        s2.roll_no = 2;
        s2.phone_no = "9876501234";
        s2.address = "Pune";

        System.out.println(s1.name + " " + s1.roll_no + " " +
                           s1.phone_no + " " + s1.address);

        System.out.println(s2.name + " " + s2.roll_no + " " +
                           s2.phone_no + " " + s2.address);
    }
}
