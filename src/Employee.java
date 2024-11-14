public abstract class Employee
{

    public Employee()
    {
    }

    protected String    name;
    protected String    jobTitle;
    protected int       salary;
    protected String    adress;


    //BONUS ATTRIBUTES:

    protected int       retunOnInvestment;
    protected int       projectImportance;
    protected int       employeeContribution;

    protected int       bonus = 0;


    public Employee(String name, String jobTitle, int salary, String adress)
    {
        this.name =     name;
        this.jobTitle = jobTitle;
        this.salary =   salary;
        this.adress =   adress;
    }

    public String getName()
    {
        return name;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public String getAdress()
    {
        return adress;
    }

    public int getSalary()
    {
        return salary;
    }


    public int addBonusForProject(int proImp, int employeeContribution, int retunOnInvestment)
    {
        this.projectImportance = proImp;
        this.employeeContribution = employeeContribution;
        this.retunOnInvestment = retunOnInvestment;

        bonus += projectImportance * employeeContribution * retunOnInvestment;
        return bonus;
    }

    public int totalBonus ()
    {
        return bonus;
    }

    public int totalIncome()
    {
        return salary * 12;
    }

    public int totalExpense ()
    {
        return bonus + (salary * 12);
    }




}
