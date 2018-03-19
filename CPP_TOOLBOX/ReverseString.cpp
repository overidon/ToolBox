//============================================================================
// Name        : ReverseString.cpp
// Author      : TYLER  JAGGERS
// Version     :
// Copyright   : 2018 OVERIDON OMNIMEDIA
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;



string reverseString(std::string inputString) {
    cout << "!!! REVERSE STRING !!! ---->" << inputString << endl;

    std::string originalString = inputString;

    std::string reversedString = "";

    int n = inputString.length() - 1;

    while(n >= 0){

        reversedString += originalString[n];
        n--;
    }

    return ( reversedString );
}



int main() {

	cout << reverseString("supernatural")<< endl;

	return 0;
}
