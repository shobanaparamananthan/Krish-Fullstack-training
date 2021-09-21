class reverseString
{
  public static void main(String args[])
  {
    String string1 ="happy programming";
    String  reverse = "";

    System.out.println("original string is : "+string1);
  

    for (int i = (string1 .length())- 1 ; i >= 0 ; i--)
      reverse = reverse + string1.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}