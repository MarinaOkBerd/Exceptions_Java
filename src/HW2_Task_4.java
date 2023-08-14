import java.util.Scanner;

public class HW2_Task_4 {
    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     *  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args){
        defineEmptyString();
    }

    private static void defineEmptyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст: ");
        String string = scanner.nextLine();
        if (string.equals("")){
            System.out.println("Пустые строки вводить нельзя!");
        }else{
            System.out.println("Ввод текста верный!");
        }
    }


}
