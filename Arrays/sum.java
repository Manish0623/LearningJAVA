public class sum {
    public static void main(String[] args){
        float[] marks = {45.5f, 55.4f, 23.5f, 56.7f, 10.9f};
      float sum = 0;
      for( float mark:marks){
        sum+=mark;
      }
      System.out.println("The sum of 5 marks:" + sum);
    }
}
