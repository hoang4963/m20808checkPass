import java.util.Scanner;
public class checkPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println(" nhap so hoc sinh can kiem tra: " );
            size = scanner.nextByte();
            if (size > 30){
                System.out.println("khong lam duoc nhieu the");
            }
        }while (size > 30);
        int[] score = new int[size];
        inputScore(score);
        System.out.println(" so hoc sinh pass la: " + checkPas(score));
    }
    public static int[] inputScore(int[] arr){
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("nhap diem cua hoc sinh thu " + (i + 1));
            arr[i] = scanner1.nextByte();
        }
        return arr;
    }
    public static int checkPas(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5){
                count++;
            }
        }
        return count;
    }
}
