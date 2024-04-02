
/**
Write a Java program that accepts a list of student projects and
returns the number of projects that were completed on time, late,
or early, and the average time it took for each student to complete
their projects.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Project {
    String name;
    int daysTaken;

    public Project(String name, int daysTaken) {
        this.name = name;
        this.daysTaken = daysTaken;
    }
}

public class ProjectCompletionAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Project> projects = new ArrayList<>();

        System.out.print("Enter the number of projects: ");
        int numProjects = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numProjects; i++) {
            System.out.println("Enter project name and days taken (separated by space) for project " + (i + 1) + ":");
            String projectName = scanner.next();
            int daysTaken = scanner.nextInt();
            projects.add(new Project(projectName, daysTaken));
        }

        int onTimeCount = 0;
        int lateCount = 0;
        int earlyCount = 0;
        int totalDays = 0;

        for (Project project : projects) {
            if (project.daysTaken <= 0) {
                earlyCount++;
            } else if (project.daysTaken <= 7) {
                onTimeCount++;
            } else {
                lateCount++;
            }
            totalDays += project.daysTaken;
        }

        double averageCompletionTime = (double) totalDays / numProjects;

        System.out.println("\nProject Completion Analysis:");
        System.out.println("Projects completed on time: " + onTimeCount);
        System.out.println("Projects completed late: " + lateCount);
        System.out.println("Projects completed early: " + earlyCount);
        System.out.println("Average completion time: " + averageCompletionTime + " days");

        scanner.close();
    }
}
