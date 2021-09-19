class MarkSheet
{
	public static void main(String args[])
	{
	int calculus=70;
	int Computer_Programming=80;
	int English=75;
	int Basic_Electronics=85;
	int Basic_Electrical=90;
	int total_marks=(calculus+Computer_Programming+English+Basic_Electronics+Basic_Electrical);
	System.out.println("Your Total Marks Are "+total_marks);
	if(total_marks>450){
	System.out.println("You Got A1 Grade");}
	else if(total_marks>380 && total_marks<450){
	System.out.println("You Got A Grade");}
	else if(total_marks>300 && total_marks<380){
	System.out.println("You Got B Grade");}
	else if(total_marks>250 && total_marks<300){
	System.out.println("You Got c Grade");}
	else if(total_marks>180 && total_marks<250){
	System.out.println("You Got Passed Marks");}
	else if(total_marks>133 && total_marks<180){
	System.out.println("Wagniiii Mahnat Kr Re....");}
	
	}

}