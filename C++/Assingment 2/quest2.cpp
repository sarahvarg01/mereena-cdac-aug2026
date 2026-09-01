/* Question 2 — Hospital Patient Registry*/
#include <iostream>
#include <string>
using namespace std;

class Patient {
private:
    int id;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:

    Patient()
        : id(0), name("Unknown"), age(0),
          ward("General"), bloodGroup("O+") {

        cout << "Default constructor\n";
    }

    Patient(int id, string name)
        : id(id), name(name), age(0),
          ward("Emergency"), bloodGroup("O+") {

        cout << "Emergency constructor\n";
    }
    Patient(int id, string name, int age,
            string ward, string blood)
        : id(id), name(name), age(age),
          ward(ward), bloodGroup(blood) {

        cout << "Full constructor\n";
    }

    void displayRecord() const {
        cout << "\nID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Ward: " << ward << endl;
        cout << "Blood: " << bloodGroup << endl;
    }

    void transferWard(string newWard) {
        ward = newWard;
    }

    ~Patient() {
        cout << "Patient " << name << " discharged\n";
    }
};

int main() {

    Patient p1;

    Patient p2(101, "Raj");

    Patient p3(102, "Meera", 30,
               "Cardiology", "B+");

    p1.displayRecord();
    p2.displayRecord();
    p3.displayRecord();

    p2.transferWard("ICU");

    cout << "\nAfter transfer:\n";
    p2.displayRecord();
    Patient* p = new Patient[4];

    for (int i = 0; i < 4; i++) {
        p[i].displayRecord();
    }

    delete[] p;

    return 0;
}