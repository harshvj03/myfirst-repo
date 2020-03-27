#pragma once
#include <string>
#ifndef PLAYER_H
#define PLAYER_H

using namespace std;

class Player {
	string name;
	int age;
	string country;

public : 
	Player();

	Player(string n, int a, string c);
	
	Player(const Player& p);

	string getN();
	int getA();
	string getC();

	void setN(string na);
	void setA(int ag);
	void setC(string co);

	friend ostream & operator<<(ostream& out, Player p);
	
	friend istream &operator>>(istream& in, Player p);

	friend int agecomp(const void* p, const void* q);
	friend void sort(Player* p, int no);

};
#endif // !1
