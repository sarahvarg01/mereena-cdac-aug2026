#include <iostream>
#include <cstdlib>
using namespace std;

int main(int argc, char* argv[]) {

    if (argc != 4) {
        cout << "Usage: ./sensor_monitor <warn> <critical> <readings>\n";
        return 1;
    }

    int warn = atoi(argv[1]);
    int critical = atoi(argv[2]);
    int n = atoi(argv[3]);

    if (warn >= critical) {
        cout << "Error: warn must be less than critical\n";
        return 1;
    }

    if (n < 1 || n > 500) {
        cout << "Error: readings must be 1 to 500\n";
        return 1;
    }

    int normal = 0, warning = 0;
    int criticalCount = 0, shutdown = 0;

    for (int i = 0; i < n; i++) {

        int temp = rand() % 70;

        if (temp < warn)
            normal++;
        else if (temp < critical)
            warning++;
        else if (temp < 60)
            criticalCount++;
        else
            shutdown++;
    }

    cout << "Normal: " << normal << endl;
    cout << "Warning: " << warning << endl;
    cout << "Critical: " << criticalCount << endl;
    cout << "Shutdown: " << shutdown << endl;

    return 0;
}