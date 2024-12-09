package levels;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
        long nbr = teachers.stream().filter(teacher -> teacher.getName().toLowerCase().startsWith("s")).count();
        System.out.println("Number of teachers whose name starts with 's': " + nbr);

        /* TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter (hint: mapToInt) */
        long sum = teachers.stream().filter(teacher -> teacher.getSubject() == models.Subject.FLUTTER).mapToInt(Teacher::getSalary).sum();
        System.out.println("Sum of salaries of Flutter teachers: " + sum);

        /* TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a */
        double average = teachers.stream().filter(teacher -> teacher.getName().toLowerCase().startsWith("a")).mapToInt(Teacher::getSalary).average().orElse(0.0);
        System.out.println("Average salary of teachers whose name starts with 'a': " + average);

        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
        List<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getName().toLowerCase().startsWith("f")).collect(Collectors.toList());
        System.out.println("Teachers whose name starts with 'f': " + teachers1);

        /* TO DO 5: Retourner la liste des enseignants dont le nom commence par s */
        List<Teacher> teachers2 = teachers.stream().filter(teacher -> teacher.getName().toLowerCase().startsWith("s")).collect(Collectors.toList());
        System.out.println("Teachers whose name starts with 's': " + teachers2);

        /* TO DO 5: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non */
        boolean test = teachers.stream().anyMatch(teacher -> teacher.getSalary() > 100000);
        System.out.println("Is there at least one teacher with a salary > 100,000? " + test);
        /* TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes */
        /*First way*/
        teachers.stream().filter(teacher -> teacher.getSubject() == models.Subject.UNITY).filter(teacher -> teacher.getName().toLowerCase().startsWith("g")).findFirst().ifPresent(teacher -> System.out.println("First Unity teacher whose name starts with 'g': " + teacher));
        ;
        /*Second way*/
        teachers.stream()./* TO DO 7 */;

        /* TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s */
        teachers.stream()./* TO DO 8 */;

    }
}
