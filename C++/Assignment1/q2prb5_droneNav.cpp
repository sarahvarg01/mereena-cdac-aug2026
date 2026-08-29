/* Problem 5 — Drone Navigation Utilities*/
#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1,
                              double x2, double y2) {

    return sqrt(pow(x2 - x1, 2) +
                pow(y2 - y1, 2));
}

inline double toRadians(double degrees) {
    return degrees * (M_PI / 180.0);
}

inline double clamp(double value,
                    double minVal,
                    double maxVal) {

    if (value < minVal)
        return minVal;

    if (value > maxVal)
        return maxVal;

    return value;
}

inline bool isInSafeZone(double x, double y,
                         double cx, double cy,
                         double radius) {

    return distanceBetween(x, y, cx, cy) <= radius;
}

int main() {
    double homeX = 0;
    double homeY = 0;
    double radius = 50;

    double x[3] = {10, 30, 60};
    double y[3] = {20, 40, 10};

    for (int i = 0; i < 3; i++) {

        double distance =
            distanceBetween(homeX, homeY, x[i], y[i]);

        cout << "Waypoint " << i + 1 << endl;

        cout << "Distance: "
             << distance << endl;

        if (isInSafeZone(x[i], y[i],
                         homeX, homeY, radius)) {

            cout << "Inside Safe Zone" << endl;
        }
        else {
            cout << "Outside Safe Zone" << endl;
        }

        cout << endl;
    }

    return 0;
}