//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Manager manager1 = new Manager("Dorthe Olesen", "Senior Mangeger", 40000, "Husumgade 13");

        manager1.addBonusForProject(10, 12, 12);
        manager1.addBonusForProject(1, 12, 20);
        manager1.addBonusForProject(3, 25, 120);


        System.out.println(
                "Employee: " + manager1.getName() + "\n" +
                "Monthly Salery: DKK " + manager1.getSalary() + "\n" +
                "Yearly Bonus: DKK " + manager1.totalBonus() + "\n" +
                        "Total Annual Income: DKK " + manager1.totalIncome() + "\n" +
                        "Total Annual Income: DKK " + manager1.totalExpense() + "\n"
        );

        Programmer programmer1 = new Programmer("Ronja Tarp", "Senior Programmer", 60000, "Nørrebrogade 130");
        programmer1.addBonusForProject(10, 12, 24);
        programmer1.addBonusForProject(5, 12, 75);
        programmer1.addBonusForProject(2, 25, 10);

        System.out.println(
                "Employee: " + programmer1.getName() + "\n" +
                        "Monthly Salery: DKK " + programmer1.getSalary() + "\n"  +
                        "Yearly Bonus: DKK " + programmer1.totalBonus() + "\n" +
                        "Total Annual Income: DKK " + programmer1.totalIncome() +"\n" +
                        "Total Annual Income: DKK " + programmer1.totalExpense() + "\n"
        );


        Developer developer1= new Developer("Peyton Hunter", "Developer", 75000, "Nørrebrogade 130");
        developer1.addBonusForProject(15, 1, 19);
        developer1.addBonusForProject(5, 8, 20);
        developer1.addBonusForProject(5, 25, 24);

        System.out.println(
                "Employee: " + developer1.getName() + "\n" +
                        "Monthly Salery: DKK " + developer1.getSalary() + "\n"   +
                        "Yearly Bonus: DKK " + developer1.totalBonus() + "\n" +
                        "Total Annual Income: DKK " + developer1.totalIncome() + "\n" +
                        "Total Annual Income + Bonus: DKK " + developer1.totalExpense()
        );



    }
}