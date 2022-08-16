package com.company;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanConvert {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100);
    private int value;
    RomanConvert(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public static List<RomanConvert> getReverseSortedValues(){
        return Arrays.stream(values()).sorted(Comparator.comparing((RomanConvert e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
    public static int romanToArabic(String input){
        String romanNumeral = input.toUpperCase();
        int result =0;
        List<RomanConvert> romanNumerals = RomanConvert.getReverseSortedValues();
        int i=0;
        while((romanNumeral.length()>0) && (i<romanNumerals.size())){
            RomanConvert symbol = romanNumerals.get(i);
            if(romanNumeral.startsWith((symbol.name()))){
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            }else {
                i++;
            }
        }
        if(romanNumeral.length()>0){
            throw new IllegalArgumentException((input + " Нельзя сконвертировать в римское число"));
        }
        return result;
    }

}
