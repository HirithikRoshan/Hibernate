package koli.Hibernate_ORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class getValue {
    public static void main(String[] args) {
        // initialize hibernate configuration and session factory
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();

        // scanner to take the primary id as input
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("enter the id of the team member to retrieve: ");
            String id = scanner.next();  // read the primary key as a string

            // open session
            Session session = sf.openSession();

            // fetch team member using primary id (string type)
            Team teamMember = session.get(Team.class, id);

            // close session
            session.close();

            // check if the record exists and display it
            if (teamMember != null) {
                System.out.println("team member details:");
                System.out.println("name: " + teamMember.getName());
                System.out.println("age: " + teamMember.getAge());
                System.out.println("role: " + teamMember.getRole());
            } else {
                System.out.println("team member with id " + id + " not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            sf.close();
        }
    }
}
