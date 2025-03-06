#include "Departamento.hpp"

const int &Department::get_id() const {
    return id;
}

const string &Department::get_name() const {
    return name;
}

void Department::set_name(const string &name) {
    this->name = name;
}