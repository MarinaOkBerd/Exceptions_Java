import java.util.Scanner;

public class HW2_Task_1 {
  /*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
   вместо этого, необходимо повторно запросить у пользователя ввод данных.
   */ 
  public static void main(String[] args){
    defineNumber();
  } 
  private static void defineNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите дробное число: ");
    String resultNumber;
    try{
        resultNumber = scanner.nextLine();
        Float.parseFloat(resultNumber);
        System.out.println("Ваше число " + resultNumber);
    } catch(Exception e){
        System.err.println("Вы ввели не дробное число. Попробуйте ввести другое число!");
        defineNumber();
    }
  }
}
