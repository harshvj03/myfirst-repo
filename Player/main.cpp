// Player.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<string>
#include "Player.h"
//#include "Player.cpp"

using namespace std;

int main()
{

	Player p1;

	cout << "Name :" << p1.getN() << endl;
	cout << "age : " << p1.getA() << endl;
	cout << "Country :" << p1.getC() << endl;

	Player p("Harsh",25,"India");

	cout << "Name :" << p.getN() <<endl;
	cout << "age : " << p.getA() << endl;
	cout << "Country :" << p.getC() << endl;

	Player p2(p);

	cout << "Copy Constructor ";

	cout << "Name :" << p2.getN() << endl;
	cout << "age : " << p2.getA() << endl;
	cout << "Country :" << p2.getC() << endl;

	int n;
	cout << "Enter the no. of player : ";
	cin >> n;

	Player* p3 = new Player[n];

	for (int i = 0; i < n; i++)
	{
		string na;
		int ag;
		string co;
		cout << "Enter Name : " << endl;
		cin >> na;
		p3[i].setN(na);

		cout << "Enter age : " << endl;
		cin >> ag;
		p3[i].setA(ag);

		cout << "Enter country : " << endl;
		cin >> co;
		p3[i].setC(co);
	}

	for (int i = 0; i < n; i++)
	{
		cout << p3[i].getN() << "\t" << p3[i].getA() << "\t" << p3[i].getC();
		cout << "\n";
		cout << "***********************\n";
	}
	



	//cout << "Operator overloading : " << endl;
	//cout << p << endl << p1 << endl << p2 << endl;

	sort(p3, n);

	for (int i = 0; i < n; i++)
	{
		cout << p3[i];
		cout << "\n";
		cout << "#########\n";
	}
	delete[]p3;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
