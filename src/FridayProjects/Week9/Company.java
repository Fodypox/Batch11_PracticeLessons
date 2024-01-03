package FridayProjects.Week9;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Worker> workers;

    public Company(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void showAllWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }
    }

    public void showWorkersByPosition() {
        System.out.println("Available positions: QAEngineer, Developer, FreelanceDeveloper, ProjectManager");

        // Asking user to choose a position
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a position to show workers: ");
        String position = scanner.nextLine();

        // Converting user input to uppercase for case-insensitive comparison


        // Displaying workers in the chosen position
        System.out.println("Workers in position " + position + ":");
        for (Worker worker : workers) {
            if (getPosition(worker).equals(position)) {
                System.out.println(worker.toString());
            }
        }

    }
    private String getPosition(Worker worker) {
        if (worker instanceof QAEngineer) {
            return "QAEngineer";
        } else if (worker instanceof Developer) {
            return "Developer";
        } else if (worker instanceof FreelanceDeveloper) {
            return "FreelanceDeveloper";
        } else if (worker instanceof ProjectManager) {
            return "ProjectManager";
        } else {
            return "";
        }
    }

    public void removeWorker() {
        if (workers.isEmpty()) {
            System.out.println("No workers to remove.");
            return;
        }

        // Displaying workers with order numbers
        System.out.println("Workers:");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println((i + 1) + ". " + workers.get(i).toString());
        }

        // Asking user to choose a worker by order number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the order number of the worker to remove: ");
        int orderNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()

        if (orderNumber >= 1 && orderNumber <= workers.size()) {
            workers.remove(orderNumber - 1);
            System.out.println("Worker removed.");
        } else {
            System.out.println("Invalid order number.");
        }
    }

    public double totalSalaryToPayThisMonth() {
        double totalSalary = 0;
        for (Worker worker : workers) {
            if (!worker.isOnVacation()) {
                totalSalary += worker.calculateMonthSalary();
            }
        }
        return totalSalary;
    }

}
