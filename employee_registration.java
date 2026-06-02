package com.tcs.prep;

public class employee_registration {
	public class employee {
		String name;
		int EmpID;
		int Empsalry;

		void display() {
			System.out.println(name + " " + EmpID + " " + Empsalry);

		}

	}

	public class emp2 {
		static void main(String[] args) {

			employee e1 = new employee();
			e1.name = "Adeeb";
			e1.EmpID = 12311;
			e1.Empsalry = 200000;
			e1.display();

		}
	}

}
