package collectionsExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gradesMap {

    public static void main(String[] args) {


          finalGrades();
    }

//  finalGrades is all me baby! :D
    public static void finalGrades(){

        Map<String, Integer> grades = new HashMap();
        List names = Arrays.asList(getMakeUpGrades().keySet().toArray());

        for (int n=0; n < names.size(); n++) {
            String student = names.get(n).toString();

            int oriGrade = Integer.parseInt(getOriginalGrades().get(student).toString());
            int makGrade = Integer.parseInt(getMakeUpGrades().get(student).toString());

            if (oriGrade > makGrade){

                grades.put(student, oriGrade);

            } else {

                grades.put(student,makGrade);

            }

            System.out.println(student + "'s final grade is " + grades.get(student));

        }

    }

    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
}
