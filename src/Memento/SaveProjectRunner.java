package Memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project=new Project();
        GitHubRepo gitHub =new GitHubRepo();
        System.out.println("Creating new project. Ver. 1.0");

        project.setVersionAndDate("Ver. 1.0");

        System.out.println(project);

        System.out.println("Saving current project to github...");
        gitHub.setSave(project.save());

        System.out.println("Updating project to Ver. 1.1");

        project.setVersionAndDate("Ver. 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to Ver. 1.0");

        project.load(gitHub.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);


    }
}
