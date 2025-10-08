//лаба 2
// задача 2
import java.util.Scanner;
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 1.0;
//        double a = 2.0;
//        double b = 0.5;
//        double y;
//        if (x > 0) {
//            y = a + (0.5) * Math.exp(-x);  //Math.exp(-x) вычисляет e^(-x)
//        }
//        else {
//            y = Math.cos(b * x + 1);
//        }
//        System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//    }
//}
//задача 5
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 0.5;
//        double a = 2.0;
//        double b = 3.0;
//        double y;
//        if (x <= 1) {
//            double sinX = Math.sin(x);
//            y = a * sinX * sinX + Math.sqrt(x);
//        } else {
//            double xSquared = x * x;
//            y = b * Math.exp(xSquared);
//        }
//        System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//    }
//}
//задача 7
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 4.0;
//        double a = 0.5;
//        double b = 1.0;
//        double y;
//        if (x > 3) {
//            y = (a + x) * Math.atan(a * x);
//        } else {
//            double xCubed = x * x * x;
//            double cosValue = Math.cos(b + xCubed);
//            y = cosValue * cosValue;
//        }
//        System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//    }
//}
//задача 9
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 3.0;
//        double a = 4.0;
//        double b = 0.5;
//        double y;
//        if (x >= 2) {
//            double sqrtAx = Math.sqrt(a * x);
//            y = Math.sqrt(1 + x * sqrtAx);
//        } else {
//            y = a * Math.sin(b * x) + 3;
//        }
//        System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//    }
//}
//задача 12
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 0.5;
//        double a = 2.0;
//        double b = 3.0;
//        double y;
//        if (x <= 1) {
//            double xSquared = x * x;
//            y = 2 * xSquared + a * Math.cos(b * x);
//        } else {
//            double xCubed = x * x * x;
//            if (Math.cos(xCubed) != 0) {
//                y = Math.exp(x) + Math.tan(xCubed);
//            } else {
//                System.out.println("Ошибка: Тангенс не определен (cos(x^3) = 0)");
//                y = Double.NaN;
//            }
//        }
//        if (Double.isNaN(y)) {
//            System.out.println("Результат не может быть вычислен");
//        } else {
//            System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//        }
//    }
//}
//задача 15
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        double x = 3.0;
//        double a = 2.0;
//        double b = 1.0;
//        double y;
//        if (x < 2) {
//            double aSquared = a * a;
//            y = Math.sin(x + aSquared);
//        } else {
//            double argument = x * x + 2 * x + b;
//            if (argument > 0) {
//                y = Math.log(argument);
//            } else {
//                y = Double.NaN;
//            }
//        }
//        if (!Double.isNaN(y)) {
//            System.out.printf("При x = %.2f, y = %.5f%n", x, y);
//        }
//    }
//}
// лаба 3
// номер 9
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(java.util.Locale.US);
//
//        System.out.print("Введите значение x (-1 <= x < 1): ");
//        double x = scanner.nextDouble();
//
//        if (x < -1 || x >= 1) {
//            System.out.println("Ошибка: x должно быть в диапазоне [-1, 1)");
//            return;
//        }
//
//        System.out.print("Введите точность (например, 1e-8): ");
//        double epsilon = scanner.nextDouble();
//
//        double sum = 0.0;
//        int n = 1;
//        double term;
//
//        do {
//            // Вычисляем гармоническую сумму H_n = 1 + 1/2 + ... + 1/n
//            double harmonicSum = 0.0;
//            for (int i = 1; i <= n; i++) {
//                harmonicSum += 1.0 / i;
//            }
//
//            // Вычисляем a_n = H_n * x^(n+1) / (n+1)
//            double xPower = Math.pow(x, n + 1);
//            term = harmonicSum * xPower / (n + 1);
//
//            sum += term;
//            n++;
//
//        } while (Math.abs(term) > epsilon);
//
//        // Умножаем на 2 по условию задачи
//        sum *= 2;
//
//        System.out.printf("Сумма ряда S = %.10f\n", sum);
//        System.out.printf("Количество членов ряда: %d\n", n - 1);
//    }
//}
//номер 11
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(java.util.Locale.US); // Для ввода чисел с точкой
//
//        double x;
//        while (true) {
//            System.out.print("Введите значение x (-1 < x < 1): ");
//            try {
//                x = scanner.nextDouble();
//                if (x > -1 && x < 1) break;
//                else System.out.println("Ошибка: x должно быть в интервале (-1, 1).");
//            } catch (Exception e) {
//                System.out.println("Ошибка ввода. Введите число с точкой (например, 0.5).");
//                scanner.next(); // очистить буфер
//            }
//        }
//
//        double epsilon;
//        while (true) {
//            System.out.print("Введите точность (например, 1e-8): ");
//            try {
//                epsilon = scanner.nextDouble();
//                if (epsilon > 0) break;
//                else System.out.println("Точность должна быть положительной.");
//            } catch (Exception e) {
//                System.out.println("Ошибка ввода. Введите число (например, 0.00000001).");
//                scanner.next();
//            }
//        }
//
//        double sum = 0.0;
//        double term = 1.0; // a₀ = 1
//        int n = 0;
//
//        do {
//            sum += term;
//            n++;
//
//            // Вычисляем следующий член: a_n = a_{n-1} * (2n+1)/(2n) * x²
//            if (n > 0) {
//                term = term * (2.0 * n + 1) / (2.0 * n) * (x * x);
//            }
//
//        } while (Math.abs(term) > epsilon);
//
//        System.out.printf("Сумма ряда S = %.10f%n", sum);
//        System.out.printf("Количество членов ряда: %d%n", n);
//    }
//}
//задача 12
//public class SimpleFunctionCalculator {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(java.util.Locale.US);
//
//        double x;
//        while (true) {
//            System.out.print("Введите значение x: ");
//            try {
//                x = scanner.nextDouble();
//                break;
//            } catch (Exception e) {
//                System.out.println("Ошибка ввода. Используйте точку (например, 1.5).");
//                scanner.next();
//            }
//        }
//
//        double epsilon;
//        while (true) {
//            System.out.print("Введите точность (например, 1e-8): ");
//            try {
//                epsilon = scanner.nextDouble();
//                if (epsilon > 0) break;
//                else System.out.println("Точность должна быть положительной.");
//            } catch (Exception e) {
//                System.out.println("Ошибка ввода.");
//                scanner.next();
//            }
//        }
//
//        double sum = 0.0;
//        int n = 0;
//        double term;
//
//        do {
//            // Вычисляем a_n = [2^(n/2) * cos(πn/4)] * x^n / n!
//            double powerOf2 = Math.pow(2.0, n / 2.0);
//            double cosValue = Math.cos(Math.PI * n / 4.0);
//            double xPower = Math.pow(x, n);
//            double factorial = 1.0;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//
//            term = powerOf2 * cosValue * xPower / factorial;
//
//            sum += term;
//            n++;
//
//        } while (Math.abs(term) > epsilon);
//
//        double analytical = Math.exp(x) * Math.cos(x); // S = e^x * cos(x)
//
//        System.out.printf("Сумма ряда S = %.10f%n", sum);
//        System.out.printf("Аналитическое значение (e^x * cos(x)) = %.10f%n", analytical);
//        System.out.printf("Количество членов ряда: %d%n", n - 1);
//    }
//}
//задача 6
//public class SimpleFunctionCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(java.util.Locale.US); // Для ввода чисел с точкой
//
//        System.out.print("Введите x (в диапазоне [-1, 1]): ");
//        double x = scanner.nextDouble();
//
//        if (x < -1 || x > 1) {
//            System.out.println("Ошибка: x должно быть в диапазоне [-1, 1].");
//            return;
//        }
//
//        System.out.print("Введите точность (например, 1e-8): ");
//        double eps = scanner.nextDouble();
//
//        double sum = 1.0; // Начальное значение S = 1 + ...
//        double term;
//        int n = 2;
//
//        do {
//            // Вычисляем a_n = [(-1)^(n+1) * (n-1) * x^n] / n!
//            double sign = (n % 2 == 0) ? 1.0 : -1.0; // (-1)^(n+1) -> если n чётное → +1, нечётное → -1
//            double numerator = sign * (n - 1) * Math.pow(x, n);
//            double factorial = 1.0;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//            term = numerator / factorial;
//
//            sum += term;
//            n++;
//
//        } while (Math.abs(term) >= eps);
//
//        System.out.printf("Сумма ряда S = %.10f\n", sum);
//        System.out.printf("Количество членов ряда (начиная с n=2): %d\n", n - 2);
//
//        scanner.close();
//    }
//}
//задача 7
//public class SimpleFunctionCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(java.util.Locale.US); // Для ввода чисел с точкой
//        System.out.print("Введите x (в диапазоне [-1, 1]): ");
//        double x = scanner.nextDouble();
//
//        if (x < -1 || x > 1) {
//            System.out.println("Ошибка: x должно быть в диапазоне [-1, 1].");
//            return;
//        }
//
//        System.out.print("Введите точность (например, 1e-8): ");
//        double eps = scanner.nextDouble();
//
//        double sum = 0.0;
//        int n = 1;
//
//        // Начальные значения для первого члена (n=1)
//        double power = x * x * x; // x^(2*1 + 1) = x^3
//        double factorial = 6.0;   // (2*1 + 1)! = 3! = 6
//        double sign = -1.0;       // (-1)^1 = -1
//
//        double currentTerm = sign * (2 * n) * power / factorial;
//
//        while (Math.abs(currentTerm) >= eps) {
//            sum += currentTerm;
//            n++;
//
//            // Обновляем знак: (-1)^n
//            sign = -sign;
//
//            // Обновляем степень: x^(2n+1) = x^(2(n-1)+1) * x^2
//            power *= x * x;
//
//            // Обновляем факториал: (2n+1)! = (2(n-1)+1)! * (2n) * (2n+1)
//            // Например: 5! = 3! * 4 * 5
//            factorial *= (2 * n) * (2 * n + 1);
//
//            // Вычисляем следующий член
//            currentTerm = sign * (2 * n) * power / factorial;
//        }
//
//        System.out.printf("Сумма ряда S = %.10f\n", sum);
//        System.out.printf("Количество членов ряда: %d\n", n - 1);
//
//        scanner.close();
//    }
//}
//задача 4
//public class SimpleFunctionCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите x: ");
//        double x = scanner.nextDouble();
//
//        System.out.print("Введите точность (например, 1e-8): ");
//        double eps = scanner.nextDouble();
//
//        double sum = 0.0;
//        int n = 0;
//        double currentTerm;
//
//        do {
//            // Вычисляем a_n = [2^(n/2) * cos(pi*n/4) * x^n] / n!
//            double powerOf2 = Math.pow(2, n / 2.0); // 2^(n/2)
//            double cosValue = Math.cos(Math.PI * n / 4.0);
//            double powerOfX = Math.pow(x, n);      // x^n
//            double factorial = 1.0;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//
//            currentTerm = powerOf2 * cosValue * powerOfX / factorial;
//
//            sum += currentTerm;
//            n++;
//
//        } while (Math.abs(currentTerm) >= eps);
//
//        System.out.printf("Сумма ряда S = %.10f\n", sum);
//        System.out.printf("Количество членов ряда: %d\n", n);
//
//        scanner.close();
//    }
//}