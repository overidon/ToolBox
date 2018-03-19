//============================================================================
// Name        : SortingAlgo.cpp
// Author      : TYLER  JAGGERS
// Version     :
// Copyright   : 2018 OVERIDON OMNIMEDIA
// Description : Hello World in C++, Ansi-style
//============================================================================

//
//  main.cpp
//  SortingAlgo
//
//  Created by Tyler Jaggers on 3/2/18.
//  Copyright © 2018 Tyler Jaggers. All rights reserved.
//

// sort algorithm example
#include <iostream>     // std::cout
#include <algorithm>    // std::sort
#include <vector>       // std::vector


struct comparatorGen {
    bool operator() (int i,int j) { return (i<j);}
} lessComp;


// This is a placeholder function for adding your own parts inside the function
std::vector<int> sortVector( std::vector<int> inputVector ) {

    std::vector<int> sortedVector = inputVector;

    return sortedVector;
}



int main(int argc, const char * argv[]) {

    int myints[] = {32,71,12,45,26,80,53,33};
    std::vector<int> myvector (myints, myints+8);               // 32 71 12 45 26 80 53 33

    // using object as comparator
    std::sort (myvector.begin(), myvector.end(), lessComp);     //(12 26 32 33 45 53 71 80)

    // print out content:
    std::cout << "vector contains:";
    for (std::vector<int>::iterator it=myvector.begin(); it!=myvector.end(); ++it)
        std::cout << ' ' << *it;
    std::cout << '\n';

    return 0;
}
