#if !defined(DEPARTMENT_HPP)
#define DEPARTMENT_HPP

#include <iostream>
#include <string>

using namespace std;

class Department {
    int id;
    string name;

    public:
    Department(const string &name, const int &id) : name(name), id(id){}
    const int &get_id() const;
    const string &get_name() const;
    void set_name(const string &name);
};

#endif
