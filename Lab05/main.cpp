#include <string>
#include <iostream>
#include <map>
#include <fstream>
#include <sstream>

#include "Departamento.hpp"

using namespace std;

int main(){
    map<int, Department> departments;

    ifstream in("departamentos.csv");

    string cell, name;

    string line;
    while(getline(in, line)){
        istringstream lineStream(line);

        getline(lineStream, name, ';');

        getline(lineStream, cell, ';');
        int id = stoi(cell);

        departments.insert({id, Department(name, id)});
    }

    for(const auto &[id, department] : departments){
        cout << "Departamento: " << department.get_id() << ", " << department.get_name() << endl;
    }

}