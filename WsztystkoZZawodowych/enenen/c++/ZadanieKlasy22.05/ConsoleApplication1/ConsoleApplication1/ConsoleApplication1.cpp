#include <iostream>

using namespace std;

class KlasaBazowa {
public:
    virtual void wirtMetoda() = 0;
};

class DziedziczacaJeden : public KlasaBazowa {
public:
    void wirtMetoda() override {
        cout << "Metoda w klasie DziedziczacaJeden" << endl;
    }
};

class DziedziczacaDwa : public KlasaBazowa {
public:
    void wirtMetoda() override {
        cout << "Metoda w klasie DziedziczacaDwa" << endl;
    }
   
    operator KlasaBazowa* () { // Konwersja do klasy abstrakcyjnej
        return this;
    }
};

int main() {
    KlasaBazowa* kl1 = new DziedziczacaJeden();
    KlasaBazowa* kl2 = new DziedziczacaDwa();

    kl1->wirtMetoda();
    kl2->wirtMetoda();

    return 0;
}
