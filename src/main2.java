public class main2 {


    public static void main(String[] args) {

        int firstMoney = 100;
        int addMoney = 1100;

        int bonus = 0;
        if (addMoney > 1000) ;
        {
            bonus = addMoney / 100;
        }

        int itoqoviyBalance = firstMoney + addMoney + bonus;
        System.out.println(" Общий баланс " + itoqoviyBalance);
        System.out.println("Бонус:" + bonus);
    }
}
