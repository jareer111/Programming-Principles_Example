package com.jareer.principle.kiss;

public class KISS {
    public static void main(String[] args) {

        System.out.println("withoutKISS = " + withoutKISS(2));
        System.out.println("withKISS = " + withKISS(2));
    }

    public static String withoutKISS(int month) {
        return switch (month) {
            case 1 -> "QISH";
            case 2 -> "Bahor";
            default -> "Fasl topilmadi";
        };
    }

    public static String withKISS(int month) {
        if (month < 1 || month > 4)
            return "Fasl topilmadi";
        String[] months = {"Qish", "Bahor", "Yoz", "Kuz"};
        return months[month - 1];
    }


}
