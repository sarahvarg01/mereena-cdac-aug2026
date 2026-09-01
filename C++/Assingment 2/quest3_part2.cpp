/* Part B — Namespaces*/
#include <iostream>
using namespace std;

namespace Physics {

    double clamp(double x, double min, double max) {

        if (x < min)
            return min;

        if (x > max)
            return max;

        return x;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}


namespace GameMath {

    int clamp(int x, int min, int max) {

        if (x < min)
            return min;

        if (x > max)
            return max;

        return x;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }
}


int main() {

    cout << Physics::clamp(120.5, 0, 100) << endl;

    cout << GameMath::clamp(120, 0, 100) << endl;

    cout << Physics::lerp(0, 100, 0.5) << endl;

    cout << GameMath::lerp(0, 100, 0.5) << endl;

    {
        using namespace Physics;

        cout << clamp(150.0, 0, 100) << endl;
    }

    return 0;
}
