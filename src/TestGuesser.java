public class TestGuesser{
  private static boolean isToStringOverridden(){
    return ! new Guesser(1,0).toString().startsWith("Guesser@");
  }
  private static boolean testConstructor(int high, int low){
    return new Guesser(high, low).toString().equals(String.format("High: %d\nLow : %d", high, low));
  }
  private static void printToStringError(){
    System.err.println("You must override toString() in Guesser.");
    System.out.println("public String toString(){");
    System.out.println("  return \"low: \" + low + \" high: \" + high;");
    System.out.println("}");
  }
  
  public static void main(String[] args){

    if(!isToStringOverridden()){
      printToStringError();
      System.exit(1);
    }

    int low=0;
    int high;
    System.out.println("Running tests...");
    for(high=1;high < 1000000; high *=10){
      System.out.print("Guesser("+high+", "+low+"): ");
      System.out.println(testConstructor(high, low)?"Pass!":"Fail!");
    }
    
  }
  
}