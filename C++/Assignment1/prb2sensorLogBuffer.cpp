/* Problem 2 — Sensor Log Buffer*/

#include<iostream>

using namespace std;

int main(){
    int N;
    cout << "How many readings do you want: ";
    cin >> N;

    double readings[100];   // declaration or formation of array as we want only 100 readings
    
    // counters
    int errors = 0;
    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for(int i=0; i < N; i++){
        cin >> readings[i];
    }

    double min = 0;
    double max = 0;
    double sum = 0;
    int count = 0;

    cout << "Valid readings: ";

    for(int i = 0; i < N; i++){
    if(readings[i] < 0){
          errors++;
          continue;
    }
    cout << readings[i] << " ";

     // Sum and count

    sum = sum + readings[i];
    count++;

    // min max 

    if(count == 1){
        min = readings[i];
        max = readings[i];
    }
    else{
        if(readings[i] < min)
        min = readings[i];

        if(readings[i] > max)
        max = readings[i];
    }

     // category counting

     if(readings[i] < 30)
           normal++;
     else if(readings[i] < 45)
            warning++;
     else if(readings[i] < 60)
             critical++;
     else
        shutdown++;
    }
    cout << endl;

     // Find first reading >= 45
    for (int i = 0; i < N; i++)
    {
        if (readings[i] >= 45)
        {
            cout << "First CRITICAL : Index " << i
                 << " -> " << readings[i] << " C" << endl;
            break;
        }
    }


    // Average
    double average = sum / count;

    cout << "Skipped (errors) : " << errors << endl;


    cout << "Min : " << min
         << " C  Max : " << max
         << " C  Avg : " << average << " C" << endl;

    cout << "Normal : " << normal
         << " Warning : " << warning
         << " Critical : " << critical
         << " Shutdown : " << shutdown << endl;

   return 0;
}