import java.util.*;

public class atm

{

	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);

		int Ardhendu_Manna = 1254;

		int Hriju_Saha = 5264;

		int Dipanker_Das = 8456;

		int Kushal_Mozumder = 9384;

		int Anuradha_Nath = 8723;

		int Ankita_Sarkar =3874;

		System.out.println("Press 1 for Ardhendu Manna-123983917480");

		System.out.println("Press 2 for Hriju Saha-215796132404");

		System.out.println("Press 3 for Dipanker Das-652427846104");

		System.out.println("Press 4 for Kushal Mozumder-193529462801");

		System.out.println("Press 5 for Anuradha Nath-158845635238");

		System.out.println("Press 6 for Ankita Sarkar-673937526095");

		System.out.println("***********CHOICE ONE OPTION***********");

		int choice = sc.nextInt();

		if(choice == 1)

		{

			System.out.println("Enter passcode");

			int password = sc.nextInt();

			double current_balance = 20000.65;

			if(password == Ardhendu_Manna)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("Balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

		if(choice == 2)

		{

			System.out.println("enter passcode");

			int password = sc.nextInt();

			double current_balance = 16254.65;

			if(password == Hriju_Saha)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("Balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

			if(choice == 3)

		{

			System.out.println("Enter passcode");

			int password = sc.nextInt();

			double current_balance = 30584.71;

			if(password == Dipanker_Das)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("Balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

			if(choice == 4)

		{

			System.out.println("Enter passcode");

			int password = sc.nextInt();

			double current_balance = 150670.83;

			if(password == Kushal_Mozumder)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("Balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

		if(choice == 5)

		{

			System.out.println("Enter passcode");

			int password = sc.nextInt();

			double current_balance = 15750.49;

			if(password == Anuradha_Nath)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

		if(choice == 6)

		{

			System.out.println("Enter passcode");

			int password = sc.nextInt();

			double current_balance = 45000.29;

			if(password == Ankita_Sarkar)

			{

				System.out.println("Press 1 for withdraw");

				System.out.println("Press 2 for Deposit");

				System.out.println("Press 3 For balance");

				System.out.println("***************CHOICE ONE OPTION***************");

				int option = sc.nextInt();

				switch(option)

				{

					case 1:

						System.out.println("Enter amount to withdraw:");

						int withdraw = sc.nextInt();

						current_balance -= withdraw;

						System.out.println("Balance: " + current_balance);

						break;

					case 2:

						System.out.println("Enter amount to deposit:");

						int deposit = sc.nextInt();

						current_balance += deposit;

						System.out.println("Balance: " + current_balance);

						break;

					case 3:

						System.out.println("Balance: " + current_balance);

						break;

					default:

						System.out.println("Enter valid option");

						break;

				}

			}

			else

				System.out.println("***************WRONG PASSWORD***************");

				System.out.println("THANK YOU FOR USING OUR SURVICE");

		}

	}

}
