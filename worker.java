class trap
{
    public static void main (String args[])
    {
        int totalIncomeOfMonth;
        int perDayIncome=350;
        int totalDays=30;
        int presentDays=25;
        int finOfADay=30;
        int AbsentDays=5;
        int abscentIncomeWithFine;
        totalIncomeOfMonth=perDayIncome*totalDays;
        System.out.println("Total income of a month : "+totalIncomeOfMonth);
     abscentIncomeWithFine =((perDayIncome*presentDays)-(finOfADay*AbsentDays));
         System.out.println("Total income of 25 days including fine : "+abscentIncomeWithFine);

    }

}