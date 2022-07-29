import java.util.Scanner;

public class Person {
    public String firstName;
    public String lastName;
    public String fullName;
    public int age;
    public double height;
    public double weight;
    public double bmi;

    public int maxAge;
    public int totalAge;

    public void numberPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何人分の情報を入力しますか：");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "人目");
            informationInput();
            printData();
        }
        System.out.println("最高年齢は" + maxAge + "です");
        int averageAge = totalAge / n;
        System.out.println("平均年齢は" + averageAge + "です");

    }

    public void informationInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        this.firstName = scanner.next();

        System.out.print("名字：");
        this.lastName = scanner.next();

        System.out.print("年齢：");
        this.age = scanner.nextInt();
        if (age > maxAge) {
            maxAge = age;
        }
        totalAge = totalAge + age;

        System.out.print("身長(m)：");
        height = scanner.nextDouble();

        System.out.print("体重(kg)：");
        weight = scanner.nextDouble();

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
        System.out.println("身長は" + height + "mです");
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
        return bmi = weight/height/height;
    }
}
