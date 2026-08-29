/* Problem 3 — Building Sensor Grid */

#include<iostream>
using namespace std;

int main(){
    double temp [3][3];   // declaring array
    
    double max = 0;
    int hotFloor = 0;
    int hotRoom = 0;

    double maxAvg = 0;
    int hottestFloor = 0;

    int count = 0;

    for(int i = 0; i< 3; i++){
        for(int j = 0; j < 3; j++){
            cout << "Enter the temperature of Floor "
                 << i + 1 << " Room " << j + 1 << ": ";
                 cin >> temp[i][j];
        }
    }

    cout << "\n Sensors Grid: ";

    for(int i = 0; i < 3; i++){
        double sum = 0;
        cout << "Floor " << i + 1 << ": ";

        for(int j = 0; j < 3; j++){
            cout << temp[i][j] << " ";
            sum = sum + temp[i][j];

            // Find hottest room
            if (i == 0 && j == 0 || temp[i][j] > max) {
                max = temp[i][j];
                hotFloor = i;
                hotRoom = j;
            }

            // Count temperature >= 30
            if (temp[i][j] >= 30) {
                count++;
            }
        }

        cout << endl;

        // Find average of each floor
        double avg = sum / 3;

        if (i == 0 || avg > maxAvg) {
            maxAvg = avg;
            hottestFloor = i;
        }
    }

    // Output
    cout << "\nHottest Room: Floor "
         << hotFloor + 1 << ", Room "
         << hotRoom + 1 << " = "
         << max << " C" << endl;

    cout << "Hottest Floor: Floor "
         << hottestFloor + 1 << endl;

    cout << "Rooms at WARNING or above: "
         << count << endl;

    return 0;

        

}