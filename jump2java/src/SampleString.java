public class SampleString {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        if (a.equals(b)) {
            System.out.println("와 신기하다");
        } else {
            System.out.println("정말 신기하다");
        }
        a = "Hello Java";
        System.out.println(a.indexOf("Java"));

        System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
        System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력

    }
}
