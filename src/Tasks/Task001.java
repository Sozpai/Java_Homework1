package Tasks;

public class Task001 {
    public static void main(String[] args) {
       //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        String result = ShowTotalAmount(3);
        System.out.println(result);

    }
    public static String ShowTotalAmount(int value)
    {
        return (value * (value + 1) / 2) + "";
    }
}
