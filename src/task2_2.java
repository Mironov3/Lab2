import java.util.Scanner;
public class task2_2 {
    public static String str = "";
    public static Scanner sc;
    public static String decToBin(int n){
        if(n/2!=0){
            decToBin(n/2);
        }
        str = str.concat(Integer.toString(n%2));
        return str;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}
class task2_3 {
    public static Scanner sc;
    public static int[] arr;
    public static void fillArr(int i){
        if(i < arr.length){
            System.out.println("Введите " + (i+1) + " элемент");
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }
    public static void printArr(int i){
        if(i < arr.length){
            System.out.println(arr[i]);
            printArr(++i);
        }
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        arr = new int[5];
        fillArr(0);
        printArr(0);
    }
}

class task2_4_1 {
    static double eps = 0.0000001;

    public static double f(double x) {
        return (Math.pow(x, 3) + 2 * Math.pow(x, 2) - 5 * x - 6);
    }

    public static void divideTwo(double a, double b) {
        double x = (a + b) / 2;
        //-3 -1 2
        System.out.println(x);
        if (Math.abs(a - b) > eps) {
            if (f(a) * f(x) < 0) {
                b = x;
            } else {
                a = x;
            }
            divideTwo(a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        divideTwo(a, b);
    }
}
class taskSecond {
    public static void m(int x){
        System.out.println("x="+x);
        if ((2*x+1) < 20){
            m(2*x+1);
        }
    }
    public static void main(String[] args){
        m(1);
    }
}
class taskSecond2 {
    public static void m(int x) {
        if ( (2*x+1) <20) {
            m(2*x+1);
        }
        System.out.println("x="+x);
    }
    public static void main(String[] args) {
        m(1);
    }
}
class taskSecond3 {
    private static int step=0;
    public static void m(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1) <20) {
            m(2*x+1);
        }
        step--;
        space();
        System.out.println(""+x+ "<-");
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        m(1);
    }
}
class taskSecond4 {
    public static int fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=fact(n-1)*n;
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.print(fact(5));
    }

}
class taskSecond5 {
    public static int f(int n){
        if (n==0){
            return 0;
        }else
        if (n==1){
            return 1;
        } else {
            return f(n-2)+f(n-1);
        }
    }
    public static void main(String[] args) {
        int a = f(20);
        System.out.print(a);
    }
}