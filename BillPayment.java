class BillPayment
{
	public static void main(String args[]){
	int consume_units=300;
	if(consume_units<100){
	System.out.print("you Consume "+consume_units+" Units");
	int Bill=(consume_units*10);
	System.out.println("you charges will be "+Bill);}

	else if(consume_units>=100 && consume_units<200){
	System.out.println("you Consume "+consume_units+"Units");
	int Bill=(consume_units*20);
	System.out.println("you charges will be "+Bill);}

	else if(consume_units>=300){
	System.out.println("You Consume "+consume_units+" Units");
	int Bill=(consume_units*30);
	int Charges=((Bill*6)/100);
	int total=(Bill+Charges);
	System.out.println("You Consume More than 300 unit it will charge 6% on Bill");
	System.out.println("you charges will Be ="+total);}
	}
}
