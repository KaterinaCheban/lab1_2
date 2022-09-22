/* ad211.cheban */
public class Main {
    public static void main(String[] args) {
        for (int i=1; i<101; i++){  /* створюємо цикл для виведення значенб */
            if (i % 3 == 0 && i % 5 != 0){ /* шукаємо числа краті 3 та виводимо "Fizz" */
                System.out.print("Fizz\n");
            }
            else if (i % 5 == 0 && i % 3 != 0){ /* шукаємо числа краті 5 та виводимо "Buzz" */
                System.out.print("Buzz\n");
            }
            else if (i % 3 == 0 && i % 5 == 0) { /* шукаємо числа краті і 3, і 5 та виводимо "FizzBuzz" */
                System.out.print("FizzBuzz\n");
            }
            else  { /* виводимо всі інші числа */
                System.out.print(i+" \n");
            }
        }
    }
}