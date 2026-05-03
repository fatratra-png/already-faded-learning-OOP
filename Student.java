//Encapsulation : ??

public class Student {
      // public ? private ? protected ? default ?
      private int id;
      private String name;
      private float average;

      public Student(int id, String name, float average) {
            this.id = id;
            this.name = name;
            this.average = average;
      }

      public int getId() {
            return this.id;
      }

      public void setId(int id) {
            if (id < 0)
                  System.out.println("Erreur");
            else
                  this.id = id;
      }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return float return the average
     */
    public float getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(float average) {
        this.average = average;
    }

}
