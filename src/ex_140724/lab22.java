package ex_140724;

public class lab22 {
    public static void main(String[] args){
//
//       conditional operator --- called as Ternary
//          boolean exp ? exp1 : exp2 (exp1 if bool exp is TRUE and vice versa )
//         Operand1 must be of boolean type.

        int a = ((30>40) ? 10 : 20) ; //TRUE : FALSE
        System.out.println(a);

        String str= (100>20) ? "ONE" : "TWO";
        System.out.println(str);
    }
}
