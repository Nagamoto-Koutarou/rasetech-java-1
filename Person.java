import java.util.Scanner;
import java.util.InputMismatchException;

public class Person {
    private String firstName;
    private String lastName;
    private String fullName;
    private int age;
    private int height;
    private double weight;
    private double bmi;

    private int maxAge;
    private int totalAge;

    public void numberPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何人分の情報を入力しますか：");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "人目");
            informationInput();
            printData();
        }
        System.out.println("最高年齢は" + maxAge + "歳です");
        int averageAge = totalAge / n;
        System.out.println("平均年齢は" + averageAge + "歳です");

    }

    public void informationInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        this.firstName = scanner.next();

        System.out.print("名字：");
        this.lastName = scanner.next();

        while (true) {
            try {
                System.out.print("年齢：");
                this.age = scanner.nextInt();
                break;
        } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("数値を入力してください");
            }
        }
        if (age > maxAge) {
            maxAge = age;
        }
        totalAge = totalAge + age;

        while (true) {
            try {
                System.out.print("身長(cm)：");
                this.height = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("数値を入力してください");
            }
        }

        while (true) {
            if (this.height > 0 && this.height < 1000) {
                break;
            } else if (this.height > 1000) {
                System.out.println("3桁で入力してください");
                System.out.print("身長(cm)：");
                this.height = scanner.nextInt();
            } else {
                System.out.println("マイナスになっています");
                System.out.print("身長(cm)：");
                this.height = scanner.nextInt();
            }
        }

        while (true) {
            try {
                System.out.print("体重(kg)：");
                this.weight = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("数値を入力してください");
            }

        }

        System.out.println("--------------------");

    }

    public void printData() {
        System.out.println("名前は" + fullName() + "です");
        System.out.println("年齢は" + age + "歳です");
        if (age >= 20) {
            System.out.println("成年者です");
        } else {
            System.out.println("未成年者です");
        }
        System.out.println("身長は" + Math.round(height) + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("BMIは" + Math.round(bmi()) + "です");
        if (bmi >= 18.5 && bmi <25) {
            System.out.println("健康です");
        } else {
            System.out.println("健康ではありません");
        }
        System.out.println("--------------------");
    }

    public String fullName() {
        return fullName = firstName + " " + lastName;
    }

    public double bmi () {
        return bmi = weight/(height/100)/(height/100);
    }
}
