// de menor a mayor
students.sort(Comparator.comparingInt(Student::getAge));

// de mayor a menor 
students.sort(Comparator.comparingInt(Student::getAge).reversed());
