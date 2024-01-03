package FridayProjects.Week9;

public class QAEngineer extends Worker{
    private int projectsAmount;

    public QAEngineer(String name, double salary, boolean isOnVacation, int projectsAmount) {
        super(name, salary, isOnVacation);
        this.projectsAmount = projectsAmount;
    }

    public int getProjectsAmount() {
        return projectsAmount;
    }

    public void setProjectsAmount(int projectsAmount) {
        this.projectsAmount = projectsAmount;
    }

    @Override
    public double calculateMonthSalary() {
        // Base salary + additional payment for projects
        return super.getSalary() + (projectsAmount > 1 ? (projectsAmount - 1) * 200 : 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
