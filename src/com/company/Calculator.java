package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void calculator() throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String s = reader.readLine();
        if(s.length() == 1) {
            throw new IOException("В операции должно быть более одного символа");
        }
        if(s.contains("+")){
            String[] numbers = s.split("\\+");
            int a,b;
            if (s.contains("I")||s.contains("V")||s.contains("X")){
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if(a>0 & a<=10 & b>0 & b<=10) {
                    System.out.println("Ответ: " + ArabicConvert.arabicToRoman(a + b));
                }
                  else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }

            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if(a >0 & a <=10 & b>0 & b<=10){
                    System.out.println("Ответ: " + (a+b));
                }
                else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (s.contains("-")) {
            String[] numbers = s.split("\\-");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + ArabicConvert.arabicToRoman(a - b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + (a - b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (s.contains("*")) {
            String[] numbers = s.split("\\*");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + ArabicConvert.arabicToRoman(a * b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + (a * b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        } else if (s.contains("/")) {
            String[] numbers = s.split("\\/");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanConvert.romanToArabic(numbers[0]);
                b = RomanConvert.romanToArabic(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + ArabicConvert.arabicToRoman(a / b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            } else {
                a = Integer.parseInt(numbers[0]);
                b = Integer.parseInt(numbers[1]);
                if (numbers.length != 2) {
                    throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
                }
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println("Ответ: " + (a / b));
                } else {
                    throw new IOException("Калькулятор  принимает на вход числа от 1 до 10 включительно");
                }
            }
        }
    }

}
