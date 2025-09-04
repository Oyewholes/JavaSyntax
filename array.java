public class array {
    public static void main(String[] args) {
        String[] friends = {"Kevin", "Karen", "Oscar", "Jim"};
        friends[0] = "Dwight";
        System.out.println(friends[0]);
        System.out.println(friends.length);
        System.out.println(java.util.Arrays.toString(friends));
    }   
}