/* Part B — Function Overloading*/
#include <iostream>
using namespace std;

double reorderCost(int qty, double price) {
    return qty * price;
}

double reorderCost(double qty, double price) {
    return qty * price;
}

double reorderCost(int qty, double price, double tax) {
    double cost = qty * price;
    return cost + (cost * tax / 100);
}

double applyDiscount(double price, double discount = 10) {
    return price - (price * discount / 100);
}

int main() {

    cout << reorderCost(10, 50) << endl;

    cout << reorderCost(10.5, 50) << endl;

    cout << reorderCost(10, 50, 18) << endl;

    cout << applyDiscount(1000) << endl;

    cout << applyDiscount(1000, 20) << endl;

    return 0;
}