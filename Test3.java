import org.w3c.dom.*;
import org.w3c.dom.traversal.NodeFilter;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Doublylinkedlistq<Student> list = new Doublylinkedlistq<Student>();
        LinkedList z = new LinkedList();

        System.out.println("\t\t\t SCHOOL ALHODAA\n");
        Student s1 = new Student("wafa", "alsalfi", 20, 7765432, "omar", 2, 12);
       list.addlast(s1);
        list.printNodes();
        Student s2 = new Student("asma", "almasari", 20, 7789654, "almatar", 1, 2);
        list.addfirst(s2);
        list.printNodes();
        Student s3 = new Student("zeanah", "qamash", 20, 7786544, "omar", 1, 123);
        list.addfirst(s3);
        list.printNodes();
        System.out.println(list.size());
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.last();
            list.first();

        }



        list.size();

        System.out.println("1-add\t\t\t\t2-remove\t\t\t\t3-edit");
        Doublylinkedlistq v = new Doublylinkedlistq();
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if (s == 1) {
            System.out.println("Do want add student ?");
            {

                System.out.println("Enter the firstname :");
                String firstname = input.next();
                System.out.println("Enter the lastname :");
                String lastname = input.next();
                System.out.println("Enter the age :");
                int age = input.nextInt();
                System.out.println("Enter the address");
                String address = input.next();
                System.out.println("Enter the level :");
                int level = input.nextInt();
                System.out.println("Enter the id :");
                int id = input.nextInt();
                list.addfirst(s1);
                list.printNodes();
                list.addfirst(s2);
                list.printNodes();
                list.addfirst(s3);
                list.printNodes();
                list.printNodes();
                System.out.print("firstname = " + firstname + "\t\t");
                System.out.print("lastname = " + lastname + "\t\t");
                System.out.print("age = " + age + "\t\t");
                System.out.print("address = " + address + "\t\t");
                System.out.print("level = " + level + "\t\t");
                System.out.print("id = " + id + "\t\t");
            }

        } else if (s == 2) {
            int i = v.size();{
            System.out.println("Enter the student want delete ?");
            System.out.println("*if enter number one well delete student number one   *");
            System.out.println("*if enter number two well delete student number two   *");
            int d = input.nextInt();
            if (d == 1) {
                list.removelast();
                list.printNodes();

            } else if (d == 2)
                list.removefirt();
            list.printNodes();

        }
    }

         else if (s == 3) {
            list.edit(1);
            list.printNodes();



    }}}