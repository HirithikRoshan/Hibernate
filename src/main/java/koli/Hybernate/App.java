package koli.Hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initialize Hibernate configuration and session factory
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // List to hold Team objects
        List<Team> teamList = new ArrayList<>();

        try {
            while (true) {
                // Collect data from the user
                System.out.print("Enter team member's name (or type 'exit' to finish): ");
                String name = scanner.nextLine();
                if ("exit".equalsIgnoreCase(name)) {
                    break;  // Exit if the user types "exit"
                }

                System.out.print("Enter team member's age: ");
                int age = scanner.nextInt();

                System.out.print("Enter team member's role: ");
                scanner.nextLine();  // Consume newline left by nextInt()
                String role = scanner.nextLine();

                // Create a new Team object and add it to the list
                Team teamMember = new Team(name, age, role);
                teamList.add(teamMember);

                System.out.println("Team member added to the list!\n");
            }

            // Open session and begin transaction
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            // Save all team members from the ArrayList to the database
            for (Team teamMember : teamList) {
                session.save(teamMember);
            }

            // Commit the transaction
            tx.commit();
            session.close();
            System.out.println("All team members have been saved to the database.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            sf.close();
        }
    }
}
