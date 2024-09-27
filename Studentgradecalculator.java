import java.util.Scanner;
public class Studentgradecalculator {
    public static void main(String args[]){
    Scanner k=new Scanner(System.in);
    System.out.print("Enter the number of Subjects:");
    int noofsubjects=k.nextInt();
    int [] marks=new int[noofsubjects];
    int totalmarks=0;
    for(int i=0;i<noofsubjects;i++){
        System.out.print("Enter marks for subject"+(i+1)+":");
        marks[i]=k.nextInt();
        totalmarks+=marks[i];
    }
    double AveragePercentage=(double)totalmarks/noofsubjects;
    char grade;
    if(AveragePercentage>=95){
        grade='A';
    }
    else if(AveragePercentage>=85){
        grade='B';
    }
    else if(AveragePercentage>=75){
        grade='C';
    }
    else if(AveragePercentage>=65){
        grade='D';
    }
    else{
        grade='F';
    }
System.out.println("TotalMarks:"+totalmarks);
System.out.println("TotalMarks:"+totalmarks);
System.out.println("Average percentage:"+AveragePercentage+"%");
System.out.println("Grade:"+grade);
k.close();

}
}