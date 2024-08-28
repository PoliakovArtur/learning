package lesson_3_oop.model;

public class Main2 {
    public static void main(String[] args) {
        User user = new User();
        User.name = "abc";

        String str = "abc";

        String str2 = str.substring(1);

        System.out.println(str2);
        System.out.println(str);
        User user2 = new User();
        User user3 = new User();

        user2.email = "abc";

        String email = user2.email;

        user2.email = "bce";
        System.out.println(email);
        System.out.println(user2.email);

        User petya = new User("Petya");
        User vasya = new User("Vasya");
        User katya = new User("Katya");
        petya.friend = vasya;
        katya.friend = petya;

        User petyaFriend = petya.friend;
        petya.friend = katya;

        System.out.println(petyaFriend.fullName);
        petya.printFriend();


        //тип[] имя = new тип[размер];
        int[] arr = new int[100000];
        int[] arr2 = new int[]{2,3,3,3,3,2,2};

        int[][] arr3 = new int[3][];

        for(int i = 0; i < arr3.length; i++) {
            int[] innerArray = arr3[i];
            System.out.println(innerArray);
        }

        System.out.println(arr.length);
    }
}
