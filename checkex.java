class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}

class Person {
  private int age;

  public void setAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("You are a minor");
    }
  }

  public static void main(String[] args) {
    Person o1 = new Person();
    try {
      o1.setAge(11);
    } catch (InvalidAgeException e) {
      System.out.println("Message: " + e.getMessage());
    }
  }
}
