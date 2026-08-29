/* Problem 1 — Sensor Reading Classifier */

#include<iostream>
using namespace std;


int main(){
    double temperature;
    cout << "Enter the temperature: ";
    cin >> temperature;

    int statusCode;
    if(temperature < 0){
        statusCode = -1;
    }
    else if(temperature > 0 && temperature < 30){
        statusCode = 0;
    }
     else if(temperature >= 30 && temperature < 45){
        statusCode = 1;
    }
     else if(temperature >= 45 && temperature < 60){
        statusCode = 2;
    }
    else{
        temperature = 3;
    }

         double fahrenheit = (temperature * 9/ 5) + 32;
         cout << "Temperature: " << temperature << "C /" 
          << fahrenheit << " F" << endl;
    
    switch(statusCode){
        case -1:
           cout << "Status Label: Sensor_Error" << endl;
           cout << "Action: Sensor fault check wiring" << endl;
           break;

        case 0:
           cout << "Status Label: NORMAL" << endl;
           cout << "Action: No action required" << endl;
           break;

        case 1:
           cout << "Status Label: WARNING" << endl;
           cout << "Action: Alert sent to supervisor" << endl;
           break;

        case 2:
           cout << "Status Label: CRITICAL" << endl;
           cout << "Action: Cooling system triggered" << endl;
           break;

        case 3:
           cout << "Status Label: SHUTDOWN" << endl;
           cout << "Action: Emergency shutdown initiated" << endl;
           break;
    }
     cout << "Reading: "
    << (temperature > 25 ? "Above Average" : "Below Average");

    return 0;
    
}