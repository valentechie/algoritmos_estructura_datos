import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final double[] grades;
    private final LocalDate birthDate;
    private final LocalDate registrationDate;

    // Constructor con todos los campos obligatorios
    public Student(String name, String surname, double[] grades, LocalDate birthDate, LocalDate registrationDate) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
    }

    // Generador del identificador: 3 letras del nombre + 3 del apellido + año de registro
    public String getIdentifier() {
        String idName = name.length() >= 3 ? name.substring(0, 3) : name;
        String idSurname = surname.length() >= 3 ? surname.substring(0, 3) : surname;
        int year = registrationDate.getYear();
        return idName + idSurname + year;
    }

    // Calcula el promedio de las 4 calificaciones
    public double getAverage() {
        double sum = 0;
        for (double grade : grades) sum += grade;
        return sum / grades.length;
    }

    // Calcula la edad actual en años
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Orden natural: por identificador alfabéticamente
    @Override
    public int compareTo(Student other) {
        return this.getIdentifier().compareTo(other.getIdentifier());
    }

    // Consideramos igual a otro estudiante si el identificador coincide
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student other) {
            return this.getIdentifier().equals(other.getIdentifier());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getIdentifier().hashCode();
    }

    // Devuelve una cadena lista para imprimir en el formato que pide la práctica
    public String formattedOutput() {
        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        return String.format("%s %s (%s) - grade: %s - age: %d",
                name, surname, getIdentifier(), df.format(getAverage()), getAge());
    }
}
