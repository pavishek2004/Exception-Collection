package exceptionCollection;
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    
    // Parameterized constructor with exception handling
    public Student(int rollNo, String name, int age, String course) 
            throws AgeNotWithinRangeException, NameNotValidException {
        
        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Student age must be between 15 and 21. Given age: " + age);
        }
        
        // Validate name using regular expression
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Student name must contain only alphabets and spaces. Given name: " + name);
        }
        
        // If validations pass, initialize the attributes
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    // Getters
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCourse() {
        return course;
    }
    
    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + 
               ", Age: " + age + ", Course: " + course + "]";
    }
}