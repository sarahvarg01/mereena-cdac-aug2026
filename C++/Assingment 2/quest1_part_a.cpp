/*Question 1 — Inventory Management System*/

#include <iostream>
#include <string>
using namespace std;

class Product {
private:
    int id;
    string name;
    double price;
    int quantity;

public:

    void acceptDetails() {
        cout << "Enter ID: ";
        cin >> id;

        cout << "Enter name: ";
        cin >> name;

        cout << "Enter price: ";
        cin >> price;

        cout << "Enter quantity: ";
        cin >> quantity;
    }

    void displayDetails() const {
        cout << id << " "
             << name << " "
             << price << " "
             << quantity << " "
             << price * quantity << endl;
    }

    double totalValue() const {
        return price * quantity;
    }

    bool isLowStock(int threshold) const {
        return quantity < threshold;
    }

    string getName() const {
        return name;
    }
};

int main() {

    Product p[5];

    // Input
    for (int i = 0; i < 5; i++) {
        cout << "\nProduct " << i + 1 << endl;
        p[i].acceptDetails();
    }

    // Display
    cout << "\nID Name Price Quantity Total\n";

    for (int i = 0; i < 5; i++) {
        p[i].displayDetails();
    }

    // Find highest value
    int highest = 0;

    for (int i = 1; i < 5; i++) {
        if (p[i].totalValue() > p[highest].totalValue()) {
            highest = i;
        }
    }

    cout << "\nHighest value product: "
         << p[highest].getName() << endl;

    // Low stock
    int threshold;

    cout << "\nEnter threshold: ";
    cin >> threshold;

    cout << "Low stock products:\n";

    for (int i = 0; i < 5; i++) {
        if (p[i].isLowStock(threshold)) {
            cout << p[i].getName() << endl;
        }
    }

    return 0;
}