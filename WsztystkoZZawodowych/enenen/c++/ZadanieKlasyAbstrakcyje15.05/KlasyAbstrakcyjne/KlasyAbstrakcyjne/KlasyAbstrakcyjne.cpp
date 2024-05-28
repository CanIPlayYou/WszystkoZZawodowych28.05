#include <iostream>
using namespace std;

class Figura {
public:
    virtual double obliczPole() const = 0; // Metoda wirtualna
};

class Kolo : public Figura {
public:
    double obliczPole() const override {
        // ...
    }
};

class Kwadrat : public Figura {
public:
    double obliczPole() const override {
        // ....
    }
};

int main()
{
}