public class arrayDemo 
{
    public static void main(String[] args)
    {
        String [] students = {"Ronnie", "Chris", "Robin","Lorrie","Kevin"};
        System.out.println(students);
        int i;
        for (i=0; i<students.length-1;i++)
        {
            System.out.print(students[i]+",");
        }
        
    }
}