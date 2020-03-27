#include<iostream>
#include<string>
#include<cstring>
#include "Player.h"

using namespace std;

Player::Player()
{
	name = "\0";
	age = 0;
	country = "\0";
}

Player::Player(string n,int a,string c)
{
	name = n;
	age = a;
	country = c;
}

Player::Player(const Player& p)
{
	name = p.name;
	age = p.age;
	country = p.country;
}

string Player::getN()
{
	return name;
}

int Player::getA() {
	return age;
}

string Player::getC()
{
	return country;
}


void Player ::setN(string na)
{
	name = na;
}

void Player::setA(int ag) {
	age = ag;
}

void Player::setC(string co) {
	country = co;
}

ostream & operator<<(ostream& out, Player p) {

	out << p.getN() << endl;
	out << p.getA() << endl;
	out << p.getC() << endl;
	return out;
}


istream& operator>>(istream& in, Player p) {

	cout << "Enter name : " << endl;
	in >> p.name;

	cout << "Enter age : " << endl;
	in >> p.age;

	cout << "Enter country : " << endl;
	in >> p.country;

	return in;
}

/*int namecomp(const void* p, const void* q)
{
	//return strcmp(((class Player*)p)->getN(), ((class Player*)q)->getN());
}
*/


int agecomp(const void* p, const void* q)	//global compare function to sort data by age
{
	class Player* a = (class Player*)p;
	class Player* b = (class Player*)q;
	return ((a->getA()) - (b->getA()));
}




 void sort(Player *p, int no)
{
	int choice;
	cout << "Enter choice to sort the data : \n";
	cout << "1.Name \n2.Age" << endl;
	cin >> choice;

	switch (choice)
	{
//	case 1:
//		qsort(p, no, sizeof(Player), namecomp);	//sorts data as per name
//		break;
	case 2:
		qsort(p, no, sizeof(Player), agecomp);	//sorts data as per age
		break;
	default:
		cout << "WRONG CHOICE!!" << endl;
		break;
	}
}

