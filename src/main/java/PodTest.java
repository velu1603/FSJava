public class PodTest {

    public static void main(String[] args) {
        System.out.println("Hi there");
        sum(10,20);
        diff(100,44);
        multiple(12,34);
        concatanate2Strings("Java", " Practice");
        System.out.println(addWithReturn(90,78));
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

    public static int addWithReturn(int a, int b){
        return a + b;
    }

}
