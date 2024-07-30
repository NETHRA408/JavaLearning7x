package ex_140724;

public class lab12 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 8.97f;
        float y = course+GST;  // explicit type
        System.out.println(y);

        // Implicit
        int course1 = 100;
        float gst = 8.97f;
        int u = course1+ (int)gst;   // money loss
        float u1 = course1+gst;      //o/p : 108 to get with . use this
        System.out.println(u);
        System.out.println(u1);

        char i= 'A';
        int  k = 89;
        int y1 = i+ k;
        System.out.println(y1);

        int r= 8;
        char l = 'A'; //65
        int p =r+l;
        System.out.println(p);
    }
}
