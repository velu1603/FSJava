public class PodTest {

    public static void main(String[] args) {
        System.out.println("Hi there");
        sum(10,20);
        diff(100,44);
        multiple(12,34);
        concatanate2Strings("Java", " Practice");

    }
    /*
    * Sum method
    *
    *
    * */
    public static void  sum(int a, int b){
        int c;
        c = a+b;
        System.out.println(c);
    }
    /*
     * diff method
     *
     *
     * */
    public static void  diff(int a, int b){
        int c;
        c = a-b;
        System.out.println(c);
    }

    public static void multiple (int a, int b){
        int c;
        c = a*b;
        System.out.println(c);
    }

    public static void concatanate2Strings(String a, String b){
        String c = a + b;
        System.out.println(c);
    }

}
