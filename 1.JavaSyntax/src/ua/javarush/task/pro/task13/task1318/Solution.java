package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
*/
public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));

    }

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
        if(month.ordinal() == Month.values().length -1){
            return Month.values()[0];
        }
        int index = month.ordinal();
        return Month.values()[index + 1];
    }
}
